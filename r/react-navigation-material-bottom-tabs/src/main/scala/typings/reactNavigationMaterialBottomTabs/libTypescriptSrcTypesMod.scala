package typings.reactNavigationMaterialBottomTabs

import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNativePaper.anon.PickPropsstylenavigationS
import typings.reactNativePaper.anon.SceneMap
import typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Props
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationMaterialBottomTabs.anon.ActiveColorDark
import typings.reactNavigationMaterialBottomTabs.anon.DefaultHandler
import typings.reactNavigationMaterialBottomTabs.anon.Focused
import typings.reactNavigationMaterialBottomTabs.anon.NavigationOptions
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getAccessibilityLabel
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getBadge
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getColor
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getLabelText
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getTestID
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.navigationState
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.onIndexChange
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.onTabPress
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderIcon
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderLabel
import typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderScene
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcTypesMod {
  
  type NavigationMaterialBottomTabConfig = (Partial[
    Omit[
      ComponentProps[
        ComponentType[PickPropsstylenavigationS] & (NonReactStatics[ComponentType[Props] & SceneMap, js.Object])
      ], 
      navigationState | onIndexChange | onTabPress | renderScene | renderLabel | renderIcon | getAccessibilityLabel | getBadge | getColor | getLabelText | getTestID
    ]
  ]) & ActiveColorDark
  
  trait NavigationMaterialBottomTabOptions extends StObject {
    
    var tabBarAccessibilityLabel: js.UndefOr[String] = js.undefined
    
    var tabBarBadge: js.UndefOr[Boolean | Double | String] = js.undefined
    
    var tabBarColor: js.UndefOr[String] = js.undefined
    
    var tabBarIcon: js.UndefOr[ReactNode | (js.Function1[/* props */ Focused, ReactNode])] = js.undefined
    
    var tabBarLabel: js.UndefOr[ReactNode] = js.undefined
    
    var tabBarOnPress: js.UndefOr[js.Function1[/* props */ DefaultHandler, Unit]] = js.undefined
    
    var tabBarTestID: js.UndefOr[String] = js.undefined
    
    var tabBarVisible: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object NavigationMaterialBottomTabOptions {
    
    inline def apply(): NavigationMaterialBottomTabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationMaterialBottomTabOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationMaterialBottomTabOptions] (val x: Self) extends AnyVal {
      
      inline def setTabBarAccessibilityLabel(value: String): Self = StObject.set(x, "tabBarAccessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setTabBarAccessibilityLabelUndefined: Self = StObject.set(x, "tabBarAccessibilityLabel", js.undefined)
      
      inline def setTabBarBadge(value: Boolean | Double | String): Self = StObject.set(x, "tabBarBadge", value.asInstanceOf[js.Any])
      
      inline def setTabBarBadgeUndefined: Self = StObject.set(x, "tabBarBadge", js.undefined)
      
      inline def setTabBarColor(value: String): Self = StObject.set(x, "tabBarColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorUndefined: Self = StObject.set(x, "tabBarColor", js.undefined)
      
      inline def setTabBarIcon(value: ReactNode | (js.Function1[/* props */ Focused, ReactNode])): Self = StObject.set(x, "tabBarIcon", value.asInstanceOf[js.Any])
      
      inline def setTabBarIconFunction1(value: /* props */ Focused => ReactNode): Self = StObject.set(x, "tabBarIcon", js.Any.fromFunction1(value))
      
      inline def setTabBarIconUndefined: Self = StObject.set(x, "tabBarIcon", js.undefined)
      
      inline def setTabBarLabel(value: ReactNode): Self = StObject.set(x, "tabBarLabel", value.asInstanceOf[js.Any])
      
      inline def setTabBarLabelUndefined: Self = StObject.set(x, "tabBarLabel", js.undefined)
      
      inline def setTabBarOnPress(value: /* props */ DefaultHandler => Unit): Self = StObject.set(x, "tabBarOnPress", js.Any.fromFunction1(value))
      
      inline def setTabBarOnPressUndefined: Self = StObject.set(x, "tabBarOnPress", js.undefined)
      
      inline def setTabBarTestID(value: String): Self = StObject.set(x, "tabBarTestID", value.asInstanceOf[js.Any])
      
      inline def setTabBarTestIDUndefined: Self = StObject.set(x, "tabBarTestID", js.undefined)
      
      inline def setTabBarVisible(value: Boolean): Self = StObject.set(x, "tabBarVisible", value.asInstanceOf[js.Any])
      
      inline def setTabBarVisibleUndefined: Self = StObject.set(x, "tabBarVisible", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type NavigationMaterialBottomTabScreenComponent[Params, ScreenProps] = (ComponentType[NavigationTabScreenProps[Params, ScreenProps]]) & (NavigationOptions[Params, ScreenProps])
  
  @js.native
  trait NavigationTabProp[State, Params]
    extends StObject
       with NavigationScreenProp[State, Params] {
    
    def jumpTo(routeName: String): Unit = js.native
    def jumpTo(routeName: String, key: String): Unit = js.native
  }
  
  trait NavigationTabScreenProps[Params, ScreenProps] extends StObject {
    
    var navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params]
    
    var screenProps: ScreenProps
    
    var theme: SupportedThemes
  }
  object NavigationTabScreenProps {
    
    inline def apply[Params, ScreenProps](
      navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params],
      screenProps: ScreenProps,
      theme: SupportedThemes
    ): NavigationTabScreenProps[Params, ScreenProps] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationTabScreenProps[Params, ScreenProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationTabScreenProps[?, ?], Params, ScreenProps] (val x: Self & (NavigationTabScreenProps[Params, ScreenProps])) extends AnyVal {
      
      inline def setNavigation(value: NavigationTabProp[NavigationRoute[NavigationParams], Params]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type NavigationTabState = NavigationState
}
