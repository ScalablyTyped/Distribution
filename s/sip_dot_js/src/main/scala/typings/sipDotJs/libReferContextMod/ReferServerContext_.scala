package typings.sipDotJs.libReferContextMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
import typings.sipDotJs.libCoreMod.NameAddrHeader
import typings.sipDotJs.libCoreMod.URI
import typings.sipDotJs.libCoreSessionSessionMod.Session
import typings.sipDotJs.libEnumsMod.SessionStatus
import typings.sipDotJs.libReferContextMod.ReferServerContext.AcceptOptions
import typings.sipDotJs.libReferContextMod.ReferServerContext.RejectOptions
import typings.sipDotJs.libServerContextMod.ServerContext
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import typings.sipDotJs.libUAMod.UA
import typings.sipDotJs.sipDotJsStrings.referAccepted
import typings.sipDotJs.sipDotJsStrings.referInviteSent
import typings.sipDotJs.sipDotJsStrings.referProgress
import typings.sipDotJs.sipDotJsStrings.referRejected
import typings.sipDotJs.sipDotJsStrings.referRequestAccepted
import typings.sipDotJs.sipDotJsStrings.referRequestRejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ReferContext", "ReferServerContext")
@js.native
class ReferServerContext_ protected () extends ServerContext {
  def this(ua: UA, incomingRequest: IncomingRequest) = this()
  def this(ua: UA, incomingRequest: IncomingRequest, session: Session) = this()
  var callId: String = js.native
  var contact: String = js.native
  var cseq: Double = js.native
  var fromTag: String = js.native
  var fromUri: URI = js.native
  var id: String = js.native
  var referTo: NameAddrHeader = js.native
  var referredBy: js.UndefOr[String] = js.native
  var referredSession: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var remoteTarget: URI = js.native
  var replaces: js.UndefOr[String] = js.native
  var routeSet: js.Array[String] = js.native
  var session: js.UndefOr[js.Any] = js.native
  var status: SessionStatus = js.native
  var targetSession: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var toTag: String = js.native
  var toUri: URI = js.native
  def accept(options: AcceptOptions): Unit = js.native
  def accept(options: AcceptOptions, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
  /* protected */ def errorListener(): Unit = js.native
  @JSName("on")
  def on_referAccepted(name: referAccepted, callback: js.Function1[/* referServerContext */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_referInviteSent(name: referInviteSent, callback: js.Function1[/* referServerContext */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_referProgress(name: referProgress, callback: js.Function1[/* referServerContext */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_referRejected(name: referRejected, callback: js.Function1[/* referServerContext */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_referRequestAccepted(name: referRequestAccepted, callback: js.Function1[/* referServerContext */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_referRequestRejected(name: referRequestRejected, callback: js.Function1[/* referServerContext */ this.type, Unit]): this.type = js.native
  def reject(options: RejectOptions): Unit = js.native
  def sendNotify(bodyStr: String): Unit = js.native
}

