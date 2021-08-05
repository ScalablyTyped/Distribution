package typings.reactOverlays

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.RefCallback
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.reactOverlays.anon.HandleContainerOverflow
import typings.reactOverlays.anon.PartialModalPropsRefAttriAutoFocus
import typings.reactOverlays.anon.PreventScroll
import typings.reactOverlays.anon.WeakValidationMapModalProAutoFocus
import typings.reactOverlays.anon.inbooleanappearbooleanund
import typings.reactOverlays.esmModalManagerMod.default
import typings.reactOverlays.esmTypesMod.TransitionCallbacks
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

object esmModalMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<react-overlays.react-overlays/esm/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/esm/Modal.ModalHandle>> & {  Manager :new (hasHideSiblingNodesHandleContainerOverflow : {  hideSiblingNodes :boolean | undefined,   handleContainerOverflow :boolean | undefined} | undefined): react-overlays.react-overlays/esm/ModalManager.default} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: ModalProps & RefAttributes[ModalHandle]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("react-overlays/esm/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-overlays/esm/Modal", "default.Manager")
    @js.native
    class Manager ()
      extends typings.reactOverlays.esmModalManagerMod.default {
      def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
    }
    @JSImport("react-overlays/esm/Modal", "default.Manager")
    @js.native
    def Manager: Instantiable1[
        /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
        typings.reactOverlays.esmModalManagerMod.default
      ] = js.native
    inline def Manager_=(
      x: Instantiable1[
          /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
          typings.reactOverlays.esmModalManagerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Manager")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialModalPropsRefAttriAutoFocus] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialModalPropsRefAttriAutoFocus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapModalProAutoFocus] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapModalProAutoFocus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Modal", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  trait ModalHandle extends StObject {
    
    var backdrop: HTMLElement | Null
    
    var dialog: HTMLElement | Null
  }
  object ModalHandle {
    
    inline def apply(): ModalHandle = {
      val __obj = js.Dynamic.literal(backdrop = null, dialog = null)
      __obj.asInstanceOf[ModalHandle]
    }
    
    extension [Self <: ModalHandle](x: Self) {
      
      inline def setBackdrop(value: HTMLElement): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropNull: Self = StObject.set(x, "backdrop", null)
      
      inline def setDialog(value: HTMLElement): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogNull: Self = StObject.set(x, "dialog", null)
    }
  }
  
  trait ModalProps
    extends StObject
       with TransitionCallbacks
       with /* other */ StringDictionary[js.Any] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdrop: js.UndefOr[`true` | `false` | static] = js.undefined
    
    var backdropTransition: js.UndefOr[ModalTransitionComponent] = js.undefined
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[DOMContainer[HTMLElement]] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var manager: js.UndefOr[default] = js.undefined
    
    var onBackdropClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onEscapeKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderBackdrop: js.UndefOr[js.Function1[/* props */ RenderModalBackdropProps, ReactNode]] = js.undefined
    
    var renderDialog: js.UndefOr[js.Function1[/* props */ RenderModalDialogProps, ReactNode]] = js.undefined
    
    var restoreFocus: js.UndefOr[Boolean] = js.undefined
    
    var restoreFocusOptions: js.UndefOr[PreventScroll] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transition: js.UndefOr[ModalTransitionComponent] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
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
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setManager(value: default): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
      
      inline def setOnBackdropClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onBackdropClick", js.Any.fromFunction1(value))
      
      inline def setOnBackdropClickUndefined: Self = StObject.set(x, "onBackdropClick", js.undefined)
      
      inline def setOnEscapeKeyDown(value: /* e */ KeyboardEvent => Unit): Self = StObject.set(x, "onEscapeKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnEscapeKeyDownUndefined: Self = StObject.set(x, "onEscapeKeyDown", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
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
  
  type ModalTransitionComponent = ComponentType[inbooleanappearbooleanund]
  
  trait RenderModalBackdropProps extends StObject {
    
    def onClick(event: SyntheticEvent[Element, Event]): Unit
    
    var ref: RefCallback[Element]
  }
  object RenderModalBackdropProps {
    
    inline def apply(onClick: SyntheticEvent[Element, Event] => Unit, ref: /* instance */ Element | Null => Unit): RenderModalBackdropProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[RenderModalBackdropProps]
    }
    
    extension [Self <: RenderModalBackdropProps](x: Self) {
      
      inline def setOnClick(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRef(value: /* instance */ Element | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  trait RenderModalDialogProps extends StObject {
    
    var `aria-modal`: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var ref: RefCallback[Element]
    
    var role: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: Double
  }
  object RenderModalDialogProps {
    
    inline def apply(ref: /* instance */ Element | Null => Unit, role: String, tabIndex: Double): RenderModalDialogProps = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref), role = role.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderModalDialogProps]
    }
    
    extension [Self <: RenderModalDialogProps](x: Self) {
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRef(value: /* instance */ Element | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
}
