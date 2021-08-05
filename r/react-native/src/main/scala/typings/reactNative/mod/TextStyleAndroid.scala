package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.bottom
import typings.reactNative.reactNativeStrings.center
import typings.reactNative.reactNativeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyleAndroid
  extends StObject
     with ViewStyle {
  
  var includeFontPadding: js.UndefOr[Boolean] = js.undefined
  
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.undefined
}
object TextStyleAndroid {
  
  inline def apply(): TextStyleAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleAndroid]
  }
  
  extension [Self <: TextStyleAndroid](x: Self) {
    
    inline def setIncludeFontPadding(value: Boolean): Self = StObject.set(x, "includeFontPadding", value.asInstanceOf[js.Any])
    
    inline def setIncludeFontPaddingUndefined: Self = StObject.set(x, "includeFontPadding", js.undefined)
    
    inline def setTextAlignVertical(value: auto | top | bottom | center): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    inline def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
  }
}
