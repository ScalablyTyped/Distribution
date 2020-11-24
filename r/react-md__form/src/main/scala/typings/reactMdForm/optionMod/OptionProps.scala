package typings.reactMdForm.optionMod

import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionProps extends SimpleListItemProps {
  
  /**
    * Boolean if the option is currently selected via aria-activedescendant
    * movement.
    */
  var focused: Boolean = js.native
  
  /**
    * Boolean if the option's value is equal to the current listbox's value if it
    * is acting as a select component.
    */
  var selected: Boolean = js.native
}
object OptionProps {
  
  @scala.inline
  def apply(focused: Boolean, selected: Boolean): OptionProps = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps]
  }
  
  @scala.inline
  implicit class OptionPropsOps[Self <: OptionProps] (val x: Self) extends AnyVal {
    
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
