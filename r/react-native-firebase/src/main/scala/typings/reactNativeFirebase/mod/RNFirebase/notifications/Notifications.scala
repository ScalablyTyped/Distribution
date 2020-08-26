package typings.reactNativeFirebase.mod.RNFirebase.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifications extends js.Object {
  var android: AndroidNotifications = js.native
  /**
    * Cancels all notifications
    */
  def cancelAllNotifications(): Unit = js.native
  /**
    * Cancels a notification by ID
    */
  def cancelNotification(notificationId: String): Unit = js.native
  def displayNotification(notification: Notification): js.Promise[Unit] = js.native
  /**
    * Returns the current badge number on the app icon.
    */
  def getBadge(): js.Promise[Double] = js.native
  def getInitialNotification(): js.Promise[NotificationOpen] = js.native
  def getScheduledNotifications(): js.Promise[js.Array[Notification]] = js.native
  def onNotification(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_] = js.native
  def onNotificationDisplayed(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_] = js.native
  def onNotificationOpened(listener: js.Function1[/* notificationOpen */ NotificationOpen, _]): js.Function0[_] = js.native
  def removeAllDeliveredNotifications(): Unit = js.native
  def removeDeliveredNotification(notificationId: String): Unit = js.native
  /**
    * Schedule a local notification to be shown on the device.
    */
  def scheduleNotification(notification: Notification, schedule: Schedule): js.Any = js.native
  /**
    * Sets the badge number on the iOS app icon.
    */
  def setBadge(badge: Double): Unit = js.native
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
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], cancelAllNotifications = js.Any.fromFunction0(cancelAllNotifications), cancelNotification = js.Any.fromFunction1(cancelNotification), displayNotification = js.Any.fromFunction1(displayNotification), getBadge = js.Any.fromFunction0(getBadge), getInitialNotification = js.Any.fromFunction0(getInitialNotification), getScheduledNotifications = js.Any.fromFunction0(getScheduledNotifications), onNotification = js.Any.fromFunction1(onNotification), onNotificationDisplayed = js.Any.fromFunction1(onNotificationDisplayed), onNotificationOpened = js.Any.fromFunction1(onNotificationOpened), removeAllDeliveredNotifications = js.Any.fromFunction0(removeAllDeliveredNotifications), removeDeliveredNotification = js.Any.fromFunction1(removeDeliveredNotification), scheduleNotification = js.Any.fromFunction2(scheduleNotification), setBadge = js.Any.fromFunction1(setBadge))
    __obj.asInstanceOf[Notifications]
  }
  @scala.inline
  implicit class NotificationsOps[Self <: Notifications] (val x: Self) extends AnyVal {
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
    def setAndroid(value: AndroidNotifications): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelAllNotifications(value: () => Unit): Self = this.set("cancelAllNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setCancelNotification(value: String => Unit): Self = this.set("cancelNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayNotification(value: Notification => js.Promise[Unit]): Self = this.set("displayNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBadge(value: () => js.Promise[Double]): Self = this.set("getBadge", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInitialNotification(value: () => js.Promise[NotificationOpen]): Self = this.set("getInitialNotification", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScheduledNotifications(value: () => js.Promise[js.Array[Notification]]): Self = this.set("getScheduledNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setOnNotification(value: js.Function1[/* notification */ Notification, _] => js.Function0[_]): Self = this.set("onNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNotificationDisplayed(value: js.Function1[/* notification */ Notification, _] => js.Function0[_]): Self = this.set("onNotificationDisplayed", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNotificationOpened(value: js.Function1[/* notificationOpen */ NotificationOpen, _] => js.Function0[_]): Self = this.set("onNotificationOpened", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveAllDeliveredNotifications(value: () => Unit): Self = this.set("removeAllDeliveredNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveDeliveredNotification(value: String => Unit): Self = this.set("removeDeliveredNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setScheduleNotification(value: (Notification, Schedule) => js.Any): Self = this.set("scheduleNotification", js.Any.fromFunction2(value))
    @scala.inline
    def setSetBadge(value: Double => Unit): Self = this.set("setBadge", js.Any.fromFunction1(value))
  }
  
}

