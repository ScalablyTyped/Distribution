package typings.reactNativeImageGallery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureState extends js.Object {
  
  var _accountsForMovesUpTo: Double = js.native
  
  var _singleTabFailed: js.UndefOr[Boolean] = js.native
  
  var doubleTapUp: Boolean = js.native
  
  var dx: Double = js.native
  
  var dy: Double = js.native
  
  var moveX: Double = js.native
  
  var moveY: Double = js.native
  
  var numberActiveTouches: Double = js.native
  
  var pinch: js.UndefOr[Double] = js.native
  
  var previousMoveX: Double = js.native
  
  var previousMoveY: Double = js.native
  
  var previousPinch: js.UndefOr[Double] = js.native
  
  var singleTapUp: Boolean = js.native
  
  var vx: Double = js.native
  
  var vy: Double = js.native
  
  var x0: Double = js.native
  
  var y0: Double = js.native
}
object GestureState {
  
  @scala.inline
  def apply(
    _accountsForMovesUpTo: Double,
    doubleTapUp: Boolean,
    dx: Double,
    dy: Double,
    moveX: Double,
    moveY: Double,
    numberActiveTouches: Double,
    previousMoveX: Double,
    previousMoveY: Double,
    singleTapUp: Boolean,
    vx: Double,
    vy: Double,
    x0: Double,
    y0: Double
  ): GestureState = {
    val __obj = js.Dynamic.literal(_accountsForMovesUpTo = _accountsForMovesUpTo.asInstanceOf[js.Any], doubleTapUp = doubleTapUp.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], moveX = moveX.asInstanceOf[js.Any], moveY = moveY.asInstanceOf[js.Any], numberActiveTouches = numberActiveTouches.asInstanceOf[js.Any], previousMoveX = previousMoveX.asInstanceOf[js.Any], previousMoveY = previousMoveY.asInstanceOf[js.Any], singleTapUp = singleTapUp.asInstanceOf[js.Any], vx = vx.asInstanceOf[js.Any], vy = vy.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureState]
  }
  
  @scala.inline
  implicit class GestureStateOps[Self <: GestureState] (val x: Self) extends AnyVal {
    
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
    def setDoubleTapUp(value: Boolean): Self = this.set("doubleTapUp", value.asInstanceOf[js.Any])
    
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
    def setPreviousMoveX(value: Double): Self = this.set("previousMoveX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousMoveY(value: Double): Self = this.set("previousMoveY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleTapUp(value: Boolean): Self = this.set("singleTapUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVx(value: Double): Self = this.set("vx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVy(value: Double): Self = this.set("vy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_singleTabFailed(value: Boolean): Self = this.set("_singleTabFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_singleTabFailed: Self = this.set("_singleTabFailed", js.undefined)
    
    @scala.inline
    def setPinch(value: Double): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinch: Self = this.set("pinch", js.undefined)
    
    @scala.inline
    def setPreviousPinch(value: Double): Self = this.set("previousPinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPinch: Self = this.set("previousPinch", js.undefined)
  }
}
