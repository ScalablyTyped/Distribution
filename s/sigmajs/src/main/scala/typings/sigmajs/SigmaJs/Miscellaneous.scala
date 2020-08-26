package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Miscellaneous extends js.Object {
  var animation: Animation = js.native
}

object Miscellaneous {
  @scala.inline
  def apply(animation: Animation): Miscellaneous = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Miscellaneous]
  }
  @scala.inline
  implicit class MiscellaneousOps[Self <: Miscellaneous] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
  }
  
}

