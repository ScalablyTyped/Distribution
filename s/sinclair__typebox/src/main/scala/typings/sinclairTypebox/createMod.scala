package typings.sinclairTypebox

import typings.sinclairTypebox.mod.Static
import typings.sinclairTypebox.mod.TSchema
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  object ValueCreate {
    
    @JSImport("@sinclair/typebox/value/create", "ValueCreate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Create[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R]
    ): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    /** Creates a value from the given schema. If the schema specifies a default value, then that value is returned. */
    inline def Visit[T /* <: TSchema */](schema: T, references: js.Array[TSchema]): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Visit")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
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
