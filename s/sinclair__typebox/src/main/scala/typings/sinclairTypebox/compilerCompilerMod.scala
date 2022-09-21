package typings.sinclairTypebox

import typings.sinclairTypebox.errorsErrorsMod.ValueError
import typings.sinclairTypebox.mod.TSchema
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerCompilerMod {
  
  object Property {
    
    @JSImport("@sinclair/typebox/compiler/compiler", "Property")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Check(propertyName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Check")(propertyName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@sinclair/typebox/compiler/compiler", "TypeCheck")
  @js.native
  open class TypeCheck[T /* <: TSchema */] protected () extends StObject {
    def this(schema: T, references: js.Array[TSchema], checkFunc: CheckFunction, code: String) = this()
    
    /** Returns true if the value matches the given type. */
    def Check(value: Any): /* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean = js.native
    
    /** Returns the generated validation code used to validate this type. */
    def Code(): String = js.native
    
    /** Returns an iterator for each error in this value. */
    def Errors(value: Any): IterableIterator[ValueError] = js.native
    
    /* private */ val checkFunc: Any = js.native
    
    /* private */ val code: Any = js.native
    
    /* private */ val references: Any = js.native
    
    /* private */ val schema: Any = js.native
  }
  
  object TypeCompiler {
    
    @JSImport("@sinclair/typebox/compiler/compiler", "TypeCompiler")
    @js.native
    val ^ : js.Any = js.native
    
    /** Compiles the given type for runtime type checking. This compiler only accepts known TypeBox types non-inclusive of unsafe types. */
    inline def Compile[T /* <: TSchema */](schema: T): TypeCheck[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Compile")(schema.asInstanceOf[js.Any]).asInstanceOf[TypeCheck[T]]
    inline def Compile[T /* <: TSchema */](schema: T, references: js.Array[TSchema]): TypeCheck[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Compile")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[TypeCheck[T]]
  }
  
  @JSImport("@sinclair/typebox/compiler/compiler", "TypeCompilerUnknownTypeError")
  @js.native
  open class TypeCompilerUnknownTypeError protected ()
    extends StObject
       with Error {
    def this(schema: TSchema) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val schema: TSchema = js.native
  }
  
  type CheckFunction = js.Function1[/* value */ Any, Boolean]
}
