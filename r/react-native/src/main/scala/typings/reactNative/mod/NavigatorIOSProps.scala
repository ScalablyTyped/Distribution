package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorIOSProps extends StObject {
  
  /**
    * The default background color of the navigation bar.
    */
  var barTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * NavigatorIOS uses "route" objects to identify child views, their props, and navigation bar configuration.
    * "push" and all the other navigation operations expect routes to be like this
    */
  var initialRoute: Route
  
  /**
    * Boolean value that indicates whether the interactive pop gesture is
    * enabled. This is useful for enabling/disabling the back swipe navigation
    * gesture.
    *
    * If this prop is not provided, the default behavior is for the back swipe
    * gesture to be enabled when the navigation bar is shown and disabled when
    * the navigation bar is hidden. Once you've provided the
    * `interactivePopGestureEnabled` prop, you can never restore the default
    * behavior.
    */
  var interactivePopGestureEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default wrapper style for components in the navigator.
    * A common use case is to set the backgroundColor for every page
    */
  var itemWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * A Boolean value that indicates whether the navigation bar is hidden
    */
  var navigationBarHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether to hide the 1px hairline shadow
    */
  var shadowHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * NOT IN THE DOC BUT IN THE EXAMPLES
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * The color used for buttons in the navigation bar
    */
  var tintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * The text color of the navigation bar title
    */
  var titleTextColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * A Boolean value that indicates whether the navigation bar is translucent
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object NavigatorIOSProps {
  
  inline def apply(initialRoute: Route): NavigatorIOSProps = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorIOSProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorIOSProps] (val x: Self) extends AnyVal {
    
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
