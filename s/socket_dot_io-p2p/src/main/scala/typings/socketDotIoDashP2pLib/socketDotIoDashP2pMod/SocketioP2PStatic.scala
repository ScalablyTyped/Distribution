package typings
package socketDotIoDashP2pLib.socketDotIoDashP2pMod

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
  var defaultOps: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.DefaultOps
  var numConnectedClients: scala.Double
  var opts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.P2POptions
  var peerOpts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.PeerOpts
  var socket: js.Any
  var usePeerConnection: scala.Boolean
  var useSockets: scala.Boolean
  def binarySlice(arr: js.Array[_], interval: scala.Double, cb: js.Function0[scala.Unit]): scala.Unit
  def cb(): scala.Unit
  def disconnect(): scala.Unit
  def emit(eventName: js.Any, data: js.Any): scala.Unit
  def on(event: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit
  def setupPeerEvents(peer: js.Any): scala.Unit
  /**
    * Upgrade the connection to p2p
    */
  def upgrade(): scala.Unit
}

object SocketioP2PStatic {
  @scala.inline
  def apply(
    binarySlice: (js.Array[_], scala.Double, js.Function0[scala.Unit]) => scala.Unit,
    cb: () => scala.Unit,
    decoder: js.Any,
    defaultOps: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.DefaultOps,
    disconnect: () => scala.Unit,
    emit: (js.Any, js.Any) => scala.Unit,
    numConnectedClients: scala.Double,
    on: (java.lang.String, js.Function1[/* data */ js.Any, scala.Unit]) => scala.Unit,
    opts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.P2POptions,
    peerOpts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.PeerOpts,
    setupPeerEvents: js.Any => scala.Unit,
    socket: js.Any,
    upgrade: () => scala.Unit,
    usePeerConnection: scala.Boolean,
    useSockets: scala.Boolean
  ): SocketioP2PStatic = {
    val __obj = js.Dynamic.literal(binarySlice = js.Any.fromFunction3(binarySlice), cb = js.Any.fromFunction0(cb), decoder = decoder, defaultOps = defaultOps, disconnect = js.Any.fromFunction0(disconnect), emit = js.Any.fromFunction2(emit), numConnectedClients = numConnectedClients, on = js.Any.fromFunction2(on), opts = opts, peerOpts = peerOpts, setupPeerEvents = js.Any.fromFunction1(setupPeerEvents), socket = socket, upgrade = js.Any.fromFunction0(upgrade), usePeerConnection = usePeerConnection, useSockets = useSockets)
  
    __obj.asInstanceOf[SocketioP2PStatic]
  }
}

