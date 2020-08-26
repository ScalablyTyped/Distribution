package typings.reactNativeSortableList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animated extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var dx: js.UndefOr[Double] = js.native
  var dy: js.UndefOr[Double] = js.native
}

object Animated {
  @scala.inline
  def apply(): Animated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animated]
  }
  @scala.inline
  implicit class AnimatedOps[Self <: Animated] (val x: Self) extends AnyVal {
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
  }
  
}

