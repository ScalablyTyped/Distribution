package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanResponderGestureState extends js.Object {
  // All `gestureState` accounts for timeStamps up until:
  var _accountsForMovesUpTo: scala.Double
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dx: scala.Double
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dy: scala.Double
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveX: scala.Double
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveY: scala.Double
  /**
    * Number of touches currently on screen
    */
  var numberActiveTouches: scala.Double
  /**
    *  ID of the gestureState- persisted as long as there at least one touch on
    */
  var stateID: scala.Double
  /**
    * current velocity of the gesture
    */
  var vx: scala.Double
  /**
    * current velocity of the gesture
    */
  var vy: scala.Double
  /**
    * the screen coordinates of the responder grant
    */
  var x0: scala.Double
  /**
    * the screen coordinates of the responder grant
    */
  var y0: scala.Double
}

object PanResponderGestureState {
  @scala.inline
  def apply(
    _accountsForMovesUpTo: scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    moveX: scala.Double,
    moveY: scala.Double,
    numberActiveTouches: scala.Double,
    stateID: scala.Double,
    vx: scala.Double,
    vy: scala.Double,
    x0: scala.Double,
    y0: scala.Double
  ): PanResponderGestureState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_accountsForMovesUpTo")(_accountsForMovesUpTo)
    __obj.updateDynamic("dx")(dx)
    __obj.updateDynamic("dy")(dy)
    __obj.updateDynamic("moveX")(moveX)
    __obj.updateDynamic("moveY")(moveY)
    __obj.updateDynamic("numberActiveTouches")(numberActiveTouches)
    __obj.updateDynamic("stateID")(stateID)
    __obj.updateDynamic("vx")(vx)
    __obj.updateDynamic("vy")(vy)
    __obj.updateDynamic("x0")(x0)
    __obj.updateDynamic("y0")(y0)
    __obj.asInstanceOf[PanResponderGestureState]
  }
}

