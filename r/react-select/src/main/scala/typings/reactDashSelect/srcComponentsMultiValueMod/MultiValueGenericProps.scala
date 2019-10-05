package typings.reactDashSelect.srcComponentsMultiValueMod

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.Anon_ClassName
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: ReactNode
  var data: OptionType
  var innerProps: Anon_ClassName
  var selectProps: js.Any
}

object MultiValueGenericProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: Anon_ClassName, selectProps: js.Any, children: ReactNode = null): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps, selectProps = selectProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}

