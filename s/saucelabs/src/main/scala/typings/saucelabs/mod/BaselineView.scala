package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineView
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var metric_name: js.UndefOr[BaselineDetails] = js.undefined
}
object BaselineView {
  
  inline def apply(): BaselineView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineView]
  }
  
  extension [Self <: BaselineView](x: Self) {
    
    inline def setMetric_name(value: BaselineDetails): Self = StObject.set(x, "metric_name", value.asInstanceOf[js.Any])
    
    inline def setMetric_nameUndefined: Self = StObject.set(x, "metric_name", js.undefined)
  }
}
