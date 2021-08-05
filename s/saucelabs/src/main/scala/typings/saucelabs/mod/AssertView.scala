package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertView
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var metric_name: js.UndefOr[AssertDetails] = js.undefined
}
object AssertView {
  
  inline def apply(): AssertView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertView]
  }
  
  extension [Self <: AssertView](x: Self) {
    
    inline def setMetric_name(value: AssertDetails): Self = StObject.set(x, "metric_name", value.asInstanceOf[js.Any])
    
    inline def setMetric_nameUndefined: Self = StObject.set(x, "metric_name", js.undefined)
  }
}
