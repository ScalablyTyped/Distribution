package typings.sinclairTypebox

import typings.sinclairTypebox.mod.TRef
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TThis
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueCheckMod {
  
  object ValueCheck {
    
    @JSImport("@sinclair/typebox/value/check", "ValueCheck")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Check[T /* <: TSchema */](schema: T, references: js.Array[TSchema], value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@sinclair/typebox/value/check", "ValueCheckDereferenceError")
  @js.native
  open class ValueCheckDereferenceError protected ()
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
  
  @JSImport("@sinclair/typebox/value/check", "ValueCheckUnknownTypeError")
  @js.native
  open class ValueCheckUnknownTypeError protected ()
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
