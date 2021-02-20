package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppEventsLogger {
  
  /**
    * Explicitly kicks off flushing of events to Facebook.
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.flush")
  @js.native
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
  @JSImport("react-native-fbsdk", "AppEventsLogger.logEvent")
  @js.native
  def logEvent(eventName: String, args: (Double | Params)*): Unit = js.native
  
  /**
    * Logs a purchase. See http://en.wikipedia.org/wiki/ISO_4217 for currencyCode.
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.logPurchase")
  @js.native
  def logPurchase(purchaseAmount: Double, currencyCode: String): Unit = js.native
  @JSImport("react-native-fbsdk", "AppEventsLogger.logPurchase")
  @js.native
  def logPurchase(purchaseAmount: Double, currencyCode: String, parameters: js.Object): Unit = js.native
  
  /**
    * Logs an app event that tracks that the application was open via Push Notification.
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.logPushNotificationOpen")
  @js.native
  def logPushNotificationOpen(): Unit = js.native
  @JSImport("react-native-fbsdk", "AppEventsLogger.logPushNotificationOpen")
  @js.native
  def logPushNotificationOpen(payload: js.Object): Unit = js.native
  
  /**
    * Sets the current event flushing behavior specifying when events
    * are sent back to Facebook servers.
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.setFlushBehavior")
  @js.native
  def setFlushBehavior(flushBehavior: AppEventsFlushBehavior): Unit = js.native
  
  /**
    * For iOS only, sets and sends device token to register the current application for push notifications.
    * @platform ios
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.setPushNotificationsDeviceToken")
  @js.native
  def setPushNotificationsDeviceToken(deviceToken: String): Unit = js.native
  
  /**
    * For Android only, sets and sends registration id to register the current app for push notifications.
    * @platform Android
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.setPushNotificationsRegistrationId")
  @js.native
  def setPushNotificationsRegistrationId(registrationId: String): Unit = js.native
  
  /**
    * Set additional data about the user to increase chances of matching a Facebook user.
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.setUserData")
  @js.native
  def setUserData(userData: UserData): Unit = js.native
  
  /**
    * Sets a custom user ID to associate with all app events.
    * The userID is persisted until it is cleared by passing nil.
    */
  @JSImport("react-native-fbsdk", "AppEventsLogger.setUserID")
  @js.native
  def setUserID(): Unit = js.native
  @JSImport("react-native-fbsdk", "AppEventsLogger.setUserID")
  @js.native
  def setUserID(userID: String): Unit = js.native
}
