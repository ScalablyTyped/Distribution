package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporalUnit
  extends /* key */ StringDictionary[js.Any] {
  
  var dateBased: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Duration] = js.native
  
  var durationEstimated: js.UndefOr[Boolean] = js.native
  
  var timeBased: js.UndefOr[Boolean] = js.native
}
object TemporalUnit {
  
  @scala.inline
  def apply(): TemporalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalUnit]
  }
  
  @scala.inline
  implicit class TemporalUnitMutableBuilder[Self <: TemporalUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateBased(value: Boolean): Self = StObject.set(x, "dateBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateBasedUndefined: Self = StObject.set(x, "dateBased", js.undefined)
    
    @scala.inline
    def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationEstimated(value: Boolean): Self = StObject.set(x, "durationEstimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationEstimatedUndefined: Self = StObject.set(x, "durationEstimated", js.undefined)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setTimeBased(value: Boolean): Self = StObject.set(x, "timeBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBasedUndefined: Self = StObject.set(x, "timeBased", js.undefined)
  }
}
