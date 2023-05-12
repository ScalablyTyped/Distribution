package typings.sentryTypes.anon

import typings.sentryTypes.typesCheckinMod.MonitorSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkinmargin extends StObject {
  
  var checkin_margin: js.UndefOr[Double] = js.undefined
  
  var max_runtime: js.UndefOr[Double] = js.undefined
  
  var schedule: MonitorSchedule
  
  var timezone: js.UndefOr[String] = js.undefined
}
object Checkinmargin {
  
  inline def apply(schedule: MonitorSchedule): Checkinmargin = {
    val __obj = js.Dynamic.literal(schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkinmargin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkinmargin] (val x: Self) extends AnyVal {
    
    inline def setCheckin_margin(value: Double): Self = StObject.set(x, "checkin_margin", value.asInstanceOf[js.Any])
    
    inline def setCheckin_marginUndefined: Self = StObject.set(x, "checkin_margin", js.undefined)
    
    inline def setMax_runtime(value: Double): Self = StObject.set(x, "max_runtime", value.asInstanceOf[js.Any])
    
    inline def setMax_runtimeUndefined: Self = StObject.set(x, "max_runtime", js.undefined)
    
    inline def setSchedule(value: MonitorSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
