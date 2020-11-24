package typings.reactOverlays.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.Validator
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

/* Inlined react.react.WeakValidationMap<react-overlays.react-overlays/esm/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/esm/Modal.ModalHandle>> */
@js.native
trait WeakValidationMapModalProAutoFocus extends js.Object {
  
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var backdrop: js.UndefOr[Validator[js.UndefOr[`true` | `false` | static | Null]]] = js.native
  
  var backdropTransition: js.UndefOr[Validator[js.UndefOr[ModalTransitionComponent | Null]]] = js.native
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.native
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var container: js.UndefOr[Validator[js.UndefOr[DOMContainer[HTMLElement] | Null]]] = js.native
  
  var containerClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var enforceFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  
  var keyboard: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var manager: js.UndefOr[Validator[js.UndefOr[Null | default]]] = js.native
  
  var onBackdropClick: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]) | Null]]
  ] = js.native
  
  var onEnter: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]] = js.native
  
  var onEntered: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]] = js.native
  
  var onEntering: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]] = js.native
  
  var onEscapeKeyDown: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* e */ KeyboardEvent, Unit]) | Null]]] = js.native
  
  var onExit: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]] = js.native
  
  var onExited: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]] = js.native
  
  var onExiting: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]] = js.native
  
  var onHide: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.native
  
  var onShow: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.native
  
  var ref: js.UndefOr[Validator[js.UndefOr[Null | typings.react.mod.Ref[ModalHandle]]]] = js.native
  
  var renderBackdrop: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* props */ RenderModalBackdropProps, ReactNode]) | Null]
    ]
  ] = js.native
  
  var renderDialog: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ RenderModalDialogProps, ReactNode]) | Null]]
  ] = js.native
  
  var restoreFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var restoreFocusOptions: js.UndefOr[Validator[js.UndefOr[Null | PreventScroll]]] = js.native
  
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var show: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  
  var transition: js.UndefOr[Validator[js.UndefOr[ModalTransitionComponent | Null]]] = js.native
}
object WeakValidationMapModalProAutoFocus {
  
  @scala.inline
  def apply(): WeakValidationMapModalProAutoFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapModalProAutoFocus]
  }
  
  @scala.inline
  implicit class WeakValidationMapModalProAutoFocusOps[Self <: WeakValidationMapModalProAutoFocus] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Validator[js.UndefOr[`true` | `false` | static | Null]]): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setBackdropTransition(value: Validator[js.UndefOr[ModalTransitionComponent | Null]]): Self = this.set("backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropTransition: Self = this.set("backdropTransition", js.undefined)
    
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactElement]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainer(value: Validator[js.UndefOr[DOMContainer[HTMLElement] | Null]]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setEnforceFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceFocus: Self = this.set("enforceFocus", js.undefined)
    
    @scala.inline
    def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setManager(value: Validator[js.UndefOr[Null | default]]): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    
    @scala.inline
    def setOnBackdropClick(value: Validator[js.UndefOr[(js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]) | Null]]): Self = this.set("onBackdropClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBackdropClick: Self = this.set("onBackdropClick", js.undefined)
    
    @scala.inline
    def setOnEnter(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    
    @scala.inline
    def setOnEscapeKeyDown(value: Validator[js.UndefOr[(js.Function1[/* e */ KeyboardEvent, Unit]) | Null]]): Self = this.set("onEscapeKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEscapeKeyDown: Self = this.set("onEscapeKeyDown", js.undefined)
    
    @scala.inline
    def setOnExit(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]): Self = this.set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]): Self = this.set("onExited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, _]) | Null]]): Self = this.set("onExiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    
    @scala.inline
    def setOnHide(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | typings.react.mod.Ref[ModalHandle]]]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRenderBackdrop(
      value: Validator[
          js.UndefOr[(js.Function1[/* props */ RenderModalBackdropProps, ReactNode]) | Null]
        ]
    ): Self = this.set("renderBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderBackdrop: Self = this.set("renderBackdrop", js.undefined)
    
    @scala.inline
    def setRenderDialog(value: Validator[js.UndefOr[(js.Function1[/* props */ RenderModalDialogProps, ReactNode]) | Null]]): Self = this.set("renderDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDialog: Self = this.set("renderDialog", js.undefined)
    
    @scala.inline
    def setRestoreFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("restoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreFocus: Self = this.set("restoreFocus", js.undefined)
    
    @scala.inline
    def setRestoreFocusOptions(value: Validator[js.UndefOr[Null | PreventScroll]]): Self = this.set("restoreFocusOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreFocusOptions: Self = this.set("restoreFocusOptions", js.undefined)
    
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setShow(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransition(value: Validator[js.UndefOr[ModalTransitionComponent | Null]]): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
