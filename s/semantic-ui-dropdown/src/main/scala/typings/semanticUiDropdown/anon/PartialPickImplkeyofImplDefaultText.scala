package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplDefaultText extends js.Object {
  
  var defaultText: js.UndefOr[String] = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var placeholderText: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplDefaultText {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplDefaultText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplDefaultText]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplDefaultTextOps[Self <: PartialPickImplkeyofImplDefaultText] (val x: Self) extends AnyVal {
    
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
    def deleteDefaultText: Self = this.set("defaultText", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
