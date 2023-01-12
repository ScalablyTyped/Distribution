package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrcSetParams extends StObject {
  
  var devicePixelRatios: js.UndefOr[js.Array[Double]] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var widthTolerance: js.UndefOr[Double] = js.undefined
  
  var widths: js.UndefOr[js.Array[Double]] = js.undefined
}
object SrcSetParams {
  
  inline def apply(): SrcSetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SrcSetParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SrcSetParams] (val x: Self) extends AnyVal {
    
    inline def setDevicePixelRatios(value: js.Array[Double]): Self = StObject.set(x, "devicePixelRatios", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatiosUndefined: Self = StObject.set(x, "devicePixelRatios", js.undefined)
    
    inline def setDevicePixelRatiosVarargs(value: Double*): Self = StObject.set(x, "devicePixelRatios", js.Array(value*))
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setWidthTolerance(value: Double): Self = StObject.set(x, "widthTolerance", value.asInstanceOf[js.Any])
    
    inline def setWidthToleranceUndefined: Self = StObject.set(x, "widthTolerance", js.undefined)
    
    inline def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    
    inline def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value*))
  }
}
