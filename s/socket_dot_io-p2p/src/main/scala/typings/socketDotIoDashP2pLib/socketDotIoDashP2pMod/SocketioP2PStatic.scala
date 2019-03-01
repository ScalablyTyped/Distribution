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
    binarySlice: js.Function3[js.Array[_], scala.Double, js.Function0[scala.Unit], scala.Unit],
    cb: js.Function0[scala.Unit],
    decoder: js.Any,
    defaultOps: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.DefaultOps,
    disconnect: js.Function0[scala.Unit],
    emit: js.Function2[js.Any, js.Any, scala.Unit],
    numConnectedClients: scala.Double,
    on: js.Function2[java.lang.String, js.Function1[/* data */ js.Any, scala.Unit], scala.Unit],
    opts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.P2POptions,
    peerOpts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.PeerOpts,
    setupPeerEvents: js.Function1[js.Any, scala.Unit],
    socket: js.Any,
    upgrade: js.Function0[scala.Unit],
    usePeerConnection: scala.Boolean,
    useSockets: scala.Boolean
  ): SocketioP2PStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binarySlice")(binarySlice)
    __obj.updateDynamic("cb")(cb)
    __obj.updateDynamic("decoder")(decoder)
    __obj.updateDynamic("defaultOps")(defaultOps)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("numConnectedClients")(numConnectedClients)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("opts")(opts)
    __obj.updateDynamic("peerOpts")(peerOpts)
    __obj.updateDynamic("setupPeerEvents")(setupPeerEvents)
    __obj.updateDynamic("socket")(socket)
    __obj.updateDynamic("upgrade")(upgrade)
    __obj.updateDynamic("usePeerConnection")(usePeerConnection)
    __obj.updateDynamic("useSockets")(useSockets)
    __obj.asInstanceOf[SocketioP2PStatic]
  }
}

