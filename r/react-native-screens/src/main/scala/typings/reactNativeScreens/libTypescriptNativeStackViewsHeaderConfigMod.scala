package typings.reactNativeScreens

import typings.react.mod.global.JSX.Element
import typings.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackNavigationOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackViewsHeaderConfigMod {
  
  @JSImport("react-native-screens/lib/typescript/native-stack/views/HeaderConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasBackButtonImageBackButtonInCustomViewDirectionDisableBackButtonMenuHeaderBackTitleHeaderBackTitleStyleHeaderBackTitleVisibleHeaderCenterHeaderHideBackButtonHeaderHideShadowHeaderLargeStyleHeaderLargeTitleHeaderLargeTitleHideShadowHeaderLargeTitleStyleHeaderLeftHeaderRightHeaderShownHeaderStyleHeaderTintColorHeaderTitleHeaderTitleStyleHeaderTopInsetEnabledHeaderTranslucentRouteSearchBarTitle: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasBackButtonImageBackButtonInCustomViewDirectionDisableBackButtonMenuHeaderBackTitleHeaderBackTitleStyleHeaderBackTitleVisibleHeaderCenterHeaderHideBackButtonHeaderHideShadowHeaderLargeStyleHeaderLargeTitleHeaderLargeTitleHideShadowHeaderLargeTitleStyleHeaderLeftHeaderRightHeaderShownHeaderStyleHeaderTintColorHeaderTitleHeaderTitleStyleHeaderTopInsetEnabledHeaderTranslucentRouteSearchBarTitle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with NativeStackNavigationOptions {
    
    var route: Route[String, js.UndefOr[js.Object]]
  }
  object Props {
    
    inline def apply(route: Route[String, js.UndefOr[js.Object]]): Props = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setRoute(value: Route[String, js.UndefOr[js.Object]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
