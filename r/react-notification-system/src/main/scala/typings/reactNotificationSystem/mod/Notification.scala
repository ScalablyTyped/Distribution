package typings.reactNotificationSystem.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNotificationSystem.reactNotificationSystemStrings.bc
import typings.reactNotificationSystem.reactNotificationSystemStrings.bl
import typings.reactNotificationSystem.reactNotificationSystemStrings.br
import typings.reactNotificationSystem.reactNotificationSystemStrings.error
import typings.reactNotificationSystem.reactNotificationSystemStrings.info
import typings.reactNotificationSystem.reactNotificationSystemStrings.success
import typings.reactNotificationSystem.reactNotificationSystemStrings.tc
import typings.reactNotificationSystem.reactNotificationSystemStrings.tl
import typings.reactNotificationSystem.reactNotificationSystemStrings.tr
import typings.reactNotificationSystem.reactNotificationSystemStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var action: js.UndefOr[ActionObject] = js.undefined
  var autoDismiss: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[error | warning | info | success] = js.undefined
  var message: js.UndefOr[String | Element] = js.undefined
  var onAdd: js.UndefOr[CallBackFunction] = js.undefined
  var onRemove: js.UndefOr[CallBackFunction] = js.undefined
  var position: js.UndefOr[tr | tl | tc | br | bl | bc] = js.undefined
  var title: js.UndefOr[String | Element] = js.undefined
  var uid: js.UndefOr[Double | String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    action: ActionObject = null,
    autoDismiss: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    level: error | warning | info | success = null,
    message: String | Element = null,
    onAdd: /* notification */ Notification => Unit = null,
    onRemove: /* notification */ Notification => Unit = null,
    position: tr | tl | tc | br | bl | bc = null,
    title: String | Element = null,
    uid: Double | String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

