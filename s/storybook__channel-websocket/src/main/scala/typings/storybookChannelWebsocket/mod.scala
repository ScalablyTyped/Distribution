package typings.storybookChannelWebsocket

import typings.std.Event
import typings.storybookChannels.mod.Channel
import typings.storybookChannels.mod.ChannelHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/channel-websocket", JSImport.Default)
  @js.native
  def default(hasUrlAsyncOnError: CreateChannelArgs): Channel = js.native
  
  @JSImport("@storybook/channel-websocket", "WebsocketTransport")
  @js.native
  class WebsocketTransport protected () extends StObject {
    def this(hasUrlOnError: WebsocketTransportArgs) = this()
    
    var buffer: js.Any = js.native
    
    var connect: js.Any = js.native
    
    var flush: js.Any = js.native
    
    var handler: js.Any = js.native
    
    var isReady: js.Any = js.native
    
    def send(event: js.Any): Unit = js.native
    
    var sendLater: js.Any = js.native
    
    var sendNow: js.Any = js.native
    
    def setHandler(handler: ChannelHandler): Unit = js.native
    
    var socket: js.Any = js.native
  }
  
  @js.native
  trait CreateChannelArgs extends StObject {
    
    var async: Boolean = js.native
    
    def onError(message: Event): Unit = js.native
    @JSName("onError")
    var onError_Original: OnError = js.native
    
    var url: String = js.native
  }
  
  type OnError = js.Function1[/* message */ Event, Unit]
  
  @js.native
  trait WebsocketTransportArgs extends StObject {
    
    def onError(message: Event): Unit = js.native
    @JSName("onError")
    var onError_Original: OnError = js.native
    
    var url: String = js.native
  }
}
