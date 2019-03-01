package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerIOSItemProps extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object PickerIOSItemProps {
  @scala.inline
  def apply(label: java.lang.String = null, value: java.lang.String | scala.Double = null): PickerIOSItemProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerIOSItemProps]
  }
}

