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
    extends sipDotJsLib.typesExceptionsMod.ExceptionsNs.ConfigurationError {
    def this(parameter: java.lang.String) = this()
    def this(parameter: java.lang.String, value: js.Any) = this()
  }
  
  @js.native
  class InvalidStateError protected ()
    extends sipDotJsLib.typesExceptionsMod.ExceptionsNs.InvalidStateError {
    def this(status: sipDotJsLib.typesEnumsMod.SessionStatus) = this()
  }
  
  @js.native
  class MethodParameterError protected ()
    extends sipDotJsLib.typesExceptionsMod.ExceptionsNs.MethodParameterError {
    def this(method: java.lang.String, parameter: java.lang.String, value: js.Any) = this()
  }
  
  @js.native
  class NotSupportedError protected ()
    extends sipDotJsLib.typesExceptionsMod.ExceptionsNs.NotSupportedError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class RenegotiationError protected ()
    extends sipDotJsLib.typesExceptionsMod.ExceptionsNs.RenegotiationError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError protected ()
    extends sipDotJsLib.typesExceptionsMod.ExceptionsNs.SessionDescriptionHandlerError {
    def this(method: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String, message: java.lang.String) = this()
  }
  
  @js.native
  class TransportError protected ()
    extends sipDotJsLib.typesExceptionsMod.ExceptionsNs.TransportError {
    def this(message: java.lang.String) = this()
  }
  
}

