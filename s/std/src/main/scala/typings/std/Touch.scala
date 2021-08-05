package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad. */
trait Touch extends StObject {
  
  val altitudeAngle: Double
  
  val azimuthAngle: Double
  
  val clientX: Double
  
  val clientY: Double
  
  val force: Double
  
  val identifier: Double
  
  val pageX: Double
  
  val pageY: Double
  
  val radiusX: Double
  
  val radiusY: Double
  
  val rotationAngle: Double
  
  val screenX: Double
  
  val screenY: Double
  
  val target: EventTarget
  
  val touchType: TouchType
}
object Touch {
  
  inline def apply(
    altitudeAngle: Double,
    azimuthAngle: Double,
    clientX: Double,
    clientY: Double,
    force: Double,
    identifier: Double,
    pageX: Double,
    pageY: Double,
    radiusX: Double,
    radiusY: Double,
    rotationAngle: Double,
    screenX: Double,
    screenY: Double,
    target: EventTarget,
    touchType: TouchType
  ): Touch = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], azimuthAngle = azimuthAngle.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], touchType = touchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  
  extension [Self <: Touch](x: Self) {
    
    inline def setAltitudeAngle(value: Double): Self = StObject.set(x, "altitudeAngle", value.asInstanceOf[js.Any])
    
    inline def setAzimuthAngle(value: Double): Self = StObject.set(x, "azimuthAngle", value.asInstanceOf[js.Any])
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTouchType(value: TouchType): Self = StObject.set(x, "touchType", value.asInstanceOf[js.Any])
  }
}
