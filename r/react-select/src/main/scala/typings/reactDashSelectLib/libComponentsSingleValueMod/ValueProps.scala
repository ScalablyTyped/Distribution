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
    val __obj = js.Dynamic.literal(children = children, data = data.asInstanceOf[js.Any], innerProps = innerProps)
  
    __obj.asInstanceOf[ValueProps[OptionType]]
  }
}

