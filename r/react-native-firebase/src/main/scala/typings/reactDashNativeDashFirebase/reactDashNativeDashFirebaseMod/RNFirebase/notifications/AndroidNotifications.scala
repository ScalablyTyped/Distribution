package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Channel
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.ChannelGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidNotifications extends js.Object {
  def createChannel(channel: Channel): js.Promise[Unit]
  def createChannelGroup(channelGroup: ChannelGroup): js.Promise[Unit]
  def createChannelGroups(channelGroups: js.Array[ChannelGroup]): js.Promise[Unit]
  def createChannels(channels: js.Array[Channel]): js.Promise[Unit]
  def deleteChannel(channelId: String): js.Promise[Unit]
  def deleteChannelGroup(groupId: String): js.Promise[Unit]
  def getChannel(channelId: String): js.Promise[NativeAndroidChannel | Null]
  def getChannelGroup(channelId: String): js.Promise[NativeAndroidChannelGroup | Null]
  def getChannelGroups(channelId: String): js.Promise[js.Array[NativeAndroidChannelGroup]]
  def getChannels(channelId: String): js.Promise[js.Array[NativeAndroidChannel]]
}

object AndroidNotifications {
  @scala.inline
  def apply(
    createChannel: Channel => js.Promise[Unit],
    createChannelGroup: ChannelGroup => js.Promise[Unit],
    createChannelGroups: js.Array[ChannelGroup] => js.Promise[Unit],
    createChannels: js.Array[Channel] => js.Promise[Unit],
    deleteChannel: String => js.Promise[Unit],
    deleteChannelGroup: String => js.Promise[Unit],
    getChannel: String => js.Promise[NativeAndroidChannel | Null],
    getChannelGroup: String => js.Promise[NativeAndroidChannelGroup | Null],
    getChannelGroups: String => js.Promise[js.Array[NativeAndroidChannelGroup]],
    getChannels: String => js.Promise[js.Array[NativeAndroidChannel]]
  ): AndroidNotifications = {
    val __obj = js.Dynamic.literal(createChannel = js.Any.fromFunction1(createChannel), createChannelGroup = js.Any.fromFunction1(createChannelGroup), createChannelGroups = js.Any.fromFunction1(createChannelGroups), createChannels = js.Any.fromFunction1(createChannels), deleteChannel = js.Any.fromFunction1(deleteChannel), deleteChannelGroup = js.Any.fromFunction1(deleteChannelGroup), getChannel = js.Any.fromFunction1(getChannel), getChannelGroup = js.Any.fromFunction1(getChannelGroup), getChannelGroups = js.Any.fromFunction1(getChannelGroups), getChannels = js.Any.fromFunction1(getChannels))
  
    __obj.asInstanceOf[AndroidNotifications]
  }
}

