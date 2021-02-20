package typings.rsocketWebsocketClient

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketwebsocketclientMod {
  
  @JSImport("rsocket-websocket-client/RSocketWebSocketClient", JSImport.Default)
  @js.native
  class default protected () extends RSocketWebSocketClient {
    def this(options: ClientOptions) = this()
    def this(options: ClientOptions, encoders: Encoders[_]) = this()
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var lengthPrefixedFrames: js.UndefOr[Boolean] = js.native
    
    var url: String = js.native
    
    var wsCreator: js.UndefOr[js.Function1[/* url */ String, WebSocket]] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(url: String): ClientOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setLengthPrefixedFrames(value: Boolean): Self = StObject.set(x, "lengthPrefixedFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthPrefixedFramesUndefined: Self = StObject.set(x, "lengthPrefixedFrames", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsCreator(value: /* url */ String => WebSocket): Self = StObject.set(x, "wsCreator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWsCreatorUndefined: Self = StObject.set(x, "wsCreator", js.undefined)
    }
  }
  
  @js.native
  trait RSocketWebSocketClient extends DuplexConnection
  object RSocketWebSocketClient {
    
    @scala.inline
    def apply(
      close: () => Unit,
      connect: () => Unit,
      connectionStatus: () => Flowable[ConnectionStatus],
      receive: () => Flowable[Frame],
      send: Flowable[Frame] => Unit,
      sendOne: Frame => Unit
    ): RSocketWebSocketClient = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
      __obj.asInstanceOf[RSocketWebSocketClient]
    }
  }
}
