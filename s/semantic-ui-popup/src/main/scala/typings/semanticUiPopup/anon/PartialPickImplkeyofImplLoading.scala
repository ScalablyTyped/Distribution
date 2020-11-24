package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplLoading extends js.Object {
  
  var loading: js.UndefOr[String] = js.native
  
  var popup: js.UndefOr[String] = js.native
  
  var popupVisible: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplLoading {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplLoading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplLoading]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplLoadingOps[Self <: PartialPickImplkeyofImplLoading] (val x: Self) extends AnyVal {
    
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
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setPopupVisible(value: String): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
