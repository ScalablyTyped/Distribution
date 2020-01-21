package typings.reactNativePushNotification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-push-notification", "PushNotificationObject")
@js.native
class PushNotificationObject () extends js.Object {
  var actions: js.UndefOr[String] = js.native
  /* iOS only properties */
  var alertAction: js.UndefOr[js.Any] = js.native
  var autoCancel: js.UndefOr[Boolean] = js.native
  var bigText: js.UndefOr[String] = js.native
  var category: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  /* Android only properties */
  var id: js.UndefOr[String] = js.native
  var importance: js.UndefOr[ImportanceType] = js.native
  var largeIcon: js.UndefOr[String] = js.native
  var message: String = js.native
  var number: js.UndefOr[String] = js.native
  var ongoing: js.UndefOr[Boolean] = js.native
  var playSound: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[PriorityType] = js.native
  var repeatType: js.UndefOr[RepeatType] = js.native
  var smallIcon: js.UndefOr[String] = js.native
  var soundName: js.UndefOr[String] = js.native
  var subText: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var ticker: js.UndefOr[String] = js.native
  /* iOS and Android properties */
  var title: js.UndefOr[String] = js.native
  var userInfo: js.UndefOr[js.Any] = js.native
  var vibrate: js.UndefOr[Boolean] = js.native
  var vibration: js.UndefOr[Double] = js.native
  var visibility: js.UndefOr[VisibilityType] = js.native
}

