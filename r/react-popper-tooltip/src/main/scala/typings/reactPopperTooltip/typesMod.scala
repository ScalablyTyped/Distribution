package typings.reactPopperTooltip

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.enumsMod.Placement
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactPopper.mod.Modifier
import typings.reactPopper.mod.PopperArrowProps
import typings.reactPopperTooltip.anon.Current
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ChildrenArg extends StObject {
    
    def getTriggerProps(): GetTriggerPropsArg = js.native
    def getTriggerProps(arg: GetTriggerPropsArg): GetTriggerPropsArg = js.native
    
    var triggerRef: Ref = js.native
  }
  
  @js.native
  trait GetArrowPropsArg
    extends /* key */ StringDictionary[js.Any] {
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object GetArrowPropsArg {
    
    @scala.inline
    def apply(): GetArrowPropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetArrowPropsArg]
    }
    
    @scala.inline
    implicit class GetArrowPropsArgMutableBuilder[Self <: GetArrowPropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait GetTooltipPropsArg
    extends /* key */ StringDictionary[js.Any] {
    
    var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object GetTooltipPropsArg {
    
    @scala.inline
    def apply(): GetTooltipPropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTooltipPropsArg]
    }
    
    @scala.inline
    implicit class GetTooltipPropsArgMutableBuilder[Self <: GetTooltipPropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnMouseEnter(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait GetTriggerPropsArg
    extends /* key */ StringDictionary[js.Any] {
    
    var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onContextMenu: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onMouseMove: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.native
  }
  object GetTriggerPropsArg {
    
    @scala.inline
    def apply(): GetTriggerPropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTriggerPropsArg]
    }
    
    @scala.inline
    implicit class GetTriggerPropsArgMutableBuilder[Self <: GetTriggerPropsArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    }
  }
  
  type Ref = (js.Function1[/* element */ HTMLElement | Null, Unit]) | Current | Null
  
  @js.native
  trait TooltipArg extends StObject {
    
    var arrowRef: Ref = js.native
    
    def getArrowProps(): GetArrowPropsArg = js.native
    def getArrowProps(arg: GetArrowPropsArg): GetArrowPropsArg = js.native
    
    def getTooltipProps(): GetTooltipPropsArg = js.native
    def getTooltipProps(arg: GetTooltipPropsArg): GetTooltipPropsArg = js.native
    
    var placement: Placement = js.native
    
    var tooltipRef: Ref = js.native
  }
  
  @js.native
  trait TooltipProps extends StObject {
    
    var arrowProps: PopperArrowProps = js.native
    
    def clearScheduled(): Unit = js.native
    
    var closeOnReferenceHidden: Boolean = js.native
    
    def hideTooltip(): Unit = js.native
    
    var innerRef: Ref = js.native
    
    var isReferenceHidden: js.UndefOr[Boolean] = js.native
    
    var mutationObserverOptions: MutationObserverInit = js.native
    
    var placement: Placement = js.native
    
    var style: CSSProperties = js.native
    
    def tooltip(arg: TooltipArg): ReactNode = js.native
    
    var trigger: Trigger = js.native
    
    def update(): Unit = js.native
  }
  object TooltipProps {
    
    @scala.inline
    def apply(
      arrowProps: PopperArrowProps,
      clearScheduled: () => Unit,
      closeOnReferenceHidden: Boolean,
      hideTooltip: () => Unit,
      mutationObserverOptions: MutationObserverInit,
      placement: Placement,
      style: CSSProperties,
      tooltip: TooltipArg => ReactNode,
      trigger: Trigger,
      update: () => Unit
    ): TooltipProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnReferenceHidden = closeOnReferenceHidden.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearScheduled(value: () => Unit): Self = StObject.set(x, "clearScheduled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseOnReferenceHidden(value: Boolean): Self = StObject.set(x, "closeOnReferenceHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTooltip(value: () => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInnerRef(value: Ref): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setIsReferenceHidden(value: Boolean): Self = StObject.set(x, "isReferenceHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReferenceHiddenUndefined: Self = StObject.set(x, "isReferenceHidden", js.undefined)
      
      @scala.inline
      def setMutationObserverOptions(value: MutationObserverInit): Self = StObject.set(x, "mutationObserverOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: TooltipArg => ReactNode): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerVarargs(value: TriggerTypes*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TooltipTriggerProps extends StObject {
    
    /**
      * Trigger
      */
    def children(arg: ChildrenArg): ReactNode = js.native
    
    /**
      * Whether to close the tooltip when its trigger is out of boundary
      * @default true
      */
    var closeOnReferenceHidden: Boolean = js.native
    
    /**
      * Whether tooltip is shown by default
      * @default false
      */
    var defaultTooltipShown: Boolean = js.native
    
    /**
      * Delay in hiding the tooltip
      * @default 0
      */
    var delayHide: Double = js.native
    
    /**
      * Delay in showing the tooltip
      * @default 0
      */
    var delayShow: Double = js.native
    
    /**
      * Whether to make the tooltip spawn at cursor position
      * @default false
      */
    var followCursor: Boolean = js.native
    
    /**
      * Function that can be used to obtain a tooltip element reference
      */
    var getTooltipRef: js.UndefOr[Ref] = js.native
    
    /**
      * Function that can be used to obtain a trigger element reference
      */
    var getTriggerRef: js.UndefOr[Ref] = js.native
    
    /**
      * Modifiers passed directly to the underlying popper.js instance
      * For more information, refer to Popper.js’ modifier docs:
      * @link https://popper.js.org/docs/v2/modifiers
      * @default []
      */
    var modifiers: js.Array[Modifier[_, js.Object]] = js.native
    
    /**
      * Options to MutationObserver, used internally for updating
      * tooltip position based on its DOM changes
      * @default  { childList: true, subtree: true }
      */
    var mutationObserverOptions: MutationObserverInit = js.native
    
    /**
      * Called when the visibility of the tooltip changes
      * @default no-op
      */
    def onVisibilityChange(tooltipShown: Boolean): Unit = js.native
    
    /**
      * Tooltip placement w.r.t. trigger
      *  @default right
      */
    var placement: Placement = js.native
    
    /**
      * Element to be used as portal container
      * @default document.body
      */
    var portalContainer: HTMLElement = js.native
    
    /**
      * Tooltip
      */
    def tooltip(arg: TooltipArg): ReactNode = js.native
    
    /**
      * Used to create controlled tooltip
      */
    var tooltipShown: js.UndefOr[Boolean] = js.native
    
    /**
      * Event that triggers the tooltip
      * @default hover
      */
    var trigger: Trigger = js.native
    
    /**
      * Whether to use React.createPortal for creating tooltip
      * @default true // for browser environments
      */
    var usePortal: Boolean = js.native
  }
  object TooltipTriggerProps {
    
    @scala.inline
    def apply(
      children: ChildrenArg => ReactNode,
      closeOnReferenceHidden: Boolean,
      defaultTooltipShown: Boolean,
      delayHide: Double,
      delayShow: Double,
      followCursor: Boolean,
      modifiers: js.Array[Modifier[_, js.Object]],
      mutationObserverOptions: MutationObserverInit,
      onVisibilityChange: Boolean => Unit,
      placement: Placement,
      portalContainer: HTMLElement,
      tooltip: TooltipArg => ReactNode,
      trigger: Trigger,
      usePortal: Boolean
    ): TooltipTriggerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), closeOnReferenceHidden = closeOnReferenceHidden.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipTriggerProps]
    }
    
    @scala.inline
    implicit class TooltipTriggerPropsMutableBuilder[Self <: TooltipTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ChildrenArg => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseOnReferenceHidden(value: Boolean): Self = StObject.set(x, "closeOnReferenceHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTooltipShown(value: Boolean): Self = StObject.set(x, "defaultTooltipShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowCursor(value: Boolean): Self = StObject.set(x, "followCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTooltipRef(value: Ref): Self = StObject.set(x, "getTooltipRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTooltipRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = StObject.set(x, "getTooltipRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipRefNull: Self = StObject.set(x, "getTooltipRef", null)
      
      @scala.inline
      def setGetTooltipRefUndefined: Self = StObject.set(x, "getTooltipRef", js.undefined)
      
      @scala.inline
      def setGetTriggerRef(value: Ref): Self = StObject.set(x, "getTriggerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTriggerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = StObject.set(x, "getTriggerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTriggerRefNull: Self = StObject.set(x, "getTriggerRef", null)
      
      @scala.inline
      def setGetTriggerRefUndefined: Self = StObject.set(x, "getTriggerRef", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Array[Modifier[_, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersVarargs(value: (Modifier[js.Any, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
      
      @scala.inline
      def setMutationObserverOptions(value: MutationObserverInit): Self = StObject.set(x, "mutationObserverOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVisibilityChange(value: Boolean => Unit): Self = StObject.set(x, "onVisibilityChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: TooltipArg => ReactNode): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipShown(value: Boolean): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
      
      @scala.inline
      def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerVarargs(value: TriggerTypes*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipTriggerState extends StObject {
    
    var pageX: js.UndefOr[Double] = js.native
    
    var pageY: js.UndefOr[Double] = js.native
    
    var tooltipShown: Boolean = js.native
  }
  object TooltipTriggerState {
    
    @scala.inline
    def apply(tooltipShown: Boolean): TooltipTriggerState = {
      val __obj = js.Dynamic.literal(tooltipShown = tooltipShown.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipTriggerState]
    }
    
    @scala.inline
    implicit class TooltipTriggerStateMutableBuilder[Self <: TooltipTriggerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      @scala.inline
      def setTooltipShown(value: Boolean): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
    }
  }
  
  type Trigger = TriggerTypes | js.Array[TriggerTypes]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPopperTooltip.reactPopperTooltipStrings.none
    - typings.reactPopperTooltip.reactPopperTooltipStrings.click
    - typings.reactPopperTooltip.reactPopperTooltipStrings.`right-click`
    - typings.reactPopperTooltip.reactPopperTooltipStrings.hover
    - typings.reactPopperTooltip.reactPopperTooltipStrings.focus
  */
  trait TriggerTypes extends StObject
  object TriggerTypes {
    
    @scala.inline
    def click: typings.reactPopperTooltip.reactPopperTooltipStrings.click = "click".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.click]
    
    @scala.inline
    def focus: typings.reactPopperTooltip.reactPopperTooltipStrings.focus = "focus".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.focus]
    
    @scala.inline
    def hover: typings.reactPopperTooltip.reactPopperTooltipStrings.hover = "hover".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.hover]
    
    @scala.inline
    def none: typings.reactPopperTooltip.reactPopperTooltipStrings.none = "none".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.none]
    
    @scala.inline
    def `right-click`: typings.reactPopperTooltip.reactPopperTooltipStrings.`right-click` = "right-click".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.`right-click`]
  }
}
