package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeTouchEvent extends StObject {
  
  /**
    * Array of all touch events that have changed since the last event
    */
  var changedTouches: js.Array[NativeTouchEvent] = js.native
  
  /**
    * The ID of the touch
    */
  var identifier: String = js.native
  
  /**
    * The X position of the touch, relative to the element
    */
  var locationX: Double = js.native
  
  /**
    * The Y position of the touch, relative to the element
    */
  var locationY: Double = js.native
  
  /**
    * The X position of the touch, relative to the screen
    */
  var pageX: Double = js.native
  
  /**
    * The Y position of the touch, relative to the screen
    */
  var pageY: Double = js.native
  
  /**
    * The node id of the element receiving the touch event
    */
  var target: String = js.native
  
  /**
    * A time identifier for the touch, useful for velocity calculation
    */
  var timestamp: Double = js.native
  
  /**
    * Array of all current touches on the screen
    */
  var touches: js.Array[NativeTouchEvent] = js.native
}
object NativeTouchEvent {
  
  @scala.inline
  def apply(
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
  implicit class NativeTouchEventMutableBuilder[Self <: NativeTouchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedTouches(value: js.Array[NativeTouchEvent]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedTouchesVarargs(value: NativeTouchEvent*): Self = StObject.set(x, "changedTouches", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouches(value: js.Array[NativeTouchEvent]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesVarargs(value: NativeTouchEvent*): Self = StObject.set(x, "touches", js.Array(value :_*))
  }
}
