package typings
package socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs

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

