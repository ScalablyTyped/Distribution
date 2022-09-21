package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchInit extends StObject {
  
  /* standard dom */
  var altitudeAngle: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var azimuthAngle: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var clientX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var clientY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var force: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var identifier: Double
  
  /* standard dom */
  var pageX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var pageY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var radiusX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var radiusY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var screenX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var screenY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var target: EventTarget
  
  /* standard dom */
  var touchType: js.UndefOr[TouchType] = js.undefined
}
object TouchInit {
  
  inline def apply(identifier: Double, target: EventTarget): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInit]
  }
  
  extension [Self <: TouchInit](x: Self) {
    
    inline def setAltitudeAngle(value: Double): Self = StObject.set(x, "altitudeAngle", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAngleUndefined: Self = StObject.set(x, "altitudeAngle", js.undefined)
    
    inline def setAzimuthAngle(value: Double): Self = StObject.set(x, "azimuthAngle", value.asInstanceOf[js.Any])
    
    inline def setAzimuthAngleUndefined: Self = StObject.set(x, "azimuthAngle", js.undefined)
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
    
    inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
    
    inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    inline def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
    
    inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    inline def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTouchType(value: TouchType): Self = StObject.set(x, "touchType", value.asInstanceOf[js.Any])
    
    inline def setTouchTypeUndefined: Self = StObject.set(x, "touchType", js.undefined)
  }
}
