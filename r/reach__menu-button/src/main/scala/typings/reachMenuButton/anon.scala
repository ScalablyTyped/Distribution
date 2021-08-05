package typings.reachMenuButton

import typings.reachMenuButton.mod.ButtonRect
import typings.reachMenuButton.mod.ResolvedMenuLinkComponent
import typings.reachMenuButton.mod.State
import typings.reachMenuButton.mod.SupportedMenuLinkComponent
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As[T /* <: SupportedMenuLinkComponent */] extends StObject {
    
    var _ref: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var as: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[ResolvedMenuLinkComponent[T]] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.undefined
    
    var setState: js.UndefOr[js.Function1[/* s */ State, PartialState]] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object As {
    
    inline def apply[T /* <: SupportedMenuLinkComponent */](): As[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[T]]
    }
    
    extension [Self <: As[?], T /* <: SupportedMenuLinkComponent */](x: Self & As[T]) {
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setComponent(value: ResolvedMenuLinkComponent[T]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnClick(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setSetState(value: /* s */ State => PartialState): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      inline def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def set_ref(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "_ref", js.Any.fromFunction1(value))
      
      inline def set_refUndefined: Self = StObject.set(x, "_ref", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@reach/menu-button.@reach/menu-button.State> */
  trait PartialState extends StObject {
    
    var buttonId: js.UndefOr[String] = js.undefined
    
    var buttonRect: js.UndefOr[ButtonRect] = js.undefined
    
    var closingWithClick: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var selectionIndex: js.UndefOr[Double] = js.undefined
  }
  object PartialState {
    
    inline def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    extension [Self <: PartialState](x: Self) {
      
      inline def setButtonId(value: String): Self = StObject.set(x, "buttonId", value.asInstanceOf[js.Any])
      
      inline def setButtonIdUndefined: Self = StObject.set(x, "buttonId", js.undefined)
      
      inline def setButtonRect(value: ButtonRect): Self = StObject.set(x, "buttonRect", value.asInstanceOf[js.Any])
      
      inline def setButtonRectUndefined: Self = StObject.set(x, "buttonRect", js.undefined)
      
      inline def setClosingWithClick(value: Boolean): Self = StObject.set(x, "closingWithClick", value.asInstanceOf[js.Any])
      
      inline def setClosingWithClickUndefined: Self = StObject.set(x, "closingWithClick", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setSelectionIndex(value: Double): Self = StObject.set(x, "selectionIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectionIndexUndefined: Self = StObject.set(x, "selectionIndex", js.undefined)
    }
  }
}
