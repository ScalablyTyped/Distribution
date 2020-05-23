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
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
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
  var event: js.UndefOr[String] = js.undefined
  // Custom event to hide tooltip
  // (this requires the event prop as well)
  var eventOff: js.UndefOr[String] = js.undefined
  // Function to dynamically generate the tooltip content
  var getContent: js.UndefOr[GetContent] = js.undefined
  // Global event to hide tooltip
  var globalEventOff: js.UndefOr[String] = js.undefined
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
  @scala.inline
  def apply(
    afterHide: /* repeated */ js.Any => Unit = null,
    afterShow: /* repeated */ js.Any => Unit = null,
    arrowColor: String = null,
    backgroundColor: String = null,
    bodyMode: js.UndefOr[Boolean] = js.undefined,
    border: js.UndefOr[Boolean] = js.undefined,
    borderColor: String = null,
    children: ReactNode = null,
    `class`: String = null,
    className: String = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    delayHide: js.UndefOr[Double] = js.undefined,
    delayShow: js.UndefOr[Double] = js.undefined,
    delayUpdate: js.UndefOr[Double] = js.undefined,
    disable: js.UndefOr[Boolean] = js.undefined,
    effect: Effect = null,
    event: String = null,
    eventOff: String = null,
    getContent: GetContent = null,
    globalEventOff: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    insecure: js.UndefOr[Boolean] = js.undefined,
    isCapture: js.UndefOr[Boolean] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    offset: Offset = null,
    overridePosition: (/* position */ Left, /* currentEvent */ Event, /* currentTarget */ EventTarget, /* refNode */ Null | HTMLDivElement | HTMLSpanElement, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => Left = null,
    place: Place = null,
    possibleCustomEvents: String = null,
    possibleCustomEventsOff: String = null,
    resizeHide: js.UndefOr[Boolean] = js.undefined,
    scrollHide: js.UndefOr[Boolean] = js.undefined,
    textColor: String = null,
    `type`: Type = null,
    uuid: String = null,
    wrapper: div | span = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (afterHide != null) __obj.updateDynamic("afterHide")(js.Any.fromFunction1(afterHide))
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction1(afterShow))
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyMode)) __obj.updateDynamic("bodyMode")(bodyMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayHide)) __obj.updateDynamic("delayHide")(delayHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayShow)) __obj.updateDynamic("delayShow")(delayShow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayUpdate)) __obj.updateDynamic("delayUpdate")(delayUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.get.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventOff != null) __obj.updateDynamic("eventOff")(eventOff.asInstanceOf[js.Any])
    if (getContent != null) __obj.updateDynamic("getContent")(getContent.asInstanceOf[js.Any])
    if (globalEventOff != null) __obj.updateDynamic("globalEventOff")(globalEventOff.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCapture)) __obj.updateDynamic("isCapture")(isCapture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (overridePosition != null) __obj.updateDynamic("overridePosition")(js.Any.fromFunction8(overridePosition))
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (possibleCustomEvents != null) __obj.updateDynamic("possibleCustomEvents")(possibleCustomEvents.asInstanceOf[js.Any])
    if (possibleCustomEventsOff != null) __obj.updateDynamic("possibleCustomEventsOff")(possibleCustomEventsOff.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeHide)) __obj.updateDynamic("resizeHide")(resizeHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHide)) __obj.updateDynamic("scrollHide")(scrollHide.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

