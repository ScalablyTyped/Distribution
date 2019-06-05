package typings
package sipDotJsLib.libReferContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ReferContext", "ReferClientContext")
@js.native
class ReferClientContext protected ()
  extends sipDotJsLib.libClientContextMod.ClientContext {
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteClientContext, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteClientContext, target: sipDotJsLib.libSessionMod.InviteClientContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteClientContext, target: sipDotJsLib.libSessionMod.InviteServerContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteServerContext, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteServerContext, target: sipDotJsLib.libSessionMod.InviteClientContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteServerContext, target: sipDotJsLib.libSessionMod.InviteServerContext) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteClientContext, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteClientContext, target: sipDotJsLib.libSessionMod.InviteClientContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteClientContext, target: sipDotJsLib.libSessionMod.InviteServerContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteServerContext, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteServerContext, target: sipDotJsLib.libSessionMod.InviteClientContext, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, applicant: sipDotJsLib.libSessionMod.InviteServerContext, target: sipDotJsLib.libSessionMod.InviteServerContext, options: js.Any) = this()
  var applicant: sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext = js.native
  var errorListener: js.Any = js.native
  var extraHeaders: js.Array[java.lang.String] = js.native
  var options: js.Any = js.native
  var target: sipDotJsLib.libCoreMod.URI | java.lang.String = js.native
  /* protected */ def initReferTo(target: java.lang.String): java.lang.String | sipDotJsLib.libCoreMod.URI = js.native
  /* protected */ def initReferTo(target: sipDotJsLib.libSessionMod.InviteClientContext): java.lang.String | sipDotJsLib.libCoreMod.URI = js.native
  /* protected */ def initReferTo(target: sipDotJsLib.libSessionMod.InviteServerContext): java.lang.String | sipDotJsLib.libCoreMod.URI = js.native
  def receiveNotify(request: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest): scala.Unit = js.native
  def refer(): ReferClientContext = js.native
  def refer(options: js.Any): ReferClientContext = js.native
}

