package typings.simplePeer.mod

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
   // custom offer constraints (used by createOffer method)
  var answerConstraints: js.UndefOr[js.Object] = js.native
  
   // set to true if this is the initiating peer
  var channelConfig: js.UndefOr[js.Object] = js.native
  
   // custom webrtc data channel configuration (used by createDataChannel)
  var channelName: js.UndefOr[String] = js.native
  
   // custom webrtc data channel name
  var config: js.UndefOr[js.Object] = js.native
  
   // custom webrtc configuration (used by RTCPeerConnection constructor)
  var constraints: js.UndefOr[js.Object] = js.native
  
  var initiator: js.UndefOr[Boolean] = js.native
  
   // RTCPeerConnection/RTCSessionDescription/RTCIceCandidate
  var objectMode: js.UndefOr[Boolean] = js.native
  
   // custom webrtc video/voice constraints (used by RTCPeerConnection constructor)
  var offerConstraints: js.UndefOr[js.Object] = js.native
  
   // custom answer constraints (used by createAnswer method)
  var sdpTransform: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.native
  
   // function to transform the generated SDP signaling data (for advanced users)
  var stream: js.UndefOr[MediaStream] = js.native
  
   // if video/voice is desired, pass stream returned from getUserMedia
  var trickle: js.UndefOr[Boolean] = js.native
  
   // set to false to disable trickle ICE and get a single 'signal' event (slower)
  var wrtc: js.UndefOr[js.Object] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setSdpTransform(value: /* sdp */ js.Any => _): Self = this.set("sdpTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSdpTransform: Self = this.set("sdpTransform", js.undefined)
    
    @scala.inline
    def setStream(value: MediaStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setTrickle(value: Boolean): Self = this.set("trickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrickle: Self = this.set("trickle", js.undefined)
    
    @scala.inline
    def setWrtc(value: js.Object): Self = this.set("wrtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrtc: Self = this.set("wrtc", js.undefined)
  }
}
