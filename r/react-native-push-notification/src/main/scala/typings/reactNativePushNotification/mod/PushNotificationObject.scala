package typings.reactNativePushNotification.mod

import typings.reactNativePushNotification.reactNativePushNotificationStrings.`private`
import typings.reactNativePushNotification.reactNativePushNotificationStrings.day
import typings.reactNativePushNotification.reactNativePushNotificationStrings.high
import typings.reactNativePushNotification.reactNativePushNotificationStrings.hour
import typings.reactNativePushNotification.reactNativePushNotificationStrings.low
import typings.reactNativePushNotification.reactNativePushNotificationStrings.max
import typings.reactNativePushNotification.reactNativePushNotificationStrings.min
import typings.reactNativePushNotification.reactNativePushNotificationStrings.minute
import typings.reactNativePushNotification.reactNativePushNotificationStrings.none
import typings.reactNativePushNotification.reactNativePushNotificationStrings.public
import typings.reactNativePushNotification.reactNativePushNotificationStrings.secret
import typings.reactNativePushNotification.reactNativePushNotificationStrings.time
import typings.reactNativePushNotification.reactNativePushNotificationStrings.unspecified
import typings.reactNativePushNotification.reactNativePushNotificationStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-push-notification", "PushNotificationObject")
@js.native
class PushNotificationObject () extends js.Object {
  
  var actions: js.UndefOr[String] = js.native
  
  /* iOS only properties */
  var alertAction: js.UndefOr[js.Any] = js.native
  
  var allowWhileIdle: js.UndefOr[Boolean] = js.native
  
  var autoCancel: js.UndefOr[Boolean] = js.native
  
  var bigPictureUrl: js.UndefOr[String] = js.native
  
  var bigText: js.UndefOr[String] = js.native
  
  var category: js.UndefOr[js.Any] = js.native
  
  var channelId: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var groupSummary: js.UndefOr[Boolean] = js.native
  
  /* iOS and Android properties */
  var id: js.UndefOr[Double] = js.native
  
  var ignoreInForeground: js.UndefOr[Boolean] = js.native
  
  var importance: js.UndefOr[
    typings.reactNativePushNotification.reactNativePushNotificationStrings.default | max | high | low | min | none | unspecified
  ] = js.native
  
  var invokeApp: js.UndefOr[Boolean] = js.native
  
  var largeIcon: js.UndefOr[String] = js.native
  
  var largeIconUrl: js.UndefOr[String] = js.native
  
  var message: String = js.native
  
  var messageId: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[String | Double] = js.native
  
  var ongoing: js.UndefOr[Boolean] = js.native
  
  var onlyAlertOnce: js.UndefOr[Boolean] = js.native
  
  var playSound: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[
    max | high | low | min | typings.reactNativePushNotification.reactNativePushNotificationStrings.default
  ] = js.native
  
  var repeatTime: js.UndefOr[Double] = js.native
  
  var repeatType: js.UndefOr[week | day | hour | minute | time] = js.native
  
  var shortcutId: js.UndefOr[String] = js.native
  
  var showWhen: js.UndefOr[Boolean] = js.native
  
  var smallIcon: js.UndefOr[String] = js.native
  
  var soundName: js.UndefOr[String] = js.native
  
  var subText: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  /* Android only properties */
  var ticker: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var userInfo: js.UndefOr[js.Any] = js.native
  
  var vibrate: js.UndefOr[Boolean] = js.native
  
  var vibration: js.UndefOr[Double] = js.native
  
  var visibility: js.UndefOr[`private` | public | secret] = js.native
}
