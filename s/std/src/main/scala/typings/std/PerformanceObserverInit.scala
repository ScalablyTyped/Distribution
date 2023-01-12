package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceObserverInit extends StObject {
  
  /* standard dom */
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var entryTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  /* standard dom */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object PerformanceObserverInit {
  
  inline def apply(): PerformanceObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceObserverInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceObserverInit] (val x: Self) extends AnyVal {
    
    inline def setBuffered(value: scala.Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    inline def setEntryTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "entryTypes", value.asInstanceOf[js.Any])
    
    inline def setEntryTypesUndefined: Self = StObject.set(x, "entryTypes", js.undefined)
    
    inline def setEntryTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "entryTypes", js.Array(value*))
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
