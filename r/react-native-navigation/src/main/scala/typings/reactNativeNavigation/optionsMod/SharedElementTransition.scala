package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedElementTransition extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var fromId: String = js.native
  var interpolation: js.UndefOr[Interpolation] = js.native
  var toId: String = js.native
}

object SharedElementTransition {
  @scala.inline
  def apply(fromId: String, toId: String): SharedElementTransition = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedElementTransition]
  }
  @scala.inline
  implicit class SharedElementTransitionOps[Self <: SharedElementTransition] (val x: Self) extends AnyVal {
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
    def setFromId(value: String): Self = this.set("fromId", value.asInstanceOf[js.Any])
    @scala.inline
    def setToId(value: String): Self = this.set("toId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setInterpolation(value: Interpolation): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
  }
  
}

