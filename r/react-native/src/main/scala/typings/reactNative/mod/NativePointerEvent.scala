package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativePointerEvent
  extends StObject
     with NativeMouseEvent {
  
  /**
    * The height (magnitude on the Y axis), in CSS pixels, of the contact geometry of the pointer.
    */
  val height: Double
  
  /**
    * Indicates if the pointer represents the primary pointer of this pointer type.
    */
  val isPrimary: Boolean
  
  /**
    * A unique identifier for the pointer causing the event.
    */
  val pointerId: Double
  
  /**
    * Indicates the device type that caused the event (mouse, pen, touch, etc.)
    */
  val pointerType: String
  
  /**
    * The normalized pressure of the pointer input in the range 0 to 1, where 0 and 1 represent
    * the minimum and maximum pressure the hardware is capable of detecting, respectively.
    */
  val pressure: Double
  
  /**
    * The normalized tangential pressure of the pointer input (also known as barrel pressure or
    * cylinder stress) in the range -1 to 1, where 0 is the neutral position of the control.
    */
  val tangentialPressure: Double
  
  /**
    * The plane angle (in degrees, in the range of -90 to 90) between the Y–Z plane and the plane
    * containing both the pointer (e.g. pen stylus) axis and the Y axis.
    */
  val tiltX: Double
  
  /**
    * The plane angle (in degrees, in the range of -90 to 90) between the X–Z plane and the plane
    * containing both the pointer (e.g. pen stylus) axis and the X axis.
    */
  val tiltY: Double
  
  /**
    * The clockwise rotation of the pointer (e.g. pen stylus) around its major axis in degrees,
    * with a value in the range 0 to 359.
    */
  val twist: Double
  
  /**
    * The width (magnitude on the X axis), in CSS pixels, of the contact geometry of the pointer
    */
  val width: Double
}
object NativePointerEvent {
  
  inline def apply(
    altKey: Boolean,
    button: Double,
    buttons: Double,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    detail: Double,
    height: Double,
    isPrimary: Boolean,
    metaKey: Boolean,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    pointerId: Double,
    pointerType: String,
    pressure: Double,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    tangentialPressure: Double,
    tiltX: Double,
    tiltY: Double,
    twist: Double,
    width: Double,
    x: Double,
    y: Double
  ): NativePointerEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], tangentialPressure = tangentialPressure.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], relatedTarget = null)
    __obj.asInstanceOf[NativePointerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativePointerEvent] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    inline def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
    
    inline def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    inline def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    inline def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
