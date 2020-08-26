package typings.reactMdStates.rippleContainerMod

import typings.reactMdStates.typesMod.RippleState
import typings.reactMdStates.typesMod.RipplesState
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RippleContainerProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var classNames: js.UndefOr[CSSTransitionClassNames] = js.native
  var rippleClassName: js.UndefOr[String] = js.native
  var ripples: RipplesState = js.native
  var timeout: js.UndefOr[TransitionTimeout] = js.native
  def entered(ripple: RippleState): Unit = js.native
  def exited(ripple: RippleState): Unit = js.native
}

object RippleContainerProps {
  @scala.inline
  def apply(entered: RippleState => Unit, exited: RippleState => Unit, ripples: RipplesState): RippleContainerProps = {
    val __obj = js.Dynamic.literal(entered = js.Any.fromFunction1(entered), exited = js.Any.fromFunction1(exited), ripples = ripples.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleContainerProps]
  }
  @scala.inline
  implicit class RippleContainerPropsOps[Self <: RippleContainerProps] (val x: Self) extends AnyVal {
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
    def setEntered(value: RippleState => Unit): Self = this.set("entered", js.Any.fromFunction1(value))
    @scala.inline
    def setExited(value: RippleState => Unit): Self = this.set("exited", js.Any.fromFunction1(value))
    @scala.inline
    def setRipplesVarargs(value: RippleState*): Self = this.set("ripples", js.Array(value :_*))
    @scala.inline
    def setRipples(value: RipplesState): Self = this.set("ripples", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClassNames(value: CSSTransitionClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setRippleClassName(value: String): Self = this.set("rippleClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleClassName: Self = this.set("rippleClassName", js.undefined)
    @scala.inline
    def setTimeout(value: TransitionTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

