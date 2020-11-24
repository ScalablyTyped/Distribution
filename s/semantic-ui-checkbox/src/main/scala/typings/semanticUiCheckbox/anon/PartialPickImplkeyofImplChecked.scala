package typings.semanticUiCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplChecked extends js.Object {
  
  var checked: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var radio: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplChecked {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplChecked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplChecked]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplCheckedOps[Self <: PartialPickImplkeyofImplChecked] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: String): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setRadio(value: String): Self = this.set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadio: Self = this.set("radio", js.undefined)
    
    @scala.inline
    def setReadOnly(value: String): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
}
