package typings.atStorybookChannelDashPostmessage.atStorybookChannelDashPostmessageMod

import typings.atStorybookChannels.atStorybookChannelsMod.ChannelEvent
import typings.atStorybookChannels.atStorybookChannelsMod.ChannelHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/channel-postmessage", "PostmsgTransport")
@js.native
class PostmsgTransport protected () extends js.Object {
  def this(config: Config) = this()
  var buffer: js.Any = js.native
  val config: js.Any = js.native
  var connected: js.Any = js.native
  var flush: js.Any = js.native
  var getWindow: js.Any = js.native
  var handleEvent: js.Any = js.native
  var handler: js.Any = js.native
  /**
    * Sends `event` to the associated window. If the window does not yet exist
    * the event will be stored in a buffer and sent when the window exists.
    * @param event
    */
  def send(event: ChannelEvent): js.Promise[_] = js.native
  def send(event: ChannelEvent, options: js.Any): js.Promise[_] = js.native
  def setHandler(handler: ChannelHandler): Unit = js.native
}

