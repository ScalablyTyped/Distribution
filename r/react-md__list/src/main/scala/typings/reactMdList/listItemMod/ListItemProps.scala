package typings.reactMdList.listItemMod

import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactMdStates.useInteractionStatesMod.InteractionStatesOptions because var conflicts: className, disabled. Inlined disableEnterClick, disablePressedFallback, disableProgrammaticRipple, disableRipple, disableSpacebarClick, enablePressedAndRipple, handlers, rippleClassName, rippleClassNames, rippleContainerClassName, rippleTimeout */ @js.native
trait ListItemProps extends SimpleListItemProps {
  
  /**
    * Boolean if the enter keyboard click polyfill should be completely disabled.
    * This is generally used if the keyboard functionality is already built-in to
    * the element like buttons or labels.
    */
  var disableEnterClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the component should fallback to using the custom pressed class
    * names when ripples are disabled.
    *
    * @default false
    */
  var disablePressedFallback: js.UndefOr[Boolean] = js.native
  
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
    * Boolean if the spacebar should not trigger a click event when using the
    * user pressed spacebar on a focusable element. You _normally_ want the
    * spacebar to also trigger a click event , but there are a few cases where it
    * should not (like custom links).
    *
    * When this is disabled, it will also make sure that the ripple and pressed
    * effects are not triggered from a spacebar click.
    *
    * @default false
    */
  var disableSpacebarClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the element should be able to gain both the ripple effect and
    * the pressed states changes. This will only be enabled if both the
    * `disableRipple` and `disabledPressedFallback` are still `false`
    */
  var enablePressedAndRipple: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional object of event handlers to merge with the required
    * ripple trigger event handlers.
    */
  var handlers: js.UndefOr[MergableRippleHandlers[HTMLLIElement]] = js.native
  
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
object ListItemProps {
  
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
    
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
    def setDisableEnterClick(value: Boolean): Self = this.set("disableEnterClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEnterClick: Self = this.set("disableEnterClick", js.undefined)
    
    @scala.inline
    def setDisablePressedFallback(value: Boolean): Self = this.set("disablePressedFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePressedFallback: Self = this.set("disablePressedFallback", js.undefined)
    
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
    def setEnablePressedAndRipple(value: Boolean): Self = this.set("enablePressedAndRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePressedAndRipple: Self = this.set("enablePressedAndRipple", js.undefined)
    
    @scala.inline
    def setHandlers(value: MergableRippleHandlers[HTMLLIElement]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
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
