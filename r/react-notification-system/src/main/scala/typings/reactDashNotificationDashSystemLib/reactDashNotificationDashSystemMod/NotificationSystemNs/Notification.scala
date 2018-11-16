package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Notification extends js.Object {
  var action: js.UndefOr[ActionObject] = js.undefined
  var autoDismiss: js.UndefOr[scala.Double] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var dismissible: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[
    reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.error | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.warning | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.info | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.success
  ] = js.undefined
  var message: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onAdd: js.UndefOr[CallBackFunction] = js.undefined
  var onRemove: js.UndefOr[CallBackFunction] = js.undefined
  var position: js.UndefOr[
    reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.tr | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.tl | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.tc | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.br | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.bl | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.bc
  ] = js.undefined
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var uid: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

