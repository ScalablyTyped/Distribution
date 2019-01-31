package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/session", "ReferServerContext")
@js.native
class ReferServerContext protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(ua: sipDotJsLib.typesUaMod.UA, request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest) = this()
  /** Parsed Refer-to header. */
  var referTo: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  /** If followRefer is was true, the new Session post accepting REFER request. */
  var targetSession: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  /** Accept the REFER request with a "202 Accepted" reply. */
  def accept(): scala.Unit = js.native
  def accept(options: sipDotJsLib.typesSessionMod.ReferServerContextNs.AcceptOptions): scala.Unit = js.native
  def accept(
    options: sipDotJsLib.typesSessionMod.ReferServerContextNs.AcceptOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
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
  /** Send a "100 Trying" reply. */
  def progress(): scala.Unit = js.native
  def receiveNonInviteResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  /** Reject the REFER request. */
  def reject(): scala.Unit = js.native
  def reject(options: sipDotJsLib.typesSessionMod.ReferServerContextNs.RejectOptions): scala.Unit = js.native
  def sendNotify(body: java.lang.String): scala.Unit = js.native
}

