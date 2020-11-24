package typings.reactNativeScrollableTabView.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollableTabBarProps extends DefaultTabBarProps {
  
  var scrollOffset: js.UndefOr[Double] = js.native
  
  var tabsContainerStyle: js.UndefOr[ViewStyle] = js.native
}
object ScrollableTabBarProps {
  
  @scala.inline
  def apply(): ScrollableTabBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableTabBarProps]
  }
  
  @scala.inline
  implicit class ScrollableTabBarPropsOps[Self <: ScrollableTabBarProps] (val x: Self) extends AnyVal {
    
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
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
    
    @scala.inline
    def setTabsContainerStyle(value: ViewStyle): Self = this.set("tabsContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabsContainerStyle: Self = this.set("tabsContainerStyle", js.undefined)
  }
}
