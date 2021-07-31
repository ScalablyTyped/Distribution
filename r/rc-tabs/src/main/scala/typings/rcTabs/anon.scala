package typings.rcTabs

import typings.rcTabs.interfaceMod.AnimatedConfig
import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.OnTabScroll
import typings.rcTabs.interfaceMod.RenderTabBar
import typings.rcTabs.interfaceMod.Tab
import typings.rcTabs.interfaceMod.TabBarExtraContent
import typings.rcTabs.interfaceMod.TabPosition
import typings.rcTabs.interfaceMod.TabsLocale
import typings.rcTabs.rcTabsStrings.bottom
import typings.rcTabs.rcTabsStrings.left
import typings.rcTabs.rcTabsStrings.right
import typings.rcTabs.rcTabsStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direction extends StObject {
    
    var direction: left | right | top | bottom
  }
  object Direction {
    
    @scala.inline
    def apply(direction: left | right | top | bottom): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    @scala.inline
    implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: left | right | top | bottom): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event extends StObject {
    
    var event: (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Event {
    
    @scala.inline
    def apply(event: (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Width extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Width {
    
    @scala.inline
    def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  tabs :std.Array<rc-tabs.rc-tabs/es/interface.Tab>} & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
  @js.native
  trait tabsArrayTabTabNavListPro extends StObject {
    
    var activeKey: String = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var extra: js.UndefOr[TabBarExtraContent] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[ReactNode] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(activeKey: Key, e: KeyboardEvent[Element]): Unit = js.native
    def onTabClick(activeKey: Key, e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
    
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    
    var panes: ReactNode = js.native
    
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
}
