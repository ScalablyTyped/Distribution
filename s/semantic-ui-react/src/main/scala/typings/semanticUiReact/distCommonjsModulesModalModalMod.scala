package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsAddonsPortalPortalMod.StrictPortalProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typings.semanticUiReact.distCommonjsModulesModalModalContentMod.ModalContentProps
import typings.semanticUiReact.distCommonjsModulesModalModalDescriptionMod.ModalDescriptionProps
import typings.semanticUiReact.distCommonjsModulesModalModalDimmerMod.ModalDimmerProps
import typings.semanticUiReact.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesModalModalMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", JSImport.Default)
  @js.native
  open class default protected () extends Component[ModalProps, ComponentState, Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", JSImport.Default)
    @js.native
    val ^ : ModalComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/Modal", "default.Actions")
    @js.native
    open class Actions protected () extends Component[ModalActionsProps, ComponentState, Any] {
      def this(props: ModalActionsProps) = this()
      def this(props: ModalActionsProps, context: Any) = this()
    }
    
    type _To = ModalComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ModalComponent = ^
  }
  
  @js.native
  trait ModalComponent
    extends StObject
       with ComponentClass[ModalProps, ComponentState] {
    
    var Actions: ComponentClass[ModalActionsProps, ComponentState] = js.native
    
    var Content: FC[ModalContentProps] = js.native
    
    var Description: FC[ModalDescriptionProps] = js.native
    
    var Dimmer: FC[ModalDimmerProps] = js.native
    
    var Header: FC[ModalHeaderProps] = js.native
  }
  
  trait ModalProps
    extends StObject
       with StrictModalProps
       with /* key */ StringDictionary[Any]
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
  }
  
  trait StrictModalProps
    extends StObject
       with StrictPortalProps {
    
    /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
    var actions: js.UndefOr[SemanticShorthandItem[ModalActionsProps]] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A Modal can reduce its complexity */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** A modal can be vertically centered in the viewport. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Icon. */
    var closeIcon: js.UndefOr[Any] = js.undefined
    
    /** Whether or not the Modal should close when the dimmer is clicked. */
    var closeOnDimmerClick: js.UndefOr[Boolean] = js.undefined
    
    /** A Modal can be passed content via shorthand. */
    var content: js.UndefOr[SemanticShorthandItem[ModalContentProps]] = js.undefined
    
    /** A modal can appear in a dimmer. */
    var dimmer: js.UndefOr[true | "blurring" | "inverted" | SemanticShorthandItem[ModalDimmerProps]] = js.undefined
    
    /** A Modal can be passed header via shorthand. */
    var header: js.UndefOr[SemanticShorthandItem[ModalHeaderProps]] = js.undefined
    
    /**
      * Action onClick handler when using shorthand `actions`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onActionClick: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onClose")
    var onClose_StrictModalProps: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onMount")
    var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
    
    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onOpen")
    var onOpen_StrictModalProps: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onUnmount")
    var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
    
    /** A modal can vary in size. */
    var size: js.UndefOr["mini" | "tiny" | "small" | "large" | "fullscreen"] = js.undefined
    
    /** Custom styles. */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StrictModalProps {
    
    inline def apply(): StrictModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalProps]
    }
    
    extension [Self <: StrictModalProps](x: Self) {
      
      inline def setActions(value: SemanticShorthandItem[ModalActionsProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsFunction3(
        value: (/* component */ ElementType[ModalActionsProps], ModalActionsProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: Any): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseOnDimmerClick(value: Boolean): Self = StObject.set(x, "closeOnDimmerClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnDimmerClickUndefined: Self = StObject.set(x, "closeOnDimmerClick", js.undefined)
      
      inline def setContent(value: SemanticShorthandItem[ModalContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction3(
        value: (/* component */ ElementType[ModalContentProps], ModalContentProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDimmer(value: true | "blurring" | "inverted" | SemanticShorthandItem[ModalDimmerProps]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      
      inline def setDimmerFunction3(
        value: (/* component */ ElementType[ModalDimmerProps], ModalDimmerProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "dimmer", js.Any.fromFunction3(value))
      
      inline def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[ModalHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType[ModalHeaderProps], ModalHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setOnActionClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      inline def setOnClose(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction2(value))
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnOpen(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnUnmount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2(value))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setSize(value: "mini" | "tiny" | "small" | "large" | "fullscreen"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
