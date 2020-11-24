package typings.reachCombobox.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboboxInputProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  
  var autocomplete: js.UndefOr[Boolean] = js.native
  
  var selectOnClick: js.UndefOr[Boolean] = js.native
  
  @JSName("value")
  var value_ComboboxInputProps: js.UndefOr[String] = js.native
}
object ComboboxInputProps {
  
  @scala.inline
  def apply(): ComboboxInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboboxInputProps]
  }
  
  @scala.inline
  implicit class ComboboxInputPropsOps[Self <: ComboboxInputProps] (val x: Self) extends AnyVal {
    
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
    def setAutocomplete(value: Boolean): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    
    @scala.inline
    def setSelectOnClick(value: Boolean): Self = this.set("selectOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnClick: Self = this.set("selectOnClick", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
