package typings.sindresorhusToMilliseconds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sindresorhus/to-milliseconds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(timeDescriptor: TimeDescriptor): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(timeDescriptor.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait TimeDescriptor extends StObject {
    
    val days: js.UndefOr[Double] = js.undefined
    
    val hours: js.UndefOr[Double] = js.undefined
    
    val microseconds: js.UndefOr[Double] = js.undefined
    
    val milliseconds: js.UndefOr[Double] = js.undefined
    
    val minutes: js.UndefOr[Double] = js.undefined
    
    val nanoseconds: js.UndefOr[Double] = js.undefined
    
    val seconds: js.UndefOr[Double] = js.undefined
  }
  object TimeDescriptor {
    
    inline def apply(): TimeDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeDescriptor]
    }
    
    extension [Self <: TimeDescriptor](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMicroseconds(value: Double): Self = StObject.set(x, "microseconds", value.asInstanceOf[js.Any])
      
      inline def setMicrosecondsUndefined: Self = StObject.set(x, "microseconds", js.undefined)
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
      
      inline def setNanosecondsUndefined: Self = StObject.set(x, "nanoseconds", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    }
  }
}
