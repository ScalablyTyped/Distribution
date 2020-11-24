package typings.reactNativeFirebase.mod.RNFirebase.notifications

import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidNotifications extends js.Object {
  
  def createChannel(channel: Channel): js.Promise[Unit] = js.native
  
  def createChannelGroup(channelGroup: ChannelGroup): js.Promise[Unit] = js.native
  
  def createChannelGroups(channelGroups: js.Array[ChannelGroup]): js.Promise[Unit] = js.native
  
  def createChannels(channels: js.Array[Channel]): js.Promise[Unit] = js.native
  
  def deleteChannel(channelId: String): js.Promise[Unit] = js.native
  
  def deleteChannelGroup(groupId: String): js.Promise[Unit] = js.native
  
  def getChannel(channelId: String): js.Promise[NativeAndroidChannel | Null] = js.native
  
  def getChannelGroup(channelId: String): js.Promise[NativeAndroidChannelGroup | Null] = js.native
  
  def getChannelGroups(channelId: String): js.Promise[js.Array[NativeAndroidChannelGroup]] = js.native
  
  def getChannels(channelId: String): js.Promise[js.Array[NativeAndroidChannel]] = js.native
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
  
  @scala.inline
  implicit class AndroidNotificationsOps[Self <: AndroidNotifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateChannel(value: Channel => js.Promise[Unit]): Self = this.set("createChannel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateChannelGroup(value: ChannelGroup => js.Promise[Unit]): Self = this.set("createChannelGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateChannelGroups(value: js.Array[ChannelGroup] => js.Promise[Unit]): Self = this.set("createChannelGroups", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateChannels(value: js.Array[Channel] => js.Promise[Unit]): Self = this.set("createChannels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteChannel(value: String => js.Promise[Unit]): Self = this.set("deleteChannel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteChannelGroup(value: String => js.Promise[Unit]): Self = this.set("deleteChannelGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChannel(value: String => js.Promise[NativeAndroidChannel | Null]): Self = this.set("getChannel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChannelGroup(value: String => js.Promise[NativeAndroidChannelGroup | Null]): Self = this.set("getChannelGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChannelGroups(value: String => js.Promise[js.Array[NativeAndroidChannelGroup]]): Self = this.set("getChannelGroups", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChannels(value: String => js.Promise[js.Array[NativeAndroidChannel]]): Self = this.set("getChannels", js.Any.fromFunction1(value))
  }
}
