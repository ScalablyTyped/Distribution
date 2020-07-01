package typings.reactSelect.componentsMultiValueMod

import typings.react.mod.ReactNode
import typings.reactSelect.anon.ClassName
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: ReactNode
  var data: OptionType
  var innerProps: ClassName
  var selectProps: js.Any
}

object MultiValueGenericProps {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](data: OptionType, innerProps: ClassName, selectProps: js.Any, children: ReactNode = null): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}

