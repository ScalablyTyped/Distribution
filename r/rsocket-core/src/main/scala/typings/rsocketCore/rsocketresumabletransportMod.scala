package typings.rsocketCore

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Encodable
import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketresumabletransportMod {
  
  @JSImport("rsocket-core/RSocketResumableTransport", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RSocketResumableTransport {
    def this(source: js.Function0[DuplexConnection], options: Options) = this()
    def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[Any]) = this()
    
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
  
  trait Options extends StObject {
    
    var bufferSize: Double
    
    var resumeToken: Encodable
    
    var sessionDurationSeconds: Double
  }
  object Options {
    
    inline def apply(bufferSize: Double, resumeToken: Encodable, sessionDurationSeconds: Double): Options = {
      val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], sessionDurationSeconds = sessionDurationSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setResumeToken(value: Encodable): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
      
      inline def setSessionDurationSeconds(value: Double): Self = StObject.set(x, "sessionDurationSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait RSocketResumableTransport
    extends StObject
       with DuplexConnection {
    
    def send(frames: Flowable[Frame]): Unit
  }
  object RSocketResumableTransport {
    
    inline def apply(
      close: () => Unit,
      connect: () => Unit,
      connectionStatus: () => Any,
      receive: () => Any,
      send: Flowable[Frame] => Unit,
      sendOne: Frame => Unit
    ): RSocketResumableTransport = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
      __obj.asInstanceOf[RSocketResumableTransport]
    }
    
    extension [Self <: RSocketResumableTransport](x: Self) {
      
      inline def setSend(value: Flowable[Frame] => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
}
