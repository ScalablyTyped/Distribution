package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanResponderGestureState extends StObject {
  
  // All `gestureState` accounts for timeStamps up until:
  var _accountsForMovesUpTo: Double
  
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dx: Double
  
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dy: Double
  
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveX: Double
  
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveY: Double
  
  /**
    * Number of touches currently on screen
    */
  var numberActiveTouches: Double
  
  /**
    *  ID of the gestureState- persisted as long as there at least one touch on
    */
  var stateID: Double
  
  /**
    * current velocity of the gesture
    */
  var vx: Double
  
  /**
    * current velocity of the gesture
    */
  var vy: Double
  
  /**
    * the screen coordinates of the responder grant
    */
  var x0: Double
  
  /**
    * the screen coordinates of the responder grant
    */
  var y0: Double
}
object PanResponderGestureState {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PanResponderGestureState] (val x: Self) extends AnyVal {
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setMoveX(value: Double): Self = StObject.set(x, "moveX", value.asInstanceOf[js.Any])
    
    inline def setMoveY(value: Double): Self = StObject.set(x, "moveY", value.asInstanceOf[js.Any])
    
    inline def setNumberActiveTouches(value: Double): Self = StObject.set(x, "numberActiveTouches", value.asInstanceOf[js.Any])
    
    inline def setStateID(value: Double): Self = StObject.set(x, "stateID", value.asInstanceOf[js.Any])
    
    inline def setVx(value: Double): Self = StObject.set(x, "vx", value.asInstanceOf[js.Any])
    
    inline def setVy(value: Double): Self = StObject.set(x, "vy", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def set_accountsForMovesUpTo(value: Double): Self = StObject.set(x, "_accountsForMovesUpTo", value.asInstanceOf[js.Any])
  }
}
