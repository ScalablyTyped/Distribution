package typings.sipDotJs.libExceptionsMod

import typings.sipDotJs.libCoreMod.Exception
import typings.sipDotJs.libEnumsMod.SessionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Exceptions", "Exceptions")
@js.native
object ExceptionsNs extends js.Object {
  /**
    * Indicates the session description handler has closed.
    * Occurs when getDescription() or setDescription() are called after close() has been called.
    * Occurs when close() is called while getDescription() or setDescription() are in progress.
    */
  @js.native
  class ClosedSessionDescriptionHandlerError () extends Exception
  
  @js.native
  class ConfigurationError protected () extends LegacyException {
    def this(parameter: String) = this()
    def this(parameter: String, value: js.Any) = this()
    var parameter: String = js.native
    var value: js.Any = js.native
  }
  
  @js.native
  class InvalidStateError protected () extends LegacyException {
    def this(status: SessionStatus) = this()
    var status: SessionStatus = js.native
  }
  
  @js.native
  class MethodParameterError protected () extends LegacyException {
    def this(method: String, parameter: String, value: js.Any) = this()
    var method: String = js.native
    var parameter: String = js.native
    var value: js.Any = js.native
  }
  
  @js.native
  class NotSupportedError protected () extends LegacyException {
    def this(message: String) = this()
  }
  
  @js.native
  class RenegotiationError protected () extends LegacyException {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError protected () extends LegacyException {
    def this(method: String) = this()
    def this(method: String, error: String) = this()
    def this(method: String, error: String, message: String) = this()
    var error: js.UndefOr[String] = js.native
    var method: String = js.native
  }
  
  /**
    * Indicates the session terminated before the action completed.
    */
  @js.native
  class TerminatedSessionError () extends Exception
  
  /**
    * Unsupported session description content type.
    */
  @js.native
  class UnsupportedSessionDescriptionContentTypeError () extends Exception {
    def this(message: String) = this()
  }
  
}

