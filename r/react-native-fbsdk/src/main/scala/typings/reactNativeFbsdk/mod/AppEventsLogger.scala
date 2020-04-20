package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "AppEventsLogger")
@js.native
object AppEventsLogger extends js.Object {
  /**
    * Explicitly kicks off flushing of events to Facebook.
    */
  def flush(): Unit = js.native
  /**
    * Logs an event with eventName and optional arguments.
    * This function supports the following usage:
    * logEvent(eventName: string);
    * logEvent(eventName: string, valueToSum: number);
    * logEvent(eventName: string, parameters: {[key:string]:string|number});
    * logEvent(eventName: string, valueToSum: number, parameters: {[key:string]:string|number});
    * See https://developers.facebook.com/docs/app-events/android for detail.
    */
  def logEvent(eventName: String, args: (Double | Params)*): Unit = js.native
  /**
    * Logs a purchase. See http://en.wikipedia.org/wiki/ISO_4217 for currencyCode.
    */
  def logPurchase(purchaseAmount: Double, currencyCode: String): Unit = js.native
  def logPurchase(purchaseAmount: Double, currencyCode: String, parameters: js.Object): Unit = js.native
  /**
    * Logs an app event that tracks that the application was open via Push Notification.
    */
  def logPushNotificationOpen(): Unit = js.native
  def logPushNotificationOpen(payload: js.Object): Unit = js.native
  /**
    * Sets the current event flushing behavior specifying when events
    * are sent back to Facebook servers.
    */
  def setFlushBehavior(flushBehavior: AppEventsFlushBehavior): Unit = js.native
  /**
    * For iOS only, sets and sends device token to register the current application for push notifications.
    * @platform ios
    */
  def setPushNotificationsDeviceToken(deviceToken: String): Unit = js.native
  /**
    * For Android only, sets and sends registration id to register the current app for push notifications.
    * @platform Android
    */
  def setPushNotificationsRegistrationId(registrationId: String): Unit = js.native
  /**
    * Set additional data about the user to increase chances of matching a Facebook user.
    */
  def setUserData(userData: UserData): Unit = js.native
  def setUserID(): Unit = js.native
  /**
    * Sets a custom user ID to associate with all app events.
    * The userID is persisted until it is cleared by passing nil.
    */
  def setUserID(userID: String): Unit = js.native
}

