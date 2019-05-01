package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationIOSStatic extends js.Object {
  /**
    * iOS fetch results that best describe the result of a finished remote notification handler.
    * For a list of possible values, see `PushNotificationIOS.FetchResult`.
    */
  var FetchResult: reactDashNativeLib.reactDashNativeMod.FetchResult = js.native
  /**
    * Unregister for all remote notifications received via Apple Push
    * Notification service.
    * You should call this method in rare circumstances only, such as when
    * a new version of the app removes support for all types of remote
    * notifications. Users can temporarily prevent apps from receiving
    * remote notifications through the Notifications section of the
    * Settings app. Apps unregistered through this method can always
    * re-register.
    */
  def abandonPermissions(): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localNotification(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.localNotification,
    handler: js.Function1[/* notification */ PushNotification, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Attaches a listener to remote notifications while the app is running in the
    * foreground or the background.
    *
    * The handler will get be invoked with an instance of `PushNotificationIOS`
    *
    * The type MUST be 'notification'
    */
  @JSName("addEventListener")
  def addEventListener_notification(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.notification,
    handler: js.Function1[/* notification */ PushNotification, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fired when the user registers for remote notifications.
    *
    * The handler will be invoked with a hex string representing the deviceToken.
    *
    * The type MUST be 'register'
    */
  @JSName("addEventListener")
  def addEventListener_register(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.register,
    handler: js.Function1[/* deviceToken */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fired when the user fails to register for remote notifications.
    * Typically occurs when APNS is having issues, or the device is a simulator.
    *
    * The handler will be invoked with {message: string, code: number, details: any}.
    *
    * The type MUST be 'registrationError'
    */
  @JSName("addEventListener")
  def addEventListener_registrationError(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.registrationError,
    handler: js.Function1[/* error */ reactDashNativeLib.Anon_Code, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Cancels all scheduled localNotifications
    */
  def cancelAllLocalNotifications(): scala.Unit = js.native
  /**
    * Cancel local notifications.
    * Optionally restricts the set of canceled notifications to those notifications whose userInfo fields match the corresponding fields in the userInfo argument.
    */
  def cancelLocalNotifications(userInfo: js.Object): scala.Unit = js.native
  /**
    * See what push permissions are currently enabled. `callback` will be
    * invoked with a `permissions` object:
    *
    *  - `alert` :boolean
    *  - `badge` :boolean
    *  - `sound` :boolean
    */
  def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, scala.Unit]): scala.Unit = js.native
  /**
    * Gets the current badge number for the app icon on the home screen
    */
  def getApplicationIconBadgeNumber(callback: js.Function1[/* badge */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
    * This method returns a promise that resolves to either the notification
    * object if the app was launched by a push notification, or `null` otherwise.
    */
  def getInitialNotification(): js.Promise[PushNotification] = js.native
  /**
    * Gets the local notifications that are currently scheduled.
    */
  def getScheduledLocalNotifications(callback: js.Function1[/* notifications */ js.Array[ScheduleLocalNotificationDetails], scala.Unit]): scala.Unit = js.native
  /**
    * Schedules the localNotification for immediate presentation.
    * details is an object containing:
    * alertBody : The message displayed in the notification alert.
    * alertAction : The "action" displayed beneath an actionable notification. Defaults to "view";
    * soundName : The sound played when the notification is fired (optional).
    * category : The category of this notification, required for actionable notifications (optional).
    * userInfo : An optional object containing additional notification data.
    * applicationIconBadgeNumber (optional) : The number to display as the app's icon badge. The default value of this property is 0, which means that no badge is displayed.
    */
  def presentLocalNotification(details: PresentLocalNotificationDetails): scala.Unit = js.native
  /**
    * Removes the event listener. Do this in `componentWillUnmount` to prevent
    * memory leaks
    */
  def removeEventListener(
    `type`: PushNotificationEventName,
    handler: js.Function1[
      (/* error */ reactDashNativeLib.Anon_Code) | (/* notification */ PushNotification) | (/* deviceToken */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Requests all notification permissions from iOS, prompting the user's
    * dialog box.
    */
  def requestPermissions(): js.Promise[PushNotificationPermissions] = js.native
  def requestPermissions(permissions: js.Array[PushNotificationPermissions]): scala.Unit = js.native
  def requestPermissions(permissions: PushNotificationPermissions): js.Promise[PushNotificationPermissions] = js.native
  /**
    * Requests all notification permissions from iOS, prompting the user's
    * dialog box.
    */
  @JSName("requestPermissions")
  def requestPermissions_Unit(): scala.Unit = js.native
  /**
    * Schedules the localNotification for future presentation.
    * details is an object containing:
    * fireDate : The date and time when the system should deliver the notification.
    * alertBody : The message displayed in the notification alert.
    * alertAction : The "action" displayed beneath an actionable notification. Defaults to "view";
    * soundName : The sound played when the notification is fired (optional).
    * category : The category of this notification, required for actionable notifications (optional).
    * userInfo : An optional object containing additional notification data.
    * applicationIconBadgeNumber (optional) : The number to display as the app's icon badge. Setting the number to 0 removes the icon badge.
    */
  def scheduleLocalNotification(details: ScheduleLocalNotificationDetails): scala.Unit = js.native
  /**
    * Sets the badge number for the app icon on the home screen
    */
  def setApplicationIconBadgeNumber(number: scala.Double): scala.Unit = js.native
}

