package typings.reactMdStates.statesConfigMod

import typings.react.mod.ReactNode
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@react-md/states.@react-md/states/types/StatesConfig.StatesConfigContextType> */
@js.native
trait StatesConfigProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
  var disableRipple: js.UndefOr[Boolean] = js.native
  var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.native
  var rippleTimeout: js.UndefOr[TransitionTimeout] = js.native
}

object StatesConfigProps {
  @scala.inline
  def apply(): StatesConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatesConfigProps]
  }
  @scala.inline
  implicit class StatesConfigPropsOps[Self <: StatesConfigProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisableProgrammaticRipple(value: Boolean): Self = this.set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableProgrammaticRipple: Self = this.set("disableProgrammaticRipple", js.undefined)
    @scala.inline
    def setDisableRipple(value: Boolean): Self = this.set("disableRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRipple: Self = this.set("disableRipple", js.undefined)
    @scala.inline
    def setRippleClassNames(value: CSSTransitionClassNames): Self = this.set("rippleClassNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleClassNames: Self = this.set("rippleClassNames", js.undefined)
    @scala.inline
    def setRippleTimeout(value: TransitionTimeout): Self = this.set("rippleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleTimeout: Self = this.set("rippleTimeout", js.undefined)
  }
  
}

