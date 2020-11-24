package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSearchBar extends js.Object {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  
  var hideTopBarOnFocus: js.UndefOr[Boolean] = js.native
  
  var obscuresBackgroundDuringPresentation: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var tintColor: js.UndefOr[Color] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object OptionsSearchBar {
  
  @scala.inline
  def apply(): OptionsSearchBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSearchBar]
  }
  
  @scala.inline
  implicit class OptionsSearchBarOps[Self <: OptionsSearchBar] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = this.set("hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnScroll: Self = this.set("hideOnScroll", js.undefined)
    
    @scala.inline
    def setHideTopBarOnFocus(value: Boolean): Self = this.set("hideTopBarOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTopBarOnFocus: Self = this.set("hideTopBarOnFocus", js.undefined)
    
    @scala.inline
    def setObscuresBackgroundDuringPresentation(value: Boolean): Self = this.set("obscuresBackgroundDuringPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObscuresBackgroundDuringPresentation: Self = this.set("obscuresBackgroundDuringPresentation", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setTintColor(value: Color): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
