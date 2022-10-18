package typings.spected

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spected", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ROOTINPUT, SPEC /* <: SpecValue[ROOTINPUT, ROOTINPUT] */](spec: SPEC, input: ROOTINPUT): Result[ROOTINPUT, SPEC] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Result[ROOTINPUT, SPEC]]
  
  type ErrorMsg[INPUT] = js.UndefOr[
    String | Double | Boolean | js.Symbol | Null | js.Object | (js.Function2[/* value */ INPUT, /* field */ String, Any])
  ]
  
  type Predicate[INPUT, ROOTINPUT] = js.Function2[/* value */ INPUT, /* inputs */ ROOTINPUT, Boolean]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof INPUT ]: true | std.Array<any> | spected.spected.Result<INPUT[key], any>}
    }}}
    */
  @js.native
  trait Result[INPUT, SPEC] extends StObject
  
  type Spec[INPUT, ROOTINPUT] = js.Tuple2[Predicate[INPUT, ROOTINPUT], ErrorMsg[INPUT]]
  
  type SpecArray[INPUT, ROOTINPUT] = js.Array[Spec[INPUT, ROOTINPUT]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [INPUT] extends [std.ReadonlyArray<infer U>] ? (value : INPUT): std.ReadonlyArray<spected.spected.SpecArray<U, ROOTINPUT>> : [INPUT] extends [object] ? (value : INPUT): spected.spected.SpecObject<INPUT, ROOTINPUT> : (value : INPUT): spected.spected.SpecArray<INPUT, ROOTINPUT>
    }}}
    */
  @js.native
  trait SpecFunction[INPUT, ROOTINPUT] extends StObject
  
  type SpecObject[INPUT, ROOTINPUT] = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof INPUT ]: spected.spected.SpecValue<INPUT[key], ROOTINPUT>} */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [INPUT] extends [std.ReadonlyArray<any>] ? spected.spected.SpecArray<INPUT, ROOTINPUT> | spected.spected.SpecFunction<INPUT, ROOTINPUT> : [INPUT] extends [object] ? spected.spected.SpecArray<INPUT, ROOTINPUT> | spected.spected.SpecFunction<INPUT, ROOTINPUT> | spected.spected.SpecObject<INPUT, ROOTINPUT> : spected.spected.SpecArray<INPUT, ROOTINPUT> | spected.spected.SpecFunction<INPUT, ROOTINPUT>
    }}}
    */
  @js.native
  trait SpecValue[INPUT, ROOTINPUT] extends StObject
}
