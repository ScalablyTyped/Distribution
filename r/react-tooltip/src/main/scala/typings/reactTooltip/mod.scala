package typings.reactTooltip

import typings.react.mod.AriaAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactTooltip.anon.ActiveAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tooltip(param0: ITooltipController): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * @deprecated Use the `data-tooltip-id` attribute, or the `anchorSelect` prop instead.
    * See https://react-tooltip.com/docs/getting-started
    */
  @JSImport("react-tooltip", "TooltipProvider")
  @js.native
  val TooltipProvider: FC[PropsWithChildren[Unit]] = js.native
  
  /**
    * @deprecated Use the `data-tooltip-id` attribute, or the `anchorSelect` prop instead.
    * See https://react-tooltip.com/docs/getting-started
    */
  inline def TooltipWrapper(param0: ITooltipWrapper): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TooltipWrapper")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ChildrenType = typings.std.Element | ElementType[Any] | ReactNode
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.place
    - typings.reactTooltip.reactTooltipStrings.content
    - typings.reactTooltip.reactTooltipStrings.html
    - typings.reactTooltip.reactTooltipStrings.variant
    - typings.reactTooltip.reactTooltipStrings.offset
    - typings.reactTooltip.reactTooltipStrings.wrapper
    - typings.reactTooltip.reactTooltipStrings.events
    - typings.reactTooltip.reactTooltipStrings.`position-strategy`
    - typings.reactTooltip.reactTooltipStrings.`delay-show`
    - typings.reactTooltip.reactTooltipStrings.`delay-hide`
    - typings.reactTooltip.reactTooltipStrings.float
  */
  trait DataAttribute extends StObject
  object DataAttribute {
    
    inline def content: typings.reactTooltip.reactTooltipStrings.content = "content".asInstanceOf[typings.reactTooltip.reactTooltipStrings.content]
    
    inline def `delay-hide`: typings.reactTooltip.reactTooltipStrings.`delay-hide` = "delay-hide".asInstanceOf[typings.reactTooltip.reactTooltipStrings.`delay-hide`]
    
    inline def `delay-show`: typings.reactTooltip.reactTooltipStrings.`delay-show` = "delay-show".asInstanceOf[typings.reactTooltip.reactTooltipStrings.`delay-show`]
    
    inline def events: typings.reactTooltip.reactTooltipStrings.events = "events".asInstanceOf[typings.reactTooltip.reactTooltipStrings.events]
    
    inline def float: typings.reactTooltip.reactTooltipStrings.float = "float".asInstanceOf[typings.reactTooltip.reactTooltipStrings.float]
    
    inline def html: typings.reactTooltip.reactTooltipStrings.html = "html".asInstanceOf[typings.reactTooltip.reactTooltipStrings.html]
    
    inline def offset: typings.reactTooltip.reactTooltipStrings.offset = "offset".asInstanceOf[typings.reactTooltip.reactTooltipStrings.offset]
    
    inline def place: typings.reactTooltip.reactTooltipStrings.place = "place".asInstanceOf[typings.reactTooltip.reactTooltipStrings.place]
    
    inline def `position-strategy`: typings.reactTooltip.reactTooltipStrings.`position-strategy` = "position-strategy".asInstanceOf[typings.reactTooltip.reactTooltipStrings.`position-strategy`]
    
    inline def variant: typings.reactTooltip.reactTooltipStrings.variant = "variant".asInstanceOf[typings.reactTooltip.reactTooltipStrings.variant]
    
    inline def wrapper: typings.reactTooltip.reactTooltipStrings.wrapper = "wrapper".asInstanceOf[typings.reactTooltip.reactTooltipStrings.wrapper]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.hover
    - typings.reactTooltip.reactTooltipStrings.click
  */
  trait EventsType extends StObject
  object EventsType {
    
    inline def click: typings.reactTooltip.reactTooltipStrings.click = "click".asInstanceOf[typings.reactTooltip.reactTooltipStrings.click]
    
    inline def hover: typings.reactTooltip.reactTooltipStrings.hover = "hover".asInstanceOf[typings.reactTooltip.reactTooltipStrings.hover]
  }
  
  trait IPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object IPosition {
    
    inline def apply(x: Double, y: Double): IPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITooltipController extends StObject {
    
    var afterHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * @deprecated Use the `data-tooltip-id` attribute, or the `anchorSelect` prop instead.
      * See https://react-tooltip.com/docs/getting-started
      */
    var anchorId: js.UndefOr[String] = js.undefined
    
    var anchorSelect: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ChildrenType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNameArrow: js.UndefOr[String] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var delayHide: js.UndefOr[Double] = js.undefined
    
    var delayShow: js.UndefOr[Double] = js.undefined
    
    /**
      * @deprecated Use `openOnClick` instead.
      */
    var events: js.UndefOr[js.Array[EventsType]] = js.undefined
    
    var float: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Use `children` or `render` instead
      */
    var html: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var middlewares: js.UndefOr[js.Array[Middleware]] = js.undefined
    
    var noArrow: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var openOnClick: js.UndefOr[Boolean] = js.undefined
    
    var place: js.UndefOr[PlacesType] = js.undefined
    
    var position: js.UndefOr[IPosition] = js.undefined
    
    var positionStrategy: js.UndefOr[PositionStrategy] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* render */ ActiveAnchor, ChildrenType]] = js.undefined
    
    var setIsOpen: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var variant: js.UndefOr[VariantType] = js.undefined
    
    var wrapper: js.UndefOr[WrapperType] = js.undefined
  }
  object ITooltipController {
    
    inline def apply(): ITooltipController = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipController] (val x: Self) extends AnyVal {
      
      inline def setAfterHide(value: () => Unit): Self = StObject.set(x, "afterHide", js.Any.fromFunction0(value))
      
      inline def setAfterHideUndefined: Self = StObject.set(x, "afterHide", js.undefined)
      
      inline def setAfterShow(value: () => Unit): Self = StObject.set(x, "afterShow", js.Any.fromFunction0(value))
      
      inline def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
      
      inline def setAnchorId(value: String): Self = StObject.set(x, "anchorId", value.asInstanceOf[js.Any])
      
      inline def setAnchorIdUndefined: Self = StObject.set(x, "anchorId", js.undefined)
      
      inline def setAnchorSelect(value: String): Self = StObject.set(x, "anchorSelect", value.asInstanceOf[js.Any])
      
      inline def setAnchorSelectUndefined: Self = StObject.set(x, "anchorSelect", js.undefined)
      
      inline def setChildren(value: ChildrenType): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameArrow(value: String): Self = StObject.set(x, "classNameArrow", value.asInstanceOf[js.Any])
      
      inline def setClassNameArrowUndefined: Self = StObject.set(x, "classNameArrow", js.undefined)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      inline def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      inline def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      inline def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      inline def setEvents(value: js.Array[EventsType]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: EventsType*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setMiddlewares(value: js.Array[Middleware]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      inline def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      inline def setMiddlewaresVarargs(value: Middleware*): Self = StObject.set(x, "middlewares", js.Array(value*))
      
      inline def setNoArrow(value: Boolean): Self = StObject.set(x, "noArrow", value.asInstanceOf[js.Any])
      
      inline def setNoArrowUndefined: Self = StObject.set(x, "noArrow", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpenOnClick(value: Boolean): Self = StObject.set(x, "openOnClick", value.asInstanceOf[js.Any])
      
      inline def setOpenOnClickUndefined: Self = StObject.set(x, "openOnClick", js.undefined)
      
      inline def setPlace(value: PlacesType): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      inline def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionStrategy(value: PositionStrategy): Self = StObject.set(x, "positionStrategy", value.asInstanceOf[js.Any])
      
      inline def setPositionStrategyUndefined: Self = StObject.set(x, "positionStrategy", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRender(value: /* render */ ActiveAnchor => ChildrenType): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSetIsOpen(value: /* value */ Boolean => Unit): Self = StObject.set(x, "setIsOpen", js.Any.fromFunction1(value))
      
      inline def setSetIsOpenUndefined: Self = StObject.set(x, "setIsOpen", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVariant(value: VariantType): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setWrapper(value: WrapperType): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  /**
    * @deprecated Use the `data-tooltip-id` attribute, or the `anchorSelect` prop instead.
    * See https://react-tooltip.com/docs/getting-started
    */
  trait ITooltipWrapper extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var delayHide: js.UndefOr[Double] = js.undefined
    
    var delayShow: js.UndefOr[Double] = js.undefined
    
    var events: js.UndefOr[js.Array[EventsType]] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var place: js.UndefOr[PlacesType] = js.undefined
    
    var positionStrategy: js.UndefOr[PositionStrategy] = js.undefined
    
    var tooltipId: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[VariantType] = js.undefined
    
    var wrapper: js.UndefOr[WrapperType] = js.undefined
  }
  object ITooltipWrapper {
    
    inline def apply(): ITooltipWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipWrapper] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      inline def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      inline def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      inline def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      inline def setEvents(value: js.Array[EventsType]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: EventsType*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPlace(value: PlacesType): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      inline def setPositionStrategy(value: PositionStrategy): Self = StObject.set(x, "positionStrategy", value.asInstanceOf[js.Any])
      
      inline def setPositionStrategyUndefined: Self = StObject.set(x, "positionStrategy", js.undefined)
      
      inline def setTooltipId(value: String): Self = StObject.set(x, "tooltipId", value.asInstanceOf[js.Any])
      
      inline def setTooltipIdUndefined: Self = StObject.set(x, "tooltipId", js.undefined)
      
      inline def setVariant(value: VariantType): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setWrapper(value: WrapperType): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  /**
    * @description floating-ui middleware
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  type Middleware = Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.top
    - typings.reactTooltip.reactTooltipStrings.right
    - typings.reactTooltip.reactTooltipStrings.bottom
    - typings.reactTooltip.reactTooltipStrings.left
  */
  trait PlacesType extends StObject
  object PlacesType {
    
    inline def bottom: typings.reactTooltip.reactTooltipStrings.bottom = "bottom".asInstanceOf[typings.reactTooltip.reactTooltipStrings.bottom]
    
    inline def left: typings.reactTooltip.reactTooltipStrings.left = "left".asInstanceOf[typings.reactTooltip.reactTooltipStrings.left]
    
    inline def right: typings.reactTooltip.reactTooltipStrings.right = "right".asInstanceOf[typings.reactTooltip.reactTooltipStrings.right]
    
    inline def top: typings.reactTooltip.reactTooltipStrings.top = "top".asInstanceOf[typings.reactTooltip.reactTooltipStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.absolute
    - typings.reactTooltip.reactTooltipStrings.fixed
  */
  trait PositionStrategy extends StObject
  object PositionStrategy {
    
    inline def absolute: typings.reactTooltip.reactTooltipStrings.absolute = "absolute".asInstanceOf[typings.reactTooltip.reactTooltipStrings.absolute]
    
    inline def fixed: typings.reactTooltip.reactTooltipStrings.fixed = "fixed".asInstanceOf[typings.reactTooltip.reactTooltipStrings.fixed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.dark
    - typings.reactTooltip.reactTooltipStrings.light
    - typings.reactTooltip.reactTooltipStrings.success
    - typings.reactTooltip.reactTooltipStrings.warning
    - typings.reactTooltip.reactTooltipStrings.error
    - typings.reactTooltip.reactTooltipStrings.info
  */
  trait VariantType extends StObject
  object VariantType {
    
    inline def dark: typings.reactTooltip.reactTooltipStrings.dark = "dark".asInstanceOf[typings.reactTooltip.reactTooltipStrings.dark]
    
    inline def error: typings.reactTooltip.reactTooltipStrings.error = "error".asInstanceOf[typings.reactTooltip.reactTooltipStrings.error]
    
    inline def info: typings.reactTooltip.reactTooltipStrings.info = "info".asInstanceOf[typings.reactTooltip.reactTooltipStrings.info]
    
    inline def light: typings.reactTooltip.reactTooltipStrings.light = "light".asInstanceOf[typings.reactTooltip.reactTooltipStrings.light]
    
    inline def success: typings.reactTooltip.reactTooltipStrings.success = "success".asInstanceOf[typings.reactTooltip.reactTooltipStrings.success]
    
    inline def warning: typings.reactTooltip.reactTooltipStrings.warning = "warning".asInstanceOf[typings.reactTooltip.reactTooltipStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.react.mod.ElementType[scala.Any]
    - typings.reactTooltip.reactTooltipStrings.div
    - typings.reactTooltip.reactTooltipStrings.span
  */
  type WrapperType = _WrapperType | ElementType[Any]
  
  trait _WrapperType extends StObject
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait HTMLAttributes[T]
      extends StObject
         with AriaAttributes
         with DOMAttributes[T] {
      
      var `data-tooltip-content`: js.UndefOr[String] = js.undefined
      
      var `data-tooltip-delay-hide`: js.UndefOr[Double] = js.undefined
      
      var `data-tooltip-delay-show`: js.UndefOr[Double] = js.undefined
      
      /**
        * @deprecated Use `openOnClick` tooltip prop instead.
        */
      var `data-tooltip-events`: js.UndefOr[js.Array[EventsType]] = js.undefined
      
      var `data-tooltip-float`: js.UndefOr[Boolean] = js.undefined
      
      var `data-tooltip-html`: js.UndefOr[String] = js.undefined
      
      var `data-tooltip-id`: js.UndefOr[String] = js.undefined
      
      var `data-tooltip-offset`: js.UndefOr[Double] = js.undefined
      
      var `data-tooltip-place`: js.UndefOr[PlacesType] = js.undefined
      
      var `data-tooltip-position-strategy`: js.UndefOr[PositionStrategy] = js.undefined
      
      var `data-tooltip-variant`: js.UndefOr[VariantType] = js.undefined
      
      var `data-tooltip-wrapper`: js.UndefOr[WrapperType] = js.undefined
    }
    object HTMLAttributes {
      
      inline def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLAttributes[?], T] (val x: Self & HTMLAttributes[T]) extends AnyVal {
        
        inline def `setData-tooltip-content`(value: String): Self = StObject.set(x, "data-tooltip-content", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-contentUndefined`: Self = StObject.set(x, "data-tooltip-content", js.undefined)
        
        inline def `setData-tooltip-delay-hide`(value: Double): Self = StObject.set(x, "data-tooltip-delay-hide", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-delay-hideUndefined`: Self = StObject.set(x, "data-tooltip-delay-hide", js.undefined)
        
        inline def `setData-tooltip-delay-show`(value: Double): Self = StObject.set(x, "data-tooltip-delay-show", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-delay-showUndefined`: Self = StObject.set(x, "data-tooltip-delay-show", js.undefined)
        
        inline def `setData-tooltip-events`(value: js.Array[EventsType]): Self = StObject.set(x, "data-tooltip-events", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-eventsUndefined`: Self = StObject.set(x, "data-tooltip-events", js.undefined)
        
        inline def `setData-tooltip-eventsVarargs`(value: EventsType*): Self = StObject.set(x, "data-tooltip-events", js.Array(value*))
        
        inline def `setData-tooltip-float`(value: Boolean): Self = StObject.set(x, "data-tooltip-float", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-floatUndefined`: Self = StObject.set(x, "data-tooltip-float", js.undefined)
        
        inline def `setData-tooltip-html`(value: String): Self = StObject.set(x, "data-tooltip-html", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-htmlUndefined`: Self = StObject.set(x, "data-tooltip-html", js.undefined)
        
        inline def `setData-tooltip-id`(value: String): Self = StObject.set(x, "data-tooltip-id", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-idUndefined`: Self = StObject.set(x, "data-tooltip-id", js.undefined)
        
        inline def `setData-tooltip-offset`(value: Double): Self = StObject.set(x, "data-tooltip-offset", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-offsetUndefined`: Self = StObject.set(x, "data-tooltip-offset", js.undefined)
        
        inline def `setData-tooltip-place`(value: PlacesType): Self = StObject.set(x, "data-tooltip-place", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-placeUndefined`: Self = StObject.set(x, "data-tooltip-place", js.undefined)
        
        inline def `setData-tooltip-position-strategy`(value: PositionStrategy): Self = StObject.set(x, "data-tooltip-position-strategy", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-position-strategyUndefined`: Self = StObject.set(x, "data-tooltip-position-strategy", js.undefined)
        
        inline def `setData-tooltip-variant`(value: VariantType): Self = StObject.set(x, "data-tooltip-variant", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-variantUndefined`: Self = StObject.set(x, "data-tooltip-variant", js.undefined)
        
        inline def `setData-tooltip-wrapper`(value: WrapperType): Self = StObject.set(x, "data-tooltip-wrapper", value.asInstanceOf[js.Any])
        
        inline def `setData-tooltip-wrapperUndefined`: Self = StObject.set(x, "data-tooltip-wrapper", js.undefined)
      }
    }
  }
}
