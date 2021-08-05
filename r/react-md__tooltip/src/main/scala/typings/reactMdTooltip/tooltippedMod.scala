package typings.reactMdTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.reactMdTooltip.useHandlersMod.MergableHandlers
import typings.reactMdUtils.typesMod.SimplePosition
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltippedMod {
  
  object Tooltipped {
    
    inline def apply(
      hasIdChildrenTooltipChildrenDenseVhMarginVwMarginHoverDelayFocusDelayTouchTimeoutSpacingDenseSpacingPropPositionPositionThresholdPortalPortalIntoPortalIntoIdOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnContextMenuOnFocusOnKeyDownOnShowOnHideDisableHoverModeDescribedByDefaultPositionDisableSwappingMountOnEnterUnmountOnExitDisableAutoSpacingProps: TooltippedProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasIdChildrenTooltipChildrenDenseVhMarginVwMarginHoverDelayFocusDelayTouchTimeoutSpacingDenseSpacingPropPositionPositionThresholdPortalPortalIntoPortalIntoIdOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnContextMenuOnFocusOnKeyDownOnShowOnHideDisableHoverModeDescribedByDefaultPositionDisableSwappingMountOnEnterUnmountOnExitDisableAutoSpacingProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.defaultPosition")
      @js.native
      def defaultPosition: js.Any = js.native
      inline def defaultPosition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.dense")
      @js.native
      def dense: js.Any = js.native
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.denseSpacing")
      @js.native
      def denseSpacing: js.Any = js.native
      inline def denseSpacing_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("denseSpacing")(x.asInstanceOf[js.Any])
      
      inline def dense_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dense")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.disableAutoSpacing")
      @js.native
      def disableAutoSpacing: js.Any = js.native
      inline def disableAutoSpacing_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableAutoSpacing")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.focusDelay")
      @js.native
      def focusDelay: js.Any = js.native
      inline def focusDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.hoverDelay")
      @js.native
      def hoverDelay: js.Any = js.native
      inline def hoverDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.lineWrap")
      @js.native
      def lineWrap: js.Any = js.native
      inline def lineWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.mountOnEnter")
      @js.native
      def mountOnEnter: js.Any = js.native
      inline def mountOnEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      inline def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.positionThreshold")
      @js.native
      def positionThreshold: js.Any = js.native
      inline def positionThreshold_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionThreshold")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.spacing")
      @js.native
      def spacing: js.Any = js.native
      inline def spacing_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spacing")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.tooltipId")
      @js.native
      def tooltipId: js.Any = js.native
      inline def tooltipId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipId")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.touchTimeout")
      @js.native
      def touchTimeout: js.Any = js.native
      inline def touchTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchTimeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.unmountOnExit")
      @js.native
      def unmountOnExit: js.Any = js.native
      inline def unmountOnExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.vhMargin")
      @js.native
      def vhMargin: js.Any = js.native
      inline def vhMargin_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vhMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/Tooltipped", "Tooltipped.propTypes.vwMargin")
      @js.native
      def vwMargin: js.Any = js.native
      inline def vwMargin_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vwMargin")(x.asInstanceOf[js.Any])
    }
  }
  
  type ChildElement = ReactElement
  
  /* Inlined std.Partial<std.Omit<@react-md/tooltip.@react-md/tooltip/types/Tooltipped.TooltippedProvidedProps, 'tooltip'>> */
  trait ChildProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  }
  object ChildProps {
    
    inline def apply(): ChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildProps]
    }
    
    extension [Self <: ChildProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  type ChildrenRenderer = js.Function1[/* props */ TooltippedProvidedProps, ReactElement]
  
  /* Inlined parent @react-md/portal.@react-md/portal.RenderConditionalPortalProps */
  /* Inlined parent std.Omit<@react-md/tooltip.@react-md/tooltip/types/useTooltipState.TooltipStateOptions, 'defaultPosition'> */
  /* Inlined parent std.Partial<std.Pick<@react-md/tooltip.@react-md/tooltip/types/useTooltipState.TooltipStateOptions, 'defaultPosition'>> */
  /* Inlined parent std.Pick<@react-md/tooltip.@react-md/tooltip/types/Tooltip.TooltipProps, 'dense' | 'lineWrap' | 'mountOnEnter' | 'unmountOnExit'> */
  trait TooltippedProps extends StObject {
    
    /**
      * An optional additional `aria-describedby` id or ids to merge with the
      * tooltip id. This is really used for things like notifications or when
      * multiple elements describe your tooltipped element.
      */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /**
      * The children for this component should either be a function or a single
      * element. When the children is a single React element, this component will
      * clone in an `id`, `aria-describedby`, and all the event handlers required
      * to show and hide a tooltip relative to that element. This means that you
      * will need to ensure that the child component accepts and passes down the
      * `on*` event handlers to a DOM node as well as the `id` and
      * `aria-describedby` for accessibility. Every component within react-md
      * should do this by default.
      *
      * If the children is a function, the `id`, `aria-describedby`, and event
      * handlers will be provided as well as a new `tooltip` prop so that you have
      * more control over rendering the tooltip.
      *
      * If the tooltip prop was not provided to this component, the
      * `aria-describedby` and the event handlers will be omitted.
      */
    var children: ChildElement | ChildrenRenderer
    
    /**
      * An optional className for the tooltip
      */
    var className: js.UndefOr[String] = js.undefined
    
    var defaultPosition: js.UndefOr[SimplePosition] = js.undefined
    
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of spacing to use for a dense tooltip. This is the distance
      * between the container element and the tooltip.
      */
    var denseSpacing: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Since `react-md` provides mixins to automatically apply a dense spec
      * through mixins via mexia queries, the dense spec might be applied in css
      * instead of in JS. This component will actually check the current spacing
      * amount that has been applied when the tooltip becomes visible.
      *
      * If this behavior is not desired, you can enable this prop and it will only
      * use the provided `spacing` or `denseSpacing` props based on the `dense`
      * prop.
      *
      * Note: This will be defaulted to `true` when the `process.env.NODE_ENV ===
      * 'test'` since test environments normally don't have a default
      * `window.getComgetComputedStyle` value that is not `NaN` which will display
      * errors in your tests.
      */
    var disableAutoSpacing: js.UndefOr[Boolean] = js.undefined
    
    var disableHoverMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the auto-swapping behavior should be disabled. When this value
      * is `undefined`, it'll be treated as `true` when the `position` prop is
      * defined, otherwise `false`.
      */
    var disableSwapping: js.UndefOr[Boolean] = js.undefined
    
    var focusDelay: js.UndefOr[Double] = js.undefined
    
    var hoverDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The id for the element that has a tooltip. This is always required since it
      * will be passed down to the `containerProps` in the children renderer
      * function. It is also used to generate a `tooltipId` when there is a
      * tooltip.
      */
    var id: String
    
    var lineWrap: js.UndefOr[Boolean] = js.undefined
    
    var mountOnEnter: js.UndefOr[js.Any] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* mode */ UserInteractionMode, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Boolean if the portal should be used.
      */
    var portal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see {@link Portal#into}
      */
    var portalInto: js.UndefOr[PortalInto] = js.undefined
    
    /**
      * @see {@link Portal#intoId}
      */
    var portalIntoId: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[SimplePosition] = js.undefined
    
    var positionThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of spacing to use for a non-dense tooltip. This is the distance
      * between the container element and the tooltip.
      */
    var spacing: js.UndefOr[Double | String] = js.undefined
    
    /**
      * An optional style for the tooltip.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The tooltip to display. When this is false-ish, the children renderer will
      * always return `null` for the `tooltip` prop.
      */
    var tooltip: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional id for the tooltip. When this is omitted, it will be set as
      * `${id}-tooltip`.
      */
    var tooltipId: js.UndefOr[String] = js.undefined
    
    var touchTimeout: js.UndefOr[Double] = js.undefined
    
    var unmountOnExit: js.UndefOr[js.Any] = js.undefined
    
    /**
      * This is the viewheight margin to use in the positioning calculation. This
      * is just used so that the tooltip can be placed with some spacing between
      * the top and abottom edges of the viewport if desired.
      */
    var vhMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the viewwidth margin to use in the positioning calculation. This is
      * just used so that the tooltip can be placed with some spacing between the
      * left and right edges of the viewport if desired.
      */
    var vwMargin: js.UndefOr[Double] = js.undefined
  }
  object TooltippedProps {
    
    inline def apply(children: ChildElement | ChildrenRenderer, id: String): TooltippedProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltippedProps]
    }
    
    extension [Self <: TooltippedProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setChildren(value: ChildElement | ChildrenRenderer): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ TooltippedProvidedProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultPosition(value: SimplePosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseSpacing(value: Double | String): Self = StObject.set(x, "denseSpacing", value.asInstanceOf[js.Any])
      
      inline def setDenseSpacingUndefined: Self = StObject.set(x, "denseSpacing", js.undefined)
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setDisableAutoSpacing(value: Boolean): Self = StObject.set(x, "disableAutoSpacing", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoSpacingUndefined: Self = StObject.set(x, "disableAutoSpacing", js.undefined)
      
      inline def setDisableHoverMode(value: Boolean): Self = StObject.set(x, "disableHoverMode", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverModeUndefined: Self = StObject.set(x, "disableHoverMode", js.undefined)
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setDisableSwappingUndefined: Self = StObject.set(x, "disableSwapping", js.undefined)
      
      inline def setFocusDelay(value: Double): Self = StObject.set(x, "focusDelay", value.asInstanceOf[js.Any])
      
      inline def setFocusDelayUndefined: Self = StObject.set(x, "focusDelay", js.undefined)
      
      inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLineWrap(value: Boolean): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setMountOnEnter(value: js.Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnShow(value: /* mode */ UserInteractionMode => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalInto(value: PortalInto): Self = StObject.set(x, "portalInto", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "portalInto", js.Any.fromFunction0(value))
      
      inline def setPortalIntoId(value: String): Self = StObject.set(x, "portalIntoId", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoIdUndefined: Self = StObject.set(x, "portalIntoId", js.undefined)
      
      inline def setPortalIntoNull: Self = StObject.set(x, "portalInto", null)
      
      inline def setPortalIntoUndefined: Self = StObject.set(x, "portalInto", js.undefined)
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionThreshold(value: Double): Self = StObject.set(x, "positionThreshold", value.asInstanceOf[js.Any])
      
      inline def setPositionThresholdUndefined: Self = StObject.set(x, "positionThreshold", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipId(value: String): Self = StObject.set(x, "tooltipId", value.asInstanceOf[js.Any])
      
      inline def setTooltipIdUndefined: Self = StObject.set(x, "tooltipId", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTouchTimeout(value: Double): Self = StObject.set(x, "touchTimeout", value.asInstanceOf[js.Any])
      
      inline def setTouchTimeoutUndefined: Self = StObject.set(x, "touchTimeout", js.undefined)
      
      inline def setUnmountOnExit(value: js.Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
      
      inline def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      inline def setVhMarginUndefined: Self = StObject.set(x, "vhMargin", js.undefined)
      
      inline def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      inline def setVwMarginUndefined: Self = StObject.set(x, "vwMargin", js.undefined)
    }
  }
  
  trait TooltippedProvidedProps
    extends StObject
       with MergableHandlers {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var tooltip: ReactNode
  }
  object TooltippedProvidedProps {
    
    inline def apply(id: String): TooltippedProvidedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltippedProvidedProps]
    }
    
    extension [Self <: TooltippedProvidedProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
