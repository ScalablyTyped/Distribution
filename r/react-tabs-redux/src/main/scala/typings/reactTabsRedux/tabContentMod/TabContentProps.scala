package typings.reactTabsRedux.tabContentMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabContentProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var disableInlineStyles: js.UndefOr[Boolean] = js.native
  
  var `for`: String | Double = js.native
  
  var isVisible: js.UndefOr[Boolean] = js.native
  
  var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var visibleClassName: js.UndefOr[String] = js.native
  
  var visibleStyle: js.UndefOr[js.Object] = js.native
}
object TabContentProps {
  
  @scala.inline
  def apply(`for`: String | Double): TabContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContentProps]
  }
  
  @scala.inline
  implicit class TabContentPropsOps[Self <: TabContentProps] (val x: Self) extends AnyVal {
    
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
    def setFor(value: String | Double): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisableInlineStyles(value: Boolean): Self = this.set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInlineStyles: Self = this.set("disableInlineStyles", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    
    @scala.inline
    def setRenderActiveTabContentOnly(value: Boolean): Self = this.set("renderActiveTabContentOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderActiveTabContentOnly: Self = this.set("renderActiveTabContentOnly", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVisibleClassName(value: String): Self = this.set("visibleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleClassName: Self = this.set("visibleClassName", js.undefined)
    
    @scala.inline
    def setVisibleStyle(value: js.Object): Self = this.set("visibleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleStyle: Self = this.set("visibleStyle", js.undefined)
  }
}
