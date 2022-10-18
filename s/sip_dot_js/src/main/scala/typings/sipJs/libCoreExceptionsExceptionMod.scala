package typings.sipJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreExceptionsExceptionMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/exceptions/exception", "Exception")
  @js.native
  /* protected */ open class Exception ()
    extends StObject
       with Error {
    /* protected */ def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
