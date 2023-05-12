package typings.sinclairTypebox

import typings.sinclairTypebox.mod.Static
import typings.sinclairTypebox.mod.TRef
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TThis
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueCastMod {
  
  object ValueCast {
    
    @JSImport("@sinclair/typebox/value/cast", "ValueCast")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Cast[T /* <: TSchema */](schema: T, references: js.Array[TSchema], value: Any): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    inline def Visit(schema: TSchema, references: js.Array[TSchema], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Visit")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("@sinclair/typebox/value/cast", "ValueCastArrayUniqueItemsTypeError")
  @js.native
  open class ValueCastArrayUniqueItemsTypeError protected ()
    extends StObject
       with Error {
    def this(schema: TSchema, value: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val schema: TSchema = js.native
    
    val value: Any = js.native
  }
  
  @JSImport("@sinclair/typebox/value/cast", "ValueCastDereferenceError")
  @js.native
  open class ValueCastDereferenceError protected ()
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
  
  @JSImport("@sinclair/typebox/value/cast", "ValueCastNeverTypeError")
  @js.native
  open class ValueCastNeverTypeError protected ()
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
  
  @JSImport("@sinclair/typebox/value/cast", "ValueCastRecursiveTypeError")
  @js.native
  open class ValueCastRecursiveTypeError protected ()
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
  
  @JSImport("@sinclair/typebox/value/cast", "ValueCastReferenceTypeError")
  @js.native
  open class ValueCastReferenceTypeError protected ()
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
  
  @JSImport("@sinclair/typebox/value/cast", "ValueCastUnknownTypeError")
  @js.native
  open class ValueCastUnknownTypeError protected ()
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
