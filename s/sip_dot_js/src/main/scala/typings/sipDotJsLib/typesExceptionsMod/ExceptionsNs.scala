package typings
package sipDotJsLib.typesExceptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/exceptions", "Exceptions")
@js.native
object ExceptionsNs extends js.Object {
  @js.native
  class ConfigurationError protected ()
    extends sipDotJsLib.typesExceptionsMod.LegacyException {
    def this(parameter: java.lang.String) = this()
    def this(parameter: java.lang.String, value: js.Any) = this()
    var parameter: java.lang.String = js.native
    var value: js.Any = js.native
  }
  
  @js.native
  class InvalidStateError protected ()
    extends sipDotJsLib.typesExceptionsMod.LegacyException {
    def this(status: sipDotJsLib.typesEnumsMod.SessionStatus) = this()
    var status: sipDotJsLib.typesEnumsMod.SessionStatus = js.native
  }
  
  @js.native
  class MethodParameterError protected ()
    extends sipDotJsLib.typesExceptionsMod.LegacyException {
    def this(method: java.lang.String, parameter: java.lang.String, value: js.Any) = this()
    var method: java.lang.String = js.native
    var parameter: java.lang.String = js.native
    var value: js.Any = js.native
  }
  
  @js.native
  class NotSupportedError protected ()
    extends sipDotJsLib.typesExceptionsMod.LegacyException {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class RenegotiationError protected ()
    extends sipDotJsLib.typesExceptionsMod.LegacyException {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError protected ()
    extends sipDotJsLib.typesExceptionsMod.LegacyException {
    def this(method: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String) = this()
    def this(method: java.lang.String, error: java.lang.String, message: java.lang.String) = this()
    var error: js.UndefOr[java.lang.String] = js.native
    var method: java.lang.String = js.native
  }
  
  @js.native
  class TransportError ()
    extends sipDotJsLib.typesExceptionsMod.Exception {
    def this(message: java.lang.String) = this()
  }
  
}

