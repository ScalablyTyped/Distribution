package typings.reactPopover.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
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
    enterExitTransitionDurationMs: js.UndefOr[Double] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onOuterAction: /* event */ Event => Unit = null,
    place: PopoverPlace = null,
    preferPlace: PopoverPlace = null,
    refreshIntervalMs: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    target: ReactElement = null,
    tipSize: js.UndefOr[Double] = js.undefined
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (appendTarget != null) __obj.updateDynamic("appendTarget")(appendTarget.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enterExitTransitionDurationMs)) __obj.updateDynamic("enterExitTransitionDurationMs")(enterExitTransitionDurationMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (onOuterAction != null) __obj.updateDynamic("onOuterAction")(js.Any.fromFunction1(onOuterAction))
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (preferPlace != null) __obj.updateDynamic("preferPlace")(preferPlace.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshIntervalMs)) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(tipSize)) __obj.updateDynamic("tipSize")(tipSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

