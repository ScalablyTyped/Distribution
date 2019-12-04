package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions", JSImport.Namespace)
@js.native
object libApiExceptionsMod extends js.Object {
  @js.native
  class ContentTypeUnsupportedError ()
    extends typings.sipDotJs.libApiExceptionsContentDashTypeDashUnsupportedMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @js.native
  /** @internal */
  class RequestPendingError ()
    extends typings.sipDotJs.libApiExceptionsRequestDashPendingMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError ()
    extends typings.sipDotJs.libApiExceptionsSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionTerminatedError ()
    extends typings.sipDotJs.libApiExceptionsSessionDashTerminatedMod.SessionTerminatedError
  
  @js.native
  class StateTransitionError ()
    extends typings.sipDotJs.libApiExceptionsStateDashTransitionMod.StateTransitionError {
    def this(message: String) = this()
  }
  
}

