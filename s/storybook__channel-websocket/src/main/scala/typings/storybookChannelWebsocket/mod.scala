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
  
  inline def default(param0: CreateChannelArgs): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Channel]
  
  @JSImport("@storybook/channel-websocket", "WebsocketTransport")
  @js.native
  open class WebsocketTransport protected () extends StObject {
    def this(param0: WebsocketTransportArgs) = this()
    
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
  
  inline def createChannel(param0: CreateChannelArgs): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("createChannel")(param0.asInstanceOf[js.Any]).asInstanceOf[Channel]
  
  trait CreateChannelArgs extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var onError: js.UndefOr[OnError] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object CreateChannelArgs {
    
    inline def apply(): CreateChannelArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateChannelArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateChannelArgs] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setOnError(value: /* message */ Event => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebsocketTransportArgs] (val x: Self) extends AnyVal {
      
      inline def setOnError(value: /* message */ Event => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
