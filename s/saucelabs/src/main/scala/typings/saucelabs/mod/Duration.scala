package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var nano: js.UndefOr[Double] = js.undefined
  
  var negative: js.UndefOr[Boolean] = js.undefined
  
  var seconds: js.UndefOr[Double] = js.undefined
  
  var units: js.UndefOr[js.Array[TemporalUnit]] = js.undefined
  
  var zero: js.UndefOr[Boolean] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setNano(value: Double): Self = StObject.set(x, "nano", value.asInstanceOf[js.Any])
    
    inline def setNanoUndefined: Self = StObject.set(x, "nano", js.undefined)
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setUnits(value: js.Array[TemporalUnit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUnitsVarargs(value: TemporalUnit*): Self = StObject.set(x, "units", js.Array(value*))
    
    inline def setZero(value: Boolean): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
