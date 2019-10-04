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
  def apply[OptionType /* <: OptionTypeBase */](children: ReactNode, data: OptionType, innerProps: Anon_ClassName, selectProps: js.Any): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], innerProps = innerProps, selectProps = selectProps)
  
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}

