package typings.reactSelect.stateManagerMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  var inputValue: String = js.native
  
  var menuIsOpen: Boolean = js.native
  
  var value: ValueType[OptionType] = js.native
}
object State {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](inputValue: String, menuIsOpen: Boolean): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State[_], OptionType /* <: OptionTypeBase */] (val x: Self with State[OptionType]) extends AnyVal {
    
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
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIsOpen(value: Boolean): Self = this.set("menuIsOpen", value.asInstanceOf[js.Any])
    
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
