package typings.reachTooltip

import typings.reachPolymorphic.mod.ForwardRefComponent
import typings.reachTooltip.anon.DEBUGSTYLE
import typings.reachTooltip.reachTooltipStrings.div
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.DOMRect
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@reach/tooltip", "LEAVE_TIMEOUT")
  @js.native
  val LEAVE_TIMEOUT: /* 500 */ Double = js.native
  
  /**
    * Welcome to @reach/tooltip!
    *
    * When the user's mouse or focus rests on an element, a non-interactive popup
    * is displayed near it.
    *
    * Quick definitions:
    *
    * - "on rest" or "rested on": describes when the element receives mouse hover
    *   after a short delay (and hopefully soon, touch longpress).
    *
    * - "activation": describes a mouse click, keyboard enter, or keyboard space.
    *
    * Only one tooltip can be visible at a time, so we use a global state chart to
    * describe the various states and transitions between states that are possible.
    * With all the timeouts involved with tooltips it's important to "make
    * impossible states impossible" with a state machine.
    *
    * It's also okay to use these module globals because you don't server render
    * tooltips. None of the state is changed outside of user events.
    *
    * There are a few features that are important to understand.
    *
    * 1. Tooltips don't show up until the user has rested on one, we don't want
    *    tooltips popping up as you move your mouse around the page.
    *
    * 2. Once any tooltip becomes visible, other tooltips nearby should skip
    *    resting and display immediately.
    *
    * 3. Tooltips stick around for a little bit after blur/mouseleave.
    *
    * TODO: Research longpress tooltips on Android, iOS - Probably want to position
    *       it by default above, since your thumb is below and would cover it - I'm
    *       thinking after longpress, display the tooltip and cancel any click
    *       events. Then on touchend, so they can read it display the tooltip for a
    *       little while longer in case their hand was obstructing the tooltip.
    *
    * @see Docs     https://reach.tech/tooltip
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/tooltip
    * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.2/#tooltip
    */
  @JSImport("@reach/tooltip", "MOUSE_REST_TIMEOUT")
  @js.native
  val MOUSE_REST_TIMEOUT: /* 100 */ Double = js.native
  
  /**
    * Tooltip
    *
    * @see Docs https://reach.tech/tooltip#tooltip
    */
  @JSImport("@reach/tooltip", "Tooltip")
  @js.native
  val Tooltip: ForwardRefComponent[div, TooltipProps] = js.native
  
  /**
    * TooltipPopup
    *
    * @see Docs https://reach.tech/tooltip#tooltippopup
    */
  @JSImport("@reach/tooltip", "TooltipPopup")
  @js.native
  val TooltipPopup: ForwardRefComponent[div, TooltipPopupProps] = js.native
  
  @JSImport("@reach/tooltip", "positionTooltip")
  @js.native
  val positionTooltip: Position = js.native
  
  /**
    * useTooltip
    *
    * @param params
    */
  inline def useTooltip[ElementType /* <: HTMLElement | SVGElement */](): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")().asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
  inline def useTooltip[ElementType /* <: HTMLElement | SVGElement */](param0: DEBUGSTYLE[ElementType] & HTMLAttributes[ElementType]): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
  
  /* Inlined std.Partial<std.DOMRect> & { readonly bottom :number,  readonly height :number,  readonly left :number,  readonly right :number,  readonly top :number,  readonly width :number} */
  trait PRect extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var toJSON: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PRect {
    
    inline def apply(): PRect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PRect] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type Position = js.Function2[
    /* targetRect */ js.UndefOr[PRect | Null], 
    /* popoverRect */ js.UndefOr[PRect | Null], 
    CSSProperties
  ]
  
  trait TooltipContentProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var label: ReactNode
    
    var position: js.UndefOr[Position] = js.undefined
    
    var triggerRect: DOMRect | Null
  }
  object TooltipContentProps {
    
    inline def apply(): TooltipContentProps = {
      val __obj = js.Dynamic.literal(triggerRect = null)
      __obj.asInstanceOf[TooltipContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipContentProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPosition(
        value: (/* targetRect */ js.UndefOr[PRect | Null], /* popoverRect */ js.UndefOr[PRect | Null]) => CSSProperties
      ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTriggerRect(value: DOMRect): Self = StObject.set(x, "triggerRect", value.asInstanceOf[js.Any])
      
      inline def setTriggerRectNull: Self = StObject.set(x, "triggerRect", null)
    }
  }
  
  trait TooltipParams extends StObject {
    
    var id: String
    
    var isVisible: Boolean
    
    var triggerRect: DOMRect | Null
  }
  object TooltipParams {
    
    inline def apply(id: String, isVisible: Boolean): TooltipParams = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], triggerRect = null)
      __obj.asInstanceOf[TooltipParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipParams] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setTriggerRect(value: DOMRect): Self = StObject.set(x, "triggerRect", value.asInstanceOf[js.Any])
      
      inline def setTriggerRectNull: Self = StObject.set(x, "triggerRect", null)
    }
  }
  
  trait TooltipPopupProps
    extends StObject
       with TooltipContentProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object TooltipPopupProps {
    
    inline def apply(): TooltipPopupProps = {
      val __obj = js.Dynamic.literal(triggerRect = null)
      __obj.asInstanceOf[TooltipPopupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipPopupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@reach/tooltip.@reach/tooltip.TooltipContentProps, 'triggerRect' | 'isVisible'> */
  trait TooltipProps extends StObject {
    
    var DEBUG_STYLE: js.UndefOr[Boolean] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var children: ReactNode
    
    var label: ReactNode
    
    var position: js.UndefOr[Position] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDEBUG_STYLE(value: Boolean): Self = StObject.set(x, "DEBUG_STYLE", value.asInstanceOf[js.Any])
      
      inline def setDEBUG_STYLEUndefined: Self = StObject.set(x, "DEBUG_STYLE", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPosition(
        value: (/* targetRect */ js.UndefOr[PRect | Null], /* popoverRect */ js.UndefOr[PRect | Null]) => CSSProperties
      ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait TriggerParams[ElementType /* <: HTMLElement | SVGElement */] extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `data-reach-tooltip-trigger`: String
    
    var `data-state`: String
    
    var onBlur: FocusEventHandler[ElementType]
    
    var onFocus: FocusEventHandler[ElementType]
    
    var onKeyDown: KeyboardEventHandler[ElementType]
    
    var onMouseDown: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onPointerDown: PointerEventHandler[ElementType]
    
    var onPointerEnter: PointerEventHandler[ElementType]
    
    var onPointerLeave: PointerEventHandler[ElementType]
    
    var onPointerMove: PointerEventHandler[ElementType]
    
    var ref: Ref[ElementType]
  }
  object TriggerParams {
    
    inline def apply[ElementType /* <: HTMLElement | SVGElement */](
      `data-reach-tooltip-trigger`: String,
      `data-state`: String,
      onBlur: FocusEvent[ElementType, Element] => Unit,
      onFocus: FocusEvent[ElementType, Element] => Unit,
      onKeyDown: KeyboardEvent[ElementType] => Unit,
      onPointerDown: PointerEvent[ElementType] => Unit,
      onPointerEnter: PointerEvent[ElementType] => Unit,
      onPointerLeave: PointerEvent[ElementType] => Unit,
      onPointerMove: PointerEvent[ElementType] => Unit
    ): TriggerParams[ElementType] = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onPointerDown = js.Any.fromFunction1(onPointerDown), onPointerEnter = js.Any.fromFunction1(onPointerEnter), onPointerLeave = js.Any.fromFunction1(onPointerLeave), onPointerMove = js.Any.fromFunction1(onPointerMove), ref = null)
      __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-state")(`data-state`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerParams[ElementType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerParams[?], ElementType /* <: HTMLElement | SVGElement */] (val x: Self & TriggerParams[ElementType]) extends AnyVal {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setData-reach-tooltip-trigger`(value: String): Self = StObject.set(x, "data-reach-tooltip-trigger", value.asInstanceOf[js.Any])
      
      inline def `setData-state`(value: String): Self = StObject.set(x, "data-state", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: FocusEvent[ElementType, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: FocusEvent[ElementType, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[ElementType] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDown(value: MouseEvent[ElementType, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[ElementType, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[ElementType, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[ElementType, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[ElementType] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnter(value: PointerEvent[ElementType] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeave(value: PointerEvent[ElementType] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerMove(value: PointerEvent[ElementType] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setRef(value: Ref[ElementType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ElementType | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
