package typings.sinclairTypebox

import typings.sinclairTypebox.mod.TRef
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TThis
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueConvertMod {
  
  object ValueConvert {
    
    @JSImport("@sinclair/typebox/value/convert", "ValueConvert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Convert[T /* <: TSchema */](schema: T, references: js.Array[TSchema], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Convert")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def Visit(schema: TSchema, references: js.Array[TSchema], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Visit")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("@sinclair/typebox/value/convert", "ValueConvertDereferenceError")
  @js.native
  open class ValueConvertDereferenceError protected ()
    extends StObject
       with Error {
    def this(schema: TRef[TSchema]) = this()
    def this(schema: TThis) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val schema: TRef[TSchema] | TThis = js.native
  }
  
  @JSImport("@sinclair/typebox/value/convert", "ValueConvertUnknownTypeError")
  @js.native
  open class ValueConvertUnknownTypeError protected ()
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
}
