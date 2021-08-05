package typings.rcTabs

import typings.rcTabs.anon.Direction
import typings.rcTabs.anon.Event
import typings.rcTabs.anon.Height
import typings.rcTabs.rcTabsStrings.add
import typings.rcTabs.rcTabsStrings.remove
import typings.rcTabs.tabPaneMod.TabPaneProps
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait AnimatedConfig extends StObject {
    
    var inkBar: js.UndefOr[Boolean] = js.undefined
    
    var tabPane: js.UndefOr[Boolean] = js.undefined
  }
  object AnimatedConfig {
    
    inline def apply(): AnimatedConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedConfig]
    }
    
    extension [Self <: AnimatedConfig](x: Self) {
      
      inline def setInkBar(value: Boolean): Self = StObject.set(x, "inkBar", value.asInstanceOf[js.Any])
      
      inline def setInkBarUndefined: Self = StObject.set(x, "inkBar", js.undefined)
      
      inline def setTabPane(value: Boolean): Self = StObject.set(x, "tabPane", value.asInstanceOf[js.Any])
      
      inline def setTabPaneUndefined: Self = StObject.set(x, "tabPane", js.undefined)
    }
  }
  
  @js.native
  trait EditableConfig extends StObject {
    
    var addIcon: js.UndefOr[ReactNode] = js.native
    
    @JSName("onEdit")
    def onEdit_add(`type`: add, info: Event): Unit = js.native
    @JSName("onEdit")
    def onEdit_remove(`type`: remove, info: Event): Unit = js.native
    
    var removeIcon: js.UndefOr[ReactNode] = js.native
    
    var showAdd: js.UndefOr[Boolean] = js.native
  }
  
  type OnTabScroll = js.Function1[/* info */ Direction, Unit]
  
  type RenderTabBar = js.Function2[/* props */ js.Any, /* DefaultTabBar */ ComponentType[js.Object], ReactElement]
  
  trait Tab
    extends StObject
       with TabPaneProps {
    
    var key: String
    
    var node: ReactElement
  }
  object Tab {
    
    inline def apply(key: String, node: ReactElement): Tab = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    extension [Self <: Tab](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ReactElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type TabBarExtraContent = ReactNode | TabBarExtraMap
  
  /* Inlined std.Partial<std.Record<rc-tabs.rc-tabs/es/interface.TabBarExtraPosition, react.react.ReactNode>> */
  trait TabBarExtraMap extends StObject {
    
    var left: js.UndefOr[ReactNode] = js.undefined
    
    var right: js.UndefOr[ReactNode] = js.undefined
  }
  object TabBarExtraMap {
    
    inline def apply(): TabBarExtraMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarExtraMap]
    }
    
    extension [Self <: TabBarExtraMap](x: Self) {
      
      inline def setLeft(value: ReactNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: ReactNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcTabs.rcTabsStrings.left
    - typings.rcTabs.rcTabsStrings.right
  */
  trait TabBarExtraPosition extends StObject
  object TabBarExtraPosition {
    
    inline def left: typings.rcTabs.rcTabsStrings.left = "left".asInstanceOf[typings.rcTabs.rcTabsStrings.left]
    
    inline def right: typings.rcTabs.rcTabsStrings.right = "right".asInstanceOf[typings.rcTabs.rcTabsStrings.right]
  }
  
  trait TabOffset extends StObject {
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
  }
  object TabOffset {
    
    inline def apply(height: Double, left: Double, right: Double, top: Double, width: Double): TabOffset = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabOffset]
    }
    
    extension [Self <: TabOffset](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TabOffsetMap = Map[Key, TabOffset]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcTabs.rcTabsStrings.left
    - typings.rcTabs.rcTabsStrings.right
    - typings.rcTabs.rcTabsStrings.top
    - typings.rcTabs.rcTabsStrings.bottom
  */
  trait TabPosition extends StObject
  object TabPosition {
    
    inline def bottom: typings.rcTabs.rcTabsStrings.bottom = "bottom".asInstanceOf[typings.rcTabs.rcTabsStrings.bottom]
    
    inline def left: typings.rcTabs.rcTabsStrings.left = "left".asInstanceOf[typings.rcTabs.rcTabsStrings.left]
    
    inline def right: typings.rcTabs.rcTabsStrings.right = "right".asInstanceOf[typings.rcTabs.rcTabsStrings.right]
    
    inline def top: typings.rcTabs.rcTabsStrings.top = "top".asInstanceOf[typings.rcTabs.rcTabsStrings.top]
  }
  
  type TabSizeMap = Map[Key, Height]
  
  trait TabsLocale extends StObject {
    
    var addAriaLabel: js.UndefOr[String] = js.undefined
    
    var dropdownAriaLabel: js.UndefOr[String] = js.undefined
    
    var removeAriaLabel: js.UndefOr[String] = js.undefined
  }
  object TabsLocale {
    
    inline def apply(): TabsLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsLocale]
    }
    
    extension [Self <: TabsLocale](x: Self) {
      
      inline def setAddAriaLabel(value: String): Self = StObject.set(x, "addAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAddAriaLabelUndefined: Self = StObject.set(x, "addAriaLabel", js.undefined)
      
      inline def setDropdownAriaLabel(value: String): Self = StObject.set(x, "dropdownAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDropdownAriaLabelUndefined: Self = StObject.set(x, "dropdownAriaLabel", js.undefined)
      
      inline def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
    }
  }
}
