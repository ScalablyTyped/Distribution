package typings.reactNativeSensorManager.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
