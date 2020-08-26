package typings.reactNativeSwipeGestures.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureRecognizerConfig extends js.Object {
  /**
    * Absolute offset that shouldn't be breached for swipe to be triggered (dy for horizontal swipe, dx for vertical swipe)
    * @default 80
    */
  var directionalOffsetThreshold: js.UndefOr[Double] = js.native
  /**
    * Absolute distance that should be breached for the gesture to not be considered a click (dx or dy properties of gestureState)
    * @default 5
    */
  var gestureIsClickThreshold: js.UndefOr[Double] = js.native
  /**
    * Velocity that has to be breached in order for swipe to be triggered (vx and vy properties of gestureState)
    * @default 0.3
    */
  var velocityThreshold: js.UndefOr[Double] = js.native
}

object GestureRecognizerConfig {
  @scala.inline
  def apply(): GestureRecognizerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureRecognizerConfig]
  }
  @scala.inline
  implicit class GestureRecognizerConfigOps[Self <: GestureRecognizerConfig] (val x: Self) extends AnyVal {
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
    def setDirectionalOffsetThreshold(value: Double): Self = this.set("directionalOffsetThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionalOffsetThreshold: Self = this.set("directionalOffsetThreshold", js.undefined)
    @scala.inline
    def setGestureIsClickThreshold(value: Double): Self = this.set("gestureIsClickThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureIsClickThreshold: Self = this.set("gestureIsClickThreshold", js.undefined)
    @scala.inline
    def setVelocityThreshold(value: Double): Self = this.set("velocityThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocityThreshold: Self = this.set("velocityThreshold", js.undefined)
  }
  
}

