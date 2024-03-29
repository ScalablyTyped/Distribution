package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiExceptionsMod {
  
  @JSImport("sip.js/lib/api/exceptions", "ContentTypeUnsupportedError")
  @js.native
  open class ContentTypeUnsupportedError ()
    extends typings.sipJs.libApiExceptionsContentTypeUnsupportedMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api/exceptions", "RequestPendingError")
  @js.native
  /** @internal */
  open class RequestPendingError ()
    extends typings.sipJs.libApiExceptionsRequestPendingMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api/exceptions", "SessionDescriptionHandlerError")
  @js.native
  open class SessionDescriptionHandlerError ()
    extends typings.sipJs.libApiExceptionsSessionDescriptionHandlerMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api/exceptions", "SessionTerminatedError")
  @js.native
  open class SessionTerminatedError ()
    extends typings.sipJs.libApiExceptionsSessionTerminatedMod.SessionTerminatedError
  
  @JSImport("sip.js/lib/api/exceptions", "StateTransitionError")
  @js.native
  open class StateTransitionError ()
    extends typings.sipJs.libApiExceptionsStateTransitionMod.StateTransitionError {
    def this(message: String) = this()
  }
}
