package typings.reactRouterTabs.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutedTabsProps extends js.Object {
  
  var activeTabClassName: js.UndefOr[String] = js.native
  
  var activeTabStyle: js.UndefOr[js.Object] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var startPathWith: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tabClassName: js.UndefOr[String] = js.native
  
  var tabStyle: js.UndefOr[js.Object] = js.native
}
object RoutedTabsProps {
  
  @scala.inline
  def apply(): RoutedTabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutedTabsProps]
  }
  
  @scala.inline
  implicit class RoutedTabsPropsOps[Self <: RoutedTabsProps] (val x: Self) extends AnyVal {
    
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
    def setActiveTabClassName(value: String): Self = this.set("activeTabClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTabClassName: Self = this.set("activeTabClassName", js.undefined)
    
    @scala.inline
    def setActiveTabStyle(value: js.Object): Self = this.set("activeTabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTabStyle: Self = this.set("activeTabStyle", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setStartPathWith(value: String): Self = this.set("startPathWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPathWith: Self = this.set("startPathWith", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabClassName(value: String): Self = this.set("tabClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabClassName: Self = this.set("tabClassName", js.undefined)
    
    @scala.inline
    def setTabStyle(value: js.Object): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
  }
}
