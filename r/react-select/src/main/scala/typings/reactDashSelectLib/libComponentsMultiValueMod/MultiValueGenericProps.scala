package typings
package reactDashSelectLib.libComponentsMultiValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueGenericProps[OptionType] extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var data: OptionType
  var innerProps: reactDashSelectLib.Anon_ClassName
  var selectProps: js.Any
}

object MultiValueGenericProps {
  @scala.inline
  def apply[OptionType](
    children: reactLib.reactMod.ReactNs.ReactNode,
    data: OptionType,
    innerProps: reactDashSelectLib.Anon_ClassName,
    selectProps: js.Any
  ): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("innerProps")(innerProps)
    __obj.updateDynamic("selectProps")(selectProps)
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}

