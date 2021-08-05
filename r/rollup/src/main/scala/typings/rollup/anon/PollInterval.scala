package typings.rollup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollInterval extends StObject {
  
  var pollInterval: js.UndefOr[Double] = js.undefined
  
  var stabilityThreshold: js.UndefOr[Double] = js.undefined
}
object PollInterval {
  
  inline def apply(): PollInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollInterval]
  }
  
  extension [Self <: PollInterval](x: Self) {
    
    inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
    
    inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
    
    inline def setStabilityThreshold(value: Double): Self = StObject.set(x, "stabilityThreshold", value.asInstanceOf[js.Any])
    
    inline def setStabilityThresholdUndefined: Self = StObject.set(x, "stabilityThreshold", js.undefined)
  }
}
