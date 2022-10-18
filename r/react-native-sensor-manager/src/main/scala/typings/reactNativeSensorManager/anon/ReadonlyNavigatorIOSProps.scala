package typings.reactNativeSensorManager.anon

import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.Route
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.NavigatorIOSProps> */
trait ReadonlyNavigatorIOSProps extends StObject {
  
  val barTintColor: js.UndefOr[ColorValue] = js.undefined
  
  val initialRoute: Route
  
  val interactivePopGestureEnabled: js.UndefOr[Boolean] = js.undefined
  
  val itemWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  val navigationBarHidden: js.UndefOr[Boolean] = js.undefined
  
  val shadowHidden: js.UndefOr[Boolean] = js.undefined
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  val tintColor: js.UndefOr[ColorValue] = js.undefined
  
  val titleTextColor: js.UndefOr[ColorValue] = js.undefined
  
  val translucent: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyNavigatorIOSProps {
  
  inline def apply(initialRoute: Route): ReadonlyNavigatorIOSProps = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyNavigatorIOSProps]
  }
  
  extension [Self <: ReadonlyNavigatorIOSProps](x: Self) {
    
    inline def setBarTintColor(value: ColorValue): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
    
    inline def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
    
    inline def setInitialRoute(value: Route): Self = StObject.set(x, "initialRoute", value.asInstanceOf[js.Any])
    
    inline def setInteractivePopGestureEnabled(value: Boolean): Self = StObject.set(x, "interactivePopGestureEnabled", value.asInstanceOf[js.Any])
    
    inline def setInteractivePopGestureEnabledUndefined: Self = StObject.set(x, "interactivePopGestureEnabled", js.undefined)
    
    inline def setItemWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setItemWrapperStyleNull: Self = StObject.set(x, "itemWrapperStyle", null)
    
    inline def setItemWrapperStyleUndefined: Self = StObject.set(x, "itemWrapperStyle", js.undefined)
    
    inline def setNavigationBarHidden(value: Boolean): Self = StObject.set(x, "navigationBarHidden", value.asInstanceOf[js.Any])
    
    inline def setNavigationBarHiddenUndefined: Self = StObject.set(x, "navigationBarHidden", js.undefined)
    
    inline def setShadowHidden(value: Boolean): Self = StObject.set(x, "shadowHidden", value.asInstanceOf[js.Any])
    
    inline def setShadowHiddenUndefined: Self = StObject.set(x, "shadowHidden", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTitleTextColor(value: ColorValue): Self = StObject.set(x, "titleTextColor", value.asInstanceOf[js.Any])
    
    inline def setTitleTextColorUndefined: Self = StObject.set(x, "titleTextColor", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
