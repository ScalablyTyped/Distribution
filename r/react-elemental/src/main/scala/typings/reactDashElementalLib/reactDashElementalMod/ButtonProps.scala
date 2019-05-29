package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  val children: js.UndefOr[js.Any] = js.undefined
  val color: js.UndefOr[java.lang.String] = js.undefined
  val disabled: js.UndefOr[scala.Boolean] = js.undefined
  val secondary: js.UndefOr[scala.Boolean] = js.undefined
  val size: js.UndefOr[ButtonSize] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val text: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    size: ButtonSize = null,
    style: reactLib.reactMod.CSSProperties = null,
    text: java.lang.String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ButtonProps]
  }
}

