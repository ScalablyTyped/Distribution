package typings.reactNativeReanimated.reanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueRotation extends StObject {
  
  var pitch: Double
  
  var qw: Double
  
  var qx: Double
  
  var qy: Double
  
  var qz: Double
  
  var roll: Double
  
  var yaw: Double
}
object ValueRotation {
  
  inline def apply(pitch: Double, qw: Double, qx: Double, qy: Double, qz: Double, roll: Double, yaw: Double): ValueRotation = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], qw = qw.asInstanceOf[js.Any], qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any], qz = qz.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueRotation]
  }
  
  extension [Self <: ValueRotation](x: Self) {
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setQw(value: Double): Self = StObject.set(x, "qw", value.asInstanceOf[js.Any])
    
    inline def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
    
    inline def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
    
    inline def setQz(value: Double): Self = StObject.set(x, "qz", value.asInstanceOf[js.Any])
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
  }
}
