package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonsProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the RadioButtons can be used.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when a RadioButton is selected. The number selected is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selected */ scala.Double, scala.Unit]] = js.undefined
  /**
    * What RadioButton is selected, zero-indexed. -1 means nothing is selected.
    */
  var selected: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the RadioButtons can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object RadioButtonsProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    column: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expand: protonDashNativeLib.Anon_H = null,
    label: java.lang.String = null,
    onSelect: js.Function1[/* selected */ scala.Double, scala.Unit] = null,
    row: scala.Int | scala.Double = null,
    selected: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): RadioButtonsProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[RadioButtonsProps]
  }
}

