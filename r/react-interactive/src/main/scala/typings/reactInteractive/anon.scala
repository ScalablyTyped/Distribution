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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Active extends ActiveProps {
    
    var active: js.UndefOr[CSSProperties] = js.native
  }
  object Active {
    
    @scala.inline
    def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: CSSProperties): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  @js.native
  trait As extends StObject {
    
    // as: string | Component | ReactElement;
    var as: js.Any = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var extraTouchNoTap: js.UndefOr[Boolean] = js.native
    
    // Not sure about this type
    var focusToggleOff: js.UndefOr[Boolean] = js.native
    
    var forceState: js.UndefOr[State] = js.native
    
    var hover: js.UndefOr[CSSProperties] = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var interactiveChild: js.UndefOr[Boolean] = js.native
    
    var mutableProps: js.UndefOr[Boolean] = js.native
    
    var nonContainedChild: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[Element, typings.std.Event], 
          /* clickType */ ClickType, 
          Unit
        ]
      ] = js.native
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
    
    var onStateChange: js.UndefOr[js.Function1[/* arg0 */ Event, Unit]] = js.native
    
    var onTapFour: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
    
    var onTapThree: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
    
    var onTapTwo: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
    
    var refDOMNode: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.native
    
    var setStateCallback: js.UndefOr[js.Function1[/* arg0 */ NextState, Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styleProperty: js.UndefOr[js.Object] = js.native
    
    var tapTimeCutoff: js.UndefOr[Double] = js.native
    
    var touchActiveTapOnly: js.UndefOr[Boolean] = js.native
    
    var wrapperClassName: js.UndefOr[String] = js.native
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.native
  }
  object As {
    
    @scala.inline
    def apply(as: js.Any): As = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[As]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtraTouchNoTap(value: Boolean): Self = StObject.set(x, "extraTouchNoTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraTouchNoTapUndefined: Self = StObject.set(x, "extraTouchNoTap", js.undefined)
      
      @scala.inline
      def setFocusToggleOff(value: Boolean): Self = StObject.set(x, "focusToggleOff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusToggleOffUndefined: Self = StObject.set(x, "focusToggleOff", js.undefined)
      
      @scala.inline
      def setForceState(value: State): Self = StObject.set(x, "forceState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceStateUndefined: Self = StObject.set(x, "forceState", js.undefined)
      
      @scala.inline
      def setHover(value: CSSProperties): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setInteractiveChild(value: Boolean): Self = StObject.set(x, "interactiveChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveChildUndefined: Self = StObject.set(x, "interactiveChild", js.undefined)
      
      @scala.inline
      def setMutableProps(value: Boolean): Self = StObject.set(x, "mutableProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutablePropsUndefined: Self = StObject.set(x, "mutableProps", js.undefined)
      
      @scala.inline
      def setNonContainedChild(value: Boolean): Self = StObject.set(x, "nonContainedChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonContainedChildUndefined: Self = StObject.set(x, "nonContainedChild", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ SyntheticEvent[Element, typings.std.Event], /* clickType */ ClickType) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnStateChange(value: /* arg0 */ Event => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      @scala.inline
      def setOnTapFour(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onTapFour", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapFourUndefined: Self = StObject.set(x, "onTapFour", js.undefined)
      
      @scala.inline
      def setOnTapThree(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onTapThree", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapThreeUndefined: Self = StObject.set(x, "onTapThree", js.undefined)
      
      @scala.inline
      def setOnTapTwo(value: /* event */ typings.std.Event => Unit): Self = StObject.set(x, "onTapTwo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapTwoUndefined: Self = StObject.set(x, "onTapTwo", js.undefined)
      
      @scala.inline
      def setRefDOMNode(value: /* node */ js.Any => _): Self = StObject.set(x, "refDOMNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefDOMNodeUndefined: Self = StObject.set(x, "refDOMNode", js.undefined)
      
      @scala.inline
      def setSetStateCallback(value: /* arg0 */ NextState => Unit): Self = StObject.set(x, "setStateCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStateCallbackUndefined: Self = StObject.set(x, "setStateCallback", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleProperty(value: js.Object): Self = StObject.set(x, "styleProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylePropertyUndefined: Self = StObject.set(x, "styleProperty", js.undefined)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTapTimeCutoff(value: Double): Self = StObject.set(x, "tapTimeCutoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapTimeCutoffUndefined: Self = StObject.set(x, "tapTimeCutoff", js.undefined)
      
      @scala.inline
      def setTouchActiveTapOnly(value: Boolean): Self = StObject.set(x, "touchActiveTapOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchActiveTapOnlyUndefined: Self = StObject.set(x, "touchActiveTapOnly", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      @scala.inline
      def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var event: SyntheticEvent[Element, typings.std.Event] = js.native
    
    var nextState: State = js.native
    
    var prevState: State = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: SyntheticEvent[Element, typings.std.Event], nextState: State, prevState: State): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticEvent[Element, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextState(value: State): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevState(value: State): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Focus extends FocusProps {
    
    var focus: js.UndefOr[CSSProperties] = js.native
  }
  object Focus {
    
    @scala.inline
    def apply(): Focus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Focus]
    }
    
    @scala.inline
    implicit class FocusMutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: CSSProperties): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    }
  }
  
  @js.native
  trait FocusFromMouse extends FocusProps {
    
    var focusFromMouse: js.UndefOr[CSSProperties] = js.native
    
    var focusFromTab: js.UndefOr[CSSProperties] = js.native
    
    var focusFromTouch: js.UndefOr[CSSProperties] = js.native
  }
  object FocusFromMouse {
    
    @scala.inline
    def apply(): FocusFromMouse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusFromMouse]
    }
    
    @scala.inline
    implicit class FocusFromMouseMutableBuilder[Self <: FocusFromMouse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusFromMouse(value: CSSProperties): Self = StObject.set(x, "focusFromMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusFromMouseUndefined: Self = StObject.set(x, "focusFromMouse", js.undefined)
      
      @scala.inline
      def setFocusFromTab(value: CSSProperties): Self = StObject.set(x, "focusFromTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusFromTabUndefined: Self = StObject.set(x, "focusFromTab", js.undefined)
      
      @scala.inline
      def setFocusFromTouch(value: CSSProperties): Self = StObject.set(x, "focusFromTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusFromTouchUndefined: Self = StObject.set(x, "focusFromTouch", js.undefined)
    }
  }
  
  @js.native
  trait HoverActive extends ActiveProps {
    
    var hoverActive: js.UndefOr[CSSProperties] = js.native
    
    var keyActive: js.UndefOr[CSSProperties] = js.native
    
    var touchActive: js.UndefOr[CSSProperties] = js.native
  }
  object HoverActive {
    
    @scala.inline
    def apply(): HoverActive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverActive]
    }
    
    @scala.inline
    implicit class HoverActiveMutableBuilder[Self <: HoverActive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHoverActive(value: CSSProperties): Self = StObject.set(x, "hoverActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverActiveUndefined: Self = StObject.set(x, "hoverActive", js.undefined)
      
      @scala.inline
      def setKeyActive(value: CSSProperties): Self = StObject.set(x, "keyActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyActiveUndefined: Self = StObject.set(x, "keyActive", js.undefined)
      
      @scala.inline
      def setTouchActive(value: CSSProperties): Self = StObject.set(x, "touchActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchActiveUndefined: Self = StObject.set(x, "touchActive", js.undefined)
    }
  }
  
  @js.native
  trait NextState extends StObject {
    
    var nextState: State = js.native
    
    var prevState: State = js.native
  }
  object NextState {
    
    @scala.inline
    def apply(nextState: State, prevState: State): NextState = {
      val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextState]
    }
    
    @scala.inline
    implicit class NextStateMutableBuilder[Self <: NextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextState(value: State): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevState(value: State): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
    }
  }
}
