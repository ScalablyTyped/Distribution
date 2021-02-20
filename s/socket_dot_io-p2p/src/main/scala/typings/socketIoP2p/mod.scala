package typings.socketIoP2p

import typings.std.MediaStream
import typings.std.RTCIceCandidate
import typings.std.RTCPeerConnection
import typings.std.RTCSessionDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates the P2P object
    * @param socket Socket.io socket
    * @param opts Object of viable options
    * @param cb Optional callback
    */
  @JSImport("socket.io-p2p", JSImport.Namespace)
  @js.native
  class ^ protected () extends SocketioP2PStatic {
    def this(socket: js.Any) = this()
    def this(socket: js.Any, opts: P2POptions) = this()
    def this(socket: js.Any, opts: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]) = this()
    def this(socket: js.Any, opts: P2POptions, cb: js.Function0[Unit]) = this()
  }
  
  @js.native
  trait DefaultOps extends StObject {
    
    var autoUpgrade: Boolean = js.native
    
    var numClients: Double = js.native
  }
  object DefaultOps {
    
    @scala.inline
    def apply(autoUpgrade: Boolean, numClients: Double): DefaultOps = {
      val __obj = js.Dynamic.literal(autoUpgrade = autoUpgrade.asInstanceOf[js.Any], numClients = numClients.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOps]
    }
    
    @scala.inline
    implicit class DefaultOpsMutableBuilder[Self <: DefaultOps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "autoUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumClients(value: Double): Self = StObject.set(x, "numClients", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait P2POptions extends StObject {
    
    /**
      * Upgrade to p2p connection (from s.io one) when peers are ready
      * @default true
      */
    var autoUpgrade: js.UndefOr[Boolean] = js.native
    
    /**
      * Max number of peers each client can connect to
      * @default 5
      */
    var numClients: js.UndefOr[Double] = js.native
    
    /**
      * Object of options passed to underlying peers
      * @default {}
      */
    var peerOpts: js.UndefOr[PeerOpts] = js.native
  }
  object P2POptions {
    
    @scala.inline
    def apply(): P2POptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P2POptions]
    }
    
    @scala.inline
    implicit class P2POptionsMutableBuilder[Self <: P2POptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "autoUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUpgradeUndefined: Self = StObject.set(x, "autoUpgrade", js.undefined)
      
      @scala.inline
      def setNumClients(value: Double): Self = StObject.set(x, "numClients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumClientsUndefined: Self = StObject.set(x, "numClients", js.undefined)
      
      @scala.inline
      def setPeerOpts(value: PeerOpts): Self = StObject.set(x, "peerOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerOptsUndefined: Self = StObject.set(x, "peerOpts", js.undefined)
    }
  }
  
  @js.native
  trait PeerOpts extends StObject {
    
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
    implicit class PeerOptsMutableBuilder[Self <: PeerOpts] (val x: Self) extends AnyVal {
      
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
      def setSdpTransfrom(value: /* sdp */ js.Any => _): Self = StObject.set(x, "sdpTransfrom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSdpTransfromUndefined: Self = StObject.set(x, "sdpTransfrom", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreams(value: js.Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      @scala.inline
      def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
      
      @scala.inline
      def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
      
      @scala.inline
      def setWrtc(value: RTCPeerConnection | RTCSessionDescription | RTCIceCandidate): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  /**
    * Creates the P2P object
    * @param socket Socket.io socket
    * @param opts Object of viable options
    * @param cb Optional callback
    */
  @js.native
  trait SocketioP2PStatic extends StObject {
    
    def binarySlice(arr: js.Array[_], interval: Double, cb: js.Function0[Unit]): Unit = js.native
    
    def cb(): Unit = js.native
    
    var decoder: js.Any = js.native
    
    var defaultOps: DefaultOps = js.native
    
    def disconnect(): Unit = js.native
    
    def emit(eventName: js.Any, data: js.Any): Unit = js.native
    
    var numConnectedClients: Double = js.native
    
    def on(event: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    
    var opts: P2POptions = js.native
    
    var peerOpts: PeerOpts = js.native
    
    def setupPeerEvents(peer: js.Any): Unit = js.native
    
    var socket: js.Any = js.native
    
    /**
      * Upgrade the connection to p2p
      */
    def upgrade(): Unit = js.native
    
    var usePeerConnection: Boolean = js.native
    
    var useSockets: Boolean = js.native
  }
  object SocketioP2PStatic {
    
    @scala.inline
    def apply(
      binarySlice: (js.Array[_], Double, js.Function0[Unit]) => Unit,
      cb: () => Unit,
      decoder: js.Any,
      defaultOps: DefaultOps,
      disconnect: () => Unit,
      emit: (js.Any, js.Any) => Unit,
      numConnectedClients: Double,
      on: (String, js.Function1[/* data */ js.Any, Unit]) => Unit,
      opts: P2POptions,
      peerOpts: PeerOpts,
      setupPeerEvents: js.Any => Unit,
      socket: js.Any,
      upgrade: () => Unit,
      usePeerConnection: Boolean,
      useSockets: Boolean
    ): SocketioP2PStatic = {
      val __obj = js.Dynamic.literal(binarySlice = js.Any.fromFunction3(binarySlice), cb = js.Any.fromFunction0(cb), decoder = decoder.asInstanceOf[js.Any], defaultOps = defaultOps.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), emit = js.Any.fromFunction2(emit), numConnectedClients = numConnectedClients.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), opts = opts.asInstanceOf[js.Any], peerOpts = peerOpts.asInstanceOf[js.Any], setupPeerEvents = js.Any.fromFunction1(setupPeerEvents), socket = socket.asInstanceOf[js.Any], upgrade = js.Any.fromFunction0(upgrade), usePeerConnection = usePeerConnection.asInstanceOf[js.Any], useSockets = useSockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketioP2PStatic]
    }
    
    @scala.inline
    implicit class SocketioP2PStaticMutableBuilder[Self <: SocketioP2PStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinarySlice(value: (js.Array[_], Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "binarySlice", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCb(value: () => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDecoder(value: js.Any): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOps(value: DefaultOps): Self = StObject.set(x, "defaultOps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmit(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNumConnectedClients(value: Double): Self = StObject.set(x, "numConnectedClients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* data */ js.Any, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpts(value: P2POptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerOpts(value: PeerOpts): Self = StObject.set(x, "peerOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupPeerEvents(value: js.Any => Unit): Self = StObject.set(x, "setupPeerEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSocket(value: js.Any): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgrade(value: () => Unit): Self = StObject.set(x, "upgrade", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUsePeerConnection(value: Boolean): Self = StObject.set(x, "usePeerConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSockets(value: Boolean): Self = StObject.set(x, "useSockets", value.asInstanceOf[js.Any])
    }
  }
}
