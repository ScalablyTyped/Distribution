package typings.reactOverlays.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.reactOverlays.modalManagerMod.default
import typings.reactOverlays.modalMod.ModalHandle
import typings.reactOverlays.modalMod.ModalTransitionComponent
import typings.reactOverlays.modalMod.RenderModalBackdropProps
import typings.reactOverlays.modalMod.RenderModalDialogProps
import typings.reactOverlays.reactOverlaysBooleans.`false`
import typings.reactOverlays.reactOverlaysBooleans.`true`
import typings.reactOverlays.reactOverlaysStrings.static
import typings.reactOverlays.useWaitForDOMRefMod.DOMContainer
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-overlays.react-overlays/cjs/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/cjs/Modal.ModalHandle>> */
trait PartialModalPropsRefAttri extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var backdrop: js.UndefOr[`true` | `false` | static] = js.undefined
  
  var backdropTransition: js.UndefOr[ModalTransitionComponent] = js.undefined
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[DOMContainer[HTMLElement]] = js.undefined
  
  var containerClassName: js.UndefOr[String] = js.undefined
  
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  var manager: js.UndefOr[default] = js.undefined
  
  var onBackdropClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.undefined
  
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ref: js.UndefOr[typings.react.mod.Ref[ModalHandle]] = js.undefined
  
  var renderBackdrop: js.UndefOr[js.Function1[/* props */ RenderModalBackdropProps, ReactNode]] = js.undefined
  
  var renderDialog: js.UndefOr[js.Function1[/* props */ RenderModalDialogProps, ReactNode]] = js.undefined
  
  var restoreFocus: js.UndefOr[Boolean] = js.undefined
  
  var restoreFocusOptions: js.UndefOr[PreventScroll] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var transition: js.UndefOr[ModalTransitionComponent] = js.undefined
}
object PartialModalPropsRefAttri {
  
  inline def apply(): PartialModalPropsRefAttri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalPropsRefAttri]
  }
  
  extension [Self <: PartialModalPropsRefAttri](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setBackdrop(value: `true` | `false` | static): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropTransition(value: ModalTransitionComponent): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
    
    inline def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    inline def setContainerFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
    
    inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setManager(value: default): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setOnBackdropClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
    
    inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
    
    inline def setOnEnter(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnEscapeKeyDown(value: /* e */ KeyboardEvent => Unit): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
    
    inline def setOnExit(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setRef(value: typings.react.mod.Ref[ModalHandle]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ ModalHandle | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderBackdrop(value: /* props */ RenderModalBackdropProps => ReactNode): Self = StObject.set(x, "renderBackdrop", js.Any.fromFunction1(value))
    
    inline def setRenderBackdropUndefined: Self = StObject.set(x, "renderBackdrop", js.undefined)
    
    inline def setRenderDialog(value: /* props */ RenderModalDialogProps => ReactNode): Self = StObject.set(x, "renderDialog", js.Any.fromFunction1(value))
    
    inline def setRenderDialogUndefined: Self = StObject.set(x, "renderDialog", js.undefined)
    
    inline def setRestoreFocus(value: Boolean): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
    
    inline def setRestoreFocusOptions(value: PreventScroll): Self = StObject.set(x, "restoreFocusOptions", value.asInstanceOf[js.Any])
    
    inline def setRestoreFocusOptionsUndefined: Self = StObject.set(x, "restoreFocusOptions", js.undefined)
    
    inline def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransition(value: ModalTransitionComponent): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
