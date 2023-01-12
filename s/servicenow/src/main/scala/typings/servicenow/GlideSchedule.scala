package typings.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideSchedule extends StObject {
  
  def add(startDate: GlideDateTime, offset: GlideDuration): GlideDateTime
  
  def duration(startDate: GlideDateTime, endDate: GlideDateTime): GlideDuration
  
  def getName(): String
  
  def isInSchedule(time: GlideDateTime): String
  
  def isValid(): Boolean
  
  def load(sysId: String, timeZone: String, excludeSpanId: String): Unit
  
  def setTimeZone(tz: String): Unit
  
  def whenNext(time: GlideDateTime, timeZone: String): Double
}
object GlideSchedule {
  
  inline def apply(
    add: (GlideDateTime, GlideDuration) => GlideDateTime,
    duration: (GlideDateTime, GlideDateTime) => GlideDuration,
    getName: () => String,
    isInSchedule: GlideDateTime => String,
    isValid: () => Boolean,
    load: (String, String, String) => Unit,
    setTimeZone: String => Unit,
    whenNext: (GlideDateTime, String) => Double
  ): GlideSchedule = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), duration = js.Any.fromFunction2(duration), getName = js.Any.fromFunction0(getName), isInSchedule = js.Any.fromFunction1(isInSchedule), isValid = js.Any.fromFunction0(isValid), load = js.Any.fromFunction3(load), setTimeZone = js.Any.fromFunction1(setTimeZone), whenNext = js.Any.fromFunction2(whenNext))
    __obj.asInstanceOf[GlideSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlideSchedule] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (GlideDateTime, GlideDuration) => GlideDateTime): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setDuration(value: (GlideDateTime, GlideDateTime) => GlideDuration): Self = StObject.set(x, "duration", js.Any.fromFunction2(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setIsInSchedule(value: GlideDateTime => String): Self = StObject.set(x, "isInSchedule", js.Any.fromFunction1(value))
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setLoad(value: (String, String, String) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
    
    inline def setSetTimeZone(value: String => Unit): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
    
    inline def setWhenNext(value: (GlideDateTime, String) => Double): Self = StObject.set(x, "whenNext", js.Any.fromFunction2(value))
  }
}
