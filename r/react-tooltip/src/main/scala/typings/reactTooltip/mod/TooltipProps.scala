package typings.reactTooltip.mod

import typings.react.mod.ReactNode
import typings.reactTooltip.anon.Left
import typings.reactTooltip.reactTooltipStrings.div
import typings.reactTooltip.reactTooltipStrings.span
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends js.Object {
  
  // Callback after tooltip is hidden
  var afterHide: js.UndefOr[VoidFunc] = js.native
  
  // Callback after tooltip is shown
  var afterShow: js.UndefOr[VoidFunc] = js.native
  
  // Popup arrow color
  var arrowColor: js.UndefOr[String] = js.native
  
  // Popup background color
  var backgroundColor: js.UndefOr[String] = js.native
  
  // Listen to body events vs. individual events
  var bodyMode: js.UndefOr[Boolean] = js.native
  
  // Add 1px white border
  var border: js.UndefOr[Boolean] = js.native
  
  // Popup border color
  var borderColor: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  // Extra style class
  var `class`: js.UndefOr[String] = js.native
  
  // Extra style class
  var className: js.UndefOr[String] = js.native
  
  // Should the tooltip by clickable?
  var clickable: js.UndefOr[Boolean] = js.native
  
  // Time delay for hiding popup
  var delayHide: js.UndefOr[Double] = js.native
  
  // Time delay for showing popup
  var delayShow: js.UndefOr[Double] = js.native
  
  // Time delay for updating popup
  var delayUpdate: js.UndefOr[Double] = js.native
  
  // Manually disable the tooltip behavior
  var disable: js.UndefOr[Boolean] = js.native
  
  // Behavior of tooltip
  var effect: js.UndefOr[Effect] = js.native
  
  // Custom event to trigger tooltip
  var event: js.UndefOr[String] = js.native
  
  // Custom event to hide tooltip
  // (this requires the event prop as well)
  var eventOff: js.UndefOr[String] = js.native
  
  // Function to dynamically generate the tooltip content
  var getContent: js.UndefOr[GetContent] = js.native
  
  // Global event to hide tooltip
  var globalEventOff: js.UndefOr[String] = js.native
  
  // Inject raw HTML? (This is a security risk)
  var html: js.UndefOr[Boolean] = js.native
  
  // HTML id attribute
  var id: js.UndefOr[String] = js.native
  
  // Whether to inject the style header into the page
  // dynamically (violates CSP style-src, but is a convenient default);
  // default = true
  var insecure: js.UndefOr[Boolean] = js.native
  
  // When set to true, custom event's propagation
  // mode will be captue
  var isCapture: js.UndefOr[Boolean] = js.native
  
  // Support <br /> to make explicitly multiline tooltip comments
  var multiline: js.UndefOr[Boolean] = js.native
  
  // Global tooltip offset, e.g., offset={{ top: 10, left: 5 }}
  var offset: js.UndefOr[Offset] = js.native
  
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
  ] = js.native
  
  // Placement of tooltip
  var place: js.UndefOr[Place] = js.native
  
  // List of potential custom events to trigger the popup (in body mode)
  var possibleCustomEvents: js.UndefOr[String] = js.native
  
  // List of potential custom events to hide the popup (in body mode)
  var possibleCustomEventsOff: js.UndefOr[String] = js.native
  
  // Hide the tooltip when risizing the window;
  // default = true
  var resizeHide: js.UndefOr[Boolean] = js.native
  
  // Hide the tooltip when scrolling;
  // default = true
  var scrollHide: js.UndefOr[Boolean] = js.native
  
  // Popup text color
  var textColor: js.UndefOr[String] = js.native
  
  // Tooltip styling theme
  var `type`: js.UndefOr[Type] = js.native
  
  var uuid: js.UndefOr[String] = js.native
  
  // The tooltip parent component;
  // default = 'div' 
  var wrapper: js.UndefOr[div | span] = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterHide(value: /* repeated */ js.Any => Unit): Self = this.set("afterHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterHide: Self = this.set("afterHide", js.undefined)
    
    @scala.inline
    def setAfterShow(value: /* repeated */ js.Any => Unit): Self = this.set("afterShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterShow: Self = this.set("afterShow", js.undefined)
    
    @scala.inline
    def setArrowColor(value: String): Self = this.set("arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowColor: Self = this.set("arrowColor", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBodyMode(value: Boolean): Self = this.set("bodyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyMode: Self = this.set("bodyMode", js.undefined)
    
    @scala.inline
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setDelayHide(value: Double): Self = this.set("delayHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayHide: Self = this.set("delayHide", js.undefined)
    
    @scala.inline
    def setDelayShow(value: Double): Self = this.set("delayShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayShow: Self = this.set("delayShow", js.undefined)
    
    @scala.inline
    def setDelayUpdate(value: Double): Self = this.set("delayUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayUpdate: Self = this.set("delayUpdate", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setEffect(value: Effect): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventOff(value: String): Self = this.set("eventOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventOff: Self = this.set("eventOff", js.undefined)
    
    @scala.inline
    def setGetContentFunction1(value: /* toolTipStr */ String => ReactNode): Self = this.set("getContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContent(value: GetContent): Self = this.set("getContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetContent: Self = this.set("getContent", js.undefined)
    
    @scala.inline
    def setGlobalEventOff(value: String): Self = this.set("globalEventOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalEventOff: Self = this.set("globalEventOff", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInsecure(value: Boolean): Self = this.set("insecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecure: Self = this.set("insecure", js.undefined)
    
    @scala.inline
    def setIsCapture(value: Boolean): Self = this.set("isCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCapture: Self = this.set("isCapture", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOverridePosition(
      value: (/* position */ Left, /* currentEvent */ Event, /* currentTarget */ EventTarget, /* refNode */ Null | HTMLDivElement | HTMLSpanElement, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => Left
    ): Self = this.set("overridePosition", js.Any.fromFunction8(value))
    
    @scala.inline
    def deleteOverridePosition: Self = this.set("overridePosition", js.undefined)
    
    @scala.inline
    def setPlace(value: Place): Self = this.set("place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlace: Self = this.set("place", js.undefined)
    
    @scala.inline
    def setPossibleCustomEvents(value: String): Self = this.set("possibleCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePossibleCustomEvents: Self = this.set("possibleCustomEvents", js.undefined)
    
    @scala.inline
    def setPossibleCustomEventsOff(value: String): Self = this.set("possibleCustomEventsOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePossibleCustomEventsOff: Self = this.set("possibleCustomEventsOff", js.undefined)
    
    @scala.inline
    def setResizeHide(value: Boolean): Self = this.set("resizeHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHide: Self = this.set("resizeHide", js.undefined)
    
    @scala.inline
    def setScrollHide(value: Boolean): Self = this.set("scrollHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollHide: Self = this.set("scrollHide", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
    
    @scala.inline
    def setWrapper(value: div | span): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
