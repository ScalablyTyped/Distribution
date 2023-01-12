package typings.reactMdStates

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TouchList
import typings.reactMdStates.anon.CSSPropertiesleftnumberto
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdStates.reactMdStatesStrings.onKeyDown
    - typings.reactMdStates.reactMdStatesStrings.onKeyUp
    - typings.reactMdStates.reactMdStatesStrings.onMouseDown
    - typings.reactMdStates.reactMdStatesStrings.onMouseUp
    - typings.reactMdStates.reactMdStatesStrings.onMouseLeave
    - typings.reactMdStates.reactMdStatesStrings.onClick
    - typings.reactMdStates.reactMdStatesStrings.onTouchStart
    - typings.reactMdStates.reactMdStatesStrings.onTouchMove
    - typings.reactMdStates.reactMdStatesStrings.onTouchEnd
  */
  trait MergableRippleHandlerNames extends StObject
  object MergableRippleHandlerNames {
    
    inline def onClick: typings.reactMdStates.reactMdStatesStrings.onClick = "onClick".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onClick]
    
    inline def onKeyDown: typings.reactMdStates.reactMdStatesStrings.onKeyDown = "onKeyDown".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onKeyDown]
    
    inline def onKeyUp: typings.reactMdStates.reactMdStatesStrings.onKeyUp = "onKeyUp".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onKeyUp]
    
    inline def onMouseDown: typings.reactMdStates.reactMdStatesStrings.onMouseDown = "onMouseDown".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onMouseDown]
    
    inline def onMouseLeave: typings.reactMdStates.reactMdStatesStrings.onMouseLeave = "onMouseLeave".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onMouseLeave]
    
    inline def onMouseUp: typings.reactMdStates.reactMdStatesStrings.onMouseUp = "onMouseUp".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onMouseUp]
    
    inline def onTouchEnd: typings.reactMdStates.reactMdStatesStrings.onTouchEnd = "onTouchEnd".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onTouchEnd]
    
    inline def onTouchMove: typings.reactMdStates.reactMdStatesStrings.onTouchMove = "onTouchMove".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onTouchMove]
    
    inline def onTouchStart: typings.reactMdStates.reactMdStatesStrings.onTouchStart = "onTouchStart".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.onTouchStart]
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<E>, @react-md/states.@react-md/states/types/ripples/types.MergableRippleHandlerNames> */
  trait MergableRippleHandlers[E /* <: HTMLElement */] extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[E]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[E]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[E]] = js.undefined
  }
  object MergableRippleHandlers {
    
    inline def apply[E /* <: HTMLElement */](): MergableRippleHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergableRippleHandlers[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergableRippleHandlers[?], E /* <: HTMLElement */] (val x: Self & MergableRippleHandlers[E]) extends AnyVal {
      
      inline def setOnClick(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[E] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[E] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[E] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.MouseEvent<E, react.react.NativeMouseEvent>, 'target' | 'currentTarget' | 'type'> & std.Partial<std.Pick<react.react.MouseEvent<E, react.react.NativeMouseEvent>, 'pageX' | 'pageY' | 'button'>> & std.Partial<std.Pick<react.react.KeyboardEvent<E>, 'key'>> & std.Partial<std.Pick<react.react.TouchEvent<E>, 'touches'>> */
  trait RippleEvent[E /* <: HTMLElement */] extends StObject {
    
    var button: js.UndefOr[Double] = js.undefined
    
    var currentTarget: EventTarget & E
    
    var key: js.UndefOr[String] = js.undefined
    
    var pageX: js.UndefOr[Double] = js.undefined
    
    var pageY: js.UndefOr[Double] = js.undefined
    
    var target: EventTarget
    
    var touches: js.UndefOr[TouchList] = js.undefined
    
    var `type`: String
  }
  object RippleEvent {
    
    inline def apply[E /* <: HTMLElement */](currentTarget: EventTarget & E, target: EventTarget, `type`: String): RippleEvent[E] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleEvent[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RippleEvent[?], E /* <: HTMLElement */] (val x: Self & RippleEvent[E]) extends AnyVal {
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setCurrentTarget(value: EventTarget & E): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTouches(value: TouchList): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      inline def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RippleState extends StObject {
    
    var entered: Boolean
    
    var exiting: Boolean
    
    var holding: Boolean
    
    var startTime: Double
    
    var style: CSSPropertiesleftnumberto
    
    var `type`: RippleType
  }
  object RippleState {
    
    inline def apply(
      entered: Boolean,
      exiting: Boolean,
      holding: Boolean,
      startTime: Double,
      style: CSSPropertiesleftnumberto,
      `type`: RippleType
    ): RippleState = {
      val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], holding = holding.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RippleState] (val x: Self) extends AnyVal {
      
      inline def setEntered(value: Boolean): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
      
      inline def setExiting(value: Boolean): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
      
      inline def setHolding(value: Boolean): Self = StObject.set(x, "holding", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSPropertiesleftnumberto): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setType(value: RippleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdStates.reactMdStatesStrings.mouse
    - typings.reactMdStates.reactMdStatesStrings.touch
    - typings.reactMdStates.reactMdStatesStrings.keyboard
    - typings.reactMdStates.reactMdStatesStrings.programmatic
  */
  trait RippleType extends StObject
  object RippleType {
    
    inline def keyboard: typings.reactMdStates.reactMdStatesStrings.keyboard = "keyboard".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.keyboard]
    
    inline def mouse: typings.reactMdStates.reactMdStatesStrings.mouse = "mouse".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.mouse]
    
    inline def programmatic: typings.reactMdStates.reactMdStatesStrings.programmatic = "programmatic".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.programmatic]
    
    inline def touch: typings.reactMdStates.reactMdStatesStrings.touch = "touch".asInstanceOf[typings.reactMdStates.reactMdStatesStrings.touch]
  }
  
  trait RipplesOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the ripple effect should not occur after a programmatic trigger
      * of a click event. This would normally happen if using `aria-activedescendant`
      * movement and the user "presses" the current active element.
      */
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the ripple effect should be disabled. This will make the `useRipples`
      * hook not provide any additional logic for the provided handlers.
      */
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the spacebar click effect should be disabled. This should normally
      * state disabled unless dealing with links.
      */
    var disableSpacebarClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional boolean if the element is currently disabled. This will ensure
      * that the ripple states are not applied during these times.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional object of event handlers to merge with the required
      * ripple trigger event handlers.
      */
    var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.undefined
    
    /**
      * An optional className to apply to the ripple element.
      */
    var rippleClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional object containing the different transition class names for the ripple
      * effect. If this is undefined, it will be extracted from the current `StatesContext`
      * instead.
      */
    var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    /**
      * An optional className to apply to the ripple's container element.
      */
    var rippleContainerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional timeout duration for the ripple effect. If this is undefined, its value
      * will be extracted from the current `StatesContext` instead.
      */
    var rippleTimeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object RipplesOptions {
    
    inline def apply[E /* <: HTMLElement */](): RipplesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RipplesOptions[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RipplesOptions[?], E /* <: HTMLElement */] (val x: Self & RipplesOptions[E]) extends AnyVal {
      
      inline def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def setDisableSpacebarClickUndefined: Self = StObject.set(x, "disableSpacebarClick", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setRippleClassName(value: String): Self = StObject.set(x, "rippleClassName", value.asInstanceOf[js.Any])
      
      inline def setRippleClassNameUndefined: Self = StObject.set(x, "rippleClassName", js.undefined)
      
      inline def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      inline def setRippleClassNamesUndefined: Self = StObject.set(x, "rippleClassNames", js.undefined)
      
      inline def setRippleContainerClassName(value: String): Self = StObject.set(x, "rippleContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setRippleContainerClassNameUndefined: Self = StObject.set(x, "rippleContainerClassName", js.undefined)
      
      inline def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
      
      inline def setRippleTimeoutUndefined: Self = StObject.set(x, "rippleTimeout", js.undefined)
    }
  }
  
  type RipplesState = js.Array[RippleState]
}
