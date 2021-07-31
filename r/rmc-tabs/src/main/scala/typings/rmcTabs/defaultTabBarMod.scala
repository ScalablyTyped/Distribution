package typings.rmcTabs

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.rmcTabs.anon.OnPanEnd
import typings.rmcTabs.anon.ShowNext
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.TabBarPropsType
import typings.rmcTabs.rmcTabsStrings.bottom
import typings.rmcTabs.rmcTabsStrings.left
import typings.rmcTabs.rmcTabsStrings.right
import typings.rmcTabs.rmcTabsStrings.top
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTabBarMod {
  
  @JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends PureComponent[PropsType, StateType, js.Any] {
    def this(props: PropsType) = this()
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDefaultTabBar(nextProps: PropsType): Unit = js.native
    
    def getTabSize(page: Double, tabLength: Double): Double = js.native
    
    def getTransformByIndex(props: PropsType): ShowNext = js.native
    
    def isTabBarVertical(): Boolean = js.native
    @JSName("isTabBarVertical")
    def isTabBarVertical_bottom(position: bottom): Boolean = js.native
    @JSName("isTabBarVertical")
    def isTabBarVertical_left(position: left): Boolean = js.native
    @JSName("isTabBarVertical")
    def isTabBarVertical_right(position: right): Boolean = js.native
    @JSName("isTabBarVertical")
    def isTabBarVertical_top(position: top): Boolean = js.native
    
    var layout: HTMLDivElement = js.native
    
    var onPan: OnPanEnd = js.native
    
    def onPress(index: Double): Unit = js.native
    
    def renderTab(t: TabData, i: Double, size: Double, isTabBarVertical: Boolean): Element = js.native
    
    def setContentLayout(div: HTMLDivElement): Unit = js.native
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs/lib/DefaultTabBar", "StateType")
  @js.native
  class StateType () extends StObject {
    
    var isMoving: js.UndefOr[Boolean] = js.native
    
    var showNext: js.UndefOr[Boolean] = js.native
    
    var showPrev: js.UndefOr[Boolean] = js.native
    
    var transform: js.UndefOr[String] = js.native
  }
  
  trait PropsType
    extends StObject
       with TabBarPropsType {
    
    /** default: rmc-tabs-tab-bar */
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object PropsType {
    
    @scala.inline
    def apply(
      activeTab: Double,
      animated: Boolean,
      goToTab: Double => Unit,
      instanceId: Double,
      tabs: js.Array[TabData]
    ): PropsType = {
      val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
