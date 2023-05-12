package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormaliseOptions extends StObject {
  
  /** Percentile below which luminance values will be underexposed. */
  var lower: js.UndefOr[Double] = js.undefined
  
  /** Percentile above which luminance values will be overexposed. */
  var upper: js.UndefOr[Double] = js.undefined
}
object NormaliseOptions {
  
  inline def apply(): NormaliseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormaliseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormaliseOptions] (val x: Self) extends AnyVal {
    
    inline def setLower(value: Double): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
    
    inline def setUpper(value: Double): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpperUndefined: Self = StObject.set(x, "upper", js.undefined)
  }
}
