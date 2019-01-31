package typings
package sipDotJsLib.typesRegisterDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/register-context", "RegisterContext")
@js.native
class RegisterContext protected ()
  extends sipDotJsLib.typesClientDashContextMod.ClientContext {
  def this(ua: sipDotJsLib.typesUaMod.UA) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, options: js.Any) = this()
  var cseq: scala.Double = js.native
  var registered: scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def register(): scala.Unit = js.native
  def register(options: js.Any): scala.Unit = js.native
  def unregister(): scala.Unit = js.native
  def unregister(options: js.Any): scala.Unit = js.native
  def unregistered(): scala.Unit = js.native
  def unregistered(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def unregistered(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse, cause: java.lang.String): scala.Unit = js.native
}

