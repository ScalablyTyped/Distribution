package typings.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notifications extends StObject {
  
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
  
  def onNotification(listener: js.Function1[/* notification */ Notification, js.Any]): js.Function0[js.Any]
  
  def onNotificationDisplayed(listener: js.Function1[/* notification */ Notification, js.Any]): js.Function0[js.Any]
  
  def onNotificationOpened(listener: js.Function1[/* notificationOpen */ NotificationOpen, js.Any]): js.Function0[js.Any]
  
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
  
  inline def apply(
    android: AndroidNotifications,
    cancelAllNotifications: () => Unit,
    cancelNotification: String => Unit,
    displayNotification: Notification => js.Promise[Unit],
    getBadge: () => js.Promise[Double],
    getInitialNotification: () => js.Promise[NotificationOpen],
    getScheduledNotifications: () => js.Promise[js.Array[Notification]],
    onNotification: js.Function1[/* notification */ Notification, js.Any] => js.Function0[js.Any],
    onNotificationDisplayed: js.Function1[/* notification */ Notification, js.Any] => js.Function0[js.Any],
    onNotificationOpened: js.Function1[/* notificationOpen */ NotificationOpen, js.Any] => js.Function0[js.Any],
    removeAllDeliveredNotifications: () => Unit,
    removeDeliveredNotification: String => Unit,
    scheduleNotification: (Notification, Schedule) => js.Any,
    setBadge: Double => Unit
  ): Notifications = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], cancelAllNotifications = js.Any.fromFunction0(cancelAllNotifications), cancelNotification = js.Any.fromFunction1(cancelNotification), displayNotification = js.Any.fromFunction1(displayNotification), getBadge = js.Any.fromFunction0(getBadge), getInitialNotification = js.Any.fromFunction0(getInitialNotification), getScheduledNotifications = js.Any.fromFunction0(getScheduledNotifications), onNotification = js.Any.fromFunction1(onNotification), onNotificationDisplayed = js.Any.fromFunction1(onNotificationDisplayed), onNotificationOpened = js.Any.fromFunction1(onNotificationOpened), removeAllDeliveredNotifications = js.Any.fromFunction0(removeAllDeliveredNotifications), removeDeliveredNotification = js.Any.fromFunction1(removeDeliveredNotification), scheduleNotification = js.Any.fromFunction2(scheduleNotification), setBadge = js.Any.fromFunction1(setBadge))
    __obj.asInstanceOf[Notifications]
  }
  
  extension [Self <: Notifications](x: Self) {
    
    inline def setAndroid(value: AndroidNotifications): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setCancelAllNotifications(value: () => Unit): Self = StObject.set(x, "cancelAllNotifications", js.Any.fromFunction0(value))
    
    inline def setCancelNotification(value: String => Unit): Self = StObject.set(x, "cancelNotification", js.Any.fromFunction1(value))
    
    inline def setDisplayNotification(value: Notification => js.Promise[Unit]): Self = StObject.set(x, "displayNotification", js.Any.fromFunction1(value))
    
    inline def setGetBadge(value: () => js.Promise[Double]): Self = StObject.set(x, "getBadge", js.Any.fromFunction0(value))
    
    inline def setGetInitialNotification(value: () => js.Promise[NotificationOpen]): Self = StObject.set(x, "getInitialNotification", js.Any.fromFunction0(value))
    
    inline def setGetScheduledNotifications(value: () => js.Promise[js.Array[Notification]]): Self = StObject.set(x, "getScheduledNotifications", js.Any.fromFunction0(value))
    
    inline def setOnNotification(value: js.Function1[/* notification */ Notification, js.Any] => js.Function0[js.Any]): Self = StObject.set(x, "onNotification", js.Any.fromFunction1(value))
    
    inline def setOnNotificationDisplayed(value: js.Function1[/* notification */ Notification, js.Any] => js.Function0[js.Any]): Self = StObject.set(x, "onNotificationDisplayed", js.Any.fromFunction1(value))
    
    inline def setOnNotificationOpened(value: js.Function1[/* notificationOpen */ NotificationOpen, js.Any] => js.Function0[js.Any]): Self = StObject.set(x, "onNotificationOpened", js.Any.fromFunction1(value))
    
    inline def setRemoveAllDeliveredNotifications(value: () => Unit): Self = StObject.set(x, "removeAllDeliveredNotifications", js.Any.fromFunction0(value))
    
    inline def setRemoveDeliveredNotification(value: String => Unit): Self = StObject.set(x, "removeDeliveredNotification", js.Any.fromFunction1(value))
    
    inline def setScheduleNotification(value: (Notification, Schedule) => js.Any): Self = StObject.set(x, "scheduleNotification", js.Any.fromFunction2(value))
    
    inline def setSetBadge(value: Double => Unit): Self = StObject.set(x, "setBadge", js.Any.fromFunction1(value))
  }
}
