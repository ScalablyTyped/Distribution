package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppEventsLogger {
  
  @JSImport("react-native-fbsdk", "AppEventsLogger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Explicitly kicks off flushing of events to Facebook.
    */
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
  /**
    * Returns advertiser id or null if not set
    */
  inline def getAdvertiserID(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdvertiserID")().asInstanceOf[js.Promise[String | Null]]
  
  /**
    * Returns anonymous id or null if not set
    */
  inline def getAnonymousID(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnonymousID")().asInstanceOf[js.Promise[String | Null]]
  
  /**
    * Returns advertiser id or null if not set.
    * @platform android
    */
  inline def getAttributionID(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributionID")().asInstanceOf[js.Promise[String | Null]]
  
  /**
    * Returns user id or null if not set
    */
  inline def getUserID(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserID")().asInstanceOf[js.Promise[String | Null]]
  
  /**
    * Logs an event with eventName and optional arguments.
    * This function supports the following usage:
    * logEvent(eventName: string);
    * logEvent(eventName: string, valueToSum: number);
    * logEvent(eventName: string, parameters: {[key:string]:string|number});
    * logEvent(eventName: string, valueToSum: number, parameters: {[key:string]:string|number});
    * See https://developers.facebook.com/docs/app-events/android for detail.
    */
  inline def logEvent(eventName: String, args: (Double | Params)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  /**
    * Logs a purchase. See http://en.wikipedia.org/wiki/ISO_4217 for currencyCode.
    */
  inline def logPurchase(purchaseAmount: Double, currencyCode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logPurchase")(purchaseAmount.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logPurchase(purchaseAmount: Double, currencyCode: String, parameters: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logPurchase")(purchaseAmount.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Logs an app event that tracks that the application was open via Push Notification.
    */
  inline def logPushNotificationOpen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logPushNotificationOpen")().asInstanceOf[Unit]
  inline def logPushNotificationOpen(payload: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logPushNotificationOpen")(payload.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the current event flushing behavior specifying when events
    * are sent back to Facebook servers.
    */
  inline def setFlushBehavior(flushBehavior: AppEventsFlushBehavior): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlushBehavior")(flushBehavior.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * For iOS only, sets and sends device token to register the current application for push notifications.
    * @platform ios
    */
  inline def setPushNotificationsDeviceToken(deviceToken: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPushNotificationsDeviceToken")(deviceToken.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * For Android only, sets and sends registration id to register the current app for push notifications.
    * @platform Android
    */
  inline def setPushNotificationsRegistrationId(registrationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPushNotificationsRegistrationId")(registrationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Set additional data about the user to increase chances of matching a Facebook user.
    */
  inline def setUserData(userData: UserData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserData")(userData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets a custom user ID to associate with all app events.
    * The userID is persisted until it is cleared by passing nil.
    */
  inline def setUserID(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserID")().asInstanceOf[Unit]
  inline def setUserID(userID: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserID")(userID.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
