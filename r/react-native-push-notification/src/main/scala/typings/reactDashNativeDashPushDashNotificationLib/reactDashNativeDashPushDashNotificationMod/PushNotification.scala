package typings
package reactDashNativeDashPushDashNotificationLib.reactDashNativeDashPushDashNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotification extends js.Object {
  var alert: js.Object = js.native
  var badge: scala.Double = js.native
  var data: js.Object = js.native
  var foreground: scala.Boolean = js.native
  var message: java.lang.String | js.Object = js.native
  var sound: java.lang.String = js.native
  var userInteraction: scala.Boolean = js.native
  def abandonPermissions(): scala.Unit = js.native
  def cancelAllLocalNotifications(): scala.Unit = js.native
  def cancelLocalNotifications(details: js.Object): scala.Unit = js.native
  def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, scala.Unit]): scala.Unit = js.native
  def clearAllNotifications(): scala.Unit = js.native
  def configure(options: PushNotificationOptions): scala.Unit = js.native
  def finish(fetchResult: java.lang.String): scala.Unit = js.native
  def getApplicationIconBadgeNumber(callback: js.Function1[/* badgeCount */ scala.Double, scala.Unit]): scala.Unit = js.native
  def localNotification(details: PushNotificationObject): scala.Unit = js.native
  def localNotificationSchedule(details: PushNotificationScheduleObject): scala.Unit = js.native
  def popInitialNotification(callback: js.Function1[/* notification */ this.type | scala.Null, scala.Unit]): scala.Unit = js.native
  def presentLocalNotification(details: PushNotificationObject): scala.Unit = js.native
  def registerNotificationActions(actions: js.Array[java.lang.String]): scala.Unit = js.native
  def requestPermissions(): js.Promise[PushNotificationPermissions] = js.native
  def requestPermissions(
    permissions: js.Array[
      reactDashNativeDashPushDashNotificationLib.reactDashNativeDashPushDashNotificationLibStrings.alert | reactDashNativeDashPushDashNotificationLib.reactDashNativeDashPushDashNotificationLibStrings.badge | reactDashNativeDashPushDashNotificationLib.reactDashNativeDashPushDashNotificationLibStrings.sound
    ]
  ): js.Promise[PushNotificationPermissions] = js.native
  def scheduleLocalNotification(details: PushNotificationScheduleObject): scala.Unit = js.native
  def setApplicationIconBadgeNumber(badgeCount: scala.Double): scala.Unit = js.native
  def unregister(): scala.Unit = js.native
}

