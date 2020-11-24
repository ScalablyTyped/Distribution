package typings.reactNativeNavbar.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBarProps extends js.Object {
  
  var leftButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.native
  
  var rightButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.native
  
  var statusBar: js.UndefOr[StatusBar] = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[NavigationBarTitle | ReactElement | Null] = js.native
}
object NavigationBarProps {
  
  @scala.inline
  def apply(): NavigationBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarProps]
  }
  
  @scala.inline
  implicit class NavigationBarPropsOps[Self <: NavigationBarProps] (val x: Self) extends AnyVal {
    
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
    def setLeftButton(value: NavigationBarButton | ReactElement): Self = this.set("leftButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftButton: Self = this.set("leftButton", js.undefined)
    
    @scala.inline
    def setLeftButtonNull: Self = this.set("leftButton", null)
    
    @scala.inline
    def setRightButton(value: NavigationBarButton | ReactElement): Self = this.set("rightButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightButton: Self = this.set("rightButton", js.undefined)
    
    @scala.inline
    def setRightButtonNull: Self = this.set("rightButton", null)
    
    @scala.inline
    def setStatusBar(value: StatusBar): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setTitle(value: NavigationBarTitle | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
}
