package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerItemProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var testID: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PickerItemProps {
  @scala.inline
  def apply(
    label: java.lang.String,
    color: java.lang.String = null,
    testID: java.lang.String = null,
    value: js.Any = null
  ): PickerItemProps = {
    val __obj = js.Dynamic.literal(label = label)
    if (color != null) __obj.updateDynamic("color")(color)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerItemProps]
  }
}

