package typings.pusherJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("pusher-js/types/src/core/errors", "BadChannelName")
  @js.native
  open class BadChannelName ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "BadEventName")
  @js.native
  open class BadEventName ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "HTTPAuthError")
  @js.native
  open class HTTPAuthError protected ()
    extends StObject
       with Error {
    def this(status: Double) = this()
    def this(status: Double, msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var status: Double = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "RequestTimedOut")
  @js.native
  open class RequestTimedOut ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "TransportClosed")
  @js.native
  open class TransportClosed ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "TransportPriorityTooLow")
  @js.native
  open class TransportPriorityTooLow ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "UnsupportedFeature")
  @js.native
  open class UnsupportedFeature ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "UnsupportedStrategy")
  @js.native
  open class UnsupportedStrategy ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("pusher-js/types/src/core/errors", "UnsupportedTransport")
  @js.native
  open class UnsupportedTransport ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
