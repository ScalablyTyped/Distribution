package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableCallbackArgument extends DraggableStyle {
  var dx: Double = js.native
  var dy: Double = js.native
}

object DraggableCallbackArgument {
  @scala.inline
  def apply(dx: Double, dy: Double): DraggableCallbackArgument = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableCallbackArgument]
  }
  @scala.inline
  implicit class DraggableCallbackArgumentOps[Self <: DraggableCallbackArgument] (val x: Self) extends AnyVal {
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
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
  }
  
}

