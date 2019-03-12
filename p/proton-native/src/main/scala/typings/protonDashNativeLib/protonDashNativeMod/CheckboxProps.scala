package typings
package protonDashNativeLib.protonDashNativeMod

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
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text to display next to the check box.
    */
  var children: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the checkbox can be used.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when the checkbox is clicked. The current checkbox state is passed as an argument.
    */
  var onToggle: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Whether the checkbox can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: java.lang.String = null,
    column: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expand: protonDashNativeLib.Anon_H = null,
    label: java.lang.String = null,
    onToggle: /* checked */ scala.Boolean => scala.Unit = null,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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

