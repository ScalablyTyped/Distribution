package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The text to display in the button.
    */
  var children: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the button can be clicked.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when the button is clicked.
    */
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Whether the button can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    children: java.lang.String = null,
    column: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expand: protonDashNativeLib.Anon_H = null,
    label: java.lang.String = null,
    onClick: () => scala.Unit = null,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ButtonProps]
  }
}

