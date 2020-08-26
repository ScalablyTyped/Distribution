package typings.reactSelect.stateManagerMod

import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultInputValue: js.UndefOr[String] = js.native
  var defaultMenuIsOpen: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[ValueType[OptionType]] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var menuIsOpen: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta[OptionType], Unit]
  ] = js.native
  var value: js.UndefOr[ValueType[OptionType]] = js.native
}

object Props {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[OptionType]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with Props[OptionType]) extends AnyVal {
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
    def setDefaultInputValue(value: String): Self = this.set("defaultInputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInputValue: Self = this.set("defaultInputValue", js.undefined)
    @scala.inline
    def setDefaultMenuIsOpen(value: Boolean): Self = this.set("defaultMenuIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMenuIsOpen: Self = this.set("defaultMenuIsOpen", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: OptionType*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: ValueType[OptionType]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setMenuIsOpen(value: Boolean): Self = this.set("menuIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIsOpen: Self = this.set("menuIsOpen", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta[OptionType]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setValueVarargs(value: OptionType*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: ValueType[OptionType]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

