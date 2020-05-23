package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the user can enter their own custom text in addition to the drop down menu.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the Picker is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * When an *editable* Picker is changed. The current text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  /**
    * When a *non-editable* Picker is changed. The current selection is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selection */ Double, Unit]] = js.undefined
  /**
    * What element is selected if the picker *is not* editable.
    */
  var selected: js.UndefOr[Double] = js.undefined
  /**
    * What text is selected/typed if the picker *is* editable.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Whether the Picker can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    align: H = null,
    column: js.UndefOr[Double] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: H = null,
    label: String = null,
    onChange: /* text */ String => Unit = null,
    onSelect: /* selection */ Double => Unit = null,
    row: js.UndefOr[Double] = js.undefined,
    selected: js.UndefOr[Double] = js.undefined,
    span: X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PickerProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps]
  }
}

