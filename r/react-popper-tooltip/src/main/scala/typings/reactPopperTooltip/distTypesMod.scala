package typings.reactPopperTooltip

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactPopper.mod.PopperArrowProps
import typings.reactPopperTooltip.anon.Current
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  trait ChildrenArg extends StObject {
    
    def getTriggerProps(): GetTriggerPropsArg = js.native
    def getTriggerProps(arg: GetTriggerPropsArg): GetTriggerPropsArg = js.native
    
    var triggerRef: Ref = js.native
  }
  
  trait GetArrowPropsArg
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GetArrowPropsArg {
    
    inline def apply(): GetArrowPropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetArrowPropsArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetArrowPropsArg] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait GetTooltipPropsArg
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GetTooltipPropsArg {
    
    inline def apply(): GetTooltipPropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTooltipPropsArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTooltipPropsArg] (val x: Self) extends AnyVal {
      
      inline def setOnMouseEnter(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait GetTriggerPropsArg
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  }
  object GetTriggerPropsArg {
    
    inline def apply(): GetTriggerPropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTriggerPropsArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTriggerPropsArg] (val x: Self) extends AnyVal {
      
      inline def setOnBlur(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnTouchEnd(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
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
    
    var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any = js.native
    
    var tooltipRef: Ref = js.native
  }
  
  trait TooltipProps extends StObject {
    
    var arrowProps: PopperArrowProps
    
    def clearScheduled(): Unit
    
    var closeOnOutOfBoundaries: Boolean
    
    def hideTooltip(): Unit
    
    var innerRef: Ref
    
    var mutationObserverOptions: MutationObserverInit
    
    var outOfBoundaries: Boolean | Null
    
    var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
    
    def scheduleUpdate(): Unit
    
    var style: CSSProperties
    
    def tooltip(arg: TooltipArg): ReactNode
    
    var trigger: Trigger
  }
  object TooltipProps {
    
    inline def apply(
      arrowProps: PopperArrowProps,
      clearScheduled: () => Unit,
      closeOnOutOfBoundaries: Boolean,
      hideTooltip: () => Unit,
      mutationObserverOptions: MutationObserverInit,
      placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any,
      scheduleUpdate: () => Unit,
      style: CSSProperties,
      tooltip: TooltipArg => ReactNode,
      trigger: Trigger
    ): TooltipProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], innerRef = null, outOfBoundaries = null)
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      inline def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setClearScheduled(value: () => Unit): Self = StObject.set(x, "clearScheduled", js.Any.fromFunction0(value))
      
      inline def setCloseOnOutOfBoundaries(value: Boolean): Self = StObject.set(x, "closeOnOutOfBoundaries", value.asInstanceOf[js.Any])
      
      inline def setHideTooltip(value: () => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction0(value))
      
      inline def setInnerRef(value: Ref): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setMutationObserverOptions(value: MutationObserverInit): Self = StObject.set(x, "mutationObserverOptions", value.asInstanceOf[js.Any])
      
      inline def setOutOfBoundaries(value: Boolean): Self = StObject.set(x, "outOfBoundaries", value.asInstanceOf[js.Any])
      
      inline def setOutOfBoundariesNull: Self = StObject.set(x, "outOfBoundaries", null)
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setScheduleUpdate(value: () => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction0(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: TooltipArg => ReactNode): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerVarargs(value: TriggerTypes*): Self = StObject.set(x, "trigger", js.Array(value*))
    }
  }
  
  trait TooltipTriggerProps extends StObject {
    
    /**
      * Trigger
      */
    def children(arg: ChildrenArg): ReactNode
    
    /**
      * Whether to close the tooltip when it's trigger is out of the boundary
      * @default true
      */
    var closeOnOutOfBoundaries: Boolean
    
    /**
      * Whether tooltip is shown by default
      * @default false
      */
    var defaultTooltipShown: Boolean
    
    /**
      * Delay in hiding the tooltip
      * @default 0
      */
    var delayHide: Double
    
    /**
      * Delay in showing the tooltip
      * @default 0
      */
    var delayShow: Double
    
    /**
      * Whether to make the tooltip spawn at cursor position
      * @default false
      */
    var followCursor: Boolean
    
    /**
      * Function that can be used to obtain a tooltip element reference
      */
    var getTooltipRef: js.UndefOr[Ref] = js.undefined
    
    /**
      * Function that can be used to obtain a trigger element reference
      */
    var getTriggerRef: js.UndefOr[Ref] = js.undefined
    
    /**
      * Modifiers passed directly to the underlying popper.js instance
      * For more information, refer to Popper.js’ modifier docs:
      * @link https://popper.js.org/popper-documentation.html#modifiers
      */
    var modifiers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Modifiers */ Any
      ] = js.undefined
    
    /**
      * Options to MutationObserver, used internally for updating
      * tooltip position based on trigger DOM changes
      * @default  { childList: true, subtree: true }
      */
    var mutationObserverOptions: MutationObserverInit
    
    /**
      * Called when the visibility of the tooltip changes
      * @default no-op
      */
    def onVisibilityChange(tooltipShown: Boolean): Unit
    
    /**
      * Tooltip placement w.r.t. trigger
      *  @default right
      */
    var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
    
    /**
      * Element to be used as portal container
      * @default document.body
      */
    var portalContainer: HTMLElement
    
    /**
      * Tooltip
      */
    def tooltip(arg: TooltipArg): ReactNode
    
    /**
      * Used to create controlled tooltip
      */
    var tooltipShown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Event that triggers the tooltip
      * @default hover
      */
    var trigger: Trigger
    
    /**
      * Whether to use React.createPortal for creating tooltip
      * @default true // for browser environments
      */
    var usePortal: Boolean
  }
  object TooltipTriggerProps {
    
    inline def apply(
      children: ChildrenArg => ReactNode,
      closeOnOutOfBoundaries: Boolean,
      defaultTooltipShown: Boolean,
      delayHide: Double,
      delayShow: Double,
      followCursor: Boolean,
      mutationObserverOptions: MutationObserverInit,
      onVisibilityChange: Boolean => Unit,
      placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any,
      portalContainer: HTMLElement,
      tooltip: TooltipArg => ReactNode,
      trigger: Trigger,
      usePortal: Boolean
    ): TooltipTriggerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipTriggerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipTriggerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ChildrenArg => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setCloseOnOutOfBoundaries(value: Boolean): Self = StObject.set(x, "closeOnOutOfBoundaries", value.asInstanceOf[js.Any])
      
      inline def setDefaultTooltipShown(value: Boolean): Self = StObject.set(x, "defaultTooltipShown", value.asInstanceOf[js.Any])
      
      inline def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      inline def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      inline def setFollowCursor(value: Boolean): Self = StObject.set(x, "followCursor", value.asInstanceOf[js.Any])
      
      inline def setGetTooltipRef(value: Ref): Self = StObject.set(x, "getTooltipRef", value.asInstanceOf[js.Any])
      
      inline def setGetTooltipRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = StObject.set(x, "getTooltipRef", js.Any.fromFunction1(value))
      
      inline def setGetTooltipRefNull: Self = StObject.set(x, "getTooltipRef", null)
      
      inline def setGetTooltipRefUndefined: Self = StObject.set(x, "getTooltipRef", js.undefined)
      
      inline def setGetTriggerRef(value: Ref): Self = StObject.set(x, "getTriggerRef", value.asInstanceOf[js.Any])
      
      inline def setGetTriggerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = StObject.set(x, "getTriggerRef", js.Any.fromFunction1(value))
      
      inline def setGetTriggerRefNull: Self = StObject.set(x, "getTriggerRef", null)
      
      inline def setGetTriggerRefUndefined: Self = StObject.set(x, "getTriggerRef", js.undefined)
      
      inline def setModifiers(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Modifiers */ Any
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setMutationObserverOptions(value: MutationObserverInit): Self = StObject.set(x, "mutationObserverOptions", value.asInstanceOf[js.Any])
      
      inline def setOnVisibilityChange(value: Boolean => Unit): Self = StObject.set(x, "onVisibilityChange", js.Any.fromFunction1(value))
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: TooltipArg => ReactNode): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setTooltipShown(value: Boolean): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
      
      inline def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
      
      inline def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerVarargs(value: TriggerTypes*): Self = StObject.set(x, "trigger", js.Array(value*))
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipTriggerState extends StObject {
    
    var pageX: js.UndefOr[Double] = js.undefined
    
    var pageY: js.UndefOr[Double] = js.undefined
    
    var tooltipShown: Boolean
  }
  object TooltipTriggerState {
    
    inline def apply(tooltipShown: Boolean): TooltipTriggerState = {
      val __obj = js.Dynamic.literal(tooltipShown = tooltipShown.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipTriggerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipTriggerState] (val x: Self) extends AnyVal {
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      inline def setTooltipShown(value: Boolean): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
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
    
    inline def click: typings.reactPopperTooltip.reactPopperTooltipStrings.click = "click".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.click]
    
    inline def focus: typings.reactPopperTooltip.reactPopperTooltipStrings.focus = "focus".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.focus]
    
    inline def hover: typings.reactPopperTooltip.reactPopperTooltipStrings.hover = "hover".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.hover]
    
    inline def none: typings.reactPopperTooltip.reactPopperTooltipStrings.none = "none".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.none]
    
    inline def `right-click`: typings.reactPopperTooltip.reactPopperTooltipStrings.`right-click` = "right-click".asInstanceOf[typings.reactPopperTooltip.reactPopperTooltipStrings.`right-click`]
  }
}
