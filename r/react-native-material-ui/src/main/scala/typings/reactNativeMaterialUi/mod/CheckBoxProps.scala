package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.AnonLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedIcon: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
  var style: js.UndefOr[AnonLabel] = js.undefined
  var uncheckedIcon: js.UndefOr[String] = js.undefined
  var value: String | Double
  def onCheck(checked: Boolean): Unit
}

object CheckBoxProps {
  @scala.inline
  def apply(
    label: String,
    onCheck: Boolean => Unit,
    value: String | Double,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedIcon: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: AnonLabel = null,
    uncheckedIcon: String = null
  ): CheckBoxProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onCheck = js.Any.fromFunction1(onCheck), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
}

