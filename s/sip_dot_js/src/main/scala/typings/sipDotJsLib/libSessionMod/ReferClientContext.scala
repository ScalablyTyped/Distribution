package typings
package sipDotJsLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session", "ReferClientContext")
@js.native
class ReferClientContext protected ()
  extends sipDotJsLib.libClientContextMod.ClientContext {
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteClientContext, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteClientContext, target: InviteClientContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteClientContext, target: InviteServerContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteServerContext, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteServerContext, target: InviteClientContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteServerContext, target: InviteServerContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteClientContext, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteClientContext, target: InviteClientContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteClientContext, target: InviteServerContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteServerContext, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteServerContext, target: InviteClientContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: InviteServerContext, target: InviteServerContext, options: js.Any) = this()
  var applicant: js.Any = js.native
  var errorListener: js.Any = js.native
  var extraHeaders: js.Any = js.native
  var options: js.Any = js.native
  var target: js.Any = js.native
  def receiveNotify(request: sipDotJsLib.libSIPMessageMod.IncomingRequest): scala.Unit = js.native
  def refer(): ReferClientContext = js.native
  def refer(options: js.Any): ReferClientContext = js.native
}

