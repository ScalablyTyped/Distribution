package typings.reactInteractive

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactInteractive.mod.ActiveProps
import typings.reactInteractive.mod.ClickType
import typings.reactInteractive.mod.FocusProps
import typings.reactInteractive.mod.State
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active
    extends StObject
       with ActiveProps {
    
    var active: js.UndefOr[CSSProperties] = js.undefined
  }
  object Active {
    
    inline def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: CSSProperties): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait As extends StObject {
    
    // as: string | Component | ReactElement;
    var as: js.Any
    
    var className: js.UndefOr[String] = js.undefined
    
    var extraTouchNoTap: js.UndefOr[Boolean] = js.undefined
    
    // Not sure about this type
    var focusToggleOff: js.UndefOr[Boolean] = js.undefined
    
    var forceState: js.UndefOr[State] = js.undefined
    
    var hover: js.UndefOr[CSSProperties] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var interactiveChild: js.UndefOr[Boolean] = js.undefined
    
    var mutableProps: js.UndefOr[Boolean] = js.undefined
    
    var nonContainedChild: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[Element, typings.std.Event], 
          /* clickType */ ClickType, 
          Unit
        ]
      ] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.undefined
    
    var onStateChange: js.UndefOr[js.Function1[/* arg0 */ Event, Unit]] = js.undefined
    
    var onTapFour: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.undefined
    
    var onTapThree: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.undefined
    
    var onTapTwo: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.undefined
    
    var refDOMNode: js.UndefOr[js.Function1[/* node */ js.Any, js.Any]] = js.undefined
    
    var setStateCallback: js.UndefOr[js.Function1[/* arg0 */ NextState, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var styleProperty: js.UndefOr[js.Object] = js.undefined
    
    var tapTimeCutoff: js.UndefOr[Double] = js.undefined
    
    var touchActiveTapOnly: js.UndefOr[Boolean] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object As {
    
    inline def apply(as: js.Any): As = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[As]
    }
    
    extension [Self <: As](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtraTouchNoTap(value: Boolean): Self = StObject.set(x, "extraTouchNoTap", value.asInstanceOf[js.Any])
      
      inline def setExtraTouchNoTapUndefined: Self = StObject.set(x, "extraTouchNoTap", js.undefined)
      
      inline def setFocusToggleOff(value: Boolean): Self = StObject.set(x, "focusToggleOff", value.asInstanceOf[js.Any])
      
      inline def setFocusToggleOffUndefined: Self = StObject.set(x, "focusToggleOff", js.undefined)
      
      inline def setForceState(value: State): Self = StObject.set(x, "forceState", value.asInstanceOf[js.Any])
      
      inline def setForceStateUndefined: Self = StObject.set(x, "forceState", js.undefined)
      
      inline def setHover(value: CSSProperties): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInteractiveChild(value: Boolean): Self = StObject.set(x, "interactiveChild", value.asInstanceOf[js.Any])
      
      inline def setInteractiveChildUndefined: Self = StObject.set(x, "interactiveChild", js.undefined)
      
      inline def setMutableProps(value: Boolean): Self = StObject.set(x, "mutableProps", value.asInstanceOf[js.Any])
      
      inline def setMutablePropsUndefined: Self = StObject.set(x, "mutableProps", js.undefined)
      
      inline def setNonContainedChild(value: Boolean): Self = StObject.set(x, "nonContainedChild", value.asInstanceOf[js.Any])
      
      inline def setNonContainedChildUndefined: Self = StObject.set(x, "nonContainedChild", js.undefined)
      
      inline def setOnClick(value: (/* event */ SyntheticEvent[Element, typings.std.Event], /* clickType */ ClickType) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnLongPress(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnStateChange(value: /* arg0 */ Event => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setOnTapFour(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onTapFour", js.Any.fromFunction1(value))
      
      inline def setOnTapFourUndefined: Self = StObject.set(x, "onTapFour", js.undefined)
      
      inline def setOnTapThree(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onTapThree", js.Any.fromFunction1(value))
      
      inline def setOnTapThreeUndefined: Self = StObject.set(x, "onTapThree", js.undefined)
      
      inline def setOnTapTwo(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onTapTwo", js.Any.fromFunction1(value))
      
      inline def setOnTapTwoUndefined: Self = StObject.set(x, "onTapTwo", js.undefined)
      
      inline def setRefDOMNode(value: /* node */ js.Any => js.Any): Self = StObject.set(x, "refDOMNode", js.Any.fromFunction1(value))
      
      inline def setRefDOMNodeUndefined: Self = StObject.set(x, "refDOMNode", js.undefined)
      
      inline def setSetStateCallback(value: /* arg0 */ NextState => Unit): Self = StObject.set(x, "setStateCallback", js.Any.fromFunction1(value))
      
      inline def setSetStateCallbackUndefined: Self = StObject.set(x, "setStateCallback", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleProperty(value: js.Object): Self = StObject.set(x, "styleProperty", value.asInstanceOf[js.Any])
      
      inline def setStylePropertyUndefined: Self = StObject.set(x, "styleProperty", js.undefined)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTapTimeCutoff(value: Double): Self = StObject.set(x, "tapTimeCutoff", value.asInstanceOf[js.Any])
      
      inline def setTapTimeCutoffUndefined: Self = StObject.set(x, "tapTimeCutoff", js.undefined)
      
      inline def setTouchActiveTapOnly(value: Boolean): Self = StObject.set(x, "touchActiveTapOnly", value.asInstanceOf[js.Any])
      
      inline def setTouchActiveTapOnlyUndefined: Self = StObject.set(x, "touchActiveTapOnly", js.undefined)
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      inline def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var event: SyntheticEvent[Element, typings.std.Event]
    
    var nextState: State
    
    var prevState: State
  }
  object Event {
    
    inline def apply(event: SyntheticEvent[Element, typings.std.Event], nextState: State, prevState: State): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setEvent(value: SyntheticEvent[Element, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNextState(value: State): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      inline def setPrevState(value: State): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
    }
  }
  
  trait Focus
    extends StObject
       with FocusProps {
    
    var focus: js.UndefOr[CSSProperties] = js.undefined
  }
  object Focus {
    
    inline def apply(): Focus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Focus]
    }
    
    extension [Self <: Focus](x: Self) {
      
      inline def setFocus(value: CSSProperties): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    }
  }
  
  trait FocusFromMouse
    extends StObject
       with FocusProps {
    
    var focusFromMouse: js.UndefOr[CSSProperties] = js.undefined
    
    var focusFromTab: js.UndefOr[CSSProperties] = js.undefined
    
    var focusFromTouch: js.UndefOr[CSSProperties] = js.undefined
  }
  object FocusFromMouse {
    
    inline def apply(): FocusFromMouse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusFromMouse]
    }
    
    extension [Self <: FocusFromMouse](x: Self) {
      
      inline def setFocusFromMouse(value: CSSProperties): Self = StObject.set(x, "focusFromMouse", value.asInstanceOf[js.Any])
      
      inline def setFocusFromMouseUndefined: Self = StObject.set(x, "focusFromMouse", js.undefined)
      
      inline def setFocusFromTab(value: CSSProperties): Self = StObject.set(x, "focusFromTab", value.asInstanceOf[js.Any])
      
      inline def setFocusFromTabUndefined: Self = StObject.set(x, "focusFromTab", js.undefined)
      
      inline def setFocusFromTouch(value: CSSProperties): Self = StObject.set(x, "focusFromTouch", value.asInstanceOf[js.Any])
      
      inline def setFocusFromTouchUndefined: Self = StObject.set(x, "focusFromTouch", js.undefined)
    }
  }
  
  trait HoverActive
    extends StObject
       with ActiveProps {
    
    var hoverActive: js.UndefOr[CSSProperties] = js.undefined
    
    var keyActive: js.UndefOr[CSSProperties] = js.undefined
    
    var touchActive: js.UndefOr[CSSProperties] = js.undefined
  }
  object HoverActive {
    
    inline def apply(): HoverActive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverActive]
    }
    
    extension [Self <: HoverActive](x: Self) {
      
      inline def setHoverActive(value: CSSProperties): Self = StObject.set(x, "hoverActive", value.asInstanceOf[js.Any])
      
      inline def setHoverActiveUndefined: Self = StObject.set(x, "hoverActive", js.undefined)
      
      inline def setKeyActive(value: CSSProperties): Self = StObject.set(x, "keyActive", value.asInstanceOf[js.Any])
      
      inline def setKeyActiveUndefined: Self = StObject.set(x, "keyActive", js.undefined)
      
      inline def setTouchActive(value: CSSProperties): Self = StObject.set(x, "touchActive", value.asInstanceOf[js.Any])
      
      inline def setTouchActiveUndefined: Self = StObject.set(x, "touchActive", js.undefined)
    }
  }
  
  trait NextState extends StObject {
    
    var nextState: State
    
    var prevState: State
  }
  object NextState {
    
    inline def apply(nextState: State, prevState: State): NextState = {
      val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextState]
    }
    
    extension [Self <: NextState](x: Self) {
      
      inline def setNextState(value: State): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      inline def setPrevState(value: State): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
    }
  }
}
