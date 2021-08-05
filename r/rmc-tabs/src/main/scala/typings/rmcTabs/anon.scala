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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveTab[S /* <: StateType */, P /* <: PropsType */] extends StObject {
    
    var activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any
    
    var animated: Boolean
    
    var goToTab: js.Any
    
    var instanceId: Double
    
    var onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any
    
    var tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any
    
    var tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any
    
    var tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any
    
    var tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any
    
    var tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any
    
    var tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any
    
    var tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any
  }
  object ActiveTab {
    
    inline def apply[S /* <: StateType */, P /* <: PropsType */](
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
    
    extension [Self <: ActiveTab[?, ?], S /* <: StateType */, P /* <: PropsType */](x: Self & (ActiveTab[S, P])) {
      
      inline def setActiveTab(
        value: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any
      ): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setGoToTab(value: js.Any): Self = StObject.set(x, "goToTab", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setOnTabClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any
      ): Self = StObject.set(x, "onTabClick", value.asInstanceOf[js.Any])
      
      inline def setTabBarActiveTextColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any
      ): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarBackgroundColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any
      ): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarInactiveTextColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any
      ): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any
      ): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      inline def setTabBarTextStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any
      ): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarUnderlineStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any
      ): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActiveTextColor extends StObject {
    
    var activeTextColor: String
    
    var container: Height
    
    var inactiveTextColor: String
    
    var tab: ViewStyle
    
    var tabs: ViewStyle
    
    var textStyle: ViewStyle
    
    var underline: ViewStyle
  }
  object ActiveTextColor {
    
    inline def apply(
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
    
    extension [Self <: ActiveTextColor](x: Self) {
      
      inline def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: Height): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTab(value: ViewStyle): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: ViewStyle): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTextStyle(value: ViewStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderline(value: ViewStyle): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    }
  }
  
  trait BottomTabBarSplitLine extends StObject {
    
    var bottomTabBarSplitLine: ViewStyle
    
    var container: ViewStyle
    
    var topTabBarSplitLine: ViewStyle
  }
  object BottomTabBarSplitLine {
    
    inline def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): BottomTabBarSplitLine = {
      val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabBarSplitLine]
    }
    
    extension [Self <: BottomTabBarSplitLine](x: Self) {
      
      inline def setBottomTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "bottomTabBarSplitLine", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setTopTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "topTabBarSplitLine", value.asInstanceOf[js.Any])
    }
  }
  
  trait Component extends StObject {
    
    var _component: ScrollView
  }
  object Component {
    
    inline def apply(_component: ScrollView): Component = {
      val __obj = js.Dynamic.literal(_component = _component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def set_component(value: ScrollView): Self = StObject.set(x, "_component", value.asInstanceOf[js.Any])
    }
  }
  
  trait FixX extends StObject {
    
    var fixX: Boolean
    
    var fixY: Boolean
  }
  object FixX {
    
    inline def apply(fixX: Boolean, fixY: Boolean): FixX = {
      val __obj = js.Dynamic.literal(fixX = fixX.asInstanceOf[js.Any], fixY = fixY.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixX]
    }
    
    extension [Self <: FixX](x: Self) {
      
      inline def setFixX(value: Boolean): Self = StObject.set(x, "fixX", value.asInstanceOf[js.Any])
      
      inline def setFixY(value: Boolean): Self = StObject.set(x, "fixY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
  }
  object Height {
    
    inline def apply(height: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    }
  }
  
  trait MozTransform extends StObject {
    
    var MozTransform: js.Any
    
    var WebkitTransform: js.Any
    
    var transform: js.Any
  }
  object MozTransform {
    
    inline def apply(MozTransform: js.Any, WebkitTransform: js.Any, transform: js.Any): MozTransform = {
      val __obj = js.Dynamic.literal(MozTransform = MozTransform.asInstanceOf[js.Any], WebkitTransform = WebkitTransform.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[MozTransform]
    }
    
    extension [Self <: MozTransform](x: Self) {
      
      inline def setMozTransform(value: js.Any): Self = StObject.set(x, "MozTransform", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: js.Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransform(value: js.Any): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
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
  trait PropsTypechildrenReactNod extends StObject {
    
    var active: Boolean
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var fixX: js.UndefOr[Boolean] = js.undefined
    
    var fixY: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object PropsTypechildrenReactNod {
    
    inline def apply(active: Boolean): PropsTypechildrenReactNod = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsTypechildrenReactNod]
    }
    
    extension [Self <: PropsTypechildrenReactNod](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFixX(value: Boolean): Self = StObject.set(x, "fixX", value.asInstanceOf[js.Any])
      
      inline def setFixXUndefined: Self = StObject.set(x, "fixX", js.undefined)
      
      inline def setFixY(value: Boolean): Self = StObject.set(x, "fixY", value.asInstanceOf[js.Any])
      
      inline def setFixYUndefined: Self = StObject.set(x, "fixY", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-tabs.rmc-tabs/lib/Tabs.PropsType> */
  trait ReadonlychildrenReactNode extends StObject {
    
    val animated: js.UndefOr[Boolean] = js.undefined
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val destroyInactiveTab: js.UndefOr[Boolean] = js.undefined
    
    val distanceToChangeTab: js.UndefOr[Double] = js.undefined
    
    val initialPage: js.UndefOr[Double | String] = js.undefined
    
    val noRenderContent: js.UndefOr[Boolean] = js.undefined
    
    val onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
    
    val onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
    
    val page: js.UndefOr[Double | String] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
    
    val renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`] = js.undefined
    
    val swipeable: js.UndefOr[Boolean] = js.undefined
    
    val tabBarActiveTextColor: js.UndefOr[String] = js.undefined
    
    val tabBarBackgroundColor: js.UndefOr[String] = js.undefined
    
    val tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
    
    val tabBarPosition: js.UndefOr[top | bottom | left | right] = js.undefined
    
    val tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
    
    val tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
    
    val tabDirection: js.UndefOr[horizontal | vertical] = js.undefined
    
    val tabs: js.Array[TabData]
    
    val useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined
    
    val useOnPan: js.UndefOr[Boolean] = js.undefined
    
    val usePaged: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlychildrenReactNode {
    
    inline def apply(tabs: js.Array[TabData]): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    extension [Self <: ReadonlychildrenReactNode](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDestroyInactiveTab(value: Boolean): Self = StObject.set(x, "destroyInactiveTab", value.asInstanceOf[js.Any])
      
      inline def setDestroyInactiveTabUndefined: Self = StObject.set(x, "destroyInactiveTab", js.undefined)
      
      inline def setDistanceToChangeTab(value: Double): Self = StObject.set(x, "distanceToChangeTab", value.asInstanceOf[js.Any])
      
      inline def setDistanceToChangeTabUndefined: Self = StObject.set(x, "distanceToChangeTab", js.undefined)
      
      inline def setInitialPage(value: Double | String): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setNoRenderContent(value: Boolean): Self = StObject.set(x, "noRenderContent", value.asInstanceOf[js.Any])
      
      inline def setNoRenderContentUndefined: Self = StObject.set(x, "noRenderContent", js.undefined)
      
      inline def setOnChange(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
      
      inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      inline def setPage(value: Double | String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrerenderingSiblingsNumber(value: Double): Self = StObject.set(x, "prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
      
      inline def setPrerenderingSiblingsNumberUndefined: Self = StObject.set(x, "prerenderingSiblingsNumber", js.undefined)
      
      inline def setRenderTabBar(value: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`): Self = StObject.set(x, "renderTabBar", value.asInstanceOf[js.Any])
      
      inline def setRenderTabBarFunction1(value: /* props */ TabBarPropsType => ReactNode): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      inline def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
      
      inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
      
      inline def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
      
      inline def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
      
      inline def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
      
      inline def setTabBarPosition(value: top | bottom | left | right): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      inline def setTabBarTextStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
      
      inline def setTabBarUnderlineStyle(value: CSSProperties | js.Any): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
      
      inline def setTabDirection(value: horizontal | vertical): Self = StObject.set(x, "tabDirection", value.asInstanceOf[js.Any])
      
      inline def setTabDirectionUndefined: Self = StObject.set(x, "tabDirection", js.undefined)
      
      inline def setTabs(value: js.Array[TabData]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: TabData*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      inline def setUseLeftInsteadTransform(value: Boolean): Self = StObject.set(x, "useLeftInsteadTransform", value.asInstanceOf[js.Any])
      
      inline def setUseLeftInsteadTransformUndefined: Self = StObject.set(x, "useLeftInsteadTransform", js.undefined)
      
      inline def setUseOnPan(value: Boolean): Self = StObject.set(x, "useOnPan", value.asInstanceOf[js.Any])
      
      inline def setUseOnPanUndefined: Self = StObject.set(x, "useOnPan", js.undefined)
      
      inline def setUsePaged(value: Boolean): Self = StObject.set(x, "usePaged", value.asInstanceOf[js.Any])
      
      inline def setUsePagedUndefined: Self = StObject.set(x, "usePaged", js.undefined)
    }
  }
  
  trait ShowNext extends StObject {
    
    var showNext: Boolean
    
    var showPrev: Boolean
    
    var transform: String
  }
  object ShowNext {
    
    inline def apply(showNext: Boolean, showPrev: Boolean, transform: String): ShowNext = {
      val __obj = js.Dynamic.literal(showNext = showNext.asInstanceOf[js.Any], showPrev = showPrev.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowNext]
    }
    
    extension [Self <: ShowNext](x: Self) {
      
      inline def setShowNext(value: Boolean): Self = StObject.set(x, "showNext", value.asInstanceOf[js.Any])
      
      inline def setShowPrev(value: Boolean): Self = StObject.set(x, "showPrev", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabBar extends StObject {
    
    var TabBar: ActiveTextColor
    
    var Tabs: BottomTabBarSplitLine
  }
  object TabBar {
    
    inline def apply(TabBar: ActiveTextColor, Tabs: BottomTabBarSplitLine): TabBar = {
      val __obj = js.Dynamic.literal(TabBar = TabBar.asInstanceOf[js.Any], Tabs = Tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBar]
    }
    
    extension [Self <: TabBar](x: Self) {
      
      inline def setTabBar(value: ActiveTextColor): Self = StObject.set(x, "TabBar", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: BottomTabBarSplitLine): Self = StObject.set(x, "Tabs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDefaultTabBar
    extends StObject
       with Instantiable1[/* props */ typings.rmcTabs.defaultTabBarMod.PropsType, DefaultTabBar] {
    
    var defaultProps: typings.rmcTabs.defaultTabBarMod.PropsType = js.native
  }
}
