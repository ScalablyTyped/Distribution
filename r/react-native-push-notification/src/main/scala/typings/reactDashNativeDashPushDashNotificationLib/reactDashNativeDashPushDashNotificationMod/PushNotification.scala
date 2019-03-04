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

object PushNotification {
  @scala.inline
  def apply(
    abandonPermissions: js.Function0[scala.Unit],
    alert: js.Object,
    badge: scala.Double,
    cancelAllLocalNotifications: js.Function0[scala.Unit],
    cancelLocalNotifications: js.Function1[js.Object, scala.Unit],
    checkPermissions: js.Function1[
      js.Function1[/* permissions */ PushNotificationPermissions, scala.Unit], 
      scala.Unit
    ],
    clearAllNotifications: js.Function0[scala.Unit],
    configure: js.Function1[PushNotificationOptions, scala.Unit],
    data: js.Object,
    finish: js.Function1[java.lang.String, scala.Unit],
    foreground: scala.Boolean,
    getApplicationIconBadgeNumber: js.Function1[js.Function1[/* badgeCount */ scala.Double, scala.Unit], scala.Unit],
    localNotification: js.Function1[PushNotificationObject, scala.Unit],
    localNotificationSchedule: js.Function1[PushNotificationScheduleObject, scala.Unit],
    message: java.lang.String | js.Object,
    popInitialNotification: js.Function1[
      js.Function1[/* notification */ PushNotification | scala.Null, scala.Unit], 
      scala.Unit
    ],
    presentLocalNotification: js.Function1[PushNotificationObject, scala.Unit],
    registerNotificationActions: js.Function1[js.Array[java.lang.String], scala.Unit],
    requestPermissions: js.Function0[scala.Unit],
    scheduleLocalNotification: js.Function1[PushNotificationScheduleObject, scala.Unit],
    setApplicationIconBadgeNumber: js.Function1[scala.Double, scala.Unit],
    sound: java.lang.String,
    unregister: js.Function0[scala.Unit],
    userInteraction: scala.Boolean
  ): PushNotification = {
    val __obj = js.Dynamic.literal(abandonPermissions = abandonPermissions, alert = alert, badge = badge, cancelAllLocalNotifications = cancelAllLocalNotifications, cancelLocalNotifications = cancelLocalNotifications, checkPermissions = checkPermissions, clearAllNotifications = clearAllNotifications, configure = configure, data = data, finish = finish, foreground = foreground, getApplicationIconBadgeNumber = getApplicationIconBadgeNumber, localNotification = localNotification, localNotificationSchedule = localNotificationSchedule, message = message.asInstanceOf[js.Any], popInitialNotification = popInitialNotification, presentLocalNotification = presentLocalNotification, registerNotificationActions = registerNotificationActions, requestPermissions = requestPermissions, scheduleLocalNotification = scheduleLocalNotification, setApplicationIconBadgeNumber = setApplicationIconBadgeNumber, sound = sound, unregister = unregister, userInteraction = userInteraction)
  
    __obj.asInstanceOf[PushNotification]
  }
}

