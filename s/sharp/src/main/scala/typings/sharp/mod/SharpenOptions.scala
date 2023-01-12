package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharpenOptions extends StObject {
  
  /** The level of sharpening to apply to "flat" areas. (optional, default 1.0) */
  var m1: js.UndefOr[Double] = js.undefined
  
  /** The level of sharpening to apply to "jagged" areas. (optional, default 2.0) */
  var m2: js.UndefOr[Double] = js.undefined
  
  /** The sigma of the Gaussian mask, where sigma = 1 + radius / 2. */
  var sigma: Double
  
  /** Threshold between "flat" and "jagged" (optional, default 2.0) */
  var x1: js.UndefOr[Double] = js.undefined
  
  /** Maximum amount of brightening. (optional, default 10.0) */
  var y2: js.UndefOr[Double] = js.undefined
  
  /** Maximum amount of darkening. (optional, default 20.0) */
  var y3: js.UndefOr[Double] = js.undefined
}
object SharpenOptions {
  
  inline def apply(sigma: Double): SharpenOptions = {
    val __obj = js.Dynamic.literal(sigma = sigma.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharpenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharpenOptions] (val x: Self) extends AnyVal {
    
    inline def setM1(value: Double): Self = StObject.set(x, "m1", value.asInstanceOf[js.Any])
    
    inline def setM1Undefined: Self = StObject.set(x, "m1", js.undefined)
    
    inline def setM2(value: Double): Self = StObject.set(x, "m2", value.asInstanceOf[js.Any])
    
    inline def setM2Undefined: Self = StObject.set(x, "m2", js.undefined)
    
    inline def setSigma(value: Double): Self = StObject.set(x, "sigma", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    inline def setY3(value: Double): Self = StObject.set(x, "y3", value.asInstanceOf[js.Any])
    
    inline def setY3Undefined: Self = StObject.set(x, "y3", js.undefined)
  }
}
