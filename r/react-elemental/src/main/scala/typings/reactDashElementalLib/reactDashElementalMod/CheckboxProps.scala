package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  val checked: js.UndefOr[scala.Boolean] = js.undefined
  val children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  val disabled: js.UndefOr[scala.Boolean] = js.undefined
  val label: js.UndefOr[java.lang.String] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    onChange: /* checked */ scala.Boolean => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CheckboxProps]
  }
}

