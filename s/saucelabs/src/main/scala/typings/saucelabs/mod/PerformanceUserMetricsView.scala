package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceUserMetricsView
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var items: js.UndefOr[js.Array[PerformanceMetricsListViewItems]] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
  
  var previous: js.UndefOr[String] = js.undefined
}
object PerformanceUserMetricsView {
  
  inline def apply(): PerformanceUserMetricsView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceUserMetricsView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceUserMetricsView] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PerformanceMetricsListViewItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PerformanceMetricsListViewItems*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
