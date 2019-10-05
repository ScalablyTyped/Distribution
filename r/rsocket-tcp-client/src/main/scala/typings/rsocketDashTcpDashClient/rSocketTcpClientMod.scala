package typings.rsocketDashTcpDashClient

import typings.node.netMod.Socket
import typings.node.netMod.TcpSocketConnectOpts
import typings.node.tlsMod.ConnectionOptions
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typings.rsocketDashTcpDashClient.rSocketTcpClientMod.RSocketTcpConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client/RSocketTcpClient", JSImport.Namespace)
@js.native
object rSocketTcpClientMod extends js.Object {
  @js.native
  class RSocketTcpClient protected () extends RSocketTcpConnection {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
  }
  
  @js.native
  class RSocketTcpConnection () extends DuplexConnection {
    def this(socket: Socket) = this()
    def this(socket: Socket, encoders: Encoders[_]) = this()
    /**
      * Close the underlying connection, emitting `onComplete` on the receive()
      * Publisher.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Open the underlying connection. Throws if the connection is already in
      * the CLOSED or ERROR state.
      */
    /* CompleteClass */
    override def connect(): Unit = js.native
    /**
      * Returns a Flowable that immediately publishes the current connection
      * status and thereafter updates as it changes. Once a connection is in
      * the CLOSED or ERROR state, it may not be connected again.
      * Implementations must publish values per the comments on ConnectionStatus.
      */
    /* CompleteClass */
    override def connectionStatus(): Flowable[ConnectionStatus] = js.native
    def getConnectionState(): ConnectionStatus = js.native
    /**
      * Returns a stream of all `Frame`s received on this connection.
      *
      * Notes:
      * - Implementations must call `onComplete` if the underlying connection is
      *   closed by the peer or by calling `close()`.
      * - Implementations must call `onError` if there are any errors
      *   sending/receiving frames.
      * - Implemenations may optionally support multi-cast receivers. Those that do
      *   not should throw if `receive` is called more than once.
      */
    /* CompleteClass */
    override def receive(): Flowable[Frame] = js.native
    /**
      * Send all the `input` frames on this connection.
      *
      * Notes:
      * - Implementations must not cancel the subscription.
      * - Implementations must signal any errors by calling `onError` on the
      *   `receive()` Publisher.
      */
    /* CompleteClass */
    override def send(input: Flowable[Frame]): Unit = js.native
    /**
      * Send a single frame on the connection.
      */
    /* CompleteClass */
    override def sendOne(frame: Frame): Unit = js.native
    def setConnectionStatus(status: ConnectionStatus): Unit = js.native
    def setupSocket(socket: Socket): Unit = js.native
  }
  
  @js.native
  class RSocketTlsClient protected () extends RSocketTcpConnection {
    def this(options: ConnectionOptions) = this()
    def this(options: ConnectionOptions, encoders: Encoders[_]) = this()
  }
  
}

