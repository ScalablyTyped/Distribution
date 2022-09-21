package typings.storybookChannelWebsocket

import typings.std.Event
import typings.storybookChannels.mod.Channel
import typings.storybookChannels.mod.ChannelHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/channel-websocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasUrlAsyncOnError: CreateChannelArgs): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasUrlAsyncOnError.asInstanceOf[js.Any]).asInstanceOf[Channel]
  
  @JSImport("@storybook/channel-websocket", "WebsocketTransport")
  @js.native
  open class WebsocketTransport protected () extends StObject {
    def this(hasUrlOnError: WebsocketTransportArgs) = this()
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var connect: Any = js.native
    
    /* private */ var flush: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    /* private */ var isReady: Any = js.native
    
    def send(event: Any): Unit = js.native
    
    /* private */ var sendLater: Any = js.native
    
    /* private */ var sendNow: Any = js.native
    
    def setHandler(handler: ChannelHandler): Unit = js.native
    
    /* private */ var socket: Any = js.native
  }
  
  trait CreateChannelArgs extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var onError: js.UndefOr[OnError] = js.undefined
    
    var url: String
  }
  object CreateChannelArgs {
    
    inline def apply(url: String): CreateChannelArgs = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateChannelArgs]
    }
    
    extension [Self <: CreateChannelArgs](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setOnError(value: /* message */ Event => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type OnError = js.Function1[/* message */ Event, Unit]
  
  trait WebsocketTransportArgs extends StObject {
    
    def onError(message: Event): Unit
    @JSName("onError")
    var onError_Original: OnError
    
    var url: String
  }
  object WebsocketTransportArgs {
    
    inline def apply(onError: /* message */ Event => Unit, url: String): WebsocketTransportArgs = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebsocketTransportArgs]
    }
    
    extension [Self <: WebsocketTransportArgs](x: Self) {
      
      inline def setOnError(value: /* message */ Event => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
