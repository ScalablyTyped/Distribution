package typings.reactMdl.mod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps
  extends MDLHTMLAttributes
     with MDLDOMAttributes[Tabs] {
  
  var activeTab: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* tabId */ Double, _]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[Tabs]] = js.native
  
  var tabBarProps: js.UndefOr[TabBarProps] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object TabsProps {
  
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* tabId */ Double => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[Tabs, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTabBarProps(value: TabBarProps): Self = StObject.set(x, "tabBarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarPropsUndefined: Self = StObject.set(x, "tabBarProps", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
