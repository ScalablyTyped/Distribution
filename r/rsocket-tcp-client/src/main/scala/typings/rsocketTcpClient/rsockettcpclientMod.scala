package typings.rsocketTcpClient

import typings.node.netMod.Socket
import typings.node.netMod.TcpSocketConnectOpts
import typings.node.tlsMod.ConnectionOptions
import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsockettcpclientMod {
  
  @JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTcpClient")
  @js.native
  open class RSocketTcpClient protected () extends RSocketTcpConnection {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[Any]) = this()
  }
  
  @JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTcpConnection")
  @js.native
  open class RSocketTcpConnection ()
    extends StObject
       with DuplexConnection {
    def this(socket: Socket) = this()
    def this(socket: Unit, encoders: Encoders[Any]) = this()
    def this(socket: Socket, encoders: Encoders[Any]) = this()
    
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
    override def connectionStatus(): Any = js.native
    
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
    override def receive(): Any = js.native
    
    def send(frames: Flowable[Frame]): Unit = js.native
    /**
      * Send all the `input` frames on this connection.
      *
      * Notes:
      * - Implementations must not cancel the subscription.
      * - Implementations must signal any errors by calling `onError` on the
      *   `receive()` Publisher.
      */
    /* CompleteClass */
    override def send(
      input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Flowable<Frame> */ Any
    ): Unit = js.native
    
    /**
      * Send a single frame on the connection.
      */
    /* CompleteClass */
    override def sendOne(frame: Frame): Unit = js.native
    
    def setConnectionStatus(status: ConnectionStatus): Unit = js.native
    
    def setupSocket(socket: Socket): Unit = js.native
  }
  
  @JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTlsClient")
  @js.native
  open class RSocketTlsClient protected () extends RSocketTcpConnection {
    def this(options: ConnectionOptions) = this()
    def this(options: ConnectionOptions, encoders: Encoders[Any]) = this()
  }
}
