package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasShadowStyles extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowBlur) */
  /* standard dom */
  var shadowBlur: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowColor) */
  /* standard dom */
  var shadowColor: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetX) */
  /* standard dom */
  var shadowOffsetX: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetY) */
  /* standard dom */
  var shadowOffsetY: Double
}
object CanvasShadowStyles {
  
  inline def apply(shadowBlur: Double, shadowColor: java.lang.String, shadowOffsetX: Double, shadowOffsetY: Double): CanvasShadowStyles = {
    val __obj = js.Dynamic.literal(shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasShadowStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasShadowStyles] (val x: Self) extends AnyVal {
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowColor(value: java.lang.String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
  }
}
