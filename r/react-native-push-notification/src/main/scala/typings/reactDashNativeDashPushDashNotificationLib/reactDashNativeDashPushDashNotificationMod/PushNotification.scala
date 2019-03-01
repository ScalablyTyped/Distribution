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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abandonPermissions")(abandonPermissions)
    __obj.updateDynamic("alert")(alert)
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("cancelAllLocalNotifications")(cancelAllLocalNotifications)
    __obj.updateDynamic("cancelLocalNotifications")(cancelLocalNotifications)
    __obj.updateDynamic("checkPermissions")(checkPermissions)
    __obj.updateDynamic("clearAllNotifications")(clearAllNotifications)
    __obj.updateDynamic("configure")(configure)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("finish")(finish)
    __obj.updateDynamic("foreground")(foreground)
    __obj.updateDynamic("getApplicationIconBadgeNumber")(getApplicationIconBadgeNumber)
    __obj.updateDynamic("localNotification")(localNotification)
    __obj.updateDynamic("localNotificationSchedule")(localNotificationSchedule)
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.updateDynamic("popInitialNotification")(popInitialNotification)
    __obj.updateDynamic("presentLocalNotification")(presentLocalNotification)
    __obj.updateDynamic("registerNotificationActions")(registerNotificationActions)
    __obj.updateDynamic("requestPermissions")(requestPermissions)
    __obj.updateDynamic("scheduleLocalNotification")(scheduleLocalNotification)
    __obj.updateDynamic("setApplicationIconBadgeNumber")(setApplicationIconBadgeNumber)
    __obj.updateDynamic("sound")(sound)
    __obj.updateDynamic("unregister")(unregister)
    __obj.updateDynamic("userInteraction")(userInteraction)
    __obj.asInstanceOf[PushNotification]
  }
}

