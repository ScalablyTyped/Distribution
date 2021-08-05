package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceUserMetricsView
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var items: js.UndefOr[js.Array[PerformanceMetricsListViewItems]] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
  
  var previous: js.UndefOr[String] = js.undefined
}
object PerformanceUserMetricsView {
  
  inline def apply(): PerformanceUserMetricsView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceUserMetricsView]
  }
  
  extension [Self <: PerformanceUserMetricsView](x: Self) {
    
    inline def setItems(value: js.Array[PerformanceMetricsListViewItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PerformanceMetricsListViewItems*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
