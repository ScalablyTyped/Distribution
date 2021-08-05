package typings.reactNativeSensorManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Azimuth extends StObject {
    
    var azimuth: Double
    
    var pitch: Double
    
    var roll: Double
  }
  object Azimuth {
    
    inline def apply(azimuth: Double, pitch: Double, roll: Double): Azimuth = {
      val __obj = js.Dynamic.literal(azimuth = azimuth.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Azimuth]
    }
    
    extension [Self <: Azimuth](x: Self) {
      
      inline def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsNear extends StObject {
    
    var isNear: Boolean
    
    var maxRange: Double
    
    var value: Double
  }
  object IsNear {
    
    inline def apply(isNear: Boolean, maxRange: Double, value: Double): IsNear = {
      val __obj = js.Dynamic.literal(isNear = isNear.asInstanceOf[js.Any], maxRange = maxRange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsNear]
    }
    
    extension [Self <: IsNear](x: Self) {
      
      inline def setIsNear(value: Boolean): Self = StObject.set(x, "isNear", value.asInstanceOf[js.Any])
      
      inline def setMaxRange(value: Double): Self = StObject.set(x, "maxRange", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Light extends StObject {
    
    var light: Double
  }
  object Light {
    
    inline def apply(light: Double): Light = {
      val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any])
      __obj.asInstanceOf[Light]
    }
    
    extension [Self <: Light](x: Self) {
      
      inline def setLight(value: Double): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    }
  }
  
  trait Steps extends StObject {
    
    var steps: Double
  }
  object Steps {
    
    inline def apply(steps: Double): Steps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Steps]
    }
    
    extension [Self <: Steps](x: Self) {
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Temp extends StObject {
    
    var temp: Double
  }
  object Temp {
    
    inline def apply(temp: Double): Temp = {
      val __obj = js.Dynamic.literal(temp = temp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Temp]
    }
    
    extension [Self <: Temp](x: Self) {
      
      inline def setTemp(value: Double): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double, z: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
