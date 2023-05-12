package typings.sinclairTypebox

import typings.sinclairTypebox.mod.Static
import typings.sinclairTypebox.mod.TRef
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TThis
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueCreateMod {
  
  object ValueCreate {
    
    @JSImport("@sinclair/typebox/value/create", "ValueCreate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Create[T /* <: TSchema */](schema: T, references: js.Array[TSchema]): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    /** Creates a value from the given schema. If the schema specifies a default value, then that value is returned. */
    inline def Visit(schema: TSchema, references: js.Array[TSchema]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Visit")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("@sinclair/typebox/value/create", "ValueCreateDereferenceError")
  @js.native
  open class ValueCreateDereferenceError protected ()
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
  
  @JSImport("@sinclair/typebox/value/create", "ValueCreateIntersectTypeError")
  @js.native
  open class ValueCreateIntersectTypeError protected ()
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
  
  @JSImport("@sinclair/typebox/value/create", "ValueCreateNeverTypeError")
  @js.native
  open class ValueCreateNeverTypeError protected ()
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
  
  @JSImport("@sinclair/typebox/value/create", "ValueCreateTempateLiteralTypeError")
  @js.native
  open class ValueCreateTempateLiteralTypeError protected ()
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
  
  @JSImport("@sinclair/typebox/value/create", "ValueCreateUnknownTypeError")
  @js.native
  open class ValueCreateUnknownTypeError protected ()
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
