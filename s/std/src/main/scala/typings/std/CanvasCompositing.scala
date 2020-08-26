package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasCompositing extends js.Object {
  var globalAlpha: Double = js.native
  var globalCompositeOperation: java.lang.String = js.native
}

object CanvasCompositing {
  @scala.inline
  def apply(globalAlpha: Double, globalCompositeOperation: java.lang.String): CanvasCompositing = {
    val __obj = js.Dynamic.literal(globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCompositing]
  }
  @scala.inline
  implicit class CanvasCompositingOps[Self <: CanvasCompositing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalAlpha(value: Double): Self = this.set("globalAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalCompositeOperation(value: java.lang.String): Self = this.set("globalCompositeOperation", value.asInstanceOf[js.Any])
  }
  
}

