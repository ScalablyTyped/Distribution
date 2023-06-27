package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch)
  */
trait Touch extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientX) */
  /* standard dom */
  val clientX: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientY) */
  /* standard dom */
  val clientY: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/force) */
  /* standard dom */
  val force: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/identifier) */
  /* standard dom */
  val identifier: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageX) */
  /* standard dom */
  val pageX: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageY) */
  /* standard dom */
  val pageY: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusX) */
  /* standard dom */
  val radiusX: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusY) */
  /* standard dom */
  val radiusY: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/rotationAngle) */
  /* standard dom */
  val rotationAngle: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenX) */
  /* standard dom */
  val screenX: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenY) */
  /* standard dom */
  val screenY: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/target) */
  /* standard dom */
  val target: EventTarget
}
object Touch {
  
  inline def apply(
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
    target: EventTarget
  ): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Touch] (val x: Self) extends AnyVal {
    
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
  }
}
