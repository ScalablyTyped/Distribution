package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanResponderGestureState extends js.Object {
  
  // All `gestureState` accounts for timeStamps up until:
  var _accountsForMovesUpTo: Double = js.native
  
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dx: Double = js.native
  
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dy: Double = js.native
  
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveX: Double = js.native
  
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveY: Double = js.native
  
  /**
    * Number of touches currently on screen
    */
  var numberActiveTouches: Double = js.native
  
  /**
    *  ID of the gestureState- persisted as long as there at least one touch on
    */
  var stateID: Double = js.native
  
  /**
    * current velocity of the gesture
    */
  var vx: Double = js.native
  
  /**
    * current velocity of the gesture
    */
  var vy: Double = js.native
  
  /**
    * the screen coordinates of the responder grant
    */
  var x0: Double = js.native
  
  /**
    * the screen coordinates of the responder grant
    */
  var y0: Double = js.native
}
object PanResponderGestureState {
  
  @scala.inline
  def apply(
    _accountsForMovesUpTo: Double,
    dx: Double,
    dy: Double,
    moveX: Double,
    moveY: Double,
    numberActiveTouches: Double,
    stateID: Double,
    vx: Double,
    vy: Double,
    x0: Double,
    y0: Double
  ): PanResponderGestureState = {
    val __obj = js.Dynamic.literal(_accountsForMovesUpTo = _accountsForMovesUpTo.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], moveX = moveX.asInstanceOf[js.Any], moveY = moveY.asInstanceOf[js.Any], numberActiveTouches = numberActiveTouches.asInstanceOf[js.Any], stateID = stateID.asInstanceOf[js.Any], vx = vx.asInstanceOf[js.Any], vy = vy.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanResponderGestureState]
  }
  
  @scala.inline
  implicit class PanResponderGestureStateOps[Self <: PanResponderGestureState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_accountsForMovesUpTo(value: Double): Self = this.set("_accountsForMovesUpTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveX(value: Double): Self = this.set("moveX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveY(value: Double): Self = this.set("moveY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberActiveTouches(value: Double): Self = this.set("numberActiveTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateID(value: Double): Self = this.set("stateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVx(value: Double): Self = this.set("vx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVy(value: Double): Self = this.set("vy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
  }
}
