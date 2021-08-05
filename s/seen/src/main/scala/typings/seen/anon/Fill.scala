package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var `fill-opacity`: js.UndefOr[Double] = js.undefined
  
  var `text-anchor`: js.UndefOr[String] = js.undefined
}
object Fill {
  
  inline def apply(): Fill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fill]
  }
  
  extension [Self <: Fill](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: Double): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def `setText-anchor`(value: String): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
  }
}
