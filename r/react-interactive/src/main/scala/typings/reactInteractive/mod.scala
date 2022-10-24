package typings.reactInteractive

import typings.eventFrom.mod.EventFromInput
import typings.react.mod.CSSProperties
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.reactInteractive.reactInteractiveStrings.a
import typings.reactInteractive.reactInteractiveStrings.as
import typings.reactInteractive.reactInteractiveStrings.button
import typings.reactInteractive.reactInteractiveStrings.div
import typings.reactInteractive.reactInteractiveStrings.input
import typings.reactInteractive.reactInteractiveStrings.ref
import typings.reactInteractive.reactInteractiveStrings.select
import typings.reactInteractive.reactInteractiveStrings.span
import typings.reactPolymorphicTypes.mod.PolymorphicPropsWithRef
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-interactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-interactive", "Interactive")
  @js.native
  val Interactive: PolymorphicInteractive = js.native
  
  inline def createInteractive[T /* <: ElementType[Any] */](as: T): ForwardRefExoticComponent[InteractivePropsWithoutAs[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInteractive")(as.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[InteractivePropsWithoutAs[T]]]
  
  inline def eventFrom(event: Record[String, Any]): EventFromInput = ^.asInstanceOf[js.Dynamic].applyDynamic("eventFrom")(event.asInstanceOf[js.Any]).asInstanceOf[EventFromInput]
  
  inline def setEventFrom(value: EventFromInput): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEventFrom")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.reactInteractiveBooleans.`false`
    - typings.reactInteractive.reactInteractiveStrings.mouseActive
    - typings.reactInteractive.reactInteractiveStrings.touchActive
    - typings.reactInteractive.reactInteractiveStrings.keyActive
  */
  trait ActiveState extends StObject
  object ActiveState {
    
    inline def `false`: typings.reactInteractive.reactInteractiveBooleans.`false` = false.asInstanceOf[typings.reactInteractive.reactInteractiveBooleans.`false`]
    
    inline def keyActive: typings.reactInteractive.reactInteractiveStrings.keyActive = "keyActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.keyActive]
    
    inline def mouseActive: typings.reactInteractive.reactInteractiveStrings.mouseActive = "mouseActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.mouseActive]
    
    inline def touchActive: typings.reactInteractive.reactInteractiveStrings.touchActive = "touchActive".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.touchActive]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.reactInteractiveBooleans.`false`
    - typings.reactInteractive.reactInteractiveStrings.focusFromMouse
    - typings.reactInteractive.reactInteractiveStrings.focusFromTouch
    - typings.reactInteractive.reactInteractiveStrings.focusFromKey
  */
  trait FocusState extends StObject
  object FocusState {
    
    inline def `false`: typings.reactInteractive.reactInteractiveBooleans.`false` = false.asInstanceOf[typings.reactInteractive.reactInteractiveBooleans.`false`]
    
    inline def focusFromKey: typings.reactInteractive.reactInteractiveStrings.focusFromKey = "focusFromKey".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.focusFromKey]
    
    inline def focusFromMouse: typings.reactInteractive.reactInteractiveStrings.focusFromMouse = "focusFromMouse".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.focusFromMouse]
    
    inline def focusFromTouch: typings.reactInteractive.reactInteractiveStrings.focusFromTouch = "focusFromTouch".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.focusFromTouch]
  }
  
  type InteractiveExtendableProps[T /* <: ElementType[Any] */] = Omit[InteractiveProps[T], as | ref]
  
  trait InteractiveOwnProps extends StObject {
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var activeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* state */ InteractiveState, ReactNode])] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledClassName: js.UndefOr[String] = js.undefined
    
    var disabledStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var focusClassName: js.UndefOr[String] = js.undefined
    
    var focusFromKeyClassName: js.UndefOr[String] = js.undefined
    
    var focusFromKeyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var focusFromMouseClassName: js.UndefOr[String] = js.undefined
    
    var focusFromMouseStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var focusFromTouchClassName: js.UndefOr[String] = js.undefined
    
    var focusFromTouchStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var focusStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var hoverClassName: js.UndefOr[String] = js.undefined
    
    var hoverStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var keyActiveClassName: js.UndefOr[String] = js.undefined
    
    var keyActiveStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var mouseActiveClassName: js.UndefOr[String] = js.undefined
    
    var mouseActiveStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onStateChange: js.UndefOr[js.Function1[/* param0 */ InteractiveStateChange, Unit]] = js.undefined
    
    var touchActiveClassName: js.UndefOr[String] = js.undefined
    
    var touchActiveStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var useExtendedTouchActive: js.UndefOr[Boolean] = js.undefined
  }
  object InteractiveOwnProps {
    
    inline def apply(): InteractiveOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractiveOwnProps]
    }
    
    extension [Self <: InteractiveOwnProps](x: Self) {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setChildren(value: ReactNode | (js.Function1[/* state */ InteractiveState, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* state */ InteractiveState => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassName(value: String): Self = StObject.set(x, "disabledClassName", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassNameUndefined: Self = StObject.set(x, "disabledClassName", js.undefined)
      
      inline def setDisabledStyle(value: CSSProperties): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusClassName(value: String): Self = StObject.set(x, "focusClassName", value.asInstanceOf[js.Any])
      
      inline def setFocusClassNameUndefined: Self = StObject.set(x, "focusClassName", js.undefined)
      
      inline def setFocusFromKeyClassName(value: String): Self = StObject.set(x, "focusFromKeyClassName", value.asInstanceOf[js.Any])
      
      inline def setFocusFromKeyClassNameUndefined: Self = StObject.set(x, "focusFromKeyClassName", js.undefined)
      
      inline def setFocusFromKeyStyle(value: CSSProperties): Self = StObject.set(x, "focusFromKeyStyle", value.asInstanceOf[js.Any])
      
      inline def setFocusFromKeyStyleUndefined: Self = StObject.set(x, "focusFromKeyStyle", js.undefined)
      
      inline def setFocusFromMouseClassName(value: String): Self = StObject.set(x, "focusFromMouseClassName", value.asInstanceOf[js.Any])
      
      inline def setFocusFromMouseClassNameUndefined: Self = StObject.set(x, "focusFromMouseClassName", js.undefined)
      
      inline def setFocusFromMouseStyle(value: CSSProperties): Self = StObject.set(x, "focusFromMouseStyle", value.asInstanceOf[js.Any])
      
      inline def setFocusFromMouseStyleUndefined: Self = StObject.set(x, "focusFromMouseStyle", js.undefined)
      
      inline def setFocusFromTouchClassName(value: String): Self = StObject.set(x, "focusFromTouchClassName", value.asInstanceOf[js.Any])
      
      inline def setFocusFromTouchClassNameUndefined: Self = StObject.set(x, "focusFromTouchClassName", js.undefined)
      
      inline def setFocusFromTouchStyle(value: CSSProperties): Self = StObject.set(x, "focusFromTouchStyle", value.asInstanceOf[js.Any])
      
      inline def setFocusFromTouchStyleUndefined: Self = StObject.set(x, "focusFromTouchStyle", js.undefined)
      
      inline def setFocusStyle(value: CSSProperties): Self = StObject.set(x, "focusStyle", value.asInstanceOf[js.Any])
      
      inline def setFocusStyleUndefined: Self = StObject.set(x, "focusStyle", js.undefined)
      
      inline def setHoverClassName(value: String): Self = StObject.set(x, "hoverClassName", value.asInstanceOf[js.Any])
      
      inline def setHoverClassNameUndefined: Self = StObject.set(x, "hoverClassName", js.undefined)
      
      inline def setHoverStyle(value: CSSProperties): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
      
      inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
      
      inline def setKeyActiveClassName(value: String): Self = StObject.set(x, "keyActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setKeyActiveClassNameUndefined: Self = StObject.set(x, "keyActiveClassName", js.undefined)
      
      inline def setKeyActiveStyle(value: CSSProperties): Self = StObject.set(x, "keyActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setKeyActiveStyleUndefined: Self = StObject.set(x, "keyActiveStyle", js.undefined)
      
      inline def setMouseActiveClassName(value: String): Self = StObject.set(x, "mouseActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setMouseActiveClassNameUndefined: Self = StObject.set(x, "mouseActiveClassName", js.undefined)
      
      inline def setMouseActiveStyle(value: CSSProperties): Self = StObject.set(x, "mouseActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setMouseActiveStyleUndefined: Self = StObject.set(x, "mouseActiveStyle", js.undefined)
      
      inline def setOnStateChange(value: /* param0 */ InteractiveStateChange => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setTouchActiveClassName(value: String): Self = StObject.set(x, "touchActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setTouchActiveClassNameUndefined: Self = StObject.set(x, "touchActiveClassName", js.undefined)
      
      inline def setTouchActiveStyle(value: CSSProperties): Self = StObject.set(x, "touchActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setTouchActiveStyleUndefined: Self = StObject.set(x, "touchActiveStyle", js.undefined)
      
      inline def setUseExtendedTouchActive(value: Boolean): Self = StObject.set(x, "useExtendedTouchActive", value.asInstanceOf[js.Any])
      
      inline def setUseExtendedTouchActiveUndefined: Self = StObject.set(x, "useExtendedTouchActive", js.undefined)
    }
  }
  
  type InteractiveProps[T /* <: ElementType[Any] */] = PolymorphicPropsWithRef[InteractiveOwnProps, T]
  
  type InteractivePropsWithoutAs[T /* <: ElementType[Any] */] = Omit[InteractiveProps[T], as]
  
  trait InteractiveState extends StObject {
    
    var active: ActiveState
    
    var focus: FocusState
    
    var hover: Boolean
  }
  object InteractiveState {
    
    inline def apply(active: ActiveState, focus: FocusState, hover: Boolean): InteractiveState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractiveState]
    }
    
    extension [Self <: InteractiveState](x: Self) {
      
      inline def setActive(value: ActiveState): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: FocusState): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractiveStateChange extends StObject {
    
    var prevState: InteractiveState
    
    var state: InteractiveState
  }
  object InteractiveStateChange {
    
    inline def apply(prevState: InteractiveState, state: InteractiveState): InteractiveStateChange = {
      val __obj = js.Dynamic.literal(prevState = prevState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractiveStateChange]
    }
    
    extension [Self <: InteractiveStateChange](x: Self) {
      
      inline def setPrevState(value: InteractiveState): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      inline def setState(value: InteractiveState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactInteractive.reactInteractiveStrings.hover
    - typings.reactInteractive.reactInteractiveStrings.active
    - typings.reactInteractive.reactInteractiveStrings.focus
  */
  trait InteractiveStateKey extends StObject
  object InteractiveStateKey {
    
    inline def active: typings.reactInteractive.reactInteractiveStrings.active = "active".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.active]
    
    inline def focus: typings.reactInteractive.reactInteractiveStrings.focus = "focus".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.focus]
    
    inline def hover: typings.reactInteractive.reactInteractiveStrings.hover = "hover".asInstanceOf[typings.reactInteractive.reactInteractiveStrings.hover]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.MemoExoticComponent<react.react.ComponentType<any>>, keyof react-polymorphic-types.react-polymorphic-types.PolymorphicExoticComponent<react-interactive.react-interactive.InteractiveOwnProps, / * "button" * / string>> ]: react.react.MemoExoticComponent<react.react.ComponentType<any>>[P]}
  - Dropped {[ P in std.Exclude<keyof react.react.ExoticComponent<react-interactive.react-interactive.InteractiveOwnProps & {[key: string] : unknown}>, keyof <InstanceT extends react.react.ElementType<any> = / * "button" * / string>(props : react-polymorphic-types.react-polymorphic-types.PolymorphicPropsWithRef<react-interactive.react-interactive.InteractiveOwnProps, InstanceT>): react.react.ReactElement | null> ]: react.react.ExoticComponent<react-interactive.react-interactive.InteractiveOwnProps & {[key: string] : unknown}>[P]}
  - Dropped <InstanceT extends react.react.ElementType<any> = / * "button" * / string>(props : react-polymorphic-types.react-polymorphic-types.PolymorphicPropsWithRef<react-interactive.react-interactive.InteractiveOwnProps, InstanceT>): react.react.ReactElement | null */ trait PolymorphicInteractive extends StObject {
    
    var A: ForwardRefExoticComponent[InteractivePropsWithoutAs[a]]
    
    var Button: ForwardRefExoticComponent[InteractivePropsWithoutAs[button]]
    
    var Div: ForwardRefExoticComponent[InteractivePropsWithoutAs[div]]
    
    var Input: ForwardRefExoticComponent[InteractivePropsWithoutAs[input]]
    
    var Select: ForwardRefExoticComponent[InteractivePropsWithoutAs[select]]
    
    var Span: ForwardRefExoticComponent[InteractivePropsWithoutAs[span]]
  }
  object PolymorphicInteractive {
    
    inline def apply(
      A: ForwardRefExoticComponent[InteractivePropsWithoutAs[a]],
      Button: ForwardRefExoticComponent[InteractivePropsWithoutAs[button]],
      Div: ForwardRefExoticComponent[InteractivePropsWithoutAs[div]],
      Input: ForwardRefExoticComponent[InteractivePropsWithoutAs[input]],
      Select: ForwardRefExoticComponent[InteractivePropsWithoutAs[select]],
      Span: ForwardRefExoticComponent[InteractivePropsWithoutAs[span]]
    ): PolymorphicInteractive = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], Div = Div.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], Span = Span.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolymorphicInteractive]
    }
    
    extension [Self <: PolymorphicInteractive](x: Self) {
      
      inline def setA(value: ForwardRefExoticComponent[InteractivePropsWithoutAs[a]]): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setButton(value: ForwardRefExoticComponent[InteractivePropsWithoutAs[button]]): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setDiv(value: ForwardRefExoticComponent[InteractivePropsWithoutAs[div]]): Self = StObject.set(x, "Div", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ForwardRefExoticComponent[InteractivePropsWithoutAs[input]]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: ForwardRefExoticComponent[InteractivePropsWithoutAs[select]]): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: ForwardRefExoticComponent[InteractivePropsWithoutAs[span]]): Self = StObject.set(x, "Span", value.asInstanceOf[js.Any])
    }
  }
}
