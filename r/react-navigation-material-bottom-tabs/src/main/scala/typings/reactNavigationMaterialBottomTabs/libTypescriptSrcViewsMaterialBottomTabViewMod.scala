package typings.reactNavigationMaterialBottomTabs

import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.PickPropsstylenavigationS
import typings.reactNativePaper.anon.SceneMap
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationMaterialBottomTabs.anon.Color
import typings.reactNavigationMaterialBottomTabs.anon.Descriptors
import typings.reactNavigationMaterialBottomTabs.anon.RouteKey
import typings.reactNavigationMaterialBottomTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcViewsMaterialBottomTabViewMod {
  
  @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", JSImport.Default)
  @js.native
  open class default () extends MaterialBottomTabView
  /* static members */
  object default {
    
    @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", "default.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    inline def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MaterialBottomTabView
    extends Component[Props, js.Object, Any] {
    
    def _getBarStyle(): js.Array[StyleProp[ViewStyle]] = js.native
    
    def _getColor(param0: RouteKey): js.UndefOr[String] = js.native
    
    def _getInactiveColor(): js.UndefOr[String] = js.native
    
    def _getactiveColor(): js.UndefOr[String] = js.native
    
    def _isVisible(): js.UndefOr[Boolean] = js.native
    
    def _renderIcon(param0: Color): ReactNode = js.native
  }
  
  trait Options extends StObject {
    
    var tabBarColor: js.UndefOr[String] = js.undefined
    
    var tabBarColorDark: js.UndefOr[String] = js.undefined
    
    var tabBarColorLight: js.UndefOr[String] = js.undefined
    
    var tabBarVisible: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setTabBarColor(value: String): Self = StObject.set(x, "tabBarColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorDark(value: String): Self = StObject.set(x, "tabBarColorDark", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorDarkUndefined: Self = StObject.set(x, "tabBarColorDark", js.undefined)
      
      inline def setTabBarColorLight(value: String): Self = StObject.set(x, "tabBarColorLight", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorLightUndefined: Self = StObject.set(x, "tabBarColorLight", js.undefined)
      
      inline def setTabBarColorUndefined: Self = StObject.set(x, "tabBarColor", js.undefined)
      
      inline def setTabBarVisible(value: Boolean): Self = StObject.set(x, "tabBarVisible", value.asInstanceOf[js.Any])
      
      inline def setTabBarVisibleUndefined: Self = StObject.set(x, "tabBarVisible", js.undefined)
    }
  }
  
  type Props = (ComponentProps[
    ComponentType[PickPropsstylenavigationS] & (NonReactStatics[
      (ComponentType[
        typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Props
      ]) & SceneMap, 
      js.Object
    ])
  ]) & NavigationMaterialBottomTabConfig & Descriptors
}
