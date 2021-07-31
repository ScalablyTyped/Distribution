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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<react-overlays.react-overlays/esm/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/esm/Modal.ModalHandle>> */
trait WeakValidationMapModalProAutoFocus extends StObject {
  
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var backdrop: js.UndefOr[Validator[js.UndefOr[`true` | `false` | static | Null]]] = js.undefined
  
  var backdropTransition: js.UndefOr[Validator[js.UndefOr[ModalTransitionComponent | Null]]] = js.undefined
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var container: js.UndefOr[Validator[js.UndefOr[DOMContainer[HTMLElement] | Null]]] = js.undefined
  
  var containerClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var enforceFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.undefined
  
  var keyboard: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var manager: js.UndefOr[Validator[js.UndefOr[Null | default]]] = js.undefined
  
  var onBackdropClick: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]) | Null]]
  ] = js.undefined
  
  var onEnter: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]] = js.undefined
  
  var onEntered: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]] = js.undefined
  
  var onEntering: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]] = js.undefined
  
  var onEscapeKeyDown: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* e */ KeyboardEvent, Unit]) | Null]]] = js.undefined
  
  var onExit: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]] = js.undefined
  
  var onExited: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]] = js.undefined
  
  var onExiting: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]] = js.undefined
  
  var onHide: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onShow: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var ref: js.UndefOr[Validator[js.UndefOr[Null | typings.react.mod.Ref[ModalHandle]]]] = js.undefined
  
  var renderBackdrop: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* props */ RenderModalBackdropProps, ReactNode]) | Null]
    ]
  ] = js.undefined
  
  var renderDialog: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ RenderModalDialogProps, ReactNode]) | Null]]
  ] = js.undefined
  
  var restoreFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var restoreFocusOptions: js.UndefOr[Validator[js.UndefOr[Null | PreventScroll]]] = js.undefined
  
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var show: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  
  var transition: js.UndefOr[Validator[js.UndefOr[ModalTransitionComponent | Null]]] = js.undefined
}
object WeakValidationMapModalProAutoFocus {
  
  @scala.inline
  def apply(): WeakValidationMapModalProAutoFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapModalProAutoFocus]
  }
  
  @scala.inline
  implicit class WeakValidationMapModalProAutoFocusMutableBuilder[Self <: WeakValidationMapModalProAutoFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Validator[js.UndefOr[`true` | `false` | static | Null]]): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropTransition(value: Validator[js.UndefOr[ModalTransitionComponent | Null]]): Self = StObject.set(x, "backdropTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropTransitionUndefined: Self = StObject.set(x, "backdropTransition", js.undefined)
    
    @scala.inline
    def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContainer(value: Validator[js.UndefOr[DOMContainer[HTMLElement] | Null]]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setEnforceFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
    
    @scala.inline
    def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setManager(value: Validator[js.UndefOr[Null | default]]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    @scala.inline
    def setOnBackdropClick(value: Validator[js.UndefOr[(js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]) | Null]]): Self = StObject.set(x, "onBackdropClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
    
    @scala.inline
    def setOnEnter(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    @scala.inline
    def setOnEntered(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    @scala.inline
    def setOnEntering(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    @scala.inline
    def setOnEscapeKeyDown(value: Validator[js.UndefOr[(js.Function1[/* e */ KeyboardEvent, Unit]) | Null]]): Self = StObject.set(x, "onEscapeKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
    
    @scala.inline
    def setOnExit(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    @scala.inline
    def setOnExited(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    @scala.inline
    def setOnExiting(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, js.Any]) | Null]]): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    
    @scala.inline
    def setOnHide(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | typings.react.mod.Ref[ModalHandle]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRenderBackdrop(
      value: Validator[
          js.UndefOr[(js.Function1[/* props */ RenderModalBackdropProps, ReactNode]) | Null]
        ]
    ): Self = StObject.set(x, "renderBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderBackdropUndefined: Self = StObject.set(x, "renderBackdrop", js.undefined)
    
    @scala.inline
    def setRenderDialog(value: Validator[js.UndefOr[(js.Function1[/* props */ RenderModalDialogProps, ReactNode]) | Null]]): Self = StObject.set(x, "renderDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDialogUndefined: Self = StObject.set(x, "renderDialog", js.undefined)
    
    @scala.inline
    def setRestoreFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreFocusOptions(value: Validator[js.UndefOr[Null | PreventScroll]]): Self = StObject.set(x, "restoreFocusOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreFocusOptionsUndefined: Self = StObject.set(x, "restoreFocusOptions", js.undefined)
    
    @scala.inline
    def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
    
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setShow(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTransition(value: Validator[js.UndefOr[ModalTransitionComponent | Null]]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
