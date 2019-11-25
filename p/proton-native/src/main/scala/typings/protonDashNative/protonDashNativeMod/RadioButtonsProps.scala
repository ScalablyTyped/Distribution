package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
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
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when a RadioButton is selected. The number selected is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selected */ Double, Unit]] = js.undefined
  /**
    * What RadioButton is selected, zero-indexed. -1 means nothing is selected.
    */
  var selected: js.UndefOr[Double] = js.undefined
  /**
    * Whether the RadioButtons can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object RadioButtonsProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: Anon_H = null,
    label: String = null,
    onSelect: /* selected */ Double => Unit = null,
    row: Int | Double = null,
    selected: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): RadioButtonsProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonsProps]
  }
}

