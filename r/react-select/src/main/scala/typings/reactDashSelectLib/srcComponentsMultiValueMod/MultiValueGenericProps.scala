package typings
package reactDashSelectLib.srcComponentsMultiValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueGenericProps[OptionType] extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var data: OptionType
  var innerProps: reactDashSelectLib.Anon_ClassName
  var selectProps: js.Any
}

object MultiValueGenericProps {
  @scala.inline
  def apply[OptionType](
    children: reactLib.reactMod.ReactNode,
    data: OptionType,
    innerProps: reactDashSelectLib.Anon_ClassName,
    selectProps: js.Any
  ): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], innerProps = innerProps, selectProps = selectProps)
  
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}

