package typings.sinclairTypebox

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueHashMod {
  
  object ValueHash {
    
    @JSImport("@sinclair/typebox/value/hash", "ValueHash")
    @js.native
    val ^ : js.Any = js.native
    
    /** Creates a FNV1A-64 non cryptographic hash of the given value */
    inline def Create(value: Any): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  }
  
  @JSImport("@sinclair/typebox/value/hash", "ValueHashError")
  @js.native
  open class ValueHashError protected ()
    extends StObject
       with Error {
    def this(value: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val value: Any = js.native
  }
}
