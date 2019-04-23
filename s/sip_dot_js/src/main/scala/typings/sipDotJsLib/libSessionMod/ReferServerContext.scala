package typings
package sipDotJsLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session", "ReferServerContext")
@js.native
class ReferServerContext protected ()
  extends sipDotJsLib.libServerContextMod.ServerContext {
  def this(ua: sipDotJsLib.libUAMod.UA, request: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  var callId: js.Any = js.native
  var contact: js.Any = js.native
  var cseq: js.Any = js.native
  var errorListener: js.Any = js.native
  var fromTag: js.Any = js.native
  var fromUri: js.Any = js.native
  var id: js.Any = js.native
  var referTo: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var referredBy: js.Any = js.native
  var referredSession: js.Any = js.native
  var remoteTarget: js.Any = js.native
  var replaces: js.Any = js.native
  var routeSet: js.Any = js.native
  var status: js.Any = js.native
  var targetSession: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var toTag: js.Any = js.native
  var toUri: js.Any = js.native
  def accept(options: sipDotJsLib.libSessionMod.ReferServerContextNs.AcceptOptions): scala.Unit = js.native
  def accept(
    options: sipDotJsLib.libSessionMod.ReferServerContextNs.AcceptOptions,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
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
  def receiveNonInviteResponse(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def reject(options: sipDotJsLib.libSessionMod.ReferServerContextNs.RejectOptions): scala.Unit = js.native
  def sendNotify(body: java.lang.String): scala.Unit = js.native
}

