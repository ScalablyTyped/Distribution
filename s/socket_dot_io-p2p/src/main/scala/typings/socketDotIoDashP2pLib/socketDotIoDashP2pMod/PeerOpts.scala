package typings
package socketDotIoDashP2pLib.socketDotIoDashP2pMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerOpts extends js.Object {
  /**
    * Custom answer constraints (used by createAnswer method)
    */
  var answerConstraints: js.UndefOr[js.Object] = js.undefined
  /**
    * Custom WebRTC channel configuration (used by createDataChannel)
    * @default {}
    */
  var channelConfig: js.UndefOr[js.Object] = js.undefined
  /**
    * Custom WebRTC data channel name
    * @default <randomString>
    */
  var channelName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom WebRTC configuration (used by RTCPeerConnection constructor)
    * @default {iceServers:[{urls:'stun:stun.l.google.com:19302'},{urls:'stun:global.stun.twilio.com:3478?transport=udp'}]}
    */
  var config: js.UndefOr[js.Object] = js.undefined
  /**
    * Custom WebRTC video/voice constrainst (used by RTCPeerConnection constructor)
    * @default {}
    */
  var constraints: js.UndefOr[js.Object] = js.undefined
  /**
    * Set to true if this is the initiating peer
    * @default false
    */
  var initiator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to create the stream in Object Mode. In this mode, incoming string data is not automatically converted to Buffer objects
    * @default false
    */
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom offer contstraints (used by createOffer methode)
    * @default {}
    */
  var offerConstraints: js.UndefOr[js.Object] = js.undefined
  /**
    * Function to transform generated SDP signaling data (for advanced users)
    * @default (sdp)=>sdp
    */
  var sdpTransfrom: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.undefined
  /**
    * If video/voice is desired, pass stream from getUserMedia
    * @default false
    */
  var stream: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of MediaStreams returned from getUserMedia
    * @default []
    */
  var streams: js.UndefOr[js.Array[stdLib.MediaStream]] = js.undefined
  /**
    * Set to false to disable trickle ICE and get single 'signal' event (slower)
    * @default true
    */
  var trickle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom WebRTC implementation, mainly useful in node to specify the wrtc package
    * @default {}
    */
  var wrtc: js.UndefOr[stdLib.RTCPeerConnection | stdLib.RTCSessionDescription | stdLib.RTCIceCandidate] = js.undefined
}

object PeerOpts {
  @scala.inline
  def apply(
    answerConstraints: js.Object = null,
    channelConfig: js.Object = null,
    channelName: java.lang.String = null,
    config: js.Object = null,
    constraints: js.Object = null,
    initiator: js.UndefOr[scala.Boolean] = js.undefined,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    offerConstraints: js.Object = null,
    sdpTransfrom: /* sdp */ js.Any => _ = null,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    streams: js.Array[stdLib.MediaStream] = null,
    trickle: js.UndefOr[scala.Boolean] = js.undefined,
    wrtc: stdLib.RTCPeerConnection | stdLib.RTCSessionDescription | stdLib.RTCIceCandidate = null
  ): PeerOpts = {
    val __obj = js.Dynamic.literal()
    if (answerConstraints != null) __obj.updateDynamic("answerConstraints")(answerConstraints)
    if (channelConfig != null) __obj.updateDynamic("channelConfig")(channelConfig)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (config != null) __obj.updateDynamic("config")(config)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (!js.isUndefined(initiator)) __obj.updateDynamic("initiator")(initiator)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (offerConstraints != null) __obj.updateDynamic("offerConstraints")(offerConstraints)
    if (sdpTransfrom != null) __obj.updateDynamic("sdpTransfrom")(js.Any.fromFunction1(sdpTransfrom))
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (streams != null) __obj.updateDynamic("streams")(streams)
    if (!js.isUndefined(trickle)) __obj.updateDynamic("trickle")(trickle)
    if (wrtc != null) __obj.updateDynamic("wrtc")(wrtc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerOpts]
  }
}

