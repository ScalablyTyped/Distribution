package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  var android: AndroidNotifications
  /**
    * Cancels all notifications
    */
  def cancelAllNotifications(): Unit
  /**
    * Cancels a notification by ID
    */
  def cancelNotification(notificationId: String): Unit
  def displayNotification(notification: Notification): js.Promise[Unit]
  /**
    * Returns the current badge number on the app icon.
    */
  def getBadge(): js.Promise[Double]
  def getInitialNotification(): js.Promise[NotificationOpen]
  def getScheduledNotifications(): js.Promise[js.Array[Notification]]
  def onNotification(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_]
  def onNotificationDisplayed(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_]
  def onNotificationOpened(listener: js.Function1[/* notificationOpen */ NotificationOpen, _]): js.Function0[_]
  def removeAllDeliveredNotifications(): Unit
  def removeDeliveredNotification(notificationId: String): Unit
  /**
    * Schedule a local notification to be shown on the device.
    */
  def scheduleNotification(notification: Notification, schedule: Schedule): js.Any
  /**
    * Sets the badge number on the iOS app icon.
    */
  def setBadge(badge: Double): Unit
}

object Notifications {
  @scala.inline
  def apply(
    android: AndroidNotifications,
    cancelAllNotifications: () => Unit,
    cancelNotification: String => Unit,
    displayNotification: Notification => js.Promise[Unit],
    getBadge: () => js.Promise[Double],
    getInitialNotification: () => js.Promise[NotificationOpen],
    getScheduledNotifications: () => js.Promise[js.Array[Notification]],
    onNotification: js.Function1[/* notification */ Notification, _] => js.Function0[_],
    onNotificationDisplayed: js.Function1[/* notification */ Notification, _] => js.Function0[_],
    onNotificationOpened: js.Function1[/* notificationOpen */ NotificationOpen, _] => js.Function0[_],
    removeAllDeliveredNotifications: () => Unit,
    removeDeliveredNotification: String => Unit,
    scheduleNotification: (Notification, Schedule) => js.Any,
    setBadge: Double => Unit
  ): Notifications = {
    val __obj = js.Dynamic.literal(android = android, cancelAllNotifications = js.Any.fromFunction0(cancelAllNotifications), cancelNotification = js.Any.fromFunction1(cancelNotification), displayNotification = js.Any.fromFunction1(displayNotification), getBadge = js.Any.fromFunction0(getBadge), getInitialNotification = js.Any.fromFunction0(getInitialNotification), getScheduledNotifications = js.Any.fromFunction0(getScheduledNotifications), onNotification = js.Any.fromFunction1(onNotification), onNotificationDisplayed = js.Any.fromFunction1(onNotificationDisplayed), onNotificationOpened = js.Any.fromFunction1(onNotificationOpened), removeAllDeliveredNotifications = js.Any.fromFunction0(removeAllDeliveredNotifications), removeDeliveredNotification = js.Any.fromFunction1(removeDeliveredNotification), scheduleNotification = js.Any.fromFunction2(scheduleNotification), setBadge = js.Any.fromFunction1(setBadge))
  
    __obj.asInstanceOf[Notifications]
  }
}

