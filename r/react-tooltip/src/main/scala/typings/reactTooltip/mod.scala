package typings.reactTooltip

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactTooltip.anon.Left
import typings.reactTooltip.reactTooltipStrings.div
import typings.reactTooltip.reactTooltipStrings.span
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tooltip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TooltipProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def hide(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[js.Object]
    inline def hide(target: Element): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(target.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def rebuild(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("rebuild")().asInstanceOf[js.Object]
    
    // static methods
    inline def show(target: Element): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(target.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.float
    - typings.reactTooltip.reactTooltipStrings.solid
  */
  trait Effect extends StObject
  object Effect {
    
    inline def float: typings.reactTooltip.reactTooltipStrings.float = "float".asInstanceOf[typings.reactTooltip.reactTooltipStrings.float]
    
    inline def solid: typings.reactTooltip.reactTooltipStrings.solid = "solid".asInstanceOf[typings.reactTooltip.reactTooltipStrings.solid]
  }
  
  type GetContent = GetContentFunc | (js.Tuple2[GetContentFunc, Double])
  
  type GetContentFunc = js.Function1[/* toolTipStr */ String, ReactNode]
  
  trait Offset extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.top
    - typings.reactTooltip.reactTooltipStrings.right
    - typings.reactTooltip.reactTooltipStrings.bottom
    - typings.reactTooltip.reactTooltipStrings.left
  */
  trait Place extends StObject
  object Place {
    
    inline def bottom: typings.reactTooltip.reactTooltipStrings.bottom = "bottom".asInstanceOf[typings.reactTooltip.reactTooltipStrings.bottom]
    
    inline def left: typings.reactTooltip.reactTooltipStrings.left = "left".asInstanceOf[typings.reactTooltip.reactTooltipStrings.left]
    
    inline def right: typings.reactTooltip.reactTooltipStrings.right = "right".asInstanceOf[typings.reactTooltip.reactTooltipStrings.right]
    
    inline def top: typings.reactTooltip.reactTooltipStrings.top = "top".asInstanceOf[typings.reactTooltip.reactTooltipStrings.top]
  }
  
  type ReactTooltip = Component[TooltipProps, js.Object, Any]
  
  trait TooltipProps extends StObject {
    
    // Callback after tooltip is hidden
    var afterHide: js.UndefOr[VoidFunc] = js.undefined
    
    // Callback after tooltip is shown
    var afterShow: js.UndefOr[VoidFunc] = js.undefined
    
    // Popup arrow color
    var arrowColor: js.UndefOr[String] = js.undefined
    
    // Popup background color
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    // Listen to body events vs. individual events
    var bodyMode: js.UndefOr[Boolean] = js.undefined
    
    // Add 1px white border
    var border: js.UndefOr[Boolean] = js.undefined
    
    // A custom class name to use for the border
    var borderClass: js.UndefOr[String] = js.undefined
    
    // Popup border color
    var borderColor: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    // Extra style class
    var `class`: js.UndefOr[String] = js.undefined
    
    // Extra style class
    var className: js.UndefOr[String] = js.undefined
    
    // Should the tooltip by clickable?
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    // Time delay for hiding popup
    var delayHide: js.UndefOr[Double] = js.undefined
    
    // Time delay for showing popup
    var delayShow: js.UndefOr[Double] = js.undefined
    
    // Time delay for updating popup
    var delayUpdate: js.UndefOr[Double] = js.undefined
    
    // Manually disable the tooltip behavior
    var disable: js.UndefOr[Boolean] = js.undefined
    
    // Behavior of tooltip
    var effect: js.UndefOr[Effect] = js.undefined
    
    // Custom event to trigger tooltip
    var event: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typings.reactTooltip.reactTooltipStrings.fullscreenchange, typings.reactTooltip.reactTooltipStrings.fullscreenerror, typings.reactTooltip.reactTooltipStrings.copy */ Any
      ] = js.undefined
    
    // Custom event to hide tooltip
    // (this requires the event prop as well)
    var eventOff: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typings.reactTooltip.reactTooltipStrings.fullscreenchange, typings.reactTooltip.reactTooltipStrings.fullscreenerror, typings.reactTooltip.reactTooltipStrings.copy */ Any
      ] = js.undefined
    
    // Function to dynamically generate the tooltip content
    var getContent: js.UndefOr[GetContent] = js.undefined
    
    // Global event to hide tooltip
    var globalEventOff: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typings.reactTooltip.reactTooltipStrings.fullscreenchange, typings.reactTooltip.reactTooltipStrings.fullscreenerror, typings.reactTooltip.reactTooltipStrings.copy */ Any
      ] = js.undefined
    
    // Inject raw HTML? (This is a security risk)
    var html: js.UndefOr[Boolean] = js.undefined
    
    // HTML id attribute
    var id: js.UndefOr[String] = js.undefined
    
    // Whether to inject the style header into the page
    // dynamically (violates CSP style-src, but is a convenient default);
    // default = true
    var insecure: js.UndefOr[Boolean] = js.undefined
    
    // When set to true, custom event's propagation
    // mode will be captue
    var isCapture: js.UndefOr[Boolean] = js.undefined
    
    // Support <br /> to make explicitly multiline tooltip comments
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    // Global tooltip offset, e.g., offset={{ top: 10, left: 5 }}
    var offset: js.UndefOr[Offset] = js.undefined
    
    // Callback to override the tooltip position
    var overridePosition: js.UndefOr[
        js.Function8[
          /* position */ Left, 
          /* currentEvent */ Event, 
          /* currentTarget */ EventTarget, 
          /* refNode */ Null | HTMLDivElement | HTMLSpanElement, 
          /* place */ Place, 
          /* desiredPlace */ Place, 
          /* effect */ Effect, 
          /* offset */ Offset, 
          Left
        ]
      ] = js.undefined
    
    // Placement of tooltip
    var place: js.UndefOr[Place] = js.undefined
    
    // List of potential custom events to trigger the popup (in body mode)
    var possibleCustomEvents: js.UndefOr[String] = js.undefined
    
    // List of potential custom events to hide the popup (in body mode)
    var possibleCustomEventsOff: js.UndefOr[String] = js.undefined
    
    // Hide the tooltip when risizing the window;
    // default = true
    var resizeHide: js.UndefOr[Boolean] = js.undefined
    
    // Aria role for the tooltip
    var role: js.UndefOr[String] = js.undefined
    
    // Hide the tooltip when scrolling;
    // default = true
    var scrollHide: js.UndefOr[Boolean] = js.undefined
    
    // Popup text color
    var textColor: js.UndefOr[String] = js.undefined
    
    // Tooltip styling theme
    var `type`: js.UndefOr[Type] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
    
    // The tooltip parent component;
    // default = 'div'
    var wrapper: js.UndefOr[div | span] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setAfterHide(value: VoidFunc): Self = StObject.set(x, "afterHide", value.asInstanceOf[js.Any])
      
      inline def setAfterHideUndefined: Self = StObject.set(x, "afterHide", js.undefined)
      
      inline def setAfterShow(value: VoidFunc): Self = StObject.set(x, "afterShow", value.asInstanceOf[js.Any])
      
      inline def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
      
      inline def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
      
      inline def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBodyMode(value: Boolean): Self = StObject.set(x, "bodyMode", value.asInstanceOf[js.Any])
      
      inline def setBodyModeUndefined: Self = StObject.set(x, "bodyMode", js.undefined)
      
      inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderClass(value: String): Self = StObject.set(x, "borderClass", value.asInstanceOf[js.Any])
      
      inline def setBorderClassUndefined: Self = StObject.set(x, "borderClass", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      inline def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      inline def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      inline def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      inline def setDelayUpdate(value: Double): Self = StObject.set(x, "delayUpdate", value.asInstanceOf[js.Any])
      
      inline def setDelayUpdateUndefined: Self = StObject.set(x, "delayUpdate", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setEffect(value: Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEvent(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typings.reactTooltip.reactTooltipStrings.fullscreenchange, typings.reactTooltip.reactTooltipStrings.fullscreenerror, typings.reactTooltip.reactTooltipStrings.copy */ Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventOff(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typings.reactTooltip.reactTooltipStrings.fullscreenchange, typings.reactTooltip.reactTooltipStrings.fullscreenerror, typings.reactTooltip.reactTooltipStrings.copy */ Any
      ): Self = StObject.set(x, "eventOff", value.asInstanceOf[js.Any])
      
      inline def setEventOffUndefined: Self = StObject.set(x, "eventOff", js.undefined)
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setGetContent(value: GetContent): Self = StObject.set(x, "getContent", value.asInstanceOf[js.Any])
      
      inline def setGetContentFunction1(value: /* toolTipStr */ String => ReactNode): Self = StObject.set(x, "getContent", js.Any.fromFunction1(value))
      
      inline def setGetContentUndefined: Self = StObject.set(x, "getContent", js.undefined)
      
      inline def setGlobalEventOff(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typings.reactTooltip.reactTooltipStrings.fullscreenchange, typings.reactTooltip.reactTooltipStrings.fullscreenerror, typings.reactTooltip.reactTooltipStrings.copy */ Any
      ): Self = StObject.set(x, "globalEventOff", value.asInstanceOf[js.Any])
      
      inline def setGlobalEventOffUndefined: Self = StObject.set(x, "globalEventOff", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInsecure(value: Boolean): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      inline def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      inline def setIsCapture(value: Boolean): Self = StObject.set(x, "isCapture", value.asInstanceOf[js.Any])
      
      inline def setIsCaptureUndefined: Self = StObject.set(x, "isCapture", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOverridePosition(
        value: (/* position */ Left, /* currentEvent */ Event, /* currentTarget */ EventTarget, /* refNode */ Null | HTMLDivElement | HTMLSpanElement, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => Left
      ): Self = StObject.set(x, "overridePosition", js.Any.fromFunction8(value))
      
      inline def setOverridePositionUndefined: Self = StObject.set(x, "overridePosition", js.undefined)
      
      inline def setPlace(value: Place): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      inline def setPossibleCustomEvents(value: String): Self = StObject.set(x, "possibleCustomEvents", value.asInstanceOf[js.Any])
      
      inline def setPossibleCustomEventsOff(value: String): Self = StObject.set(x, "possibleCustomEventsOff", value.asInstanceOf[js.Any])
      
      inline def setPossibleCustomEventsOffUndefined: Self = StObject.set(x, "possibleCustomEventsOff", js.undefined)
      
      inline def setPossibleCustomEventsUndefined: Self = StObject.set(x, "possibleCustomEvents", js.undefined)
      
      inline def setResizeHide(value: Boolean): Self = StObject.set(x, "resizeHide", value.asInstanceOf[js.Any])
      
      inline def setResizeHideUndefined: Self = StObject.set(x, "resizeHide", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScrollHide(value: Boolean): Self = StObject.set(x, "scrollHide", value.asInstanceOf[js.Any])
      
      inline def setScrollHideUndefined: Self = StObject.set(x, "scrollHide", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      inline def setWrapper(value: div | span): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTooltip.reactTooltipStrings.dark
    - typings.reactTooltip.reactTooltipStrings.success
    - typings.reactTooltip.reactTooltipStrings.warning
    - typings.reactTooltip.reactTooltipStrings.error
    - typings.reactTooltip.reactTooltipStrings.info
    - typings.reactTooltip.reactTooltipStrings.light
  */
  trait Type extends StObject
  object Type {
    
    inline def dark: typings.reactTooltip.reactTooltipStrings.dark = "dark".asInstanceOf[typings.reactTooltip.reactTooltipStrings.dark]
    
    inline def error: typings.reactTooltip.reactTooltipStrings.error = "error".asInstanceOf[typings.reactTooltip.reactTooltipStrings.error]
    
    inline def info: typings.reactTooltip.reactTooltipStrings.info = "info".asInstanceOf[typings.reactTooltip.reactTooltipStrings.info]
    
    inline def light: typings.reactTooltip.reactTooltipStrings.light = "light".asInstanceOf[typings.reactTooltip.reactTooltipStrings.light]
    
    inline def success: typings.reactTooltip.reactTooltipStrings.success = "success".asInstanceOf[typings.reactTooltip.reactTooltipStrings.success]
    
    inline def warning: typings.reactTooltip.reactTooltipStrings.warning = "warning".asInstanceOf[typings.reactTooltip.reactTooltipStrings.warning]
  }
  
  @js.native
  trait VoidFunc extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
}
