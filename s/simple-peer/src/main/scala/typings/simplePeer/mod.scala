package typings.simplePeer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.simplePeer.anon.Address
import typings.simplePeer.simplePeerStrings.answer
import typings.simplePeer.simplePeerStrings.offer
import typings.simplePeer.simplePeerStrings.pranswer
import typings.simplePeer.simplePeerStrings.rollback
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.MediaStream
import typings.std.MediaStreamTrack
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("simple-peer", JSImport.Namespace)
  @js.native
  class ^ () extends Instance {
    def this(opts: Options) = this()
  }
  @JSImport("simple-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SimplePeer = js.native
  
  @js.native
  trait Instance extends Duplex {
    
    // used for debug logging
    def _debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    def _debug(message: Unit, optionalParams: js.Any*): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peeraddstreamstream
    def addStream(stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peeraddtracktrack-stream
    def addTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    def address(): Address = js.native
    
    // methods which are not documented
    val bufferSize: Double = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peerremovestreamstream
    def removeStream(stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peerremovetracktrack-stream
    def removeTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/blob/v9.6.1/index.js#L306
    def replaceTrack(oldTrack: MediaStreamTrack, newTrack: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v6.1.5#peersenddata
    def send(data: SimplePeerData): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v6.1.5#peersignaldata
    def signal(data: String): Unit = js.native
    def signal(data: SignalData): Unit = js.native
  }
  
  trait Options extends StObject {
    
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
    var sdpTransform: js.UndefOr[js.Function1[/* sdp */ js.Any, js.Any]] = js.undefined
    
    // function to transform the generated SDP signaling data (for advanced users)
    var stream: js.UndefOr[MediaStream] = js.undefined
    
    // if video/voice is desired, pass stream returned from getUserMedia
    var trickle: js.UndefOr[Boolean] = js.undefined
    
    // set to false to disable trickle ICE and get a single 'signal' event (slower)
    var wrtc: js.UndefOr[js.Object] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnswerConstraints(value: js.Object): Self = StObject.set(x, "answerConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnswerConstraintsUndefined: Self = StObject.set(x, "answerConstraints", js.undefined)
      
      @scala.inline
      def setChannelConfig(value: js.Object): Self = StObject.set(x, "channelConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelConfigUndefined: Self = StObject.set(x, "channelConfig", js.undefined)
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setInitiator(value: Boolean): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setOfferConstraints(value: js.Object): Self = StObject.set(x, "offerConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfferConstraintsUndefined: Self = StObject.set(x, "offerConstraints", js.undefined)
      
      @scala.inline
      def setSdpTransform(value: /* sdp */ js.Any => js.Any): Self = StObject.set(x, "sdpTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSdpTransformUndefined: Self = StObject.set(x, "sdpTransform", js.undefined)
      
      @scala.inline
      def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
      
      @scala.inline
      def setWrtc(value: js.Object): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  trait SignalData extends StObject {
    
    var candidate: js.UndefOr[js.Any] = js.undefined
    
    var sdp: js.UndefOr[js.Any] = js.undefined
    
    var `type`: js.UndefOr[offer | pranswer | answer | rollback] = js.undefined
  }
  object SignalData {
    
    @scala.inline
    def apply(): SignalData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignalData]
    }
    
    @scala.inline
    implicit class SignalDataMutableBuilder[Self <: SignalData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidate(value: js.Any): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidateUndefined: Self = StObject.set(x, "candidate", js.undefined)
      
      @scala.inline
      def setSdp(value: js.Any): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
      
      @scala.inline
      def setType(value: offer | pranswer | answer | rollback): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // https://github.com/feross/simple-peer/tree/v6.1.5#peer--new-simplepeeropts
  @js.native
  trait SimplePeer
    extends StObject
       with Instantiable0[Instance]
       with Instantiable1[/* opts */ Options, Instance] {
    
    def apply(): Instance = js.native
    def apply(opts: Options): Instance = js.native
    
    // https://github.com/feross/simple-peer/tree/v6.1.5#peerwebrtc_support
    val WEBRTC_SUPPORT: Boolean = js.native
  }
  
  type SimplePeerData = String | Buffer | TypedArray | ArrayBuffer | Blob
  
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
  
  type _To = js.Object & SimplePeer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & SimplePeer = ^
}
