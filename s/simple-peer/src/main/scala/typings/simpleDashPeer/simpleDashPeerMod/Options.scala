package typings.simpleDashPeer.simpleDashPeerMod

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   // custom offer constraints (used by createOffer method)
  var answerConstraints: js.UndefOr[js.Object] = js.undefined
   // set to true if this is the initiating peer
  var channelConfig: js.UndefOr[js.Object] = js.undefined
   // custom webrtc data channel configuration (used by createDataChannel)
  var channelName: js.UndefOr[String] = js.undefined
   // custom webrtc data channel name
  var config: js.UndefOr[js.Object] = js.undefined
   // custom webrtc configuration (used by RTCPeerConnection constructor)
  var constraints: js.UndefOr[js.Object] = js.undefined
  var initiator: js.UndefOr[Boolean] = js.undefined
   // RTCPeerConnection/RTCSessionDescription/RTCIceCandidate
  var objectMode: js.UndefOr[Boolean] = js.undefined
   // custom webrtc video/voice constraints (used by RTCPeerConnection constructor)
  var offerConstraints: js.UndefOr[js.Object] = js.undefined
   // custom answer constraints (used by createAnswer method)
  var reconnectTimer: js.UndefOr[Boolean | Double] = js.undefined
   // wait __ milliseconds after ICE 'disconnect' for reconnect attempt before emitting 'close'
  var sdpTransform: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.undefined
   // function to transform the generated SDP signaling data (for advanced users)
  var stream: js.UndefOr[MediaStream] = js.undefined
   // if video/voice is desired, pass stream returned from getUserMedia
  var trickle: js.UndefOr[Boolean] = js.undefined
   // set to false to disable trickle ICE and get a single 'signal' event (slower)
  var wrtc: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    answerConstraints: js.Object = null,
    channelConfig: js.Object = null,
    channelName: String = null,
    config: js.Object = null,
    constraints: js.Object = null,
    initiator: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    offerConstraints: js.Object = null,
    reconnectTimer: Boolean | Double = null,
    sdpTransform: /* sdp */ js.Any => _ = null,
    stream: MediaStream = null,
    trickle: js.UndefOr[Boolean] = js.undefined,
    wrtc: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (answerConstraints != null) __obj.updateDynamic("answerConstraints")(answerConstraints)
    if (channelConfig != null) __obj.updateDynamic("channelConfig")(channelConfig)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (config != null) __obj.updateDynamic("config")(config)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (!js.isUndefined(initiator)) __obj.updateDynamic("initiator")(initiator)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (offerConstraints != null) __obj.updateDynamic("offerConstraints")(offerConstraints)
    if (reconnectTimer != null) __obj.updateDynamic("reconnectTimer")(reconnectTimer.asInstanceOf[js.Any])
    if (sdpTransform != null) __obj.updateDynamic("sdpTransform")(js.Any.fromFunction1(sdpTransform))
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (!js.isUndefined(trickle)) __obj.updateDynamic("trickle")(trickle)
    if (wrtc != null) __obj.updateDynamic("wrtc")(wrtc)
    __obj.asInstanceOf[Options]
  }
}

