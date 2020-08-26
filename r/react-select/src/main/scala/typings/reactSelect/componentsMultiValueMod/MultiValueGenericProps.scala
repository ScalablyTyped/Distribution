package typings.reactSelect.componentsMultiValueMod

import typings.react.mod.ReactNode
import typings.reactSelect.anon.ClassName
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: ReactNode = js.native
  var data: OptionType = js.native
  var innerProps: ClassName = js.native
  var selectProps: js.Any = js.native
}

object MultiValueGenericProps {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](data: OptionType, innerProps: ClassName, selectProps: js.Any): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
  @scala.inline
  implicit class MultiValueGenericPropsOps[Self <: MultiValueGenericProps[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with MultiValueGenericProps[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: OptionType): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerProps(value: ClassName): Self = this.set("innerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectProps(value: js.Any): Self = this.set("selectProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

