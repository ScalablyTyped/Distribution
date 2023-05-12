package typings.reactSpringCore.mod

import typings.react.mod.MutableRefObject
import typings.reactSpringCore.reactSpringCoreStrings.all
import typings.reactSpringCore.reactSpringCoreStrings.any
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @react-spring/core.@react-spring/core.Omit<std.IntersectionObserverInit, 'root' | 'threshold'> */
trait IntersectionArgs extends StObject {
  
  var amount: js.UndefOr[any | all | Double | js.Array[Double]] = js.undefined
  
  var once: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[MutableRefObject[HTMLElement]] = js.undefined
  
  var rootMargin: js.UndefOr[String] = js.undefined
}
object IntersectionArgs {
  
  inline def apply(): IntersectionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntersectionArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntersectionArgs] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: any | all | Double | js.Array[Double]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAmountVarargs(value: Double*): Self = StObject.set(x, "amount", js.Array(value*))
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setRoot(value: MutableRefObject[HTMLElement]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    inline def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
