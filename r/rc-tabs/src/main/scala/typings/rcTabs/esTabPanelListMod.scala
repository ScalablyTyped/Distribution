package typings.rcTabs

import typings.rcTabs.esInterfaceMod.AnimatedConfig
import typings.rcTabs.esInterfaceMod.TabPosition
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabPanelListMod {
  
  @JSImport("rc-tabs/es/TabPanelList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIdActiveKeyAnimatedTabPositionDestroyInactiveTabPane: TabPanelListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIdActiveKeyAnimatedTabPositionDestroyInactiveTabPane.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TabPanelListProps extends StObject {
    
    var activeKey: String
    
    var animated: js.UndefOr[AnimatedConfig] = js.undefined
    
    var destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var tabPosition: js.UndefOr[TabPosition] = js.undefined
  }
  object TabPanelListProps {
    
    inline def apply(activeKey: String, id: String): TabPanelListProps = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelListProps]
    }
    
    extension [Self <: TabPanelListProps](x: Self) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setAnimated(value: AnimatedConfig): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setDestroyInactiveTabPane(value: Boolean): Self = StObject.set(x, "destroyInactiveTabPane", value.asInstanceOf[js.Any])
      
      inline def setDestroyInactiveTabPaneUndefined: Self = StObject.set(x, "destroyInactiveTabPane", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTabPosition(value: TabPosition): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
      
      inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    }
  }
}
