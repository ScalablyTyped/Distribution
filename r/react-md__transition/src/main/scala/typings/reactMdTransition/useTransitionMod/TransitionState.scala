package typings.reactMdTransition.useTransitionMod

import typings.reactMdTransition.constantsMod.TransitionStage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionState extends js.Object {
  /**
    * Boolean if the transition is in the initial mounting/appearing stage while
    * entering. This will be `false` if the `appear` option is `false` and
    * automatically set to `false` after the first transition if `appear` was
    * `true`.
    */
  var appearing: Boolean = js.native
  /**
    * Boolean if the component should be rendered in the DOM. This will always be
    * `true` if the `temporary` option is omitted or `false`. Otherwise, it will
    * be `true` during the transitions and entered.
    */
  var rendered: Boolean = js.native
  /**
    * The current stage for the transition. This probably won't be used too much
    * unless you want to apply custom classnames based on the stage.
    */
  var stage: TransitionStage = js.native
}

object TransitionState {
  @scala.inline
  def apply(appearing: Boolean, rendered: Boolean, stage: TransitionStage): TransitionState = {
    val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionState]
  }
  @scala.inline
  implicit class TransitionStateOps[Self <: TransitionState] (val x: Self) extends AnyVal {
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
    def setAppearing(value: Boolean): Self = this.set("appearing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendered(value: Boolean): Self = this.set("rendered", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: TransitionStage): Self = this.set("stage", value.asInstanceOf[js.Any])
  }
  
}

