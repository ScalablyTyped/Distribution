package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
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
    align: H = null,
    column: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: H = null,
    label: String = null,
    onSelect: /* selected */ Double => Unit = null,
    row: js.UndefOr[Double] = js.undefined,
    selected: js.UndefOr[Double] = js.undefined,
    span: X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): RadioButtonsProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonsProps]
  }
}

