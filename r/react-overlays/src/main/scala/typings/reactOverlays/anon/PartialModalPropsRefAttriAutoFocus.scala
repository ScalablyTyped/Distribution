package typings.reactOverlays.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.reactOverlays.esmModalManagerMod.default
import typings.reactOverlays.esmModalMod.ModalHandle
import typings.reactOverlays.esmModalMod.ModalTransitionComponent
import typings.reactOverlays.esmModalMod.RenderModalBackdropProps
import typings.reactOverlays.esmModalMod.RenderModalDialogProps
import typings.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import typings.reactOverlays.reactOverlaysBooleans.`false`
import typings.reactOverlays.reactOverlaysBooleans.`true`
import typings.reactOverlays.reactOverlaysStrings.static
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-overlays.react-overlays/esm/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/esm/Modal.ModalHandle>> */
@js.native
trait PartialModalPropsRefAttriAutoFocus extends js.Object {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var backdrop: js.UndefOr[`true` | `false` | static] = js.native
  
  var backdropTransition: js.UndefOr[ModalTransitionComponent] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[DOMContainer[HTMLElement]] = js.native
  
  var containerClassName: js.UndefOr[String] = js.native
  
  var enforceFocus: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[Key | Null] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var manager: js.UndefOr[default] = js.native
  
  var onBackdropClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.native
  
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ref: js.UndefOr[typings.react.mod.Ref[ModalHandle]] = js.native
  
  var renderBackdrop: js.UndefOr[js.Function1[/* props */ RenderModalBackdropProps, ReactNode]] = js.native
  
  var renderDialog: js.UndefOr[js.Function1[/* props */ RenderModalDialogProps, ReactNode]] = js.native
  
  var restoreFocus: js.UndefOr[Boolean] = js.native
  
  var restoreFocusOptions: js.UndefOr[PreventScroll] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var transition: js.UndefOr[ModalTransitionComponent] = js.native
}
object PartialModalPropsRefAttriAutoFocus {
  
  @scala.inline
  def apply(): PartialModalPropsRefAttriAutoFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalPropsRefAttriAutoFocus]
  }
  
  @scala.inline
  implicit class PartialModalPropsRefAttriAutoFocusOps[Self <: PartialModalPropsRefAttriAutoFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBackdrop(value: `true` | `false` | static): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setBackdropTransition(value: ModalTransitionComponent): Self = this.set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropTransition: Self = this.set("backdropTransition", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainerFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = this.set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainer(value: DOMContainer[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = this.set("enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceFocus: Self = this.set("enforceFocus", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setManager(value: default): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    
    @scala.inline
    def setOnBackdropClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onBackdropClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBackdropClick: Self = this.set("onBackdropClick", js.undefined)
    
    @scala.inline
    def setOnEnter(value: /* node */ HTMLElement => _): Self = this.set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: /* node */ HTMLElement => _): Self = this.set("onEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: /* node */ HTMLElement => _): Self = this.set("onEntering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    
    @scala.inline
    def setOnEscapeKeyDown(value: /* e */ KeyboardEvent => Unit): Self = this.set("onEscapeKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEscapeKeyDown: Self = this.set("onEscapeKeyDown", js.undefined)
    
    @scala.inline
    def setOnExit(value: /* node */ HTMLElement => _): Self = this.set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: /* node */ HTMLElement => _): Self = this.set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: /* node */ HTMLElement => _): Self = this.set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ ModalHandle | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: typings.react.mod.Ref[ModalHandle]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setRenderBackdrop(value: /* props */ RenderModalBackdropProps => ReactNode): Self = this.set("renderBackdrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderBackdrop: Self = this.set("renderBackdrop", js.undefined)
    
    @scala.inline
    def setRenderDialog(value: /* props */ RenderModalDialogProps => ReactNode): Self = this.set("renderDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderDialog: Self = this.set("renderDialog", js.undefined)
    
    @scala.inline
    def setRestoreFocus(value: Boolean): Self = this.set("restoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreFocus: Self = this.set("restoreFocus", js.undefined)
    
    @scala.inline
    def setRestoreFocusOptions(value: PreventScroll): Self = this.set("restoreFocusOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreFocusOptions: Self = this.set("restoreFocusOptions", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransition(value: ModalTransitionComponent): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
