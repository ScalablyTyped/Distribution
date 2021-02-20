package typings.rmcTabs

import org.scalablytyped.runtime.Instantiable1
import typings.rcGesture.mod.IGestureStatus
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactNative.mod.ScrollView
import typings.reactNative.mod.ViewStyle
import typings.rmcTabs.defaultTabBarMod.DefaultTabBar
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.PropsType
import typings.rmcTabs.propsTypeMod.TabBarPropsType
import typings.rmcTabs.rmcTabsBooleans.`false`
import typings.rmcTabs.rmcTabsStrings.bottom
import typings.rmcTabs.rmcTabsStrings.horizontal
import typings.rmcTabs.rmcTabsStrings.left
import typings.rmcTabs.rmcTabsStrings.right
import typings.rmcTabs.rmcTabsStrings.top
import typings.rmcTabs.rmcTabsStrings.vertical
import typings.rmcTabs.tabsBaseMod.StateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ActiveTab[S /* <: StateType */, P /* <: PropsType */] extends StObject {
    
    var activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any = js.native
    
    var animated: Boolean = js.native
    
    var goToTab: js.Any = js.native
    
    var instanceId: Double = js.native
    
    var onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any = js.native
    
    var tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any = js.native
    
    var tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any = js.native
    
    var tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any = js.native
    
    var tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any = js.native
    
    var tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any = js.native
    
    var tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any = js.native
    
    var tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any = js.native
  }
  object ActiveTab {
    
    @scala.inline
    def apply[S /* <: StateType */, P /* <: PropsType */](
      activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any,
      animated: Boolean,
      goToTab: js.Any,
      instanceId: Double,
      onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any,
      tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any,
      tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any,
      tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any,
      tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any,
      tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any,
      tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any,
      tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any
    ): ActiveTab[S, P] = {
      val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], onTabClick = onTabClick.asInstanceOf[js.Any], tabBarActiveTextColor = tabBarActiveTextColor.asInstanceOf[js.Any], tabBarBackgroundColor = tabBarBackgroundColor.asInstanceOf[js.Any], tabBarInactiveTextColor = tabBarInactiveTextColor.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], tabBarTextStyle = tabBarTextStyle.asInstanceOf[js.Any], tabBarUnderlineStyle = tabBarUnderlineStyle.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveTab[S, P]]
    }
    
    @scala.inline
    implicit class ActiveTabMutableBuilder[Self <: ActiveTab[_, _], S /* <: StateType */, P /* <: PropsType */] (val x: Self with (ActiveTab[S, P])) extends AnyVal {
      
      @scala.inline
      def setActiveTab(
        value: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any
      ): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoToTab(value: js.Any): Self = StObject.set(x, "goToTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTabClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any
      ): Self = StObject.set(x, "onTabClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarActiveTextColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any
      ): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarBackgroundColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any
      ): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarInactiveTextColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any
      ): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any
      ): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarTextStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any
      ): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarUnderlineStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any
      ): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ActiveTextColor extends StObject {
    
    var activeTextColor: String = js.native
    
    var container: Height = js.native
    
    var inactiveTextColor: String = js.native
    
    var tab: ViewStyle = js.native
    
    var tabs: ViewStyle = js.native
    
    var textStyle: ViewStyle = js.native
    
    var underline: ViewStyle = js.native
  }
  object ActiveTextColor {
    
    @scala.inline
    def apply(
      activeTextColor: String,
      container: Height,
      inactiveTextColor: String,
      tab: ViewStyle,
      tabs: ViewStyle,
      textStyle: ViewStyle,
      underline: ViewStyle
    ): ActiveTextColor = {
      val __obj = js.Dynamic.literal(activeTextColor = activeTextColor.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], inactiveTextColor = inactiveTextColor.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveTextColor]
    }
    
    @scala.inline
    implicit class ActiveTextColorMutableBuilder[Self <: ActiveTextColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: Height): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: ViewStyle): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: ViewStyle): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyle(value: ViewStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderline(value: ViewStyle): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BottomTabBarSplitLine extends StObject {
    
    var bottomTabBarSplitLine: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var topTabBarSplitLine: ViewStyle = js.native
  }
  object BottomTabBarSplitLine {
    
    @scala.inline
    def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): BottomTabBarSplitLine = {
      val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabBarSplitLine]
    }
    
    @scala.inline
    implicit class BottomTabBarSplitLineMutableBuilder[Self <: BottomTabBarSplitLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "bottomTabBarSplitLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "topTabBarSplitLine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Component extends StObject {
    
    var _component: ScrollView = js.native
  }
  object Component {
    
    @scala.inline
    def apply(_component: ScrollView): Component = {
      val __obj = js.Dynamic.literal(_component = _component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_component(value: ScrollView): Self = StObject.set(x, "_component", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FixX extends StObject {
    
    var fixX: Boolean = js.native
    
    var fixY: Boolean = js.native
  }
  object FixX {
    
    @scala.inline
    def apply(fixX: Boolean, fixY: Boolean): FixX = {
      val __obj = js.Dynamic.literal(fixX = fixX.asInstanceOf[js.Any], fixY = fixY.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixX]
    }
    
    @scala.inline
    implicit class FixXMutableBuilder[Self <: FixX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixX(value: Boolean): Self = StObject.set(x, "fixX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixY(value: Boolean): Self = StObject.set(x, "fixY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MozTransform extends StObject {
    
    var MozTransform: js.Any = js.native
    
    var WebkitTransform: js.Any = js.native
    
    var transform: js.Any = js.native
  }
  object MozTransform {
    
    @scala.inline
    def apply(MozTransform: js.Any, WebkitTransform: js.Any, transform: js.Any): MozTransform = {
      val __obj = js.Dynamic.literal(MozTransform = MozTransform.asInstanceOf[js.Any], WebkitTransform = WebkitTransform.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[MozTransform]
    }
    
    @scala.inline
    implicit class MozTransformMutableBuilder[Self <: MozTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMozTransform(value: js.Any): Self = StObject.set(x, "MozTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: js.Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransform(value: js.Any): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnPanEnd extends StObject {
    
    def onPanEnd(): Unit = js.native
    
    def onPanMove(status: IGestureStatus): Unit = js.native
    
    def onPanStart(): Unit = js.native
    
    def setCurrentOffset(offset: String): String | Double = js.native
    def setCurrentOffset(offset: Double): String | Double = js.native
  }
  
  @js.native
  trait OnPanMove extends StObject {
    
    def onPanEnd(): Unit = js.native
    
    def onPanMove(status: IGestureStatus): Unit = js.native
    
    def onPanStart(status: IGestureStatus): Unit = js.native
    
    def setCurrentOffset(offset: String): String | Double = js.native
    def setCurrentOffset(offset: Double): String | Double = js.native
  }
  
  /* Inlined rmc-tabs.rmc-tabs/lib/TabPane.PropsType & {  children :react.react.ReactNode | undefined} */
  @js.native
  trait PropsTypechildrenReactNod extends StObject {
    
    var active: Boolean = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var fixX: js.UndefOr[Boolean] = js.native
    
    var fixY: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
  }
  object PropsTypechildrenReactNod {
    
    @scala.inline
    def apply(active: Boolean): PropsTypechildrenReactNod = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsTypechildrenReactNod]
    }
    
    @scala.inline
    implicit class PropsTypechildrenReactNodMutableBuilder[Self <: PropsTypechildrenReactNod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFixX(value: Boolean): Self = StObject.set(x, "fixX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixXUndefined: Self = StObject.set(x, "fixX", js.undefined)
      
      @scala.inline
      def setFixY(value: Boolean): Self = StObject.set(x, "fixY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixYUndefined: Self = StObject.set(x, "fixY", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-tabs.rmc-tabs/lib/Tabs.PropsType> */
  @js.native
  trait ReadonlychildrenReactNode extends StObject {
    
    val animated: js.UndefOr[Boolean] = js.native
    
    val children: js.UndefOr[ReactNode] = js.native
    
    val destroyInactiveTab: js.UndefOr[Boolean] = js.native
    
    val distanceToChangeTab: js.UndefOr[Double] = js.native
    
    val initialPage: js.UndefOr[Double | String] = js.native
    
    val noRenderContent: js.UndefOr[Boolean] = js.native
    
    val onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
    
    val onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
    
    val page: js.UndefOr[Double | String] = js.native
    
    val prefixCls: js.UndefOr[String] = js.native
    
    val prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
    
    val renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`] = js.native
    
    val swipeable: js.UndefOr[Boolean] = js.native
    
    val tabBarActiveTextColor: js.UndefOr[String] = js.native
    
    val tabBarBackgroundColor: js.UndefOr[String] = js.native
    
    val tabBarInactiveTextColor: js.UndefOr[String] = js.native
    
    val tabBarPosition: js.UndefOr[top | bottom | left | right] = js.native
    
    val tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.native
    
    val tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.native
    
    val tabDirection: js.UndefOr[horizontal | vertical] = js.native
    
    val tabs: js.Array[TabData] = js.native
    
    val useLeftInsteadTransform: js.UndefOr[Boolean] = js.native
    
    val useOnPan: js.UndefOr[Boolean] = js.native
    
    val usePaged: js.UndefOr[Boolean] = js.native
  }
  object ReadonlychildrenReactNode {
    
    @scala.inline
    def apply(tabs: js.Array[TabData]): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeMutableBuilder[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDestroyInactiveTab(value: Boolean): Self = StObject.set(x, "destroyInactiveTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactiveTabUndefined: Self = StObject.set(x, "destroyInactiveTab", js.undefined)
      
      @scala.inline
      def setDistanceToChangeTab(value: Double): Self = StObject.set(x, "distanceToChangeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToChangeTabUndefined: Self = StObject.set(x, "distanceToChangeTab", js.undefined)
      
      @scala.inline
      def setInitialPage(value: Double | String): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      @scala.inline
      def setNoRenderContent(value: Boolean): Self = StObject.set(x, "noRenderContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRenderContentUndefined: Self = StObject.set(x, "noRenderContent", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      @scala.inline
      def setPage(value: Double | String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrerenderingSiblingsNumber(value: Double): Self = StObject.set(x, "prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerenderingSiblingsNumberUndefined: Self = StObject.set(x, "prerenderingSiblingsNumber", js.undefined)
      
      @scala.inline
      def setRenderTabBar(value: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`): Self = StObject.set(x, "renderTabBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTabBarFunction1(value: /* props */ TabBarPropsType => ReactNode): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      @scala.inline
      def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
      
      @scala.inline
      def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
      
      @scala.inline
      def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
      
      @scala.inline
      def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
      
      @scala.inline
      def setTabBarPosition(value: top | bottom | left | right): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      @scala.inline
      def setTabBarTextStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
      
      @scala.inline
      def setTabBarUnderlineStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
      
      @scala.inline
      def setTabDirection(value: horizontal | vertical): Self = StObject.set(x, "tabDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabDirectionUndefined: Self = StObject.set(x, "tabDirection", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[TabData]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: TabData*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      @scala.inline
      def setUseLeftInsteadTransform(value: Boolean): Self = StObject.set(x, "useLeftInsteadTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLeftInsteadTransformUndefined: Self = StObject.set(x, "useLeftInsteadTransform", js.undefined)
      
      @scala.inline
      def setUseOnPan(value: Boolean): Self = StObject.set(x, "useOnPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseOnPanUndefined: Self = StObject.set(x, "useOnPan", js.undefined)
      
      @scala.inline
      def setUsePaged(value: Boolean): Self = StObject.set(x, "usePaged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePagedUndefined: Self = StObject.set(x, "usePaged", js.undefined)
    }
  }
  
  @js.native
  trait ShowNext extends StObject {
    
    var showNext: Boolean = js.native
    
    var showPrev: Boolean = js.native
    
    var transform: String = js.native
  }
  object ShowNext {
    
    @scala.inline
    def apply(showNext: Boolean, showPrev: Boolean, transform: String): ShowNext = {
      val __obj = js.Dynamic.literal(showNext = showNext.asInstanceOf[js.Any], showPrev = showPrev.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowNext]
    }
    
    @scala.inline
    implicit class ShowNextMutableBuilder[Self <: ShowNext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowNext(value: Boolean): Self = StObject.set(x, "showNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrev(value: Boolean): Self = StObject.set(x, "showPrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabBar extends StObject {
    
    var TabBar: ActiveTextColor = js.native
    
    var Tabs: BottomTabBarSplitLine = js.native
  }
  object TabBar {
    
    @scala.inline
    def apply(TabBar: ActiveTextColor, Tabs: BottomTabBarSplitLine): TabBar = {
      val __obj = js.Dynamic.literal(TabBar = TabBar.asInstanceOf[js.Any], Tabs = Tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBar]
    }
    
    @scala.inline
    implicit class TabBarMutableBuilder[Self <: TabBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabBar(value: ActiveTextColor): Self = StObject.set(x, "TabBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: BottomTabBarSplitLine): Self = StObject.set(x, "Tabs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDefaultTabBar
    extends Instantiable1[/* props */ typings.rmcTabs.defaultTabBarMod.PropsType, DefaultTabBar] {
    
    var defaultProps: typings.rmcTabs.defaultTabBarMod.PropsType = js.native
  }
}
