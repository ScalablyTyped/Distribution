package typings.reactNativeModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationOut extends js.Object {
  var animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any = js.native
  var animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any = js.native
}

object AnimationOut {
  @scala.inline
  def apply(
    animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any,
    animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any
  ): AnimationOut = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOut]
  }
  @scala.inline
  implicit class AnimationOutOps[Self <: AnimationOut] (val x: Self) extends AnyVal {
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
    def setAnimationIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOut(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any): Self = this.set("animationOut", value.asInstanceOf[js.Any])
  }
  
}

