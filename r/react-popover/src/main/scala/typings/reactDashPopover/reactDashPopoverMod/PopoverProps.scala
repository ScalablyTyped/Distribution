package typings.reactDashPopover.reactDashPopoverMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var appendTarget: js.UndefOr[Element] = js.undefined
  var body: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var enterExitTransitionDurationMs: js.UndefOr[Double] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var onOuterAction: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var place: js.UndefOr[PopoverPlace] = js.undefined
  var preferPlace: js.UndefOr[PopoverPlace] = js.undefined
  var refreshIntervalMs: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var target: js.UndefOr[ReactElement] = js.undefined
  var tipSize: js.UndefOr[Double] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    appendTarget: Element = null,
    body: ReactNode = null,
    className: String = null,
    enterExitTransitionDurationMs: Int | Double = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onOuterAction: /* event */ Event => Unit = null,
    place: PopoverPlace = null,
    preferPlace: PopoverPlace = null,
    refreshIntervalMs: Int | Double = null,
    style: CSSProperties = null,
    target: ReactElement = null,
    tipSize: Int | Double = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (appendTarget != null) __obj.updateDynamic("appendTarget")(appendTarget)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (enterExitTransitionDurationMs != null) __obj.updateDynamic("enterExitTransitionDurationMs")(enterExitTransitionDurationMs.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (onOuterAction != null) __obj.updateDynamic("onOuterAction")(js.Any.fromFunction1(onOuterAction))
    if (place != null) __obj.updateDynamic("place")(place)
    if (preferPlace != null) __obj.updateDynamic("preferPlace")(preferPlace)
    if (refreshIntervalMs != null) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

