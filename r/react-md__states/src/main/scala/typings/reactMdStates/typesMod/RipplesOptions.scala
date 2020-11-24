package typings.reactMdStates.typesMod

import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RipplesOptions[E /* <: HTMLElement */] extends js.Object {
  
  /**
    * Boolean if the ripple effect should not occur after a programmatic trigger
    * of a click event. This would normally happen if using `aria-activedescendat`
    * movement and the user "presses" the current active element.
    */
  var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the ripple effeect should be disabled. This will make the `useRipples`
    * hook not provide any additional logic for the provided handlers.
    */
  var disableRipple: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the spacebar click effect should be disabled. This should normally
    * state disabled unless dealing with links.
    */
  var disableSpacebarClick: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional boolean if the element is currently disabled. This will ensure
    * that the ripple states are not applied during these times.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional object of event handlers to merge with the required
    * ripple trigger event handlers.
    */
  var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.native
  
  /**
    * An optional className to apply to the ripple element.
    */
  var rippleClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional object containing the different transition class names for the ripple
    * effect. If this is undefined, it will be extracted from the current `StatesContext`
    * instead.
    */
  var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.native
  
  /**
    * An optional className to apply to the ripple's container element.
    */
  var rippleContainerClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional timeout duration for the ripple effect. If this is undefined, its value
    * will be extracted from the current `StatesContext` instead.
    */
  var rippleTimeout: js.UndefOr[TransitionTimeout] = js.native
}
object RipplesOptions {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): RipplesOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RipplesOptions[E]]
  }
  
  @scala.inline
  implicit class RipplesOptionsOps[Self <: RipplesOptions[_], E /* <: HTMLElement */] (val x: Self with RipplesOptions[E]) extends AnyVal {
    
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
    def deleteDisableProgrammaticRipple: Self = this.set("disableProgrammaticRipple", js.undefined)
    
    @scala.inline
    def setDisableRipple(value: Boolean): Self = this.set("disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRipple: Self = this.set("disableRipple", js.undefined)
    
    @scala.inline
    def setDisableSpacebarClick(value: Boolean): Self = this.set("disableSpacebarClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSpacebarClick: Self = this.set("disableSpacebarClick", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHandlers(value: MergableRippleHandlers[E]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setRippleClassName(value: String): Self = this.set("rippleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleClassName: Self = this.set("rippleClassName", js.undefined)
    
    @scala.inline
    def setRippleClassNames(value: CSSTransitionClassNames): Self = this.set("rippleClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleClassNames: Self = this.set("rippleClassNames", js.undefined)
    
    @scala.inline
    def setRippleContainerClassName(value: String): Self = this.set("rippleContainerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleContainerClassName: Self = this.set("rippleContainerClassName", js.undefined)
    
    @scala.inline
    def setRippleTimeout(value: TransitionTimeout): Self = this.set("rippleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleTimeout: Self = this.set("rippleTimeout", js.undefined)
  }
}
