package typings.semanticUiReact.transitionTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPropDuration extends js.Object {
  var hide: Double = js.native
  var show: Double = js.native
}

object TransitionPropDuration {
  @scala.inline
  def apply(hide: Double, show: Double): TransitionPropDuration = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionPropDuration]
  }
  @scala.inline
  implicit class TransitionPropDurationOps[Self <: TransitionPropDuration] (val x: Self) extends AnyVal {
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
    def setHide(value: Double): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Double): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

