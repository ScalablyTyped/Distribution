package typings.reactNativePushNotification.mod

import typings.reactNativePushNotification.reactNativePushNotificationStrings.alert
import typings.reactNativePushNotification.reactNativePushNotificationStrings.badge
import typings.reactNativePushNotification.reactNativePushNotificationStrings.sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotification extends js.Object {
  var alert: js.Object = js.native
  var badge: Double = js.native
  var data: js.Object = js.native
  var foreground: Boolean = js.native
  var message: String | js.Object = js.native
  var sound: String = js.native
  var subText: js.UndefOr[String] = js.native
  var userInteraction: Boolean = js.native
  def abandonPermissions(): Unit = js.native
  def cancelAllLocalNotifications(): Unit = js.native
  def cancelLocalNotifications(details: js.Object): Unit = js.native
  def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, Unit]): Unit = js.native
  def clearAllNotifications(): Unit = js.native
  def configure(options: PushNotificationOptions): Unit = js.native
  def finish(fetchResult: String): Unit = js.native
  def getApplicationIconBadgeNumber(callback: js.Function1[/* badgeCount */ Double, Unit]): Unit = js.native
  def localNotification(details: PushNotificationObject): Unit = js.native
  def localNotificationSchedule(details: PushNotificationScheduleObject): Unit = js.native
  def popInitialNotification(callback: js.Function1[/* notification */ this.type | Null, Unit]): Unit = js.native
  def presentLocalNotification(details: PushNotificationObject): Unit = js.native
  def registerNotificationActions(actions: js.Array[String]): Unit = js.native
  def requestPermissions(): js.Promise[PushNotificationPermissions] = js.native
  def requestPermissions(permissions: js.Array[alert | badge | sound]): js.Promise[PushNotificationPermissions] = js.native
  def scheduleLocalNotification(details: PushNotificationScheduleObject): Unit = js.native
  def setApplicationIconBadgeNumber(badgeCount: Double): Unit = js.native
  def unregister(): Unit = js.native
}

