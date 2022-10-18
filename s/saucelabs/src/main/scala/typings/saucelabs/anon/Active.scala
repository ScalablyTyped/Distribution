package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var active: Boolean
  
  var baseline: js.UndefOr[Lowerboundary] = js.undefined
  
  var baseline_url: String
  
  var regime_end: Double
  
  var regime_start: Double
}
object Active {
  
  inline def apply(active: Boolean, baseline_url: String, regime_end: Double, regime_start: Double): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], baseline_url = baseline_url.asInstanceOf[js.Any], regime_end = regime_end.asInstanceOf[js.Any], regime_start = regime_start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setBaseline(value: Lowerboundary): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setBaseline_url(value: String): Self = StObject.set(x, "baseline_url", value.asInstanceOf[js.Any])
    
    inline def setRegime_end(value: Double): Self = StObject.set(x, "regime_end", value.asInstanceOf[js.Any])
    
    inline def setRegime_start(value: Double): Self = StObject.set(x, "regime_start", value.asInstanceOf[js.Any])
  }
}
