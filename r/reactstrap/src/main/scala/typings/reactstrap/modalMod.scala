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
import typings.reactstrap.fadeMod.FadeProps
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.static
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("reactstrap/lib/Modal", JSImport.Default)
  @js.native
  class default ()
    extends Component[ModalProps, js.Object, js.Any]
  
  type Modal = Component[ModalProps, js.Object, js.Any]
  
  trait ModalProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdrop: js.UndefOr[Boolean | static] = js.undefined
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var backdropTransition: js.UndefOr[FadeProps] = js.undefined
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var external: js.UndefOr[ReactNode] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
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
    
    var toggle: js.UndefOr[KeyboardEventHandler[js.Any] | MouseEventHandler[js.Any]] = js.undefined
    
    var unmountOnClose: js.UndefOr[Boolean] = js.undefined
    
    var wrapClassName: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double | String] = js.undefined
  }
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackdrop(value: Boolean | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      @scala.inline
      def setBackdropTransition(value: FadeProps): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setExternal(value: ReactNode): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      @scala.inline
      def setModalClassName(value: String): Self = StObject.set(x, "modalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalClassNameUndefined: Self = StObject.set(x, "modalClassName", js.undefined)
      
      @scala.inline
      def setModalTransition(value: FadeProps): Self = StObject.set(x, "modalTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalTransitionUndefined: Self = StObject.set(x, "modalTransition", js.undefined)
      
      @scala.inline
      def setOnClosed(value: () => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnOpened(value: () => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setReturnFocusAfterClose(value: Boolean): Self = StObject.set(x, "returnFocusAfterClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFocusAfterCloseUndefined: Self = StObject.set(x, "returnFocusAfterClose", js.undefined)
      
      @scala.inline
      def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setToggle(value: KeyboardEvent[js.Any] | (MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setUnmountOnClose(value: Boolean): Self = StObject.set(x, "unmountOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnCloseUndefined: Self = StObject.set(x, "unmountOnClose", js.undefined)
      
      @scala.inline
      def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
