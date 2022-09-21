package typings.simpleTimeInputEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClockMode extends StObject {
    
    var clockMode: Double
    
    var time: String
  }
  object ClockMode {
    
    inline def apply(clockMode: Double, time: String): ClockMode = {
      val __obj = js.Dynamic.literal(clockMode = clockMode.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClockMode]
    }
    
    extension [Self <: ClockMode](x: Self) {
      
      inline def setClockMode(value: Double): Self = StObject.set(x, "clockMode", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewValue extends StObject {
    
    var clockMode: Double
    
    var newValue: String
    
    var previousTime: String
  }
  object NewValue {
    
    inline def apply(clockMode: Double, newValue: String, previousTime: String): NewValue = {
      val __obj = js.Dynamic.literal(clockMode = clockMode.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], previousTime = previousTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValue]
    }
    
    extension [Self <: NewValue](x: Self) {
      
      inline def setClockMode(value: Double): Self = StObject.set(x, "clockMode", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousTime(value: String): Self = StObject.set(x, "previousTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Time extends StObject {
    
    var time: String
    
    var valid: Boolean
  }
  object Time {
    
    inline def apply(time: String, valid: Boolean): Time = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    extension [Self <: Time](x: Self) {
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
