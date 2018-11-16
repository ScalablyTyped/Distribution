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
@JSImport("socket.io-p2p", JSImport.Namespace)
@js.native
class namespaced protected () extends SocketioP2PStatic {
  def this(socket: js.Any) = this()
  def this(socket: js.Any, opts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.P2POptions) = this()
  def this(socket: js.Any, opts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.P2POptions, cb: js.Function0[scala.Unit]) = this()
  /* CompleteClass */
  override var decoder: js.Any = js.native
  /* CompleteClass */
  override var defaultOps: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.DefaultOps = js.native
  /* CompleteClass */
  override var numConnectedClients: scala.Double = js.native
  /* CompleteClass */
  override var opts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.P2POptions = js.native
  /* CompleteClass */
  override var peerOpts: socketDotIoDashP2pLib.socketDotIoDashP2pMod.SocketioP2PStaticNs.PeerOpts = js.native
  /* CompleteClass */
  override var socket: js.Any = js.native
  /* CompleteClass */
  override var usePeerConnection: scala.Boolean = js.native
  /* CompleteClass */
  override var useSockets: scala.Boolean = js.native
  /* CompleteClass */
  override def binarySlice(arr: js.Array[_], interval: scala.Double, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def cb(): scala.Unit = js.native
  /* CompleteClass */
  override def disconnect(): scala.Unit = js.native
  /* CompleteClass */
  override def emit(eventName: js.Any, data: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def on(event: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def setupPeerEvents(peer: js.Any): scala.Unit = js.native
  /**
     * Upgrade the connection to p2p
     */
  /* CompleteClass */
  override def upgrade(): scala.Unit = js.native
}

