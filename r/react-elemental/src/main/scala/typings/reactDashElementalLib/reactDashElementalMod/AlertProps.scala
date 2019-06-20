package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  val dismissible: js.UndefOr[scala.Boolean] = js.undefined
  val message: java.lang.String | reactLib.reactMod.ReactElement
  val onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  val size: js.UndefOr[AlertSize] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val title: java.lang.String
  val `type`: js.UndefOr[AlertType] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    message: java.lang.String | reactLib.reactMod.ReactElement,
    title: java.lang.String,
    dismissible: js.UndefOr[scala.Boolean] = js.undefined,
    onDismiss: () => scala.Unit = null,
    size: AlertSize = null,
    style: reactLib.reactMod.CSSProperties = null,
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

