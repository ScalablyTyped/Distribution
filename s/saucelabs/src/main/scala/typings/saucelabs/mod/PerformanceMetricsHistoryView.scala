package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMetricsHistoryView
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var items: js.UndefOr[js.Array[PerformanceMetricsListViewItems]] = js.undefined
}
object PerformanceMetricsHistoryView {
  
  inline def apply(): PerformanceMetricsHistoryView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetricsHistoryView]
  }
  
  extension [Self <: PerformanceMetricsHistoryView](x: Self) {
    
    inline def setItems(value: js.Array[PerformanceMetricsListViewItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PerformanceMetricsListViewItems*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
