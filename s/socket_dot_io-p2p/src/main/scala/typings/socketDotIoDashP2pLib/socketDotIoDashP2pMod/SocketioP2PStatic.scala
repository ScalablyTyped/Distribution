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

