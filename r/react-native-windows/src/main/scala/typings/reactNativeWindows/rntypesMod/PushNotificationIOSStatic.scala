package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.Code
import typings.reactNativeWindows.reactNativeWindowsStrings.localNotification
import typings.reactNativeWindows.reactNativeWindowsStrings.notification
import typings.reactNativeWindows.reactNativeWindowsStrings.register
import typings.reactNativeWindows.reactNativeWindowsStrings.registrationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotificationIOSStatic extends StObject {
  
  /**
    * iOS fetch results that best describe the result of a finished remote notification handler.
    * For a list of possible values, see `PushNotificationIOS.FetchResult`.
    */
  var FetchResult: typings.reactNativeWindows.rntypesMod.FetchResult = js.native
  
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
  def abandonPermissions(): Unit = js.native
  
  /**
    * Attaches a listener to remote notifications while the app is running in the
    * foreground or the background.
    *
    * The handler will get be invoked with an instance of `PushNotificationIOS`
    *
    * The type MUST be 'notification'
    */
  def addEventListener(
    `type`: notification | localNotification,
    handler: js.Function1[/* notification */ PushNotification, Unit]
  ): Unit = js.native
  /**
    * Fired when the user registers for remote notifications.
    *
    * The handler will be invoked with a hex string representing the deviceToken.
    *
    * The type MUST be 'register'
    */
  @JSName("addEventListener")
  def addEventListener_register(`type`: register, handler: js.Function1[/* deviceToken */ String, Unit]): Unit = js.native
  /**
    * Fired when the user fails to register for remote notifications.
    * Typically occurs when APNS is having issues, or the device is a simulator.
    *
    * The handler will be invoked with {message: string, code: number, details: any}.
    *
    * The type MUST be 'registrationError'
    */
  @JSName("addEventListener")
  def addEventListener_registrationError(`type`: registrationError, handler: js.Function1[/* error */ Code, Unit]): Unit = js.native
  
  /**
    * Cancels all scheduled localNotifications
    */
  def cancelAllLocalNotifications(): Unit = js.native
  
  /**
    * Cancel local notifications.
    * Optionally restricts the set of canceled notifications to those notifications whose userInfo fields match the corresponding fields in the userInfo argument.
    */
  def cancelLocalNotifications(userInfo: js.Object): Unit = js.native
  
  /**
    * See what push permissions are currently enabled. `callback` will be
    * invoked with a `permissions` object:
    *
    *  - `alert` :boolean
    *  - `badge` :boolean
    *  - `sound` :boolean
    */
  def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, Unit]): Unit = js.native
  
  /**
    * Gets the current badge number for the app icon on the home screen
    */
  def getApplicationIconBadgeNumber(callback: js.Function1[/* badge */ Double, Unit]): Unit = js.native
  
  /**
    * This method returns a promise that resolves to either the notification
    * object if the app was launched by a push notification, or `null` otherwise.
    */
  def getInitialNotification(): js.Promise[PushNotification | Null] = js.native
  
  /**
    * Gets the local notifications that are currently scheduled.
    */
  def getScheduledLocalNotifications(callback: js.Function1[/* notifications */ js.Array[ScheduleLocalNotificationDetails], Unit]): Unit = js.native
  
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
  def presentLocalNotification(details: PresentLocalNotificationDetails): Unit = js.native
  
  /**
    * Removes the event listener. Do this in `componentWillUnmount` to prevent
    * memory leaks
    */
  def removeEventListener(
    `type`: PushNotificationEventName,
    handler: js.Function1[
      (/* error */ Code) | (/* notification */ PushNotification) | (/* deviceToken */ String), 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Requests all notification permissions from iOS, prompting the user's
    * dialog box.
    */
  def requestPermissions(): Unit = js.native
  def requestPermissions(permissions: js.Array[PushNotificationPermissions]): Unit = js.native
  def requestPermissions(permissions: PushNotificationPermissions): js.Promise[PushNotificationPermissions] = js.native
  /**
    * Requests all notification permissions from iOS, prompting the user's
    * dialog box.
    */
  @JSName("requestPermissions")
  def requestPermissions_Promise(): js.Promise[PushNotificationPermissions] = js.native
  
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
  def scheduleLocalNotification(details: ScheduleLocalNotificationDetails): Unit = js.native
  
  /**
    * Sets the badge number for the app icon on the home screen
    */
  def setApplicationIconBadgeNumber(number: Double): Unit = js.native
}
