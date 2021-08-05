package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps
  extends StObject
     with typings.reactNative.mod.TextProps
     with _HeaderSubComponent {
  
  /**
    * font size 40
    */
  var h1: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Styling for when `h1` is set
    */
  var h1Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * font size 34
    */
  var h2: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Styling for when `h2` is set
    */
  var h2Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * font size 28
    */
  var h3: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Styling for when `h3` is set
    */
  var h3Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * font size 22
    */
  var h4: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Styling for when `h4` is set
    */
  var h4Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object TextProps {
  
  inline def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  extension [Self <: TextProps](x: Self) {
    
    inline def setH1(value: Boolean): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
    
    inline def setH1Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h1Style", value.asInstanceOf[js.Any])
    
    inline def setH1StyleNull: Self = StObject.set(x, "h1Style", null)
    
    inline def setH1StyleUndefined: Self = StObject.set(x, "h1Style", js.undefined)
    
    inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
    
    inline def setH2(value: Boolean): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
    
    inline def setH2Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h2Style", value.asInstanceOf[js.Any])
    
    inline def setH2StyleNull: Self = StObject.set(x, "h2Style", null)
    
    inline def setH2StyleUndefined: Self = StObject.set(x, "h2Style", js.undefined)
    
    inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
    
    inline def setH3(value: Boolean): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
    
    inline def setH3Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h3Style", value.asInstanceOf[js.Any])
    
    inline def setH3StyleNull: Self = StObject.set(x, "h3Style", null)
    
    inline def setH3StyleUndefined: Self = StObject.set(x, "h3Style", js.undefined)
    
    inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
    
    inline def setH4(value: Boolean): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
    
    inline def setH4Style(value: StyleProp[TextStyle]): Self = StObject.set(x, "h4Style", value.asInstanceOf[js.Any])
    
    inline def setH4StyleNull: Self = StObject.set(x, "h4Style", null)
    
    inline def setH4StyleUndefined: Self = StObject.set(x, "h4Style", js.undefined)
    
    inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
  }
}
