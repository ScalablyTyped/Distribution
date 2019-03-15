package typings
package reactDashTooltipLib.reactDashTooltipMod.ReactTooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var afterHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var border: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var delayHide: js.UndefOr[scala.Double] = js.undefined
  var delayShow: js.UndefOr[scala.Double] = js.undefined
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var effect: js.UndefOr[Effect] = js.undefined
  var event: js.UndefOr[ElementEvents] = js.undefined
  var eventOff: js.UndefOr[ElementEvents] = js.undefined
  var getContent: js.UndefOr[GetContent] = js.undefined
  var globalEventOff: js.UndefOr[WindowEvents] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var insecure: js.UndefOr[scala.Boolean] = js.undefined
  var isCapture: js.UndefOr[scala.Boolean] = js.undefined
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[Offset] = js.undefined
  var place: js.UndefOr[Place] = js.undefined
  var resizeHide: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var sanitizeHtmlOptions: js.UndefOr[SanitizeHtmlOptions] = js.undefined
  var scrollHide: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
  var watchWindow: js.UndefOr[scala.Boolean] = js.undefined
  var wrapper: js.UndefOr[
    reactDashTooltipLib.reactDashTooltipLibStrings.div | reactDashTooltipLib.reactDashTooltipLibStrings.span
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    afterHide: () => scala.Unit = null,
    afterShow: () => scala.Unit = null,
    border: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    `class`: java.lang.String = null,
    className: java.lang.String = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    delayHide: scala.Int | scala.Double = null,
    delayShow: scala.Int | scala.Double = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    effect: Effect = null,
    event: ElementEvents = null,
    eventOff: ElementEvents = null,
    getContent: GetContent = null,
    globalEventOff: WindowEvents = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    insecure: js.UndefOr[scala.Boolean] = js.undefined,
    isCapture: js.UndefOr[scala.Boolean] = js.undefined,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    offset: Offset = null,
    place: Place = null,
    resizeHide: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    sanitizeHtmlOptions: SanitizeHtmlOptions = null,
    scrollHide: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: Type = null,
    watchWindow: js.UndefOr[scala.Boolean] = js.undefined,
    wrapper: reactDashTooltipLib.reactDashTooltipLibStrings.div | reactDashTooltipLib.reactDashTooltipLibStrings.span = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (afterHide != null) __obj.updateDynamic("afterHide")(js.Any.fromFunction0(afterHide))
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction0(afterShow))
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (delayHide != null) __obj.updateDynamic("delayHide")(delayHide.asInstanceOf[js.Any])
    if (delayShow != null) __obj.updateDynamic("delayShow")(delayShow.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (event != null) __obj.updateDynamic("event")(event)
    if (eventOff != null) __obj.updateDynamic("eventOff")(eventOff)
    if (getContent != null) __obj.updateDynamic("getContent")(getContent.asInstanceOf[js.Any])
    if (globalEventOff != null) __obj.updateDynamic("globalEventOff")(globalEventOff.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure)
    if (!js.isUndefined(isCapture)) __obj.updateDynamic("isCapture")(isCapture)
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (place != null) __obj.updateDynamic("place")(place)
    if (!js.isUndefined(resizeHide)) __obj.updateDynamic("resizeHide")(resizeHide)
    if (role != null) __obj.updateDynamic("role")(role)
    if (sanitizeHtmlOptions != null) __obj.updateDynamic("sanitizeHtmlOptions")(sanitizeHtmlOptions)
    if (!js.isUndefined(scrollHide)) __obj.updateDynamic("scrollHide")(scrollHide)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(watchWindow)) __obj.updateDynamic("watchWindow")(watchWindow)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

