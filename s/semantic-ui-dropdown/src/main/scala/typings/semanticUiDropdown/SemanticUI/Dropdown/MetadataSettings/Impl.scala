package typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default 'defaultText'
    */
  var defaultText: String = js.native
  
  /**
    * @default 'defaultValue'
    */
  var defaultValue: String = js.native
  
  /**
    * @default 'placeholderText'
    */
  var placeholderText: String = js.native
  
  /**
    * @default 'text'
    */
  var text: String = js.native
  
  /**
    * @default 'value'
    */
  var value: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(defaultText: String, defaultValue: String, placeholderText: String, text: String, value: String): Impl = {
    val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], placeholderText = placeholderText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setDefaultText(value: String): Self = this.set("defaultText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
