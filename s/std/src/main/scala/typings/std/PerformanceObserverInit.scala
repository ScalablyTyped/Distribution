package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceObserverInit extends StObject {
  
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  
  var entryTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object PerformanceObserverInit {
  
  @scala.inline
  def apply(): PerformanceObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceObserverInit]
  }
  
  @scala.inline
  implicit class PerformanceObserverInitMutableBuilder[Self <: PerformanceObserverInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffered(value: scala.Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    @scala.inline
    def setEntryTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "entryTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryTypesUndefined: Self = StObject.set(x, "entryTypes", js.undefined)
    
    @scala.inline
    def setEntryTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "entryTypes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
