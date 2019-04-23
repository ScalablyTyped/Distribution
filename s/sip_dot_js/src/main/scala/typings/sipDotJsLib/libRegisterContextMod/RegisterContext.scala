package typings
package sipDotJsLib.libRegisterContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/RegisterContext", "RegisterContext")
@js.native
class RegisterContext protected ()
  extends sipDotJsLib.libClientContextMod.ClientContext {
  def this(ua: sipDotJsLib.libUAMod.UA) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, options: js.Any) = this()
  var closeHeaders: js.Any = js.native
  var contact: js.Any = js.native
  var cseq: scala.Double = js.native
  var expires: js.Any = js.native
  /**
    * Helper Function to generate Contact Header
    * @private
    * returns {String}
    */
  var generateContactHeader: js.Any = js.native
  var onTransportDisconnected: js.Any = js.native
  var options: js.Any = js.native
  var registered: scala.Boolean = js.native
  var registeredBefore: js.Any = js.native
  var registrationExpiredTimer: js.Any = js.native
  var registrationFailure: js.Any = js.native
  var registrationTimer: js.Any = js.native
  def close(): scala.Unit = js.native
  def register(): scala.Unit = js.native
  def register(options: js.Any): scala.Unit = js.native
  def unregister(): scala.Unit = js.native
  def unregister(options: js.Any): scala.Unit = js.native
  def unregistered(): scala.Unit = js.native
  def unregistered(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def unregistered(response: sipDotJsLib.libSIPMessageMod.IncomingResponse, cause: java.lang.String): scala.Unit = js.native
}

