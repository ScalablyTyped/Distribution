package typings.reactNativePushNotification.mod

import typings.reactNativePushNotification.anon.Id
import typings.reactNativePushNotification.reactNativePushNotificationStrings.alert
import typings.reactNativePushNotification.reactNativePushNotificationStrings.badge
import typings.reactNativePushNotification.reactNativePushNotificationStrings.sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotification extends js.Object {
  
  def abandonPermissions(): Unit = js.native
  
  var alert: js.Object = js.native
  
  var badge: Double = js.native
  
  def cancelAllLocalNotifications(): Unit = js.native
  
  def cancelLocalNotifications(details: Id): Unit = js.native
  
  def channelBlocked(channel_id: String, callback: js.Function1[/* blocked */ Boolean, Unit]): Unit = js.native
  
  def channelExists(channel_id: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, Unit]): Unit = js.native
  
  def clearAllNotifications(): Unit = js.native
  
  def clearLocalNotification(tag: String, notificationID: Double): Unit = js.native
  
  def configure(options: PushNotificationOptions): Unit = js.native
  
  def createChannel(channel: ChannelObject, callback: js.Function1[/* created */ Boolean, Unit]): Unit = js.native
  
  var data: js.Object = js.native
  
  def deleteChannel(channel_id: String): Unit = js.native
  
  def finish(fetchResult: String): Unit = js.native
  
  var foreground: Boolean = js.native
  
  def getApplicationIconBadgeNumber(callback: js.Function1[/* badgeCount */ Double, Unit]): Unit = js.native
  
  def getChannels(callback: js.Function1[/* channel_ids */ js.Array[String], Unit]): Unit = js.native
  
  def getDeliveredNotifications(callback: js.Function1[/* notifications */ js.Array[PushNotificationDeliveredObject], Unit]): Unit = js.native
  
  def getScheduledLocalNotifications(callback: js.Function1[/* notifications */ js.Array[PushNotificationScheduledLocalObject], Unit]): Unit = js.native
  
  var id: Double = js.native
  
  def invokeApp(notification: PushNotificationObject): Unit = js.native
  
  def localNotification(notification: PushNotificationObject): Unit = js.native
  
  def localNotificationSchedule(notification: PushNotificationScheduleObject): Unit = js.native
  
  var message: String | js.Object = js.native
  
  def popInitialNotification(callback: js.Function1[/* notification */ this.type | Null, Unit]): Unit = js.native
  
  def presentLocalNotification(notification: PushNotificationObject): Unit = js.native
  
  def removeAllDeliveredNotifications(): Unit = js.native
  
  def removeDeliveredNotifications(identifiers: js.Array[String]): Unit = js.native
  
  def requestPermissions(): js.Promise[PushNotificationPermissions] = js.native
  def requestPermissions(permissions: js.Array[alert | badge | sound]): js.Promise[PushNotificationPermissions] = js.native
  
  def scheduleLocalNotification(notification: PushNotificationScheduleObject): Unit = js.native
  
  def setApplicationIconBadgeNumber(badgeCount: Double): Unit = js.native
  
  var sound: String = js.native
  
  var subText: js.UndefOr[String] = js.native
  
  def subscribeToTopic(topic: String): Unit = js.native
  
  def unregister(): Unit = js.native
  
  def unsubscribeFromTopic(topic: String): Unit = js.native
  
  var userInteraction: Boolean = js.native
}
