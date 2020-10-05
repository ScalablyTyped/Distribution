package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceTouchGestureHandlerEventExtra extends js.Object {
  var absoluteX: Double = js.native
  var absoluteY: Double = js.native
  var force: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ForceTouchGestureHandlerEventExtra {
  @scala.inline
  def apply(absoluteX: Double, absoluteY: Double, force: Double, x: Double, y: Double): ForceTouchGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class ForceTouchGestureHandlerEventExtraOps[Self <: ForceTouchGestureHandlerEventExtra] (val x: Self) extends AnyVal {
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
    def setAbsoluteX(value: Double): Self = this.set("absoluteX", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteY(value: Double): Self = this.set("absoluteY", value.asInstanceOf[js.Any])
    @scala.inline
    def setForce(value: Double): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

