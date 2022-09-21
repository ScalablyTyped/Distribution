package typings.simplePeer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import typings.simplePeer.anon.Address
import typings.simplePeer.anon.Family
import typings.simplePeer.anon.Init
import typings.simplePeer.anon.RTCIceCandidate
import typings.simplePeer.simplePeerStrings.close
import typings.simplePeer.simplePeerStrings.connect
import typings.simplePeer.simplePeerStrings.data
import typings.simplePeer.simplePeerStrings.end
import typings.simplePeer.simplePeerStrings.error
import typings.simplePeer.simplePeerStrings.pause
import typings.simplePeer.simplePeerStrings.readable
import typings.simplePeer.simplePeerStrings.resume
import typings.simplePeer.simplePeerStrings.signal
import typings.simplePeer.simplePeerStrings.stream
import typings.simplePeer.simplePeerStrings.track
import typings.std.Blob
import typings.std.MediaStream
import typings.std.MediaStreamTrack
import typings.std.RTCAnswerOptions
import typings.std.RTCConfiguration
import typings.std.RTCDataChannelInit
import typings.std.RTCOfferOptions
import typings.std.RTCRtpTransceiverInit
import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("simple-peer", JSImport.Namespace)
  @js.native
  /**
    * Create a new WebRTC peer connection.
    *
    * A "data channel" for text/binary communication is always established, because it's cheap and often useful. For video/voice communication, pass the stream option.
    *
    * If opts is specified, then the default options (see <https://github.com/feross/simple-peer#peer--new-peeropts>) will be overridden.
    */
  open class ^ () extends Instance {
    def this(opts: Options) = this()
  }
  @JSImport("simple-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SimplePeer = js.native
  
  @js.native
  trait Instance extends Duplex {
    
    // used for debug logging
    def _debug(message: Any, optionalParams: Any*): Unit = js.native
    def _debug(message: Unit, optionalParams: Any*): Unit = js.native
    
    // ******
    // events
    // ******
    def addListener(event: connect | close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_signal(event: signal, listener: js.Function1[/* data */ SignalData, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_track(event: track, listener: js.Function2[/* track */ MediaStreamTrack, /* stream */ MediaStream, Unit]): this.type = js.native
    
    /** Add a `MediaStream` to the connection. */
    def addStream(stream: MediaStream): Unit = js.native
    
    /** Add a `MediaStreamTrack` to the connection. Must also pass the `MediaStream` you want to attach it to. */
    def addTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    /** Add a `RTCRtpTransceiver` to the connection. Can be used to add transceivers before adding tracks. Automatically called as necessary by `addTrack`. */
    def addTransceiver(kind: String): Unit = js.native
    def addTransceiver(kind: String, init: RTCRtpTransceiverInit): Unit = js.native
    
    def address(): Address | Family = js.native
    
    // ********************************
    // methods which are not documented
    // ********************************
    val bufferSize: Double = js.native
    
    val connected: Boolean = js.native
    
    // TODO: https://github.com/feross/simple-peer/blob/d972548299a50f836ca91c36e39304ef0f9474b7/index.js#L427
    // destroy(onclose?: () => void): void;
    /**
      * Destroy and cleanup this peer connection.
      *
      * If the optional `err` parameter is passed, then it will be emitted as an `'error'`
      * event on the stream.
      */
    def destroy(): Any = js.native
    def destroy(error: js.Error): Any = js.native
    
    def emit(event: connect | close | end | pause | readable | resume): Boolean = js.native
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: Any): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_signal(event: signal, data: SignalData): this.type = js.native
    @JSName("emit")
    def emit_stream(event: stream, stream: MediaStream): this.type = js.native
    @JSName("emit")
    def emit_track(event: track, track: MediaStreamTrack, stream: MediaStream): this.type = js.native
    
    def on(event: connect | close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_signal(event: signal, listener: js.Function1[/* data */ SignalData, Unit]): this.type = js.native
    @JSName("on")
    def on_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
    @JSName("on")
    def on_track(event: track, listener: js.Function2[/* track */ MediaStreamTrack, /* stream */ MediaStream, Unit]): this.type = js.native
    
    def once(event: connect | close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_signal(event: signal, listener: js.Function1[/* data */ SignalData, Unit]): this.type = js.native
    @JSName("once")
    def once_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
    @JSName("once")
    def once_track(event: track, listener: js.Function2[/* track */ MediaStreamTrack, /* stream */ MediaStream, Unit]): this.type = js.native
    
    def prependListener(event: connect | close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_signal(event: signal, listener: js.Function1[/* data */ SignalData, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_track(event: track, listener: js.Function2[/* track */ MediaStreamTrack, /* stream */ MediaStream, Unit]): this.type = js.native
    
    def prependOnceListener(event: connect | close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_signal(event: signal, listener: js.Function1[/* data */ SignalData, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_track(event: track, listener: js.Function2[/* track */ MediaStreamTrack, /* stream */ MediaStream, Unit]): this.type = js.native
    
    def removeListener(event: connect | close | end | pause | readable | resume, listener: js.Function0[Unit]): this.type = js.native
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_signal(event: signal, listener: js.Function1[/* data */ SignalData, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_stream(event: stream, listener: js.Function1[/* stream */ MediaStream, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_track(event: track, listener: js.Function2[/* track */ MediaStreamTrack, /* stream */ MediaStream, Unit]): this.type = js.native
    
    /** Remove a `MediaStream` from the connection. */
    def removeStream(stream: MediaStream): Unit = js.native
    
    /** Remove a `MediaStreamTrack` from the connection. Must also pass the `MediaStream` that it was attached to. */
    def removeTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    /** Replace a `MediaStreamTrack` with another track. Must also pass the `MediaStream` that the old track was attached to. */
    def replaceTrack(oldTrack: MediaStreamTrack, newTrack: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    /**
      * Send text/binary data to the remote peer. `data` can be any of several types: `String`,
      * `Buffer` (see [buffer](https://github.com/feross/buffer)), `ArrayBufferView` (`Uint8Array`,
      * etc.), `ArrayBuffer`, or `Blob` (in browsers that support it).
      *
      * Note: If this method is called before the `peer.on('connect')` event has fired,
      * then an exception will be thrown. Use `peer.write(data)`
      * (which is inherited from the node.js [duplex stream](https://nodejs.org/api/stream.html) interface)
      * if you want this data to be buffered instead.
      */
    def send(data: SimplePeerData): Unit = js.native
    
    /**
      * Call this method whenever the remote peer emits a `peer.on('signal')` event.
      *
      * The `data` will encapsulate a webrtc offer, answer, or ice candidate. These messages help
      * the peers to eventually establish a direct connection to each other. The contents of these
      * strings are an implementation detail that can be ignored by the user of this module;
      * simply pass the data from 'signal' events to the remote peer and call `peer.signal(data)`
      * to get connected.
      */
    def signal(data: String): Unit = js.native
    def signal(data: SignalData): Unit = js.native
    
    val streams: js.Array[MediaStream] = js.native
  }
  
  trait Options extends StObject {
    
    /** similar to `trickle`, needs to be set to `false` to disable trickling, defaults to `false` */
    var allowHalfTrickle: js.UndefOr[Boolean] = js.undefined
    
    /** custom answer options (used by [`createAnswer`](https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createAnswer) method) */
    var answerOptions: js.UndefOr[RTCAnswerOptions] = js.undefined
    
    /** custom webrtc data channel configuration (used by [`createDataChannel`](https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createDataChannel)) */
    var channelConfig: js.UndefOr[RTCDataChannelInit] = js.undefined
    
    /** custom webrtc data channel name */
    var channelName: js.UndefOr[String] = js.undefined
    
    /** custom webrtc configuration (used by [`RTCPeerConnection`](https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection) constructor) */
    var config: js.UndefOr[RTCConfiguration] = js.undefined
    
    /** if `trickle` is set to `false`, determines how long to wait before providing an offer or answer; default value is 5000 milliseconds  */
    var iceCompleteTimeout: js.UndefOr[Double] = js.undefined
    
    /** set to `true` if this is the initiating peer */
    var initiator: js.UndefOr[Boolean] = js.undefined
    
    /** set to true to create the stream in Object Mode. In this mode, incoming string data is not automatically converted to Buffer objects. */
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    /** custom offer options (used by [`createOffer`](https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createOffer) method) */
    var offerOptions: js.UndefOr[RTCOfferOptions] = js.undefined
    
    /** function to transform the generated SDP signaling data (for advanced users) */
    var sdpTransform: js.UndefOr[js.ThisFunction1[/* this */ Instance, /* sdp */ String, String]] = js.undefined
    
    /** if video/voice is desired, pass stream returned from [`getUserMedia`](https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia) */
    var stream: js.UndefOr[MediaStream] = js.undefined
    
    /** an array of MediaStreams returned from [`getUserMedia`](https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia) */
    var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
    
    /** set to `false` to disable [trickle ICE](http://webrtchacks.com/trickle-ice/) and get a single 'signal' event (slower) */
    var trickle: js.UndefOr[Boolean] = js.undefined
    
    /** custom webrtc implementation, mainly useful in node to specify in the [wrtc](https://npmjs.com/package/wrtc) package. */
    var wrtc: js.UndefOr[RTCIceCandidate] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowHalfTrickle(value: Boolean): Self = StObject.set(x, "allowHalfTrickle", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfTrickleUndefined: Self = StObject.set(x, "allowHalfTrickle", js.undefined)
      
      inline def setAnswerOptions(value: RTCAnswerOptions): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
      
      inline def setAnswerOptionsUndefined: Self = StObject.set(x, "answerOptions", js.undefined)
      
      inline def setChannelConfig(value: RTCDataChannelInit): Self = StObject.set(x, "channelConfig", value.asInstanceOf[js.Any])
      
      inline def setChannelConfigUndefined: Self = StObject.set(x, "channelConfig", js.undefined)
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      inline def setConfig(value: RTCConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setIceCompleteTimeout(value: Double): Self = StObject.set(x, "iceCompleteTimeout", value.asInstanceOf[js.Any])
      
      inline def setIceCompleteTimeoutUndefined: Self = StObject.set(x, "iceCompleteTimeout", js.undefined)
      
      inline def setInitiator(value: Boolean): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOfferOptions(value: RTCOfferOptions): Self = StObject.set(x, "offerOptions", value.asInstanceOf[js.Any])
      
      inline def setOfferOptionsUndefined: Self = StObject.set(x, "offerOptions", js.undefined)
      
      inline def setSdpTransform(value: js.ThisFunction1[/* this */ Instance, /* sdp */ String, String]): Self = StObject.set(x, "sdpTransform", value.asInstanceOf[js.Any])
      
      inline def setSdpTransformUndefined: Self = StObject.set(x, "sdpTransform", js.undefined)
      
      inline def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStreams(value: js.Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value*))
      
      inline def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      inline def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
      
      inline def setWrtc(value: RTCIceCandidate): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      inline def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simplePeer.anon.TransceiverRequest
    - typings.simplePeer.anon.Renegotiate
    - typings.simplePeer.anon.Candidate
    - typings.std.RTCSessionDescriptionInit
  */
  type SignalData = _SignalData | RTCSessionDescriptionInit
  
  @js.native
  trait SimplePeer
    extends StObject
       with /**
    * Create a new WebRTC peer connection.
    *
    * A "data channel" for text/binary communication is always established, because it's cheap and often useful. For video/voice communication, pass the stream option.
    *
    * If opts is specified, then the default options (see <https://github.com/feross/simple-peer#peer--new-peeropts>) will be overridden.
    */
  Instantiable0[Instance]
       with Instantiable1[/* opts */ Options, Instance] {
    
    /** Detect native WebRTC support in the javascript environment. */
    val WEBRTC_SUPPORT: Boolean = js.native
    
    /**
      * Expose peer and data channel config for overriding all Peer
      * instances. Otherwise, just set opts.config or opts.channelConfig
      * when constructing a Peer.
      */
    var channelConfig: RTCDataChannelInit = js.native
    
    // ********************************
    // methods which are not documented
    // ********************************
    /**
      * Expose peer and data channel config for overriding all Peer
      * instances. Otherwise, just set opts.config or opts.channelConfig
      * when constructing a Peer.
      */
    var config: RTCConfiguration = js.native
  }
  
  type SimplePeerData = String | Buffer | TypedArray | js.typedarray.ArrayBuffer | Blob
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  trait _SignalData extends StObject
  object _SignalData {
    
    inline def Candidate(candidate: typings.std.RTCIceCandidate): typings.simplePeer.anon.Candidate = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candidate")
      __obj.asInstanceOf[typings.simplePeer.anon.Candidate]
    }
    
    inline def Renegotiate(): typings.simplePeer.anon.Renegotiate = {
      val __obj = js.Dynamic.literal(renegotiate = true)
      __obj.updateDynamic("type")("renegotiate")
      __obj.asInstanceOf[typings.simplePeer.anon.Renegotiate]
    }
    
    inline def TransceiverRequest(transceiverRequest: Init): typings.simplePeer.anon.TransceiverRequest = {
      val __obj = js.Dynamic.literal(transceiverRequest = transceiverRequest.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transceiverRequest")
      __obj.asInstanceOf[typings.simplePeer.anon.TransceiverRequest]
    }
  }
  
  type _To = js.Object & SimplePeer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & SimplePeer = ^
}
