package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.Rect
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.RefObject
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.popupContentMod.PopupContentProps
import typings.semanticUiReact.popupHeaderMod.PopupHeaderProps
import typings.semanticUiReact.portalPortalMod.StrictPortalProps
import typings.semanticUiReact.semanticUiReactStrings.`bottom center`
import typings.semanticUiReact.semanticUiReactStrings.`bottom left`
import typings.semanticUiReact.semanticUiReactStrings.`bottom right`
import typings.semanticUiReact.semanticUiReactStrings.`left center`
import typings.semanticUiReact.semanticUiReactStrings.`right center`
import typings.semanticUiReact.semanticUiReactStrings.`top center`
import typings.semanticUiReact.semanticUiReactStrings.`top left`
import typings.semanticUiReact.semanticUiReactStrings.`top right`
import typings.semanticUiReact.semanticUiReactStrings.click
import typings.semanticUiReact.semanticUiReactStrings.focus
import typings.semanticUiReact.semanticUiReactStrings.hover
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.very
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupPopupMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup/Popup", JSImport.Default)
  @js.native
  open class default protected () extends Component[PopupProps, ComponentState, Any] {
    def this(props: PopupProps) = this()
    def this(props: PopupProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup/Popup", JSImport.Default)
  @js.native
  val default: PopupComponent = js.native
  
  type PopperOffsetsFunction = js.Function1[
    /* params */ PopperOffsetsFunctionParams, 
    js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]
  ]
  
  trait PopperOffsetsFunctionParams extends StObject {
    
    var placement: Placement
    
    var popper: Rect
    
    var reference: Rect
  }
  object PopperOffsetsFunctionParams {
    
    inline def apply(placement: Placement, popper: Rect, reference: Rect): PopperOffsetsFunctionParams = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperOffsetsFunctionParams]
    }
    
    extension [Self <: PopperOffsetsFunctionParams](x: Self) {
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupComponent
    extends StObject
       with ComponentClass[PopupProps, ComponentState] {
    
    var Content: FC[PopupContentProps] = js.native
    
    var Header: FC[PopupHeaderProps] = js.native
  }
  
  trait PopupProps
    extends StObject
       with StrictPopupProps
       with /* key */ StringDictionary[Any]
  object PopupProps {
    
    inline def apply(): PopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupProps]
    }
  }
  
  trait StrictPopupProps
    extends StObject
       with StrictPortalProps {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Display the popup without the pointing arrow */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Simple text content for the popover. */
    var content: js.UndefOr[SemanticShorthandItem[PopupContentProps]] = js.undefined
    
    /** Existing element the pop-up should be bound to. */
    var context: js.UndefOr[Document | Window | HTMLElement | RefObject[HTMLElement]] = js.undefined
    
    /** A disabled popup only renders its trigger. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the Popper.js event listeners. */
    var eventsEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** A flowing Popup has no maximum width and continues to flow to fit its content. */
    var flowing: js.UndefOr[Boolean] = js.undefined
    
    /** Header displayed above the content in bold. */
    var header: js.UndefOr[SemanticShorthandItem[PopupHeaderProps]] = js.undefined
    
    /** Hide the Popup when scrolling the window. */
    var hideOnScroll: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the popup should not close on hover. */
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    /** Invert the colors of the popup */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Offset values in px unit to apply to rendered popup. The basic offset accepts an
      * array with two numbers in the form [skidding, distance]:
      * - `skidding` displaces the Popup along the reference element
      * - `distance` displaces the Popup away from, or toward, the reference element in the direction of its placement. A positive number displaces it further away, while a negative number lets it overlap the reference.
      *
      * @see https://popper.js.org/docs/v2/modifiers/offset/
      */
    var offset: js.UndefOr[(js.Tuple2[Double, js.UndefOr[Double]]) | PopperOffsetsFunction] = js.undefined
    
    /** Events triggering the popup. */
    var on: js.UndefOr[hover | click | focus | (js.Array[hover | click | focus])] = js.undefined
    
    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onClose")
    var onClose_StrictPopupProps: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is mounted on the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onMount")
    var onMount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PopupProps, Unit]] = js.undefined
    
    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onOpen")
    var onOpen_StrictPopupProps: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is unmounted from the DOM.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    @JSName("onUnmount")
    var onUnmount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PopupProps, Unit]] = js.undefined
    
    /** Disables automatic repositioning of the component, it will always be placed according to the position value. */
    var pinned: js.UndefOr[Boolean] = js.undefined
    
    /** A wrapping element for an actual content that will be used for positioning. */
    var popper: js.UndefOr[SemanticShorthandItem[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /** A popup can have dependencies which update will schedule a position update. */
    var popperDependencies: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** An array containing custom settings for the Popper.js modifiers. */
    var popperModifiers: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Position for the popover. */
    var position: js.UndefOr[
        (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
      ] = js.undefined
    
    /** Tells `Popper.js` to use the `position: fixed` strategy to position the popover. */
    var positionFixed: js.UndefOr[Boolean] = js.undefined
    
    /** Popup size. */
    var size: js.UndefOr[mini | tiny | small | large | huge] = js.undefined
    
    /** Custom Popup style. */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** Popup width. */
    var wide: js.UndefOr[Boolean | very] = js.undefined
  }
  object StrictPopupProps {
    
    inline def apply(): StrictPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPopupProps]
    }
    
    extension [Self <: StrictPopupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandItem[PopupContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction3(
        value: (/* component */ ElementType[PopupContentProps], PopupContentProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContext(value: Document | Window | HTMLElement | RefObject[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
      
      inline def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
      
      inline def setFlowing(value: Boolean): Self = StObject.set(x, "flowing", value.asInstanceOf[js.Any])
      
      inline def setFlowingUndefined: Self = StObject.set(x, "flowing", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[PopupHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType[PopupHeaderProps], PopupHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
      
      inline def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setOffset(value: (js.Tuple2[Double, js.UndefOr[Double]]) | PopperOffsetsFunction): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(
        value: /* params */ PopperOffsetsFunctionParams => js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]
      ): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOn(value: hover | click | focus | (js.Array[hover | click | focus])): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction2(value))
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnOpen(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnUnmount(value: (/* nothing */ Null, /* data */ PopupProps) => Unit): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2(value))
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setOnVarargs(value: (hover | click | focus)*): Self = StObject.set(x, "on", js.Array(value*))
      
      inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setPopper(value: SemanticShorthandItem[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setPopperDependencies(value: js.Array[Any]): Self = StObject.set(x, "popperDependencies", value.asInstanceOf[js.Any])
      
      inline def setPopperDependenciesUndefined: Self = StObject.set(x, "popperDependencies", js.undefined)
      
      inline def setPopperDependenciesVarargs(value: Any*): Self = StObject.set(x, "popperDependencies", js.Array(value*))
      
      inline def setPopperFunction3(
        value: (/* component */ ElementType[HTMLAttributes[HTMLDivElement]], HTMLAttributes[HTMLDivElement], /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "popper", js.Any.fromFunction3(value))
      
      inline def setPopperModifiers(value: js.Array[Any]): Self = StObject.set(x, "popperModifiers", value.asInstanceOf[js.Any])
      
      inline def setPopperModifiersUndefined: Self = StObject.set(x, "popperModifiers", js.undefined)
      
      inline def setPopperModifiersVarargs(value: Any*): Self = StObject.set(x, "popperModifiers", js.Array(value*))
      
      inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
      
      inline def setPosition(
        value: (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
      
      inline def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSize(value: mini | tiny | small | large | huge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWide(value: Boolean | very): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
      
      inline def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    }
  }
  
  type _To = PopupComponent
  
  /* This means you don't have to write `default`, but can instead just say `popupPopupMod.foo` */
  override def _to: PopupComponent = default
}
