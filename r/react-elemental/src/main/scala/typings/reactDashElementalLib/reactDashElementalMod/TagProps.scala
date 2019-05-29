package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  val backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  val dismissible: js.UndefOr[scala.Boolean] = js.undefined
  val onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  val outlineColor: js.UndefOr[java.lang.String] = js.undefined
  val size: js.UndefOr[TagSize] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val text: java.lang.String
}

object TagProps {
  @scala.inline
  def apply(
    text: java.lang.String,
    backgroundColor: java.lang.String = null,
    dismissible: js.UndefOr[scala.Boolean] = js.undefined,
    onDismiss: () => scala.Unit = null,
    outlineColor: java.lang.String = null,
    size: TagSize = null,
    style: reactLib.reactMod.CSSProperties = null
  ): TagProps = {
    val __obj = js.Dynamic.literal(text = text)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TagProps]
  }
}

