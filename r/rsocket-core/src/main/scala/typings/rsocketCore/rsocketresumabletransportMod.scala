package typings.rsocketCore

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Encodable
import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketresumabletransportMod {
  
  @JSImport("rsocket-core/RSocketResumableTransport", JSImport.Default)
  @js.native
  class default protected () extends RSocketResumableTransport {
    def this(source: js.Function0[DuplexConnection], options: Options) = this()
    def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[_]) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var bufferSize: Double = js.native
    
    var resumeToken: Encodable = js.native
    
    var sessionDurationSeconds: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(bufferSize: Double, resumeToken: Encodable, sessionDurationSeconds: Double): Options = {
      val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], sessionDurationSeconds = sessionDurationSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResumeToken(value: Encodable): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDurationSeconds(value: Double): Self = StObject.set(x, "sessionDurationSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RSocketResumableTransport extends DuplexConnection
  object RSocketResumableTransport {
    
    @scala.inline
    def apply(
      close: () => Unit,
      connect: () => Unit,
      connectionStatus: () => Flowable[ConnectionStatus],
      receive: () => Flowable[Frame],
      send: Flowable[Frame] => Unit,
      sendOne: Frame => Unit
    ): RSocketResumableTransport = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
      __obj.asInstanceOf[RSocketResumableTransport]
    }
  }
}
