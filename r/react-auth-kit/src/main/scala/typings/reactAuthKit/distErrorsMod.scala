package typings.reactAuthKit

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @JSImport("react-auth-kit/dist/errors", "AuthKitError")
  @js.native
  open class AuthKitError protected ()
    extends StObject
       with Error {
    /**
      * @constructor
      * @param message - Error message
      */
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
