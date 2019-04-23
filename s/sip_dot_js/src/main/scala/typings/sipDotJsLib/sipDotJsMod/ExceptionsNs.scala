package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Exceptions")
@js.native
object ExceptionsNs extends js.Object {
  @js.native
  class ConfigurationError protected ()
    extends sipDotJsLib.libExceptionsMod.ExceptionsNs.ConfigurationError {
    def this(parameter: java.lang.String) = this()
    def this(parameter: java.lang.String, value: js.Any) = this()
  }
  
  @js.native
  class InvalidStateError protected ()
    extends sipDotJsLib.libExceptionsMod.ExceptionsNs.InvalidStateError {
    def this(status: sipDotJsLib.libEnumsMod.SessionStatus) = this()
  }
  
  @js.native
  class MethodParameterError protected ()
    extends sipDotJsLib.libExceptionsMod.ExceptionsNs.MethodParameterError {
    def this(method: java.lang.String, parameter: java.lang.String, value: js.Any) = this()
  }
  
  @js.native
  class NotSupportedError protected ()
    extends sipDotJsLib.libExceptionsMod.ExceptionsNs.NotSupportedError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class RenegotiationError protected ()
    extends sipDotJsLib.libExceptionsMod.ExceptionsNs.RenegotiationError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError protected ()
    extends sipDotJsLib.libExceptionsMod.ExceptionsNs.SessionDescriptionHandlerError {
    def this(method: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String, message: java.lang.String) = this()
  }
  
  /**
    * Transport error.
    */
  @js.native
  class TransportError ()
    extends sipDotJsLib.libExceptionsMod.ExceptionsNs.TransportError {
    def this(message: java.lang.String) = this()
  }
  
}

