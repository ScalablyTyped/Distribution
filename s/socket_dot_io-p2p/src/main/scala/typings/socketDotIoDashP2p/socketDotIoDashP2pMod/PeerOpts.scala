package typings.socketDotIoDashP2p.socketDotIoDashP2pMod

import typings.std.MediaStream
import typings.std.RTCIceCandidate
import typings.std.RTCPeerConnection
import typings.std.RTCSessionDescription
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
  var channelName: js.UndefOr[String] = js.undefined
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
  var initiator: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to create the stream in Object Mode. In this mode, incoming string data is not automatically converted to Buffer objects
    * @default false
    */
  var objectMode: js.UndefOr[Boolean] = js.undefined
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
  var stream: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of MediaStreams returned from getUserMedia
    * @default []
    */
  var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
  /**
    * Set to false to disable trickle ICE and get single 'signal' event (slower)
    * @default true
    */
  var trickle: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom WebRTC implementation, mainly useful in node to specify the wrtc package
    * @default {}
    */
  var wrtc: js.UndefOr[RTCPeerConnection | RTCSessionDescription | RTCIceCandidate] = js.undefined
}

object PeerOpts {
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
    sdpTransfrom: /* sdp */ js.Any => _ = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    streams: js.Array[MediaStream] = null,
    trickle: js.UndefOr[Boolean] = js.undefined,
    wrtc: RTCPeerConnection | RTCSessionDescription | RTCIceCandidate = null
  ): PeerOpts = {
    val __obj = js.Dynamic.literal()
    if (answerConstraints != null) __obj.updateDynamic("answerConstraints")(answerConstraints.asInstanceOf[js.Any])
    if (channelConfig != null) __obj.updateDynamic("channelConfig")(channelConfig.asInstanceOf[js.Any])
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (!js.isUndefined(initiator)) __obj.updateDynamic("initiator")(initiator.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (offerConstraints != null) __obj.updateDynamic("offerConstraints")(offerConstraints.asInstanceOf[js.Any])
    if (sdpTransfrom != null) __obj.updateDynamic("sdpTransfrom")(js.Any.fromFunction1(sdpTransfrom))
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    if (!js.isUndefined(trickle)) __obj.updateDynamic("trickle")(trickle.asInstanceOf[js.Any])
    if (wrtc != null) __obj.updateDynamic("wrtc")(wrtc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerOpts]
  }
}

