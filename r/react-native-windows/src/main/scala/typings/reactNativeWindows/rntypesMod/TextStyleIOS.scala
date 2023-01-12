package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.auto
import typings.reactNativeWindows.reactNativeWindowsStrings.dashed
import typings.reactNativeWindows.reactNativeWindowsStrings.dotted
import typings.reactNativeWindows.reactNativeWindowsStrings.double
import typings.reactNativeWindows.reactNativeWindowsStrings.ltr
import typings.reactNativeWindows.reactNativeWindowsStrings.rtl
import typings.reactNativeWindows.reactNativeWindowsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyleIOS
  extends StObject
     with ViewStyle {
  
  var fontVariant: js.UndefOr[js.Array[FontVariant]] = js.undefined
  
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  var textDecorationColor: js.UndefOr[ColorValue] = js.undefined
  
  var textDecorationStyle: js.UndefOr[solid | double | dotted | dashed] = js.undefined
  
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.undefined
}
object TextStyleIOS {
  
  inline def apply(): TextStyleIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleIOS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextStyleIOS] (val x: Self) extends AnyVal {
    
    inline def setFontVariant(value: js.Array[FontVariant]): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    inline def setFontVariantVarargs(value: FontVariant*): Self = StObject.set(x, "fontVariant", js.Array(value*))
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setTextDecorationColor(value: ColorValue): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
    
    inline def setTextDecorationStyle(value: solid | double | dotted | dashed): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
    
    inline def setWritingDirection(value: auto | ltr | rtl): Self = StObject.set(x, "writingDirection", value.asInstanceOf[js.Any])
    
    inline def setWritingDirectionUndefined: Self = StObject.set(x, "writingDirection", js.undefined)
  }
}
