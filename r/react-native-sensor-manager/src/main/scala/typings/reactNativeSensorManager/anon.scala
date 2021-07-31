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
    
    @scala.inline
    def apply(azimuth: Double, pitch: Double, roll: Double): Azimuth = {
      val __obj = js.Dynamic.literal(azimuth = azimuth.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Azimuth]
    }
    
    @scala.inline
    implicit class AzimuthMutableBuilder[Self <: Azimuth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsNear extends StObject {
    
    var isNear: Boolean
    
    var maxRange: Double
    
    var value: Double
  }
  object IsNear {
    
    @scala.inline
    def apply(isNear: Boolean, maxRange: Double, value: Double): IsNear = {
      val __obj = js.Dynamic.literal(isNear = isNear.asInstanceOf[js.Any], maxRange = maxRange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsNear]
    }
    
    @scala.inline
    implicit class IsNearMutableBuilder[Self <: IsNear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsNear(value: Boolean): Self = StObject.set(x, "isNear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRange(value: Double): Self = StObject.set(x, "maxRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Light extends StObject {
    
    var light: Double
  }
  object Light {
    
    @scala.inline
    def apply(light: Double): Light = {
      val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any])
      __obj.asInstanceOf[Light]
    }
    
    @scala.inline
    implicit class LightMutableBuilder[Self <: Light] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLight(value: Double): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    }
  }
  
  trait Steps extends StObject {
    
    var steps: Double
  }
  object Steps {
    
    @scala.inline
    def apply(steps: Double): Steps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Steps]
    }
    
    @scala.inline
    implicit class StepsMutableBuilder[Self <: Steps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Temp extends StObject {
    
    var temp: Double
  }
  object Temp {
    
    @scala.inline
    def apply(temp: Double): Temp = {
      val __obj = js.Dynamic.literal(temp = temp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Temp]
    }
    
    @scala.inline
    implicit class TempMutableBuilder[Self <: Temp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemp(value: Double): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double, z: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
