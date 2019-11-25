package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerItemProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var label: String
  var testID: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PickerItemProps {
  @scala.inline
  def apply(label: String, color: String = null, testID: String = null, value: js.Any = null): PickerItemProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerItemProps]
  }
}

