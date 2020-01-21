package typings.socketIoP2p.mod

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
class ^ protected () extends SocketioP2PStatic {
  def this(socket: js.Any) = this()
  def this(socket: js.Any, opts: P2POptions) = this()
  def this(socket: js.Any, opts: P2POptions, cb: js.Function0[Unit]) = this()
  /* CompleteClass */
  override var decoder: js.Any = js.native
  /* CompleteClass */
  override var defaultOps: DefaultOps = js.native
  /* CompleteClass */
  override var numConnectedClients: Double = js.native
  /* CompleteClass */
  override var opts: P2POptions = js.native
  /* CompleteClass */
  override var peerOpts: PeerOpts = js.native
  /* CompleteClass */
  override var socket: js.Any = js.native
  /* CompleteClass */
  override var usePeerConnection: Boolean = js.native
  /* CompleteClass */
  override var useSockets: Boolean = js.native
  /* CompleteClass */
  override def binarySlice(arr: js.Array[_], interval: Double, cb: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def cb(): Unit = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def emit(eventName: js.Any, data: js.Any): Unit = js.native
  /* CompleteClass */
  override def on(event: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  /* CompleteClass */
  override def setupPeerEvents(peer: js.Any): Unit = js.native
  /**
    * Upgrade the connection to p2p
    */
  /* CompleteClass */
  override def upgrade(): Unit = js.native
}

