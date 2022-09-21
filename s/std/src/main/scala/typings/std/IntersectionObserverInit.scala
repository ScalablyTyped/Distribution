package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectionObserverInit extends StObject {
  
  /* standard dom */
  var root: js.UndefOr[Element | Document | Null] = js.undefined
  
  /* standard dom */
  var rootMargin: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var threshold: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object IntersectionObserverInit {
  
  inline def apply(): IntersectionObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntersectionObserverInit]
  }
  
  extension [Self <: IntersectionObserverInit](x: Self) {
    
    inline def setRoot(value: Element | Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMargin(value: java.lang.String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    inline def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setThreshold(value: Double | js.Array[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setThresholdVarargs(value: Double*): Self = StObject.set(x, "threshold", js.Array(value*))
  }
}
