package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.reactstrap.reactstrapStrings.lg
import typings.reactstrap.reactstrapStrings.md
import typings.reactstrap.reactstrapStrings.sm
import typings.reactstrap.reactstrapStrings.static
import typings.reactstrap.reactstrapStrings.xl
import typings.reactstrap.typesLibFadeMod.FadeProps
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibModalMod {
  
  @JSImport("reactstrap/types/lib/Modal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalProps, js.Object, Any]
  
  type Modal = Component[ModalProps, js.Object, Any]
  
  trait ModalProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var backdrop: js.UndefOr[Boolean | static] = js.undefined
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var backdropTransition: js.UndefOr[FadeProps] = js.undefined
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var external: js.UndefOr[ReactNode] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean | sm | md | lg | xl] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var labelledBy: js.UndefOr[String] = js.undefined
    
    var modalClassName: js.UndefOr[String] = js.undefined
    
    var modalTransition: js.UndefOr[FadeProps] = js.undefined
    
    var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnFocusAfterClose: js.UndefOr[Boolean] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var toggle: js.UndefOr[KeyboardEventHandler[Any] | MouseEventHandler[Any]] = js.undefined
    
    var trapFocus: js.UndefOr[Boolean] = js.undefined
    
    var unmountOnClose: js.UndefOr[Boolean] = js.undefined
    
    var wrapClassName: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double | String] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      inline def setBackdrop(value: Boolean | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      inline def setBackdropTransition(value: FadeProps): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      inline def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setExternal(value: ReactNode): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setFullscreen(value: Boolean | sm | md | lg | xl): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
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
      
      inline def setModalClassName(value: String): Self = StObject.set(x, "modalClassName", value.asInstanceOf[js.Any])
      
      inline def setModalClassNameUndefined: Self = StObject.set(x, "modalClassName", js.undefined)
      
      inline def setModalTransition(value: FadeProps): Self = StObject.set(x, "modalTransition", value.asInstanceOf[js.Any])
      
      inline def setModalTransitionUndefined: Self = StObject.set(x, "modalTransition", js.undefined)
      
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
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
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
