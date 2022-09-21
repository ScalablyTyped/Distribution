package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrimOptions extends StObject {
  
  /** background colour, parsed by the color module, defaults to that of the top-left pixel. (optional) */
  var background: js.UndefOr[Color] = js.undefined
  
  /** the allowed difference from the above colour, a positive number. (optional, default `10`) */
  var threshold: js.UndefOr[Double] = js.undefined
}
object TrimOptions {
  
  inline def apply(): TrimOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimOptions]
  }
  
  extension [Self <: TrimOptions](x: Self) {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
