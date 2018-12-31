package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  var assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
  var data: ClientContext | ServerContext = js.native
  var endTime: js.UndefOr[stdLib.Date] = js.native
  var localIdentity: js.UndefOr[NameAddrHeader] = js.native
  var mediaHandler: js.UndefOr[sipDotJsLib.sipDotJsMod.WebRTCNs.MediaHandler] = js.native
  var method: js.UndefOr[java.lang.String] = js.native
  var remoteIdentity: js.UndefOr[NameAddrHeader] = js.native
  var request: js.UndefOr[IncomingRequest | OutgoingRequest] = js.native
  var sessionDescriptionHandler: SessionDescriptionHandler = js.native
  var startTime: js.UndefOr[stdLib.Date] = js.native
  var ua: js.UndefOr[UA] = js.native
  def accept(): scala.Unit = js.native
  def accept(options: sipDotJsLib.sipDotJsMod.SessionNs.AcceptOptions): scala.Unit = js.native
  def bye(): Session = js.native
  def bye(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): Session = js.native
  def cancel(): scala.Unit = js.native
  def cancel(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): scala.Unit = js.native
  def dtmf(tone: java.lang.String): Session = js.native
  def dtmf(tone: java.lang.String, options: sipDotJsLib.sipDotJsMod.SessionNs.DtmfOptions): Session = js.native
  def dtmf(tone: scala.Double): Session = js.native
  def dtmf(tone: scala.Double, options: sipDotJsLib.sipDotJsMod.SessionNs.DtmfOptions): Session = js.native
  def followRefer(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getLocalStreams(): js.Array[_] = js.native
  def getRemoteStreams(): js.Array[_] = js.native
  def hold(): scala.Unit = js.native
  def hold(options: sipDotJsLib.sipDotJsMod.SessionNs.HoldOptions): scala.Unit = js.native
  def isOnHold(): sipDotJsLib.sipDotJsMod.SessionNs.Held = js.native
  def mute(): scala.Unit = js.native
  def mute(options: ExtraHeadersOptions): scala.Unit = js.native
  def on(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def `on_SessionDescriptionHandler-created`(
    name: sipDotJsLib.sipDotJsLibStrings.`SessionDescriptionHandler-created`,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_accepted(
    name: sipDotJsLib.sipDotJsLibStrings.accepted,
    callback: js.Function1[/* data */ sipDotJsLib.Anon_Code, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_bye(
    name: sipDotJsLib.sipDotJsLibStrings.bye,
    callback: js.Function1[/* request */ IncomingRequest, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_cancel(name: sipDotJsLib.sipDotJsLibStrings.cancel, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_directionChanged(name: sipDotJsLib.sipDotJsLibStrings.directionChanged, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_dtmf(
    name: sipDotJsLib.sipDotJsLibStrings.dtmf,
    callback: js.Function2[
      /* request */ IncomingRequest, 
      /* dtmf */ sipDotJsLib.sipDotJsMod.SessionNs.DTMF, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_failed(
    name: sipDotJsLib.sipDotJsLibStrings.failed,
    callback: js.Function2[/* response */ IncomingResponse, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_muted(
    name: sipDotJsLib.sipDotJsLibStrings.muted,
    callback: js.Function1[/* data */ sipDotJsLib.sipDotJsMod.SessionNs.Muted, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* request */ IncomingRequest, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_progress(
    name: sipDotJsLib.sipDotJsLibStrings.progress,
    callback: js.Function1[/* response */ IncomingResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_refer(
    name: sipDotJsLib.sipDotJsLibStrings.refer,
    callback: js.Function1[/* request */ IncomingRequest, scala.Unit]
  ): scala.Unit = js.native
  /*    these come from the ClientContext that is on the session somehow */
  @JSName("on")
  def on_referAccepted(
    name: sipDotJsLib.sipDotJsLibStrings.referAccepted,
    callback: js.Function1[/* ClientContext */ ClientContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referProgress(
    name: sipDotJsLib.sipDotJsLibStrings.referProgress,
    callback: js.Function1[/* ClientContext */ ClientContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRejected(
    name: sipDotJsLib.sipDotJsLibStrings.referRejected,
    callback: js.Function1[/* ClientContext */ ClientContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRequestAccepted(
    name: sipDotJsLib.sipDotJsLibStrings.referRequestAccepted,
    callback: js.Function1[/* ClientContext */ ClientContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRequestRejected(
    name: sipDotJsLib.sipDotJsLibStrings.referRequestRejected,
    callback: js.Function1[/* ClientContext */ ClientContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRequested(
    name: sipDotJsLib.sipDotJsLibStrings.referRequested,
    callback: js.Function1[/* request */ ClientContext | ServerContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reinvite(
    name: sipDotJsLib.sipDotJsLibStrings.reinvite,
    callback: js.Function1[/* newSession */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_rejected(
    name: sipDotJsLib.sipDotJsLibStrings.rejected,
    callback: js.Function2[/* response */ IncomingResponse, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_replaced(
    name: sipDotJsLib.sipDotJsLibStrings.replaced,
    callback: js.Function1[/* newSession */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_terminated(
    name: sipDotJsLib.sipDotJsLibStrings.terminated,
    callback: js.Function2[/* message */ IncomingResponse, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_trackAdded(name: sipDotJsLib.sipDotJsLibStrings.trackAdded, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_unmuted(
    name: sipDotJsLib.sipDotJsLibStrings.unmuted,
    callback: js.Function1[/* data */ sipDotJsLib.sipDotJsMod.SessionNs.Muted, scala.Unit]
  ): scala.Unit = js.native
  def progress(): scala.Unit = js.native
  def progress(options: sipDotJsLib.sipDotJsMod.SessionNs.ProgressOptions): scala.Unit = js.native
  def refer(target: java.lang.String): Session = js.native
  def refer(target: java.lang.String, options: ExtraHeadersOptions): Session = js.native
  def refer(target: Session): Session = js.native
  def refer(target: Session, options: ExtraHeadersOptions): Session = js.native
  def reject(): scala.Unit = js.native
  def reject(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): scala.Unit = js.native
  def reply(): scala.Unit = js.native
  def reply(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): scala.Unit = js.native
  def terminate(): Session = js.native
  def terminate(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): Session = js.native
  def unhold(): scala.Unit = js.native
  def unhold(options: sipDotJsLib.sipDotJsMod.SessionNs.HoldOptions): scala.Unit = js.native
  def unmute(): scala.Unit = js.native
  def unmute(options: ExtraHeadersOptions): scala.Unit = js.native
}

