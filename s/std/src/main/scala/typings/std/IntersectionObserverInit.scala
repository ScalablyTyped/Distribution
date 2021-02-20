package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserverInit extends StObject {
  
  var root: js.UndefOr[Element | Null] = js.native
  
  var rootMargin: js.UndefOr[java.lang.String] = js.native
  
  var threshold: js.UndefOr[Double | js.Array[Double]] = js.native
}
object IntersectionObserverInit {
  
  @scala.inline
  def apply(): IntersectionObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntersectionObserverInit]
  }
  
  @scala.inline
  implicit class IntersectionObserverInitMutableBuilder[Self <: IntersectionObserverInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootMargin(value: java.lang.String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double | js.Array[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setThresholdVarargs(value: Double*): Self = StObject.set(x, "threshold", js.Array(value :_*))
  }
}
