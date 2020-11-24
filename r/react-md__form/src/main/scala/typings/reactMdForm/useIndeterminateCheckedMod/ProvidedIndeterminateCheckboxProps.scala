package typings.reactMdForm.useIndeterminateCheckedMod

import typings.reactMdForm.reactMdFormStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidedIndeterminateCheckboxProps extends js.Object {
  
  var `aria-checked`: js.UndefOr[mixed] = js.native
  
  var checked: Boolean = js.native
  
  var indeterminate: Boolean = js.native
  
  def onChange(): Unit = js.native
}
object ProvidedIndeterminateCheckboxProps {
  
  @scala.inline
  def apply(checked: Boolean, indeterminate: Boolean, onChange: () => Unit): ProvidedIndeterminateCheckboxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange))
    __obj.asInstanceOf[ProvidedIndeterminateCheckboxProps]
  }
  
  @scala.inline
  implicit class ProvidedIndeterminateCheckboxPropsOps[Self <: ProvidedIndeterminateCheckboxProps] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def `setAria-checked`(value: mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
  }
}
