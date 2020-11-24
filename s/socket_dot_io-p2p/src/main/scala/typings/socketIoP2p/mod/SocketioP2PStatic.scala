package typings.socketIoP2p.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates the P2P object
  * @param socket Socket.io socket
  * @param opts Object of viable options
  * @param cb Optional callback
  */
@js.native
trait SocketioP2PStatic extends js.Object {
  
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
  implicit class SocketioP2PStaticOps[Self <: SocketioP2PStatic] (val x: Self) extends AnyVal {
    
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
    def setBinarySlice(value: (js.Array[_], Double, js.Function0[Unit]) => Unit): Self = this.set("binarySlice", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCb(value: () => Unit): Self = this.set("cb", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDecoder(value: js.Any): Self = this.set("decoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOps(value: DefaultOps): Self = this.set("defaultOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmit(value: (js.Any, js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumConnectedClients(value: Double): Self = this.set("numConnectedClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* data */ js.Any, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpts(value: P2POptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerOpts(value: PeerOpts): Self = this.set("peerOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupPeerEvents(value: js.Any => Unit): Self = this.set("setupPeerEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSocket(value: js.Any): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgrade(value: () => Unit): Self = this.set("upgrade", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsePeerConnection(value: Boolean): Self = this.set("usePeerConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSockets(value: Boolean): Self = this.set("useSockets", value.asInstanceOf[js.Any])
  }
}
