package typings.rsocketWebsocketClient

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketwebsocketclientMod {
  
  @JSImport("rsocket-websocket-client/RSocketWebSocketClient", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RSocketWebSocketClient {
    def this(options: ClientOptions) = this()
    def this(options: ClientOptions, encoders: Encoders[Any]) = this()
    
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
    
    /* CompleteClass */
    override def send(frames: Flowable[Frame]): Unit = js.native
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
  }
  
  trait ClientOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var lengthPrefixedFrames: js.UndefOr[Boolean] = js.undefined
    
    var url: String
    
    var wsCreator: js.UndefOr[js.Function1[/* url */ String, WebSocket]] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(url: String): ClientOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setLengthPrefixedFrames(value: Boolean): Self = StObject.set(x, "lengthPrefixedFrames", value.asInstanceOf[js.Any])
      
      inline def setLengthPrefixedFramesUndefined: Self = StObject.set(x, "lengthPrefixedFrames", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWsCreator(value: /* url */ String => WebSocket): Self = StObject.set(x, "wsCreator", js.Any.fromFunction1(value))
      
      inline def setWsCreatorUndefined: Self = StObject.set(x, "wsCreator", js.undefined)
    }
  }
  
  trait RSocketWebSocketClient
    extends StObject
       with DuplexConnection {
    
    def send(frames: Flowable[Frame]): Unit
  }
  object RSocketWebSocketClient {
    
    inline def apply(
      close: () => Unit,
      connect: () => Unit,
      connectionStatus: () => Any,
      receive: () => Any,
      send: Flowable[Frame] => Unit,
      sendOne: Frame => Unit
    ): RSocketWebSocketClient = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
      __obj.asInstanceOf[RSocketWebSocketClient]
    }
    
    extension [Self <: RSocketWebSocketClient](x: Self) {
      
      inline def setSend(value: Flowable[Frame] => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
}
