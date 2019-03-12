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
    abandonPermissions: () => scala.Unit,
    alert: js.Object,
    badge: scala.Double,
    cancelAllLocalNotifications: () => scala.Unit,
    cancelLocalNotifications: js.Object => scala.Unit,
    checkPermissions: js.Function1[/* permissions */ PushNotificationPermissions, scala.Unit] => scala.Unit,
    clearAllNotifications: () => scala.Unit,
    configure: PushNotificationOptions => scala.Unit,
    data: js.Object,
    finish: java.lang.String => scala.Unit,
    foreground: scala.Boolean,
    getApplicationIconBadgeNumber: js.Function1[/* badgeCount */ scala.Double, scala.Unit] => scala.Unit,
    localNotification: PushNotificationObject => scala.Unit,
    localNotificationSchedule: PushNotificationScheduleObject => scala.Unit,
    message: java.lang.String | js.Object,
    popInitialNotification: js.Function1[/* notification */ PushNotification | scala.Null, scala.Unit] => scala.Unit,
    presentLocalNotification: PushNotificationObject => scala.Unit,
    registerNotificationActions: js.Array[java.lang.String] => scala.Unit,
    requestPermissions: () => scala.Unit,
    scheduleLocalNotification: PushNotificationScheduleObject => scala.Unit,
    setApplicationIconBadgeNumber: scala.Double => scala.Unit,
    sound: java.lang.String,
    unregister: () => scala.Unit,
    userInteraction: scala.Boolean
  ): PushNotification = {
    val __obj = js.Dynamic.literal(abandonPermissions = js.Any.fromFunction0(abandonPermissions), alert = alert, badge = badge, cancelAllLocalNotifications = js.Any.fromFunction0(cancelAllLocalNotifications), cancelLocalNotifications = js.Any.fromFunction1(cancelLocalNotifications), checkPermissions = js.Any.fromFunction1(checkPermissions), clearAllNotifications = js.Any.fromFunction0(clearAllNotifications), configure = js.Any.fromFunction1(configure), data = data, finish = js.Any.fromFunction1(finish), foreground = foreground, getApplicationIconBadgeNumber = js.Any.fromFunction1(getApplicationIconBadgeNumber), localNotification = js.Any.fromFunction1(localNotification), localNotificationSchedule = js.Any.fromFunction1(localNotificationSchedule), message = message.asInstanceOf[js.Any], popInitialNotification = js.Any.fromFunction1(popInitialNotification), presentLocalNotification = js.Any.fromFunction1(presentLocalNotification), registerNotificationActions = js.Any.fromFunction1(registerNotificationActions), requestPermissions = js.Any.fromFunction0(requestPermissions), scheduleLocalNotification = js.Any.fromFunction1(scheduleLocalNotification), setApplicationIconBadgeNumber = js.Any.fromFunction1(setApplicationIconBadgeNumber), sound = sound, unregister = js.Any.fromFunction0(unregister), userInteraction = userInteraction)
  
    __obj.asInstanceOf[PushNotification]
  }
}

