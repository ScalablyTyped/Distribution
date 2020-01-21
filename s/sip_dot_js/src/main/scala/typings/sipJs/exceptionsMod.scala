package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions", JSImport.Namespace)
@js.native
object exceptionsMod extends js.Object {
  @js.native
  class ContentTypeUnsupportedError ()
    extends typings.sipJs.contentTypeUnsupportedMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @js.native
  /** @internal */
  class RequestPendingError ()
    extends typings.sipJs.requestPendingMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError ()
    extends typings.sipJs.sessionDescriptionHandlerMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionTerminatedError ()
    extends typings.sipJs.sessionTerminatedMod.SessionTerminatedError
  
  @js.native
  class StateTransitionError ()
    extends typings.sipJs.stateTransitionMod.StateTransitionError {
    def this(message: String) = this()
  }
  
}

