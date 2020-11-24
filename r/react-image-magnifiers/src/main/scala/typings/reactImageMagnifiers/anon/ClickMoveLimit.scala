package typings.reactImageMagnifiers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickMoveLimit extends js.Object {
  
  var clickMoveLimit: js.UndefOr[Double] = js.native
  
  var doubleTapDurationInMs: js.UndefOr[Double] = js.native
  
  var longTouchDurationInMs: js.UndefOr[Double] = js.native
  
  var longTouchMoveLimit: js.UndefOr[Double] = js.native
  
  var tapDurationInMs: js.UndefOr[Double] = js.native
}
object ClickMoveLimit {
  
  @scala.inline
  def apply(): ClickMoveLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickMoveLimit]
  }
  
  @scala.inline
  implicit class ClickMoveLimitOps[Self <: ClickMoveLimit] (val x: Self) extends AnyVal {
    
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
    def setClickMoveLimit(value: Double): Self = this.set("clickMoveLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickMoveLimit: Self = this.set("clickMoveLimit", js.undefined)
    
    @scala.inline
    def setDoubleTapDurationInMs(value: Double): Self = this.set("doubleTapDurationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleTapDurationInMs: Self = this.set("doubleTapDurationInMs", js.undefined)
    
    @scala.inline
    def setLongTouchDurationInMs(value: Double): Self = this.set("longTouchDurationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongTouchDurationInMs: Self = this.set("longTouchDurationInMs", js.undefined)
    
    @scala.inline
    def setLongTouchMoveLimit(value: Double): Self = this.set("longTouchMoveLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongTouchMoveLimit: Self = this.set("longTouchMoveLimit", js.undefined)
    
    @scala.inline
    def setTapDurationInMs(value: Double): Self = this.set("tapDurationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapDurationInMs: Self = this.set("tapDurationInMs", js.undefined)
  }
}
