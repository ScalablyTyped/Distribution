package typings.sharp.mod

import typings.sharp.sharpStrings.bicubic
import typings.sharp.sharpStrings.bilinear
import typings.sharp.sharpStrings.lbb
import typings.sharp.sharpStrings.nearest
import typings.sharp.sharpStrings.nohalo
import typings.sharp.sharpStrings.vsqbs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffineOptions extends StObject {
  
  /** Parsed by the color module to extract values for red, green, blue and alpha. (optional, default "#000000") */
  var background: js.UndefOr[String | js.Object] = js.undefined
  
  /** Input horizontal offset (optional, default 0) */
  var idx: js.UndefOr[Double] = js.undefined
  
  /** Input vertical offset (optional, default 0) */
  var idy: js.UndefOr[Double] = js.undefined
  
  /** Interpolator (optional, default sharp.interpolators.bicubic) */
  var interpolator: js.UndefOr[lbb | nearest | vsqbs | bicubic | bilinear | nohalo] = js.undefined
  
  /** Output horizontal offset (optional, default 0) */
  var odx: js.UndefOr[Double] = js.undefined
  
  /** Output horizontal offset (optional, default 0) */
  var ody: js.UndefOr[Double] = js.undefined
}
object AffineOptions {
  
  inline def apply(): AffineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AffineOptions] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String | js.Object): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    inline def setIdy(value: Double): Self = StObject.set(x, "idy", value.asInstanceOf[js.Any])
    
    inline def setIdyUndefined: Self = StObject.set(x, "idy", js.undefined)
    
    inline def setInterpolator(value: lbb | nearest | vsqbs | bicubic | bilinear | nohalo): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
    
    inline def setInterpolatorUndefined: Self = StObject.set(x, "interpolator", js.undefined)
    
    inline def setOdx(value: Double): Self = StObject.set(x, "odx", value.asInstanceOf[js.Any])
    
    inline def setOdxUndefined: Self = StObject.set(x, "odx", js.undefined)
    
    inline def setOdy(value: Double): Self = StObject.set(x, "ody", value.asInstanceOf[js.Any])
    
    inline def setOdyUndefined: Self = StObject.set(x, "ody", js.undefined)
  }
}
