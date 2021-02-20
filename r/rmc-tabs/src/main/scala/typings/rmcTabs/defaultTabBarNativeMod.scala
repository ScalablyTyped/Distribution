package typings.rmcTabs

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.ScrollView
import typings.rmcTabs.anon.TabBar
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.TabBarPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTabBarNativeMod {
  
  @JSImport("rmc-tabs/lib/DefaultTabBar.native", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends PureComponent[PropsType, StateType, js.Any] {
    def this(props: PropsType) = this()
    
    var _containerMeasurements: js.Any = js.native
    
    var _scrollView: ScrollView = js.native
    
    var _tabContainerMeasurements: js.Any = js.native
    
    var _tabsMeasurements: js.Array[_] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDefaultTabBar(): Unit = js.native
    
    def measureTab(page: Double, event: js.Any): Unit = js.native
    
    def necessarilyMeasurementsCompleted(position: Double, isLastTab: Boolean): js.Any = js.native
    
    def onContainerLayout(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ js.Any
    ): Unit = js.native
    
    def onPress(index: Double): Unit = js.native
    
    def onTabContainerLayout(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ js.Any
    ): Unit = js.native
    
    def renderTab(tab: TabData, index: Double, width: Double, onLayoutHandler: js.Any): Element = js.native
    
    def updateTabPanel(position: Double, pageOffset: Double): Unit = js.native
    
    def updateTabUnderline(position: Double, pageOffset: Double, tabCount: Double): Unit = js.native
    
    def updateView(offset: js.Any): Unit = js.native
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs/lib/DefaultTabBar.native", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/DefaultTabBar.native", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropsType extends TabBarPropsType {
    
    /** default: false */
    var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.native
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
    
    var scrollValue: js.UndefOr[js.Any] = js.native
    
    var styles: js.UndefOr[TabBar] = js.native
    
    var tabStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
      ] = js.native
    
    var tabsContainerStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
      ] = js.native
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
      def setDynamicTabUnderlineWidth(value: Boolean): Self = StObject.set(x, "dynamicTabUnderlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicTabUnderlineWidthUndefined: Self = StObject.set(x, "dynamicTabUnderlineWidth", js.undefined)
      
      @scala.inline
      def setKeyboardShouldPersistTaps(value: Boolean): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      @scala.inline
      def setScrollValue(value: js.Any): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      @scala.inline
      def setStyles(value: TabBar): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTabStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
      ): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      @scala.inline
      def setTabsContainerStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
      ): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
    }
  }
  
  @js.native
  trait StateType extends StObject {
    
    var _containerWidth: Double = js.native
    
    var _leftTabUnderline: Value = js.native
    
    var _tabContainerWidth: Double = js.native
    
    var _widthTabUnderline: Value = js.native
  }
  object StateType {
    
    @scala.inline
    def apply(
      _containerWidth: Double,
      _leftTabUnderline: Value,
      _tabContainerWidth: Double,
      _widthTabUnderline: Value
    ): StateType = {
      val __obj = js.Dynamic.literal(_containerWidth = _containerWidth.asInstanceOf[js.Any], _leftTabUnderline = _leftTabUnderline.asInstanceOf[js.Any], _tabContainerWidth = _tabContainerWidth.asInstanceOf[js.Any], _widthTabUnderline = _widthTabUnderline.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    @scala.inline
    implicit class StateTypeMutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_containerWidth(value: Double): Self = StObject.set(x, "_containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_leftTabUnderline(value: Value): Self = StObject.set(x, "_leftTabUnderline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tabContainerWidth(value: Double): Self = StObject.set(x, "_tabContainerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_widthTabUnderline(value: Value): Self = StObject.set(x, "_widthTabUnderline", value.asInstanceOf[js.Any])
    }
  }
}
