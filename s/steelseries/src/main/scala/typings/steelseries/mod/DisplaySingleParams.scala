package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<steelseries.steelseries.Lcd, 'lcdVisible'> */
trait DisplaySingleParams extends StObject {
  
  var alwaysScroll: js.UndefOr[Boolean] = js.undefined
  
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  var digitalFont: js.UndefOr[Boolean] = js.undefined
  
  var headerString: js.UndefOr[String] = js.undefined
  
  var headerStringVisible: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var lcdColor: js.UndefOr[LcdColor] = js.undefined
  
  var lcdDecimals: js.UndefOr[Double] = js.undefined
  
  var section: js.UndefOr[js.Array[Section]] = js.undefined
  
  var unitString: js.UndefOr[String] = js.undefined
  
  var unitStringVisible: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String | Double] = js.undefined
  
  var valuesNumeric: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DisplaySingleParams {
  
  inline def apply(): DisplaySingleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplaySingleParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplaySingleParams] (val x: Self) extends AnyVal {
    
    inline def setAlwaysScroll(value: Boolean): Self = StObject.set(x, "alwaysScroll", value.asInstanceOf[js.Any])
    
    inline def setAlwaysScrollUndefined: Self = StObject.set(x, "alwaysScroll", js.undefined)
    
    inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setDigitalFont(value: Boolean): Self = StObject.set(x, "digitalFont", value.asInstanceOf[js.Any])
    
    inline def setDigitalFontUndefined: Self = StObject.set(x, "digitalFont", js.undefined)
    
    inline def setHeaderString(value: String): Self = StObject.set(x, "headerString", value.asInstanceOf[js.Any])
    
    inline def setHeaderStringUndefined: Self = StObject.set(x, "headerString", js.undefined)
    
    inline def setHeaderStringVisible(value: Boolean): Self = StObject.set(x, "headerStringVisible", value.asInstanceOf[js.Any])
    
    inline def setHeaderStringVisibleUndefined: Self = StObject.set(x, "headerStringVisible", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLcdColor(value: LcdColor): Self = StObject.set(x, "lcdColor", value.asInstanceOf[js.Any])
    
    inline def setLcdColorUndefined: Self = StObject.set(x, "lcdColor", js.undefined)
    
    inline def setLcdDecimals(value: Double): Self = StObject.set(x, "lcdDecimals", value.asInstanceOf[js.Any])
    
    inline def setLcdDecimalsUndefined: Self = StObject.set(x, "lcdDecimals", js.undefined)
    
    inline def setSection(value: js.Array[Section]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: Section*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setUnitString(value: String): Self = StObject.set(x, "unitString", value.asInstanceOf[js.Any])
    
    inline def setUnitStringUndefined: Self = StObject.set(x, "unitString", js.undefined)
    
    inline def setUnitStringVisible(value: Boolean): Self = StObject.set(x, "unitStringVisible", value.asInstanceOf[js.Any])
    
    inline def setUnitStringVisibleUndefined: Self = StObject.set(x, "unitStringVisible", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValuesNumeric(value: Boolean): Self = StObject.set(x, "valuesNumeric", value.asInstanceOf[js.Any])
    
    inline def setValuesNumericUndefined: Self = StObject.set(x, "valuesNumeric", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
