package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.locale
import typings.reactNativeNavigation.reactNativeNavigationStrings.ltr
import typings.reactNativeNavigation.reactNativeNavigationStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsLayout extends StObject {
  
  /**
    * Controls the application's preferred home indicator auto-hiding.
    * #### (iOS specific)
    */
  var autoHideHomeIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the screen background color
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Set background color only for components, helps reduce overdraw if background color is set in default options.
    * #### (Android specific)
    */
  var componentBackgroundColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Set language direction.
    * only works with DefaultOptions
    */
  var direction: js.UndefOr[rtl | ltr | locale] = js.undefined
  
  var fitSystemWindows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the allowed orientations
    */
  var orientation: js.UndefOr[js.Array[LayoutOrientation]] = js.undefined
  
  /**
    * Layout top margin
    * #### (Android specific)
    */
  var topMargin: js.UndefOr[Double] = js.undefined
}
object OptionsLayout {
  
  inline def apply(): OptionsLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsLayout]
  }
  
  extension [Self <: OptionsLayout](x: Self) {
    
    inline def setAutoHideHomeIndicator(value: Boolean): Self = StObject.set(x, "autoHideHomeIndicator", value.asInstanceOf[js.Any])
    
    inline def setAutoHideHomeIndicatorUndefined: Self = StObject.set(x, "autoHideHomeIndicator", js.undefined)
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setComponentBackgroundColor(value: Color): Self = StObject.set(x, "componentBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setComponentBackgroundColorUndefined: Self = StObject.set(x, "componentBackgroundColor", js.undefined)
    
    inline def setDirection(value: rtl | ltr | locale): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFitSystemWindows(value: Boolean): Self = StObject.set(x, "fitSystemWindows", value.asInstanceOf[js.Any])
    
    inline def setFitSystemWindowsUndefined: Self = StObject.set(x, "fitSystemWindows", js.undefined)
    
    inline def setOrientation(value: js.Array[LayoutOrientation]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOrientationVarargs(value: LayoutOrientation*): Self = StObject.set(x, "orientation", js.Array(value :_*))
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
  }
}
