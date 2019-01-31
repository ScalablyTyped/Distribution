package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/session", "ReferClientContext")
@js.native
class ReferClientContext protected ()
  extends sipDotJsLib.typesClientDashContextMod.ClientContext {
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteClientContext, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteClientContext, target: InviteClientContext) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteClientContext, target: InviteServerContext) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteServerContext, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteServerContext, target: InviteClientContext) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteServerContext, target: InviteServerContext) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteClientContext, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteClientContext, target: InviteClientContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteClientContext, target: InviteServerContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteServerContext, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteServerContext, target: InviteClientContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, applicant: InviteServerContext, target: InviteServerContext, options: js.Any) = this()
  def receiveNotify(request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest): scala.Unit = js.native
  def refer(): ReferClientContext = js.native
  def refer(options: js.Any): ReferClientContext = js.native
}

