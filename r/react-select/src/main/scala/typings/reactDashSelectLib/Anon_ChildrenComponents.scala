package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenComponents[OptionType] extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var components: js.Any
  var cropWithEllipsis: scala.Boolean
  var data: OptionType
  var innerProps: js.Any
  var isDisabled: scala.Boolean
  var isFocused: scala.Boolean
  var removeProps: Anon_EventOnClick
}

object Anon_ChildrenComponents {
  @scala.inline
  def apply[OptionType](
    children: reactLib.reactMod.ReactNs.ReactNode,
    components: js.Any,
    cropWithEllipsis: scala.Boolean,
    data: OptionType,
    innerProps: js.Any,
    isDisabled: scala.Boolean,
    isFocused: scala.Boolean,
    removeProps: Anon_EventOnClick
  ): Anon_ChildrenComponents[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("components")(components)
    __obj.updateDynamic("cropWithEllipsis")(cropWithEllipsis)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("innerProps")(innerProps)
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.updateDynamic("isFocused")(isFocused)
    __obj.updateDynamic("removeProps")(removeProps)
    __obj.asInstanceOf[Anon_ChildrenComponents[OptionType]]
  }
}

