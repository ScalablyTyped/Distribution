package typings.scChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  def closeChannel(channelName: String): Unit = js.native
  def getChannelOptions(channelName: String): js.Object = js.native
  def getChannelState(channelName: String): ChannelState = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  def publish(channelName: String, data: js.Any): js.Any = js.native
  def subscribe(channelName: String): SCChannel[_] = js.native
  def unsubscribe(channelName: String): Unit = js.native
}

