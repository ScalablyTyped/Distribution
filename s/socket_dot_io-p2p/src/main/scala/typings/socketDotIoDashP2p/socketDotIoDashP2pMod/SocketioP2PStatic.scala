package typings.socketDotIoDashP2p.socketDotIoDashP2pMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates the P2P object
  * @param socket Socket.io socket
  * @param opts Object of viable options
  * @param cb Optional callback
  */
trait SocketioP2PStatic extends js.Object {
  var decoder: js.Any
  var defaultOps: DefaultOps
  var numConnectedClients: Double
  var opts: P2POptions
  var peerOpts: PeerOpts
  var socket: js.Any
  var usePeerConnection: Boolean
  var useSockets: Boolean
  def binarySlice(arr: js.Array[_], interval: Double, cb: js.Function0[Unit]): Unit
  def cb(): Unit
  def disconnect(): Unit
  def emit(eventName: js.Any, data: js.Any): Unit
  def on(event: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit
  def setupPeerEvents(peer: js.Any): Unit
  /**
    * Upgrade the connection to p2p
    */
  def upgrade(): Unit
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
    val __obj = js.Dynamic.literal(binarySlice = js.Any.fromFunction3(binarySlice), cb = js.Any.fromFunction0(cb), decoder = decoder, defaultOps = defaultOps, disconnect = js.Any.fromFunction0(disconnect), emit = js.Any.fromFunction2(emit), numConnectedClients = numConnectedClients, on = js.Any.fromFunction2(on), opts = opts, peerOpts = peerOpts, setupPeerEvents = js.Any.fromFunction1(setupPeerEvents), socket = socket, upgrade = js.Any.fromFunction0(upgrade), usePeerConnection = usePeerConnection, useSockets = useSockets)
  
    __obj.asInstanceOf[SocketioP2PStatic]
  }
}

