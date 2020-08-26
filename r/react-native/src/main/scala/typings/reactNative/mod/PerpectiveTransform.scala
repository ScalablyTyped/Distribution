package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerpectiveTransform extends js.Object {
  var perspective: Double = js.native
}

object PerpectiveTransform {
  @scala.inline
  def apply(perspective: Double): PerpectiveTransform = {
    val __obj = js.Dynamic.literal(perspective = perspective.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpectiveTransform]
  }
  @scala.inline
  implicit class PerpectiveTransformOps[Self <: PerpectiveTransform] (val x: Self) extends AnyVal {
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
    def setPerspective(value: Double): Self = this.set("perspective", value.asInstanceOf[js.Any])
  }
  
}

