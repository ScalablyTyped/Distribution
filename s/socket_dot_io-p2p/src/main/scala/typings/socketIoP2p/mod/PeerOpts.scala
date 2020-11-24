package typings.socketIoP2p.mod

import typings.std.MediaStream
import typings.std.RTCIceCandidate
import typings.std.RTCPeerConnection
import typings.std.RTCSessionDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerOpts extends js.Object {
  
  /**
    * Custom answer constraints (used by createAnswer method)
    */
  var answerConstraints: js.UndefOr[js.Object] = js.native
  
  /**
    * Custom WebRTC channel configuration (used by createDataChannel)
    * @default {}
    */
  var channelConfig: js.UndefOr[js.Object] = js.native
  
  /**
    * Custom WebRTC data channel name
    * @default <randomString>
    */
  var channelName: js.UndefOr[String] = js.native
  
  /**
    * Custom WebRTC configuration (used by RTCPeerConnection constructor)
    * @default {iceServers:[{urls:'stun:stun.l.google.com:19302'},{urls:'stun:global.stun.twilio.com:3478?transport=udp'}]}
    */
  var config: js.UndefOr[js.Object] = js.native
  
  /**
    * Custom WebRTC video/voice constrainst (used by RTCPeerConnection constructor)
    * @default {}
    */
  var constraints: js.UndefOr[js.Object] = js.native
  
  /**
    * Set to true if this is the initiating peer
    * @default false
    */
  var initiator: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to create the stream in Object Mode. In this mode, incoming string data is not automatically converted to Buffer objects
    * @default false
    */
  var objectMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom offer contstraints (used by createOffer methode)
    * @default {}
    */
  var offerConstraints: js.UndefOr[js.Object] = js.native
  
  /**
    * Function to transform generated SDP signaling data (for advanced users)
    * @default (sdp)=>sdp
    */
  var sdpTransfrom: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.native
  
  /**
    * If video/voice is desired, pass stream from getUserMedia
    * @default false
    */
  var stream: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of MediaStreams returned from getUserMedia
    * @default []
    */
  var streams: js.UndefOr[js.Array[MediaStream]] = js.native
  
  /**
    * Set to false to disable trickle ICE and get single 'signal' event (slower)
    * @default true
    */
  var trickle: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom WebRTC implementation, mainly useful in node to specify the wrtc package
    * @default {}
    */
  var wrtc: js.UndefOr[RTCPeerConnection | RTCSessionDescription | RTCIceCandidate] = js.native
}
object PeerOpts {
  
  @scala.inline
  def apply(): PeerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerOpts]
  }
  
  @scala.inline
  implicit class PeerOptsOps[Self <: PeerOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnswerConstraints(value: js.Object): Self = this.set("answerConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswerConstraints: Self = this.set("answerConstraints", js.undefined)
    
    @scala.inline
    def setChannelConfig(value: js.Object): Self = this.set("channelConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelConfig: Self = this.set("channelConfig", js.undefined)
    
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    
    @scala.inline
    def setConfig(value: js.Object): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setConstraints(value: js.Object): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setInitiator(value: Boolean): Self = this.set("initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("initiator", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    
    @scala.inline
    def setOfferConstraints(value: js.Object): Self = this.set("offerConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferConstraints: Self = this.set("offerConstraints", js.undefined)
    
    @scala.inline
    def setSdpTransfrom(value: /* sdp */ js.Any => _): Self = this.set("sdpTransfrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSdpTransfrom: Self = this.set("sdpTransfrom", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: MediaStream*): Self = this.set("streams", js.Array(value :_*))
    
    @scala.inline
    def setStreams(value: js.Array[MediaStream]): Self = this.set("streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
    
    @scala.inline
    def setTrickle(value: Boolean): Self = this.set("trickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrickle: Self = this.set("trickle", js.undefined)
    
    @scala.inline
    def setWrtc(value: RTCPeerConnection | RTCSessionDescription | RTCIceCandidate): Self = this.set("wrtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrtc: Self = this.set("wrtc", js.undefined)
  }
}
