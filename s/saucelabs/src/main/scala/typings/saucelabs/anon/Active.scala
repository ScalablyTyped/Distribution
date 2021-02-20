package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active
  extends /* key */ StringDictionary[js.Any] {
  
  var active: Boolean = js.native
  
  var baseline: js.UndefOr[Dictkey] = js.native
  
  var baseline_url: String = js.native
  
  var regime_end: Double = js.native
  
  var regime_start: Double = js.native
}
object Active {
  
  @scala.inline
  def apply(active: Boolean, baseline_url: String, regime_end: Double, regime_start: Double): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], baseline_url = baseline_url.asInstanceOf[js.Any], regime_end = regime_end.asInstanceOf[js.Any], regime_start = regime_start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseline(value: Dictkey): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setBaseline_url(value: String): Self = StObject.set(x, "baseline_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegime_end(value: Double): Self = StObject.set(x, "regime_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegime_start(value: Double): Self = StObject.set(x, "regime_start", value.asInstanceOf[js.Any])
  }
}
