package typings.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideDuration extends StObject {
  
  def add(value: GlideDuration): GlideDuration = js.native
  
  def getByFormat(format: String): String = js.native
  
  def getDayPart(): Double = js.native
  
  def getDisplayValue(): String = js.native
  
  def getDurationValue(): String = js.native
  
  def getNumericValue(): Double = js.native
  
  def getRoundedDayPart(): Double = js.native
  
  def getValue(): String = js.native
  
  def setDisplayValue(asDisplayed: String): Unit = js.native
  
  def setValue(o: js.Object): Unit = js.native
  
  def subtract(value: GlideDuration): GlideDuration = js.native
}
object GlideDuration {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GlideDurationMutableBuilder[Self <: GlideDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: GlideDuration => GlideDuration): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDayPart(value: () => Double): Self = StObject.set(x, "getDayPart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValue(value: () => String): Self = StObject.set(x, "getDisplayValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDurationValue(value: () => String): Self = StObject.set(x, "getDurationValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumericValue(value: () => Double): Self = StObject.set(x, "getNumericValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRoundedDayPart(value: () => Double): Self = StObject.set(x, "getRoundedDayPart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDisplayValue(value: String => Unit): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: js.Object => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtract(value: GlideDuration => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
  }
}
