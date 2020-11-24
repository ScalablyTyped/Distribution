package typings.reactSelect.stateManagerMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  var defaultInputValue: String = js.native
  
  var defaultMenuIsOpen: Boolean = js.native
  
  var defaultValue: ValueType[OptionType] = js.native
}
object DefaultProps {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](defaultInputValue: String, defaultMenuIsOpen: Boolean): DefaultProps[OptionType] = {
    val __obj = js.Dynamic.literal(defaultInputValue = defaultInputValue.asInstanceOf[js.Any], defaultMenuIsOpen = defaultMenuIsOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps[OptionType]]
  }
  
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps[_], OptionType /* <: OptionTypeBase */] (val x: Self with DefaultProps[OptionType]) extends AnyVal {
    
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
    def setDefaultMenuIsOpen(value: Boolean): Self = this.set("defaultMenuIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueVarargs(value: OptionType*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: ValueType[OptionType]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
  }
}
