package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.reactstrap.reactstrapStrings.static
import typings.reactstrap.typesLibFadeMod.FadeProps
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibOffcanvasMod {
  
  @JSImport("reactstrap/types/lib/Offcanvas", JSImport.Default)
  @js.native
  open class default ()
    extends Component[OffcanvasProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactstrap.reactstrapStrings.start
    - typings.reactstrap.reactstrapStrings.end
    - typings.reactstrap.reactstrapStrings.bottom
    - typings.reactstrap.reactstrapStrings.top
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottom: typings.reactstrap.reactstrapStrings.bottom = "bottom".asInstanceOf[typings.reactstrap.reactstrapStrings.bottom]
    
    inline def end: typings.reactstrap.reactstrapStrings.end = "end".asInstanceOf[typings.reactstrap.reactstrapStrings.end]
    
    inline def start: typings.reactstrap.reactstrapStrings.start = "start".asInstanceOf[typings.reactstrap.reactstrapStrings.start]
    
    inline def top: typings.reactstrap.reactstrapStrings.top = "top".asInstanceOf[typings.reactstrap.reactstrapStrings.top]
  }
  
  type Offcanvas = Component[OffcanvasProps, js.Object, Any]
  
  trait OffcanvasProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var backdrop: js.UndefOr[Boolean | static] = js.undefined
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var backdropTransition: js.UndefOr[FadeProps] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var labelledBy: js.UndefOr[String] = js.undefined
    
    var offcanvasClassName: js.UndefOr[String] = js.undefined
    
    var offcanvasTransition: js.UndefOr[FadeProps] = js.undefined
    
    var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnFocusAfterClose: js.UndefOr[Boolean] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var toggle: js.UndefOr[KeyboardEventHandler[Any] | MouseEventHandler[Any]] = js.undefined
    
    var trapFocus: js.UndefOr[Boolean] = js.undefined
    
    var unmountOnClose: js.UndefOr[Boolean] = js.undefined
    
    var wrapClassName: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double | String] = js.undefined
  }
  object OffcanvasProps {
    
    inline def apply(): OffcanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffcanvasProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OffcanvasProps] (val x: Self) extends AnyVal {
      
      inline def setBackdrop(value: Boolean | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      inline def setBackdropTransition(value: FadeProps): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      inline def setOffcanvasClassName(value: String): Self = StObject.set(x, "offcanvasClassName", value.asInstanceOf[js.Any])
      
      inline def setOffcanvasClassNameUndefined: Self = StObject.set(x, "offcanvasClassName", js.undefined)
      
      inline def setOffcanvasTransition(value: FadeProps): Self = StObject.set(x, "offcanvasTransition", value.asInstanceOf[js.Any])
      
      inline def setOffcanvasTransitionUndefined: Self = StObject.set(x, "offcanvasTransition", js.undefined)
      
      inline def setOnClosed(value: () => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction0(value))
      
      inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      inline def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnOpened(value: () => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction0(value))
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setReturnFocusAfterClose(value: Boolean): Self = StObject.set(x, "returnFocusAfterClose", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusAfterCloseUndefined: Self = StObject.set(x, "returnFocusAfterClose", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setToggle(value: KeyboardEvent[Any] | (MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
      
      inline def setUnmountOnClose(value: Boolean): Self = StObject.set(x, "unmountOnClose", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnCloseUndefined: Self = StObject.set(x, "unmountOnClose", js.undefined)
      
      inline def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      inline def setZIndex(value: Double | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
