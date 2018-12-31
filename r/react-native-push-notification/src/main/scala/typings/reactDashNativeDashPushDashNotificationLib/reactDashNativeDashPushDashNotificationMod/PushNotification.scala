package typings
package reactDashNativeDashPushDashNotificationLib.reactDashNativeDashPushDashNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotification extends js.Object {
  var alert: js.Object
  var badge: scala.Double
  var data: js.Object
  var foreground: scala.Boolean
  var message: java.lang.String | js.Object
  var sound: java.lang.String
  var userInteraction: scala.Boolean
  def abandonPermissions(): scala.Unit
  def cancelAllLocalNotifications(): scala.Unit
  def cancelLocalNotifications(details: js.Object): scala.Unit
  def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, scala.Unit]): scala.Unit
  def clearAllNotifications(): scala.Unit
  def configure(options: PushNotificationOptions): scala.Unit
  def finish(fetchResult: java.lang.String): scala.Unit
  def getApplicationIconBadgeNumber(callback: js.Function1[/* badgeCount */ scala.Double, scala.Unit]): scala.Unit
  def localNotification(details: PushNotificationObject): scala.Unit
  def localNotificationSchedule(details: PushNotificationScheduleObject): scala.Unit
  def popInitialNotification(callback: js.Function1[/* notification */ this.type | scala.Null, scala.Unit]): scala.Unit
  def presentLocalNotification(details: PushNotificationObject): scala.Unit
  def registerNotificationActions(actions: js.Array[java.lang.String]): scala.Unit
  def requestPermissions(): scala.Unit
  def scheduleLocalNotification(details: PushNotificationScheduleObject): scala.Unit
  def setApplicationIconBadgeNumber(badgeCount: scala.Double): scala.Unit
  def unregister(): scala.Unit
}

