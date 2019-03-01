package typings
package reactDashSelectLib.libComponentsSingleValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProps[OptionType] extends js.Object {
  /** The children to be rendered. */
  var children: java.lang.String
  /* The data of the selected option rendered in the Single Value componentn */
  var data: OptionType
  /** Props passed to the wrapping element for the group. */
  var innerProps: js.Any
}

object ValueProps {
  @scala.inline
  def apply[OptionType](children: java.lang.String, data: OptionType, innerProps: js.Any): ValueProps[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("innerProps")(innerProps)
    __obj.asInstanceOf[ValueProps[OptionType]]
  }
}

