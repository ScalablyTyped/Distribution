package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration
  extends /* key */ StringDictionary[js.Any] {
  
  var nano: js.UndefOr[Double] = js.native
  
  var negative: js.UndefOr[Boolean] = js.native
  
  var seconds: js.UndefOr[Double] = js.native
  
  var units: js.UndefOr[js.Array[TemporalUnit]] = js.native
  
  var zero: js.UndefOr[Boolean] = js.native
}
object Duration {
  
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNano(value: Double): Self = StObject.set(x, "nano", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoUndefined: Self = StObject.set(x, "nano", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    @scala.inline
    def setUnits(value: js.Array[TemporalUnit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    @scala.inline
    def setUnitsVarargs(value: TemporalUnit*): Self = StObject.set(x, "units", js.Array(value :_*))
    
    @scala.inline
    def setZero(value: Boolean): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
