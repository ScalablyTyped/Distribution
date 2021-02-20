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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait As[T /* <: SupportedMenuLinkComponent */] extends StObject {
    
    var _ref: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    var as: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[ResolvedMenuLinkComponent[T]] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.native
    
    var setState: js.UndefOr[js.Function1[/* s */ State, PartialState]] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var to: js.UndefOr[String] = js.native
  }
  object As {
    
    @scala.inline
    def apply[T /* <: SupportedMenuLinkComponent */](): As[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[T]]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As[_], T /* <: SupportedMenuLinkComponent */] (val x: Self with As[T]) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setComponent(value: ResolvedMenuLinkComponent[T]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setSetState(value: /* s */ State => PartialState): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def set_ref(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "_ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_refUndefined: Self = StObject.set(x, "_ref", js.undefined)
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@reach/menu-button.@reach/menu-button.State> */
  @js.native
  trait PartialState extends StObject {
    
    var buttonId: js.UndefOr[String] = js.native
    
    var buttonRect: js.UndefOr[ButtonRect] = js.native
    
    var closingWithClick: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var selectionIndex: js.UndefOr[Double] = js.native
  }
  object PartialState {
    
    @scala.inline
    def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    @scala.inline
    implicit class PartialStateMutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonId(value: String): Self = StObject.set(x, "buttonId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonIdUndefined: Self = StObject.set(x, "buttonId", js.undefined)
      
      @scala.inline
      def setButtonRect(value: ButtonRect): Self = StObject.set(x, "buttonRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonRectUndefined: Self = StObject.set(x, "buttonRect", js.undefined)
      
      @scala.inline
      def setClosingWithClick(value: Boolean): Self = StObject.set(x, "closingWithClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosingWithClickUndefined: Self = StObject.set(x, "closingWithClick", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setSelectionIndex(value: Double): Self = StObject.set(x, "selectionIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionIndexUndefined: Self = StObject.set(x, "selectionIndex", js.undefined)
    }
  }
}
