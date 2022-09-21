package typings.reactNavigationMaterialBottomTabs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationDescriptor
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigation.mod.NavigationTabRouterConfig
import typings.reactNavigationMaterialBottomTabs.anon.Route
import typings.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabConfig
import typings.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typings.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import typings.reactNavigationMaterialBottomTabs.typesMod.NavigationTabState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMaterialBottomTabNavigatorMod {
  
  @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/navigators/createMaterialBottomTabNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], Any], 
      Any
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
  inline def default(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], Any], 
      Any
    ],
    config: CreateNavigatorConfig[
      NavigationMaterialBottomTabConfig, 
      NavigationTabRouterConfig, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], Any]
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
  
  trait NavigationViewProps extends StObject {
    
    var descriptors: StringDictionary[
        NavigationDescriptor[
          NavigationParams, 
          NavigationMaterialBottomTabOptions, 
          NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
        ]
      ]
    
    def getAccessibilityLabel(props: Route): js.UndefOr[String]
    
    def getLabelText(props: Route): js.UndefOr[String]
    
    def getTestID(props: Route): js.UndefOr[String]
    
    var navigation: NavigationProp[NavigationTabState]
    
    var navigationConfig: Any
    
    def onIndexChange(index: Double): Unit
    
    def onTabPress(props: Route): Unit
    
    def renderIcon(props: RenderIconProps): ReactNode
    
    def renderScene(props: Route): ReactNode
    
    var screenProps: js.UndefOr[Any] = js.undefined
  }
  object NavigationViewProps {
    
    inline def apply(
      descriptors: StringDictionary[
          NavigationDescriptor[
            NavigationParams, 
            NavigationMaterialBottomTabOptions, 
            NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ],
      getAccessibilityLabel: Route => js.UndefOr[String],
      getLabelText: Route => js.UndefOr[String],
      getTestID: Route => js.UndefOr[String],
      navigation: NavigationProp[NavigationTabState],
      navigationConfig: Any,
      onIndexChange: Double => Unit,
      onTabPress: Route => Unit,
      renderIcon: RenderIconProps => ReactNode,
      renderScene: Route => ReactNode
    ): NavigationViewProps = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), onTabPress = js.Any.fromFunction1(onTabPress), renderIcon = js.Any.fromFunction1(renderIcon), renderScene = js.Any.fromFunction1(renderScene))
      __obj.asInstanceOf[NavigationViewProps]
    }
    
    extension [Self <: NavigationViewProps](x: Self) {
      
      inline def setDescriptors(
        value: StringDictionary[
              NavigationDescriptor[
                NavigationParams, 
                NavigationMaterialBottomTabOptions, 
                NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
              ]
            ]
      ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setGetAccessibilityLabel(value: Route => js.UndefOr[String]): Self = StObject.set(x, "getAccessibilityLabel", js.Any.fromFunction1(value))
      
      inline def setGetLabelText(value: Route => js.UndefOr[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetTestID(value: Route => js.UndefOr[String]): Self = StObject.set(x, "getTestID", js.Any.fromFunction1(value))
      
      inline def setNavigation(value: NavigationProp[NavigationTabState]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationConfig(value: Any): Self = StObject.set(x, "navigationConfig", value.asInstanceOf[js.Any])
      
      inline def setOnIndexChange(value: Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnTabPress(value: Route => Unit): Self = StObject.set(x, "onTabPress", js.Any.fromFunction1(value))
      
      inline def setRenderIcon(value: RenderIconProps => ReactNode): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setRenderScene(value: Route => ReactNode): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      inline def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
    }
  }
  
  trait RenderIconProps extends StObject {
    
    var focused: Boolean
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var route: NavigationRoute[Any]
    
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object RenderIconProps {
    
    inline def apply(focused: Boolean, route: NavigationRoute[Any]): RenderIconProps = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderIconProps]
    }
    
    extension [Self <: RenderIconProps](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setRoute(value: NavigationRoute[Any]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
}
