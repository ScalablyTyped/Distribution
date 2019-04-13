package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var action: js.UndefOr[ActionObject] = js.undefined
  var autoDismiss: js.UndefOr[scala.Double] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
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

object Notification {
  @scala.inline
  def apply(
    action: ActionObject = null,
    autoDismiss: scala.Int | scala.Double = null,
    children: reactLib.reactMod.ReactNode = null,
    dismissible: js.UndefOr[scala.Boolean] = js.undefined,
    level: reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.error | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.warning | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.info | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.success = null,
    message: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    onAdd: CallBackFunction = null,
    onRemove: CallBackFunction = null,
    position: reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.tr | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.tl | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.tc | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.br | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.bl | reactDashNotificationDashSystemLib.reactDashNotificationDashSystemLibStrings.bc = null,
    title: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    uid: scala.Double | java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

