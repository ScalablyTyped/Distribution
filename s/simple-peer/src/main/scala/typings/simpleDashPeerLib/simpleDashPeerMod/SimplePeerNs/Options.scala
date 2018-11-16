package typings
package simpleDashPeerLib.simpleDashPeerMod.SimplePeerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
   // custom offer constraints (used by createOffer method)
  var answerConstraints: js.UndefOr[js.Object] = js.undefined
   // set to true if this is the initiating peer
  var channelConfig: js.UndefOr[js.Object] = js.undefined
   // custom webrtc data channel configuration (used by createDataChannel)
  var channelName: js.UndefOr[java.lang.String] = js.undefined
   // custom webrtc data channel name
  var config: js.UndefOr[js.Object] = js.undefined
   // custom webrtc configuration (used by RTCPeerConnection constructor)
  var constraints: js.UndefOr[js.Object] = js.undefined
  var initiator: js.UndefOr[scala.Boolean] = js.undefined
   // RTCPeerConnection/RTCSessionDescription/RTCIceCandidate
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
   // custom webrtc video/voice constraints (used by RTCPeerConnection constructor)
  var offerConstraints: js.UndefOr[js.Object] = js.undefined
   // custom answer constraints (used by createAnswer method)
  var reconnectTimer: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
   // wait __ milliseconds after ICE 'disconnect' for reconnect attempt before emitting 'close'
  var sdpTransform: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.undefined
   // function to transform the generated SDP signaling data (for advanced users)
  var stream: js.UndefOr[stdLib.MediaStream] = js.undefined
   // if video/voice is desired, pass stream returned from getUserMedia
  var trickle: js.UndefOr[scala.Boolean] = js.undefined
   // set to false to disable trickle ICE and get a single 'signal' event (slower)
  var wrtc: js.UndefOr[js.Object] = js.undefined
}

