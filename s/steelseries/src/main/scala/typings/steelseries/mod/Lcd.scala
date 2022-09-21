package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Lcd
trait Lcd extends StObject {
  
  var digitalFont: js.UndefOr[Boolean] = js.undefined
  
  var lcdColor: js.UndefOr[LcdColor] = js.undefined
  
  // Omit<> in DisplayMulti, DisplaySingle
  var lcdDecimals: js.UndefOr[Double] = js.undefined
  
  var lcdVisible: js.UndefOr[Boolean] = js.undefined
}
object Lcd {
  
  inline def apply(): Lcd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lcd]
  }
  
  extension [Self <: Lcd](x: Self) {
    
    inline def setDigitalFont(value: Boolean): Self = StObject.set(x, "digitalFont", value.asInstanceOf[js.Any])
    
    inline def setDigitalFontUndefined: Self = StObject.set(x, "digitalFont", js.undefined)
    
    inline def setLcdColor(value: LcdColor): Self = StObject.set(x, "lcdColor", value.asInstanceOf[js.Any])
    
    inline def setLcdColorUndefined: Self = StObject.set(x, "lcdColor", js.undefined)
    
    inline def setLcdDecimals(value: Double): Self = StObject.set(x, "lcdDecimals", value.asInstanceOf[js.Any])
    
    inline def setLcdDecimalsUndefined: Self = StObject.set(x, "lcdDecimals", js.undefined)
    
    inline def setLcdVisible(value: Boolean): Self = StObject.set(x, "lcdVisible", value.asInstanceOf[js.Any])
    
    inline def setLcdVisibleUndefined: Self = StObject.set(x, "lcdVisible", js.undefined)
  }
}
