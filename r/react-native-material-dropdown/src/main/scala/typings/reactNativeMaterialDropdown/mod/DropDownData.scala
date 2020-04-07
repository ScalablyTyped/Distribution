package typings.reactNativeMaterialDropdown.mod

import typings.reactNativeMaterialDropdown.PartialDropDownPropsAbsoluteRTLLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownData extends js.Object {
  /** Label to be shown */
  var label: js.UndefOr[String] = js.undefined
  /** Props for this item */
  var props: js.UndefOr[PartialDropDownPropsAbsoluteRTLLayout] = js.undefined
  /** Value of item */
  var value: String
}

object DropDownData {
  @scala.inline
  def apply(value: String, label: String = null, props: PartialDropDownPropsAbsoluteRTLLayout = null): DropDownData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownData]
  }
}

