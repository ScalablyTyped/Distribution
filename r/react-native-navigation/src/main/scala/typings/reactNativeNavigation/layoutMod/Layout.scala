package typings.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout[P] extends js.Object {
  
  /**
    * Set the bottom tabs
    */
  var bottomTabs: js.UndefOr[LayoutBottomTabs] = js.native
  
  /**
    * Set the component
    */
  var component: js.UndefOr[LayoutComponent[P]] = js.native
  
  /**
    * Set the external component
    */
  var externalComponent: js.UndefOr[ExternalComponent] = js.native
  
  /**
    * Set the side menu
    */
  var sideMenu: js.UndefOr[LayoutSideMenu] = js.native
  
  /**
    * Set the split view
    */
  var splitView: js.UndefOr[LayoutSplitView] = js.native
  
  /**
    * Set the stack
    */
  var stack: js.UndefOr[LayoutStack] = js.native
  
  /**
    * Set the top tabs
    */
  var topTabs: js.UndefOr[LayoutTopTabs] = js.native
}
object Layout {
  
  @scala.inline
  def apply[P](): Layout[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout[P]]
  }
  
  @scala.inline
  implicit class LayoutOps[Self <: Layout[_], P] (val x: Self with Layout[P]) extends AnyVal {
    
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
    def setBottomTabs(value: LayoutBottomTabs): Self = this.set("bottomTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomTabs: Self = this.set("bottomTabs", js.undefined)
    
    @scala.inline
    def setComponent(value: LayoutComponent[P]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setExternalComponent(value: ExternalComponent): Self = this.set("externalComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalComponent: Self = this.set("externalComponent", js.undefined)
    
    @scala.inline
    def setSideMenu(value: LayoutSideMenu): Self = this.set("sideMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideMenu: Self = this.set("sideMenu", js.undefined)
    
    @scala.inline
    def setSplitView(value: LayoutSplitView): Self = this.set("splitView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitView: Self = this.set("splitView", js.undefined)
    
    @scala.inline
    def setStack(value: LayoutStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setTopTabs(value: LayoutTopTabs): Self = this.set("topTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopTabs: Self = this.set("topTabs", js.undefined)
  }
}
