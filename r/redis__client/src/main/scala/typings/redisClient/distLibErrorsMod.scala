package typings.redisClient

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsMod {
  
  @JSImport("@redis/client/dist/lib/errors", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "ClientClosedError")
  @js.native
  open class ClientClosedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "ConnectionTimeoutError")
  @js.native
  open class ConnectionTimeoutError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "DisconnectsClientError")
  @js.native
  open class DisconnectsClientError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "ErrorReply")
  @js.native
  open class ErrorReply protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "ReconnectStrategyError")
  @js.native
  open class ReconnectStrategyError protected ()
    extends StObject
       with Error {
    def this(originalError: js.Error, socketError: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var originalError: js.Error = js.native
    
    var socketError: Any = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "RootNodesUnavailableError")
  @js.native
  open class RootNodesUnavailableError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "SocketClosedUnexpectedlyError")
  @js.native
  open class SocketClosedUnexpectedlyError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@redis/client/dist/lib/errors", "WatchError")
  @js.native
  open class WatchError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
