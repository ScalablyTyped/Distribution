package typings.rcTabs

import typings.rcTabs.interfaceMod.AnimatedConfig
import typings.rcTabs.interfaceMod.TabPosition
import typings.react.mod.Key
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelListMod {
  
  @JSImport("rc-tabs/es/TabPanelList", JSImport.Default)
  @js.native
  def default(hasIdActiveKeyAnimatedTabPositionRtlDestroyInactiveTabPane: TabPanelListProps): Element = js.native
  
  @js.native
  trait TabPanelListProps extends StObject {
    
    var activeKey: Key = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var destroyInactiveTabPane: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var rtl: Boolean = js.native
    
    var tabPosition: js.UndefOr[TabPosition] = js.native
  }
  object TabPanelListProps {
    
    @scala.inline
    def apply(activeKey: Key, id: String, rtl: Boolean): TabPanelListProps = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelListProps]
    }
    
    @scala.inline
    implicit class TabPanelListPropsMutableBuilder[Self <: TabPanelListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimated(value: AnimatedConfig): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setDestroyInactiveTabPane(value: Boolean): Self = StObject.set(x, "destroyInactiveTabPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactiveTabPaneUndefined: Self = StObject.set(x, "destroyInactiveTabPane", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPosition(value: TabPosition): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    }
  }
}
