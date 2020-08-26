package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleXTransform extends js.Object {
  var scaleX: Double = js.native
}

object ScaleXTransform {
  @scala.inline
  def apply(scaleX: Double): ScaleXTransform = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleXTransform]
  }
  @scala.inline
  implicit class ScaleXTransformOps[Self <: ScaleXTransform] (val x: Self) extends AnyVal {
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
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
  }
  
}

