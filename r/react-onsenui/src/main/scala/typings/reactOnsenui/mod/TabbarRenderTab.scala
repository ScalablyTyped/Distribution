package typings.reactOnsenui.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabbarRenderTab extends StObject {
  
  var content: Element
  
  var tab: Element
}
object TabbarRenderTab {
  
  @scala.inline
  def apply(content: Element, tab: Element): TabbarRenderTab = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbarRenderTab]
  }
  
  @scala.inline
  implicit class TabbarRenderTabMutableBuilder[Self <: TabbarRenderTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: Element): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
