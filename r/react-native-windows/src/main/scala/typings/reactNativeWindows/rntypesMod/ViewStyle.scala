package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.dashed
import typings.reactNativeWindows.reactNativeWindowsStrings.dotted
import typings.reactNativeWindows.reactNativeWindowsStrings.hidden
import typings.reactNativeWindows.reactNativeWindowsStrings.solid
import typings.reactNativeWindows.reactNativeWindowsStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewStyle
  extends StObject
     with FlexStyle
     with ShadowStyleIOS
     with TransformsStyle {
  
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.undefined
  
  var backgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderBottomColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderBottomEndRadius: js.UndefOr[Double] = js.undefined
  
  var borderBottomLeftRadius: js.UndefOr[Double] = js.undefined
  
  var borderBottomRightRadius: js.UndefOr[Double] = js.undefined
  
  var borderBottomStartRadius: js.UndefOr[Double] = js.undefined
  
  var borderColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderEndColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderLeftColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderRightColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderStartColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.undefined
  
  var borderTopColor: js.UndefOr[ColorValue] = js.undefined
  
  var borderTopEndRadius: js.UndefOr[Double] = js.undefined
  
  var borderTopLeftRadius: js.UndefOr[Double] = js.undefined
  
  var borderTopRightRadius: js.UndefOr[Double] = js.undefined
  
  var borderTopStartRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the elevation of a view, using Android's underlying
    * [elevation API](https://developer.android.com/training/material/shadows-clipping.html#Elevation).
    * This adds a drop shadow to the item and affects z-order for overlapping views.
    * Only supported on Android 5.0+, has no effect on earlier versions.
    *
    * @platform android
    */
  var elevation: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
}
object ViewStyle {
  
  inline def apply(): ViewStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewStyle]
  }
  
  extension [Self <: ViewStyle](x: Self) {
    
    inline def setBackfaceVisibility(value: visible | hidden): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
    
    inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
    
    inline def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderBottomColor(value: ColorValue): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setBorderBottomEndRadius(value: Double): Self = StObject.set(x, "borderBottomEndRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomEndRadiusUndefined: Self = StObject.set(x, "borderBottomEndRadius", js.undefined)
    
    inline def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    inline def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    inline def setBorderBottomStartRadius(value: Double): Self = StObject.set(x, "borderBottomStartRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomStartRadiusUndefined: Self = StObject.set(x, "borderBottomStartRadius", js.undefined)
    
    inline def setBorderColor(value: ColorValue): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderEndColor(value: ColorValue): Self = StObject.set(x, "borderEndColor", value.asInstanceOf[js.Any])
    
    inline def setBorderEndColorUndefined: Self = StObject.set(x, "borderEndColor", js.undefined)
    
    inline def setBorderLeftColor(value: ColorValue): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderRightColor(value: ColorValue): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    inline def setBorderStartColor(value: ColorValue): Self = StObject.set(x, "borderStartColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStartColorUndefined: Self = StObject.set(x, "borderStartColor", js.undefined)
    
    inline def setBorderStyle(value: solid | dotted | dashed): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderTopColor(value: ColorValue): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    inline def setBorderTopEndRadius(value: Double): Self = StObject.set(x, "borderTopEndRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopEndRadiusUndefined: Self = StObject.set(x, "borderTopEndRadius", js.undefined)
    
    inline def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    inline def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    inline def setBorderTopStartRadius(value: Double): Self = StObject.set(x, "borderTopStartRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopStartRadiusUndefined: Self = StObject.set(x, "borderTopStartRadius", js.undefined)
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
