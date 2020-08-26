package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationParam extends js.Object {
  var damping: js.UndefOr[Double] = js.native
  var nonAnimatedProps: js.UndefOr[js.Array[String]] = js.native
  var stiffness: js.UndefOr[Double] = js.native
}

object AnimationParam {
  @scala.inline
  def apply(): AnimationParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationParam]
  }
  @scala.inline
  implicit class AnimationParamOps[Self <: AnimationParam] (val x: Self) extends AnyVal {
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
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    @scala.inline
    def setNonAnimatedPropsVarargs(value: String*): Self = this.set("nonAnimatedProps", js.Array(value :_*))
    @scala.inline
    def setNonAnimatedProps(value: js.Array[String]): Self = this.set("nonAnimatedProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonAnimatedProps: Self = this.set("nonAnimatedProps", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
  }
  
}

