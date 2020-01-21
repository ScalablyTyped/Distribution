package typings.sipJs.registerContextMod

import typings.sipJs.clientContextMod.ClientContext
import typings.sipJs.coreMod.IncomingResponseMessage
import typings.sipJs.uAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/RegisterContext", "RegisterContext")
@js.native
class RegisterContext_ protected () extends ClientContext {
  def this(ua: UA) = this()
  def this(ua: UA, options: js.Any) = this()
  var closeHeaders: js.Any = js.native
  var contact: js.Any = js.native
  var expires: js.Any = js.native
  /**
    * Helper Function to generate Contact Header
    * @private
    * returns {String}
    */
  var generateContactHeader: js.Any = js.native
  var onTransportDisconnected: js.Any = js.native
  var options: js.Any = js.native
  var registered: Boolean = js.native
  var registeredBefore: js.Any = js.native
  var registrationExpiredTimer: js.Any = js.native
  var registrationFailure: js.Any = js.native
  var registrationTimer: js.Any = js.native
  def close(): Unit = js.native
  def register(): Unit = js.native
  def register(options: js.Any): Unit = js.native
  def unregister(): Unit = js.native
  def unregister(options: js.Any): Unit = js.native
  def unregistered(): Unit = js.native
  def unregistered(response: IncomingResponseMessage): Unit = js.native
  def unregistered(response: IncomingResponseMessage, cause: String): Unit = js.native
}

