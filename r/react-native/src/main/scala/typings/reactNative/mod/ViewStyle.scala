package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dashed
import typings.reactNative.reactNativeStrings.dotted
import typings.reactNative.reactNativeStrings.hidden
import typings.reactNative.reactNativeStrings.solid
import typings.reactNative.reactNativeStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStyle
  extends FlexStyle
     with ShadowStyleIOS
     with TransformsStyle {
  
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.native
  
  var backgroundColor: js.UndefOr[ColorValue] = js.native
  
  var borderBottomColor: js.UndefOr[ColorValue] = js.native
  
  var borderBottomEndRadius: js.UndefOr[Double] = js.native
  
  var borderBottomLeftRadius: js.UndefOr[Double] = js.native
  
  var borderBottomRightRadius: js.UndefOr[Double] = js.native
  
  var borderBottomStartRadius: js.UndefOr[Double] = js.native
  
  var borderColor: js.UndefOr[ColorValue] = js.native
  
  var borderEndColor: js.UndefOr[ColorValue] = js.native
  
  var borderLeftColor: js.UndefOr[ColorValue] = js.native
  
  var borderRadius: js.UndefOr[Double] = js.native
  
  var borderRightColor: js.UndefOr[ColorValue] = js.native
  
  var borderStartColor: js.UndefOr[ColorValue] = js.native
  
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.native
  
  var borderTopColor: js.UndefOr[ColorValue] = js.native
  
  var borderTopEndRadius: js.UndefOr[Double] = js.native
  
  var borderTopLeftRadius: js.UndefOr[Double] = js.native
  
  var borderTopRightRadius: js.UndefOr[Double] = js.native
  
  var borderTopStartRadius: js.UndefOr[Double] = js.native
  
  /**
    * Sets the elevation of a view, using Android's underlying
    * [elevation API](https://developer.android.com/training/material/shadows-clipping.html#Elevation).
    * This adds a drop shadow to the item and affects z-order for overlapping views.
    * Only supported on Android 5.0+, has no effect on earlier versions.
    *
    * @platform android
    */
  var elevation: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var testID: js.UndefOr[String] = js.native
}
object ViewStyle {
  
  @scala.inline
  def apply(): ViewStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewStyle]
  }
  
  @scala.inline
  implicit class ViewStyleMutableBuilder[Self <: ViewStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackfaceVisibility(value: visible | hidden): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderBottomColor(value: ColorValue): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    @scala.inline
    def setBorderBottomEndRadius(value: Double): Self = StObject.set(x, "borderBottomEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomEndRadiusUndefined: Self = StObject.set(x, "borderBottomEndRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomStartRadius(value: Double): Self = StObject.set(x, "borderBottomStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomStartRadiusUndefined: Self = StObject.set(x, "borderBottomStartRadius", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorValue): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderEndColor(value: ColorValue): Self = StObject.set(x, "borderEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderEndColorUndefined: Self = StObject.set(x, "borderEndColor", js.undefined)
    
    @scala.inline
    def setBorderLeftColor(value: ColorValue): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderRightColor(value: ColorValue): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    @scala.inline
    def setBorderStartColor(value: ColorValue): Self = StObject.set(x, "borderStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStartColorUndefined: Self = StObject.set(x, "borderStartColor", js.undefined)
    
    @scala.inline
    def setBorderStyle(value: solid | dotted | dashed): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setBorderTopColor(value: ColorValue): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    @scala.inline
    def setBorderTopEndRadius(value: Double): Self = StObject.set(x, "borderTopEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopEndRadiusUndefined: Self = StObject.set(x, "borderTopEndRadius", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBorderTopStartRadius(value: Double): Self = StObject.set(x, "borderTopStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopStartRadiusUndefined: Self = StObject.set(x, "borderTopStartRadius", js.undefined)
    
    @scala.inline
    def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
