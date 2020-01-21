package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeTouchEvent extends js.Object {
  /**
    * Array of all touch events that have changed since the last event
    */
  var changedTouches: js.Array[NativeTouchEvent]
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
}

