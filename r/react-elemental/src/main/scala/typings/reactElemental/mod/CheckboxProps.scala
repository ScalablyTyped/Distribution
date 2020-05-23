package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  val checked: js.UndefOr[Boolean] = js.undefined
  val children: js.UndefOr[ReactNode] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    onChange: /* checked */ Boolean => Unit = null,
    style: CSSProperties = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

