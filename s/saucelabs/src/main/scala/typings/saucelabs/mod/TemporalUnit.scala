package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalUnit
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dateBased: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Duration] = js.undefined
  
  var durationEstimated: js.UndefOr[Boolean] = js.undefined
  
  var timeBased: js.UndefOr[Boolean] = js.undefined
}
object TemporalUnit {
  
  inline def apply(): TemporalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalUnit]
  }
  
  extension [Self <: TemporalUnit](x: Self) {
    
    inline def setDateBased(value: Boolean): Self = StObject.set(x, "dateBased", value.asInstanceOf[js.Any])
    
    inline def setDateBasedUndefined: Self = StObject.set(x, "dateBased", js.undefined)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationEstimated(value: Boolean): Self = StObject.set(x, "durationEstimated", value.asInstanceOf[js.Any])
    
    inline def setDurationEstimatedUndefined: Self = StObject.set(x, "durationEstimated", js.undefined)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimeBased(value: Boolean): Self = StObject.set(x, "timeBased", value.asInstanceOf[js.Any])
    
    inline def setTimeBasedUndefined: Self = StObject.set(x, "timeBased", js.undefined)
  }
}
