package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.modalActionsMod.ModalActionsProps
import typings.semanticUiReact.modalContentMod.ModalContentProps
import typings.semanticUiReact.modalDescriptionMod.ModalDescriptionProps
import typings.semanticUiReact.modalDimmerMod.ModalDimmerProps
import typings.semanticUiReact.modalHeaderMod.ModalHeaderProps
import typings.semanticUiReact.portalPortalMod.StrictPortalProps
import typings.semanticUiReact.semanticUiReactBooleans.`true`
import typings.semanticUiReact.semanticUiReactStrings.blurring
import typings.semanticUiReact.semanticUiReactStrings.fullscreen
import typings.semanticUiReact.semanticUiReactStrings.inverted
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ModalProps, ComponentState, js.Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", JSImport.Default)
    @js.native
    val ^ : ModalComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", "default.Actions")
    @js.native
    class Actions protected ()
      extends Component[ModalActionsProps, ComponentState, js.Any] {
      def this(props: ModalActionsProps) = this()
      def this(props: ModalActionsProps, context: js.Any) = this()
    }
    
    type _To = ModalComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ModalComponent = ^
  }
  
  @js.native
  trait ModalComponent extends ComponentClass[ModalProps, ComponentState] {
    
    var Actions: ComponentClass[ModalActionsProps, ComponentState] = js.native
    
    var Content: StatelessComponent[ModalContentProps] = js.native
    
    var Description: StatelessComponent[ModalDescriptionProps] = js.native
    
    var Dimmer: StatelessComponent[ModalDimmerProps] = js.native
    
    var Header: StatelessComponent[ModalHeaderProps] = js.native
  }
  
  @js.native
  trait ModalProps
    extends StrictModalProps
       with /* key */ StringDictionary[js.Any]
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
  }
  
  @js.native
  trait StrictModalProps extends StrictPortalProps {
    
    /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
    var actions: js.UndefOr[SemanticShorthandItem[ModalActionsProps]] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A Modal can reduce its complexity */
    var basic: js.UndefOr[Boolean] = js.native
    
    /** A modal can be vertically centered in the viewport. */
    var centered: js.UndefOr[Boolean] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Icon. */
    var closeIcon: js.UndefOr[js.Any] = js.native
    
    /** Whether or not the Modal should close when the dimmer is clicked. */
    var closeOnDimmerClick: js.UndefOr[Boolean] = js.native
    
    /** A Modal can be passed content via shorthand. */
    var content: js.UndefOr[SemanticShorthandItem[ModalContentProps]] = js.native
    
    /** A modal can appear in a dimmer. */
    var dimmer: js.UndefOr[`true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]] = js.native
    
    /** A Modal can be passed header via shorthand. */
    var header: js.UndefOr[SemanticShorthandItem[ModalHeaderProps]] = js.native
    
    /**
      * Action onClick handler when using shorthand `actions`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onActionClick: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
      ] = js.native
    
    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onClose")
    var onClose_StrictModalProps: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
      ] = js.native
    
    /**
      * Called when the portal is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onMount")
    var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.native
    
    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onOpen")
    var onOpen_StrictModalProps: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
      ] = js.native
    
    /**
      * Called when the portal is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onUnmount")
    var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.native
    
    /** A modal can vary in size. */
    var size: js.UndefOr[mini | tiny | small | large | fullscreen] = js.native
    
    /** Custom styles. */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object StrictModalProps {
    
    @scala.inline
    def apply(): StrictModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalProps]
    }
    
    @scala.inline
    implicit class StrictModalPropsMutableBuilder[Self <: StrictModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: SemanticShorthandItem[ModalActionsProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsFunction3(
        value: (/* component */ ElementType[ModalActionsProps], ModalActionsProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: js.Any): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setCloseOnDimmerClick(value: Boolean): Self = StObject.set(x, "closeOnDimmerClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnDimmerClickUndefined: Self = StObject.set(x, "closeOnDimmerClick", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandItem[ModalContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction3(
        value: (/* component */ ElementType[ModalContentProps], ModalContentProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDimmer(value: `true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimmerFunction3(
        value: (/* component */ ElementType[ModalDimmerProps], ModalDimmerProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "dimmer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[ModalHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ElementType[ModalHeaderProps], ModalHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setOnActionClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | fullscreen): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
