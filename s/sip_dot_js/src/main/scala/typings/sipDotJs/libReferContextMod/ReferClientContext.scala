package typings.sipDotJs.libReferContextMod

import typings.sipDotJs.libClientContextMod.ClientContext
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
import typings.sipDotJs.libCoreMod.URI
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import typings.sipDotJs.libUAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ReferContext", "ReferClientContext")
@js.native
class ReferClientContext protected () extends ClientContext {
  def this(ua: UA, applicant: InviteClientContext, target: String) = this()
  def this(ua: UA, applicant: InviteClientContext, target: InviteClientContext) = this()
  def this(ua: UA, applicant: InviteClientContext, target: InviteServerContext) = this()
  def this(ua: UA, applicant: InviteServerContext, target: String) = this()
  def this(ua: UA, applicant: InviteServerContext, target: InviteClientContext) = this()
  def this(ua: UA, applicant: InviteServerContext, target: InviteServerContext) = this()
  def this(ua: UA, applicant: InviteClientContext, target: String, options: js.Any) = this()
  def this(ua: UA, applicant: InviteClientContext, target: InviteClientContext, options: js.Any) = this()
  def this(ua: UA, applicant: InviteClientContext, target: InviteServerContext, options: js.Any) = this()
  def this(ua: UA, applicant: InviteServerContext, target: String, options: js.Any) = this()
  def this(ua: UA, applicant: InviteServerContext, target: InviteClientContext, options: js.Any) = this()
  def this(ua: UA, applicant: InviteServerContext, target: InviteServerContext, options: js.Any) = this()
  var applicant: InviteClientContext | InviteServerContext = js.native
  var errorListener: js.Any = js.native
  var extraHeaders: js.Array[String] = js.native
  var options: js.Any = js.native
  var target: URI | String = js.native
  /* protected */ def initReferTo(target: String): String | URI = js.native
  /* protected */ def initReferTo(target: InviteClientContext): String | URI = js.native
  /* protected */ def initReferTo(target: InviteServerContext): String | URI = js.native
  def receiveNotify(request: IncomingRequest): Unit = js.native
  def refer(): ReferClientContext = js.native
  def refer(options: js.Any): ReferClientContext = js.native
}

