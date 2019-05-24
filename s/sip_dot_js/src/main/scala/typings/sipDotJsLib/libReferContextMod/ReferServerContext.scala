package typings
package sipDotJsLib.libReferContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ReferContext", "ReferServerContext")
@js.native
class ReferServerContext protected ()
  extends sipDotJsLib.libServerContextMod.ServerContext {
  def this(ua: sipDotJsLib.libUAMod.UA, incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest, session: sipDotJsLib.libCoreSessionSessionMod.Session) = this()
  var callId: java.lang.String = js.native
  var contact: java.lang.String = js.native
  var cseq: scala.Double = js.native
  var fromTag: java.lang.String = js.native
  var fromUri: sipDotJsLib.libURIMod.URI = js.native
  var id: java.lang.String = js.native
  var referTo: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var referredBy: js.UndefOr[java.lang.String] = js.native
  var referredSession: js.UndefOr[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  var remoteTarget: sipDotJsLib.libURIMod.URI = js.native
  var replaces: js.UndefOr[java.lang.String] = js.native
  var routeSet: js.Array[java.lang.String] = js.native
  var session: js.UndefOr[js.Any] = js.native
  var status: sipDotJsLib.libEnumsMod.SessionStatus = js.native
  var targetSession: js.UndefOr[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  var toTag: java.lang.String = js.native
  var toUri: sipDotJsLib.libURIMod.URI = js.native
  def accept(options: sipDotJsLib.libReferContextMod.ReferServerContextNs.AcceptOptions): scala.Unit = js.native
  def accept(
    options: sipDotJsLib.libReferContextMod.ReferServerContextNs.AcceptOptions,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
  /* protected */ def errorListener(): scala.Unit = js.native
  @JSName("on")
  def on_referAccepted(
    name: sipDotJsLib.sipDotJsLibStrings.referAccepted,
    callback: js.Function1[/* referServerContext */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referInviteSent(
    name: sipDotJsLib.sipDotJsLibStrings.referInviteSent,
    callback: js.Function1[/* referServerContext */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referProgress(
    name: sipDotJsLib.sipDotJsLibStrings.referProgress,
    callback: js.Function1[/* referServerContext */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRejected(
    name: sipDotJsLib.sipDotJsLibStrings.referRejected,
    callback: js.Function1[/* referServerContext */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRequestAccepted(
    name: sipDotJsLib.sipDotJsLibStrings.referRequestAccepted,
    callback: js.Function1[/* referServerContext */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRequestRejected(
    name: sipDotJsLib.sipDotJsLibStrings.referRequestRejected,
    callback: js.Function1[/* referServerContext */ this.type, scala.Unit]
  ): this.type = js.native
  def reject(options: sipDotJsLib.libReferContextMod.ReferServerContextNs.RejectOptions): scala.Unit = js.native
  def sendNotify(body: java.lang.String): scala.Unit = js.native
}

