package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the ProgressBar is enabled.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The current value of the ProgressBar (0-100). A value of -1 indicates an indeterminate progressbar.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the ProgressBar can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    column: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expand: protonDashNativeLib.Anon_H = null,
    label: java.lang.String = null,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ProgressBarProps]
  }
}

