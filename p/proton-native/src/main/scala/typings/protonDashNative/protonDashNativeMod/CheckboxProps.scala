package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the checkbox is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * The text to display next to the check box.
    */
  var children: js.UndefOr[String] = js.undefined
  /**
    * Whether the checkbox can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when the checkbox is clicked. The current checkbox state is passed as an argument.
    */
  var onToggle: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  /**
    * Whether the checkbox can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: String = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: Anon_H = null,
    label: String = null,
    onToggle: /* checked */ Boolean => Unit = null,
    row: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CheckboxProps]
  }
}

