package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stroke extends StObject {
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var `stroke-width`: js.UndefOr[Double] = js.undefined
  
  var `text-anchor`: js.UndefOr[String] = js.undefined
}
object Stroke {
  
  inline def apply(): Stroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stroke]
  }
  
  extension [Self <: Stroke](x: Self) {
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def `setText-anchor`(value: String): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
  }
}
