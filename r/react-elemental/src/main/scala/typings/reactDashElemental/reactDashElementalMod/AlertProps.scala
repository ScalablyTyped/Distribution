package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  val dismissible: js.UndefOr[Boolean] = js.undefined
  val message: String | ReactElement
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  val size: js.UndefOr[AlertSize] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val title: String
  val `type`: js.UndefOr[AlertType] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    message: String | ReactElement,
    title: String,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null,
    size: AlertSize = null,
    style: CSSProperties = null,
    `type`: AlertType = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title)
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AlertProps]
  }
}

