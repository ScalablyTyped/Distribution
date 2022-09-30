package typings.sassTrue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.sass.anon.Alpha
import typings.sass.booleanMod.SassBoolean
import typings.sass.compileMod.CompileResult
import typings.sass.legacyExceptionMod.LegacyException
import typings.sass.loggerMod.Logger
import typings.sass.mod.types.Color
import typings.sass.mod.types.Error
import typings.sass.mod.types.Map
import typings.sass.mod.types.Null
import typings.sass.mod.types.Number
import typings.sass.optionsMod.LegacyOptions
import typings.sass.renderMod.LegacyResult
import typings.sass.typesOptionsMod.Options
import typings.sass.typesOptionsMod.StringOptions
import typings.sass.valueMod.Value
import typings.sassTrue.sassTrueBooleans.`false`
import typings.sassTrue.sassTrueBooleans.`true`
import typings.sassTrue.sassTrueStrings.async
import typings.sassTrue.sassTrueStrings.sync
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<sass-true.sass-true.Assertion> */
  trait ReadonlyAssertion extends StObject {
    
    val assertionType: js.UndefOr[String] = js.undefined
    
    val description: String
    
    val details: js.UndefOr[String] = js.undefined
    
    val expected: js.UndefOr[String] = js.undefined
    
    val output: js.UndefOr[String] = js.undefined
    
    val passed: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyAssertion {
    
    inline def apply(description: String): ReadonlyAssertion = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyAssertion]
    }
    
    extension [Self <: ReadonlyAssertion](x: Self) {
      
      inline def setAssertionType(value: String): Self = StObject.set(x, "assertionType", value.asInstanceOf[js.Any])
      
      inline def setAssertionTypeUndefined: Self = StObject.set(x, "assertionType", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    }
  }
  
  @js.native
  trait TypeofBoolean
    extends StObject
       with Instantiable0[typings.sass.mod.types.Boolean[Boolean]] {
    
    /** Sass's `false` value. */
    val FALSE: typings.sass.functionMod.types.Boolean[`false`] = js.native
    
    /** Sass's `true` value. */
    val TRUE: typings.sass.functionMod.types.Boolean[`true`] = js.native
  }
  
  trait TypeofLogger extends StObject {
    
    val silent: Logger
  }
  object TypeofLogger {
    
    inline def apply(silent: Logger): TypeofLogger = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofLogger]
    }
    
    extension [Self <: TypeofLogger](x: Self) {
      
      inline def setSilent(value: Logger): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofNull
    extends StObject
       with Instantiable0[Null] {
    
    /** Sass's singleton `null` value. */
    val NULL: typings.sass.functionMod.types.Null = js.native
  }
  
  @js.native
  trait TypeofimportedSass extends StObject {
    
    var Exception: Instantiable0[typings.sass.mod.Exception] = js.native
    
    val FALSE: typings.sass.functionMod.types.Boolean[`false`] = js.native
    
    val Logger: TypeofLogger = js.native
    
    val NULL: typings.sass.functionMod.types.Null = js.native
    
    var SassArgumentList: Instantiable2[
        /* contents */ js.Array[Value], 
        /* keywords */ Record[String, Value], 
        typings.sass.mod.SassArgumentList
      ] = js.native
    
    var SassBoolean: Instantiable0[typings.sass.mod.SassBoolean] = js.native
    
    var SassColor: Instantiable1[/* options */ Alpha, typings.sass.mod.SassColor] = js.native
    
    var SassFunction: Instantiable2[
        /* signature */ String, 
        /* callback */ js.Function1[/* args */ js.Array[Value], Value], 
        typings.sass.mod.SassFunction
      ] = js.native
    
    var SassList: Instantiable1[/* contents */ js.Array[Value], typings.sass.mod.SassList] = js.native
    
    var SassMap: Instantiable0[typings.sass.mod.SassMap] = js.native
    
    var SassNumber: Instantiable1[/* value */ Double, typings.sass.mod.SassNumber] = js.native
    
    var SassString: Instantiable1[/* text */ String, typings.sass.mod.SassString] = js.native
    
    val TRUE: typings.sass.functionMod.types.Boolean[`true`] = js.native
    
    var Value: Instantiable0[typings.sass.mod.Value] = js.native
    
    def compile(path: String): CompileResult = js.native
    
    def compileAsync(path: String): js.Promise[CompileResult] = js.native
    @JSName("compileAsync")
    def compileAsync_async(path: String, options: Options[async]): js.Promise[CompileResult] = js.native
    
    def compileString(source: String): CompileResult = js.native
    
    def compileStringAsync(source: String): js.Promise[CompileResult] = js.native
    @JSName("compileStringAsync")
    def compileStringAsync_async(source: String, options: StringOptions[async]): js.Promise[CompileResult] = js.native
    
    @JSName("compileString")
    def compileString_sync(source: String, options: StringOptions[sync]): CompileResult = js.native
    
    @JSName("compile")
    def compile_sync(path: String, options: Options[sync]): CompileResult = js.native
    
    val info: String = js.native
    
    @JSName("renderSync")
    def renderSync_sync(options: LegacyOptions[sync]): LegacyResult = js.native
    
    @JSName("render")
    def render_async(
      options: LegacyOptions[async],
      callback: js.Function2[
          /* exception */ js.UndefOr[LegacyException], 
          /* result */ js.UndefOr[LegacyResult], 
          Unit
        ]
    ): Unit = js.native
    
    val sassFalse: SassBoolean = js.native
    
    val sassNull: Value = js.native
    
    val sassTrue: SassBoolean = js.native
    
    val types: Typeoftypes = js.native
  }
  
  trait Typeoftypes extends StObject {
    
    var Boolean: TypeofBoolean
    
    var Color: Instantiable3[/* r */ Double, /* g */ Double, /* b */ Double, typings.sass.mod.types.Color]
    
    var Error: Instantiable1[/* message */ String, typings.sass.mod.types.Error]
    
    var List: Instantiable1[/* length */ Double, typings.sass.mod.types.List]
    
    var Map: Instantiable1[/* length */ Double, typings.sass.mod.types.Map]
    
    var Null: TypeofNull
    
    var Number: Instantiable1[/* value */ Double, typings.sass.mod.types.Number]
    
    var String: Instantiable1[/* value */ java.lang.String, typings.sass.mod.types.String]
  }
  object Typeoftypes {
    
    inline def apply(
      Boolean: TypeofBoolean,
      Color: Instantiable3[/* r */ Double, /* g */ Double, /* b */ Double, Color],
      Error: Instantiable1[/* message */ String, Error],
      List: Instantiable1[/* length */ Double, typings.sass.mod.types.List],
      Map: Instantiable1[/* length */ Double, Map],
      Null: TypeofNull,
      Number: Instantiable1[/* value */ Double, Number],
      String: Instantiable1[/* value */ String, typings.sass.mod.types.String]
    ): Typeoftypes = {
      val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeoftypes]
    }
    
    extension [Self <: Typeoftypes](x: Self) {
      
      inline def setBoolean(value: TypeofBoolean): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Instantiable3[/* r */ Double, /* g */ Double, /* b */ Double, Color]): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
      
      inline def setError(value: Instantiable1[/* message */ String, Error]): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setList(value: Instantiable1[/* length */ Double, typings.sass.mod.types.List]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Instantiable1[/* length */ Double, Map]): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
      
      inline def setNull(value: TypeofNull): Self = StObject.set(x, "Null", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Instantiable1[/* value */ Double, Number]): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setString(value: Instantiable1[/* value */ String, typings.sass.mod.types.String]): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    }
  }
}
