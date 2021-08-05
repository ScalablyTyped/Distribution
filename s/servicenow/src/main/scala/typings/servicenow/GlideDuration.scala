package typings.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideDuration extends StObject {
  
  def add(value: GlideDuration): GlideDuration
  
  def getByFormat(format: String): String
  
  def getDayPart(): Double
  
  def getDisplayValue(): String
  
  def getDurationValue(): String
  
  def getNumericValue(): Double
  
  def getRoundedDayPart(): Double
  
  def getValue(): String
  
  def setDisplayValue(asDisplayed: String): Unit
  
  def setValue(o: js.Object): Unit
  
  def subtract(value: GlideDuration): GlideDuration
}
object GlideDuration {
  
  inline def apply(
    add: GlideDuration => GlideDuration,
    getByFormat: String => String,
    getDayPart: () => Double,
    getDisplayValue: () => String,
    getDurationValue: () => String,
    getNumericValue: () => Double,
    getRoundedDayPart: () => Double,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: js.Object => Unit,
    subtract: GlideDuration => GlideDuration
  ): GlideDuration = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getByFormat = js.Any.fromFunction1(getByFormat), getDayPart = js.Any.fromFunction0(getDayPart), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDurationValue = js.Any.fromFunction0(getDurationValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoundedDayPart = js.Any.fromFunction0(getRoundedDayPart), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction1(subtract))
    __obj.asInstanceOf[GlideDuration]
  }
  
  extension [Self <: GlideDuration](x: Self) {
    
    inline def setAdd(value: GlideDuration => GlideDuration): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    inline def setGetDayPart(value: () => Double): Self = StObject.set(x, "getDayPart", js.Any.fromFunction0(value))
    
    inline def setGetDisplayValue(value: () => String): Self = StObject.set(x, "getDisplayValue", js.Any.fromFunction0(value))
    
    inline def setGetDurationValue(value: () => String): Self = StObject.set(x, "getDurationValue", js.Any.fromFunction0(value))
    
    inline def setGetNumericValue(value: () => Double): Self = StObject.set(x, "getNumericValue", js.Any.fromFunction0(value))
    
    inline def setGetRoundedDayPart(value: () => Double): Self = StObject.set(x, "getRoundedDayPart", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setSetDisplayValue(value: String => Unit): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: js.Object => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSubtract(value: GlideDuration => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
  }
}
