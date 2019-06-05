package typings
package sipDotJsLib.libExceptionsMod

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
  class ClosedSessionDescriptionHandlerError ()
    extends sipDotJsLib.libCoreMod.Exception
  
  @js.native
  class ConfigurationError protected ()
    extends sipDotJsLib.libExceptionsMod.LegacyException {
    def this(parameter: java.lang.String) = this()
    def this(parameter: java.lang.String, value: js.Any) = this()
    var parameter: java.lang.String = js.native
    var value: js.Any = js.native
  }
  
  @js.native
  class InvalidStateError protected ()
    extends sipDotJsLib.libExceptionsMod.LegacyException {
    def this(status: sipDotJsLib.libEnumsMod.SessionStatus) = this()
    var status: sipDotJsLib.libEnumsMod.SessionStatus = js.native
  }
  
  @js.native
  class MethodParameterError protected ()
    extends sipDotJsLib.libExceptionsMod.LegacyException {
    def this(method: java.lang.String, parameter: java.lang.String, value: js.Any) = this()
    var method: java.lang.String = js.native
    var parameter: java.lang.String = js.native
    var value: js.Any = js.native
  }
  
  @js.native
  class NotSupportedError protected ()
    extends sipDotJsLib.libExceptionsMod.LegacyException {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class RenegotiationError protected ()
    extends sipDotJsLib.libExceptionsMod.LegacyException {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError protected ()
    extends sipDotJsLib.libExceptionsMod.LegacyException {
    def this(method: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String, message: java.lang.String) = this()
    var error: js.UndefOr[java.lang.String] = js.native
    var method: java.lang.String = js.native
  }
  
  /**
    * Indicates the session terminated before the action completed.
    */
  @js.native
  class TerminatedSessionError ()
    extends sipDotJsLib.libCoreMod.Exception
  
  /**
    * Unsupported session description content type.
    */
  @js.native
  class UnsupportedSessionDescriptionContentTypeError ()
    extends sipDotJsLib.libCoreMod.Exception {
    def this(message: java.lang.String) = this()
  }
  
}

