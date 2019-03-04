package typings
package reactDashNativeLib.reactDashNativeMod

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
  var identifier: java.lang.String
  /**
    * The X position of the touch, relative to the element
    */
  var locationX: scala.Double
  /**
    * The Y position of the touch, relative to the element
    */
  var locationY: scala.Double
  /**
    * The X position of the touch, relative to the screen
    */
  var pageX: scala.Double
  /**
    * The Y position of the touch, relative to the screen
    */
  var pageY: scala.Double
  /**
    * The node id of the element receiving the touch event
    */
  var target: java.lang.String
  /**
    * A time identifier for the touch, useful for velocity calculation
    */
  var timestamp: scala.Double
  /**
    * Array of all current touches on the screen
    */
  var touches: js.Array[NativeTouchEvent]
}

object NativeTouchEvent {
  @scala.inline
  def apply(
    changedTouches: js.Array[NativeTouchEvent],
    identifier: java.lang.String,
    locationX: scala.Double,
    locationY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    target: java.lang.String,
    timestamp: scala.Double,
    touches: js.Array[NativeTouchEvent]
  ): NativeTouchEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, identifier = identifier, locationX = locationX, locationY = locationY, pageX = pageX, pageY = pageY, target = target, timestamp = timestamp, touches = touches)
  
    __obj.asInstanceOf[NativeTouchEvent]
  }
}

