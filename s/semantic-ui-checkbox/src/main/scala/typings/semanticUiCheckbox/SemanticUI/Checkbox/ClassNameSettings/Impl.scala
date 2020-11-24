package typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default 'checked'
    */
  var checked: String = js.native
  
  /**
    * @default 'disabled'
    */
  var disabled: String = js.native
  
  /**
    * @default 'radio'
    */
  var radio: String = js.native
  
  /**
    * @default 'read-only'
    */
  var readOnly: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(checked: String, disabled: String, radio: String, readOnly: String): Impl = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadio(value: String): Self = this.set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: String): Self = this.set("readOnly", value.asInstanceOf[js.Any])
  }
}
