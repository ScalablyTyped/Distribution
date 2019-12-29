package typings.atStorybookChannelDashWebsocket

import typings.atStorybookChannels.atStorybookChannelsMod.Channel
import typings.atStorybookChannels.atStorybookChannelsMod.ChannelHandler
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/channel-websocket", JSImport.Namespace)
@js.native
object atStorybookChannelDashWebsocketMod extends js.Object {
  @js.native
  trait CreateChannelArgs extends js.Object {
    var async: Boolean = js.native
    @JSName("onError")
    var onError_Original: OnError = js.native
    var url: String = js.native
    def onError(message: Event): Unit = js.native
  }
  
  @js.native
  class WebsocketTransport protected () extends js.Object {
    def this(hasUrlOnError: WebsocketTransportArgs) = this()
    var buffer: js.Any = js.native
    var connect: js.Any = js.native
    var flush: js.Any = js.native
    var handler: js.Any = js.native
    var isReady: js.Any = js.native
    var sendLater: js.Any = js.native
    var sendNow: js.Any = js.native
    var socket: js.Any = js.native
    def send(event: js.Any): Unit = js.native
    def setHandler(handler: ChannelHandler): Unit = js.native
  }
  
  @js.native
  trait WebsocketTransportArgs extends js.Object {
    @JSName("onError")
    var onError_Original: OnError = js.native
    var url: String = js.native
    def onError(message: Event): Unit = js.native
  }
  
  def default(hasUrlAsyncOnError: CreateChannelArgs): Channel = js.native
  type OnError = js.Function1[/* message */ Event, Unit]
}

