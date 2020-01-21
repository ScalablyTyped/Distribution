package typings.sipJs.referContextMod

import typings.sipJs.coreMod.NameAddrHeader
import typings.sipJs.coreMod.URI
import typings.sipJs.enumsMod.SessionStatus
import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipJs.libSessionMod.InviteClientContext
import typings.sipJs.libSessionMod.InviteServerContext
import typings.sipJs.referContextMod.ReferServerContext.AcceptOptions
import typings.sipJs.referContextMod.ReferServerContext.RejectOptions
import typings.sipJs.serverContextMod.ServerContext
import typings.sipJs.sessionSessionMod.Session
import typings.sipJs.sipJsStrings.referAccepted
import typings.sipJs.sipJsStrings.referInviteSent
import typings.sipJs.sipJsStrings.referProgress
import typings.sipJs.sipJsStrings.referRejected
import typings.sipJs.sipJsStrings.referRequestAccepted
import typings.sipJs.sipJsStrings.referRequestRejected
import typings.sipJs.uAMod.UA
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

