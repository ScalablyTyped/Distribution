package typings.reactMdAutocomplete.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@react-md/transition.@react-md/transition.TransitionHooks> */
@js.native
trait RequiredTransitionHooks extends js.Object {
  var onEnter: js.Any = js.native
  var onEntered: js.Any = js.native
  var onEntering: js.Any = js.native
  var onExited: js.Any = js.native
}

object RequiredTransitionHooks {
  @scala.inline
  def apply(onEnter: js.Any, onEntered: js.Any, onEntering: js.Any, onExited: js.Any): RequiredTransitionHooks = {
    val __obj = js.Dynamic.literal(onEnter = onEnter.asInstanceOf[js.Any], onEntered = onEntered.asInstanceOf[js.Any], onEntering = onEntering.asInstanceOf[js.Any], onExited = onExited.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTransitionHooks]
  }
  @scala.inline
  implicit class RequiredTransitionHooksOps[Self <: RequiredTransitionHooks] (val x: Self) extends AnyVal {
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
    def setOnEnter(value: js.Any): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEntered(value: js.Any): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEntering(value: js.Any): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnExited(value: js.Any): Self = this.set("onExited", value.asInstanceOf[js.Any])
  }
  
}

