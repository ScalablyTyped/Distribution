package typings.reactDashSelect.srcComponentsSingleValueMod

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /** The children to be rendered. */
  var children: ReactNode
  /* The data of the selected option rendered in the Single Value componentn */
  var data: OptionType
  /** Props passed to the wrapping element for the group. */
  var innerProps: js.Any
}

object ValueProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: js.Any, children: ReactNode = null): ValueProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProps[OptionType]]
  }
}

