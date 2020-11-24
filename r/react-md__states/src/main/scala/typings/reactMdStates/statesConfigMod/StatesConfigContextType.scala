package typings.reactMdStates.statesConfigMod

import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatesConfigContextType extends js.Object {
  
  /**
    * Boolean if the ripple component should not be triggered after a
    * "programmatic" ripple effect. This would be if  the `.click()` function is
    * called on an element through javascript or some other means.
    */
  var disableProgrammaticRipple: Boolean = js.native
  
  /**
    * Boolean if the ripple effect should be disabled for all child components
    * that use the Ripple states.
    */
  var disableRipple: Boolean = js.native
  
  /**
    * The class names to apply during the different stages for the ripple
    * animation.  You probably don't want to use this.
    */
  var rippleClassNames: CSSTransitionClassNames = js.native
  
  /**
    * The amount of time before a ripple finishes its animation. You probably
    * don't want to change this value unless you updated the duration in scss or
    * changed the different class names for the ripple animation.
    */
  var rippleTimeout: TransitionTimeout = js.native
}
object StatesConfigContextType {
  
  @scala.inline
  def apply(
    disableProgrammaticRipple: Boolean,
    disableRipple: Boolean,
    rippleClassNames: CSSTransitionClassNames,
    rippleTimeout: TransitionTimeout
  ): StatesConfigContextType = {
    val __obj = js.Dynamic.literal(disableProgrammaticRipple = disableProgrammaticRipple.asInstanceOf[js.Any], disableRipple = disableRipple.asInstanceOf[js.Any], rippleClassNames = rippleClassNames.asInstanceOf[js.Any], rippleTimeout = rippleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatesConfigContextType]
  }
  
  @scala.inline
  implicit class StatesConfigContextTypeOps[Self <: StatesConfigContextType] (val x: Self) extends AnyVal {
    
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
    def setDisableProgrammaticRipple(value: Boolean): Self = this.set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRipple(value: Boolean): Self = this.set("disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleClassNames(value: CSSTransitionClassNames): Self = this.set("rippleClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleTimeout(value: TransitionTimeout): Self = this.set("rippleTimeout", value.asInstanceOf[js.Any])
  }
}
