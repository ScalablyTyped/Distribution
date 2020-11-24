package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.left
import typings.reactNativeNavigation.reactNativeNavigationStrings.mini
import typings.reactNativeNavigation.reactNativeNavigationStrings.regular
import typings.reactNativeNavigation.reactNativeNavigationStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsFab extends js.Object {
  
  var alignHorizontally: js.UndefOr[left | right] = js.native
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var clickColor: js.UndefOr[Color] = js.native
  
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[ImageResource] = js.native
  
  var iconColor: js.UndefOr[Color] = js.native
  
  var id: String = js.native
  
  var rippleColor: js.UndefOr[Color] = js.native
  
  var size: js.UndefOr[mini | regular] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object OptionsFab {
  
  @scala.inline
  def apply(id: String): OptionsFab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsFab]
  }
  
  @scala.inline
  implicit class OptionsFabOps[Self <: OptionsFab] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignHorizontally(value: left | right): Self = this.set("alignHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignHorizontally: Self = this.set("alignHorizontally", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setClickColor(value: Color): Self = this.set("clickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickColor: Self = this.set("clickColor", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = this.set("hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnScroll: Self = this.set("hideOnScroll", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageResource): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconColor(value: Color): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setRippleColor(value: Color): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    
    @scala.inline
    def setSize(value: mini | regular): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
