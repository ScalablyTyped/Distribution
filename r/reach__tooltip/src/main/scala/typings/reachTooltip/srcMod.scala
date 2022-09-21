package typings.reachTooltip

import typings.reachTooltip.anon.DEBUGSTYLE
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.std.DOMRect
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@reach/tooltip/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tooltip
    *
    * @see Docs https://reach.tech/tooltip#tooltip
    */
  @JSImport("@reach/tooltip/dist/declarations/src", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TooltipProps> */ Any = js.native
  
  @JSImport("@reach/tooltip/dist/declarations/src", "LEAVE_TIMEOUT")
  @js.native
  val LEAVE_TIMEOUT: /* 500 */ Double = js.native
  
  @JSImport("@reach/tooltip/dist/declarations/src", "MOUSE_REST_TIMEOUT")
  @js.native
  val MOUSE_REST_TIMEOUT: /* 100 */ Double = js.native
  
  /**
    * Tooltip
    *
    * @see Docs https://reach.tech/tooltip#tooltip
    */
  @JSImport("@reach/tooltip/dist/declarations/src", "Tooltip")
  @js.native
  val Tooltip: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TooltipProps> */ Any = js.native
  
  /**
    * TooltipPopup
    *
    * @see Docs https://reach.tech/tooltip#tooltippopup
    */
  @JSImport("@reach/tooltip/dist/declarations/src", "TooltipPopup")
  @js.native
  val TooltipPopup: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TooltipPopupProps> */ Any = js.native
  
  @JSImport("@reach/tooltip/dist/declarations/src", "positionTooltip")
  @js.native
  val positionTooltip: Position = js.native
  
  /**
    * useTooltip
    *
    * @param params
    */
  inline def useTooltip[ElementType /* <: HTMLElement */](): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")().asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
  inline def useTooltip[ElementType /* <: HTMLElement */](
    hasIdPropOnPointerEnterOnPointerMoveOnPointerLeaveOnPointerDownOnMouseEnterOnMouseMoveOnMouseLeaveOnMouseDownOnFocusOnBlurOnKeyDownDisabledForwardedRefDEBUG_STYLE: DEBUGSTYLE[ElementType] & HTMLAttributes[ElementType]
  ): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")(hasIdPropOnPointerEnterOnPointerMoveOnPointerLeaveOnPointerDownOnMouseEnterOnMouseMoveOnMouseLeaveOnMouseDownOnFocusOnBlurOnKeyDownDisabledForwardedRefDEBUG_STYLE.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
  
  /* Inlined std.Partial<std.DOMRect> & { readonly bottom :number,  readonly height :number,  readonly left :number,  readonly right :number,  readonly top :number,  readonly width :number} */
  trait PRect extends StObject {
    
    var bottom: js.UndefOr[Double] & Double
    
    var height: js.UndefOr[Double] & Double
    
    var left: js.UndefOr[Double] & Double
    
    var right: js.UndefOr[Double] & Double
    
    var toJSON: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var top: js.UndefOr[Double] & Double
    
    var width: js.UndefOr[Double] & Double
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PRect {
    
    inline def apply(
      bottom: js.UndefOr[Double] & Double,
      height: js.UndefOr[Double] & Double,
      left: js.UndefOr[Double] & Double,
      right: js.UndefOr[Double] & Double,
      top: js.UndefOr[Double] & Double,
      width: js.UndefOr[Double] & Double
    ): PRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PRect]
    }
    
    extension [Self <: PRect](x: Self) {
      
      inline def setBottom(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def setTop(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: TooltipContentProps](x: Self) {
      
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
    
    extension [Self <: TooltipParams](x: Self) {
      
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
    
    extension [Self <: TooltipPopupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@reach/tooltip.@reach/tooltip/dist/declarations/src.TooltipContentProps, 'triggerRect' | 'isVisible'> */
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
    
    extension [Self <: TooltipProps](x: Self) {
      
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
  
  trait TriggerParams[ElementType /* <: HTMLElement */] extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `data-reach-tooltip-trigger`: String
    
    var `data-state`: String
    
    var onBlur: ReactEventHandler[Element]
    
    var onFocus: ReactEventHandler[Element]
    
    var onKeyDown: ReactEventHandler[Element]
    
    var onMouseDown: js.UndefOr[ReactEventHandler[Element]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ReactEventHandler[Element]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ReactEventHandler[Element]] = js.undefined
    
    var onMouseMove: js.UndefOr[ReactEventHandler[Element]] = js.undefined
    
    var onPointerDown: ReactEventHandler[Element]
    
    var onPointerEnter: ReactEventHandler[Element]
    
    var onPointerLeave: ReactEventHandler[Element]
    
    var onPointerMove: ReactEventHandler[Element]
    
    var ref: Ref[ElementType]
  }
  object TriggerParams {
    
    inline def apply[ElementType /* <: HTMLElement */](
      `data-reach-tooltip-trigger`: String,
      `data-state`: String,
      onBlur: SyntheticEvent[Element, Event] => Unit,
      onFocus: SyntheticEvent[Element, Event] => Unit,
      onKeyDown: SyntheticEvent[Element, Event] => Unit,
      onPointerDown: SyntheticEvent[Element, Event] => Unit,
      onPointerEnter: SyntheticEvent[Element, Event] => Unit,
      onPointerLeave: SyntheticEvent[Element, Event] => Unit,
      onPointerMove: SyntheticEvent[Element, Event] => Unit
    ): TriggerParams[ElementType] = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onPointerDown = js.Any.fromFunction1(onPointerDown), onPointerEnter = js.Any.fromFunction1(onPointerEnter), onPointerLeave = js.Any.fromFunction1(onPointerLeave), onPointerMove = js.Any.fromFunction1(onPointerMove), ref = null)
      __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-state")(`data-state`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerParams[ElementType]]
    }
    
    extension [Self <: TriggerParams[?], ElementType /* <: HTMLElement */](x: Self & TriggerParams[ElementType]) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setData-reach-tooltip-trigger`(value: String): Self = StObject.set(x, "data-reach-tooltip-trigger", value.asInstanceOf[js.Any])
      
      inline def `setData-state`(value: String): Self = StObject.set(x, "data-state", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDown(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnPointerDown(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnter(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeave(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerMove(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setRef(value: Ref[ElementType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ElementType | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
