package typings
package reactDashNativeDashMaterialDashDropdownLib.reactDashNativeDashMaterialDashDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownData extends js.Object {
  /** Label to be shown */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Props for this item */
  var props: js.UndefOr[stdLib.Partial[DropDownProps]] = js.undefined
  /** Value of item */
  var value: java.lang.String
}

object DropDownData {
  @scala.inline
  def apply(
    value: java.lang.String,
    label: java.lang.String = null,
    props: stdLib.Partial[DropDownProps] = null
  ): DropDownData = {
    val __obj = js.Dynamic.literal(value = value)
    if (label != null) __obj.updateDynamic("label")(label)
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[DropDownData]
  }
}

