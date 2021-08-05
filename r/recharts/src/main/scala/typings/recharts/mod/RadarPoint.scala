package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarPoint extends StObject {
  
  var angle: Double
  
  var cx: Double
  
  var cy: Double
  
  var payload: js.Object
  
  var radius: Double
  
  var value: Double
  
  var x: Double
  
  var y: Double
}
object RadarPoint {
  
  inline def apply(
    angle: Double,
    cx: Double,
    cy: Double,
    payload: js.Object,
    radius: Double,
    value: Double,
    x: Double,
    y: Double
  ): RadarPoint = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarPoint]
  }
  
  extension [Self <: RadarPoint](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
