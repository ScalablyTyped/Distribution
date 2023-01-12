package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeTouchEvent extends StObject {
  
  /**
    * Array of all touch events that have changed since the last event
    */
  var changedTouches: js.Array[NativeTouchEvent]
  
  /**
    * 3D Touch reported force
    * @platform ios
    */
  var force: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the touch
    */
  var identifier: String
  
  /**
    * The X position of the touch, relative to the element
    */
  var locationX: Double
  
  /**
    * The Y position of the touch, relative to the element
    */
  var locationY: Double
  
  /**
    * The X position of the touch, relative to the screen
    */
  var pageX: Double
  
  /**
    * The Y position of the touch, relative to the screen
    */
  var pageY: Double
  
  /**
    * The node id of the element receiving the touch event
    */
  var target: String
  
  /**
    * A time identifier for the touch, useful for velocity calculation
    */
  var timestamp: Double
  
  /**
    * Array of all current touches on the screen
    */
  var touches: js.Array[NativeTouchEvent]
}
object NativeTouchEvent {
  
  inline def apply(
    changedTouches: js.Array[NativeTouchEvent],
    identifier: String,
    locationX: Double,
    locationY: Double,
    pageX: Double,
    pageY: Double,
    target: String,
    timestamp: Double,
    touches: js.Array[NativeTouchEvent]
  ): NativeTouchEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], locationX = locationX.asInstanceOf[js.Any], locationY = locationY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeTouchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeTouchEvent] (val x: Self) extends AnyVal {
    
    inline def setChangedTouches(value: js.Array[NativeTouchEvent]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    inline def setChangedTouchesVarargs(value: NativeTouchEvent*): Self = StObject.set(x, "changedTouches", js.Array(value*))
    
    inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
    
    inline def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTouches(value: js.Array[NativeTouchEvent]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    inline def setTouchesVarargs(value: NativeTouchEvent*): Self = StObject.set(x, "touches", js.Array(value*))
  }
}
