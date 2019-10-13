package typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod

import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.bc
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.bl
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.br
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.error
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.info
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.success
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.tc
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.tl
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.tr
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemStrings.warning
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
    autoDismiss: Int | Double = null,
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
    if (action != null) __obj.updateDynamic("action")(action)
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible)
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

