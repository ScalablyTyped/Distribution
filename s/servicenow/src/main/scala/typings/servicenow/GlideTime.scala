package typings.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideTime extends StObject {
  
  def getByFormat(format: String): String
  
  def getDisplayValue(): String
  
  def getDisplayValueinternal(): String
  
  def getValue(): String
  
  def setDisplayValue(asDisplayed: String): Unit
  
  def setValue(o: String): Unit
  
  def subtract(start: GlideTime, end: GlideTime): GlideDuration
}
object GlideTime {
  
  @scala.inline
  def apply(
    getByFormat: String => String,
    getDisplayValue: () => String,
    getDisplayValueinternal: () => String,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: String => Unit,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDisplayValueinternal = js.Any.fromFunction0(getDisplayValueinternal), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
  
  @scala.inline
  implicit class GlideTimeMutableBuilder[Self <: GlideTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisplayValue(value: () => String): Self = StObject.set(x, "getDisplayValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValueinternal(value: () => String): Self = StObject.set(x, "getDisplayValueinternal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDisplayValue(value: String => Unit): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubtract(value: (GlideTime, GlideTime) => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction2(value))
  }
}
