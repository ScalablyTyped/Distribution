package typings
package reactDashPopoverLib.reactDashPopoverMod.PopoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var appendTarget: js.UndefOr[reactLib.Element] = js.undefined
  var body: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var enterExitTransitionDurationMs: js.UndefOr[scala.Double] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var onOuterAction: js.UndefOr[js.Function1[/* event */ reactLib.Event, scala.Unit]] = js.undefined
  var place: js.UndefOr[PopoverPlace] = js.undefined
  var preferPlace: js.UndefOr[PopoverPlace] = js.undefined
  var refreshIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var target: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var tipSize: js.UndefOr[scala.Double] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    body: reactLib.reactMod.ReactNs.ReactNode,
    appendTarget: reactLib.Element = null,
    className: java.lang.String = null,
    enterExitTransitionDurationMs: scala.Int | scala.Double = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    onOuterAction: js.Function1[/* event */ reactLib.Event, scala.Unit] = null,
    place: PopoverPlace = null,
    preferPlace: PopoverPlace = null,
    refreshIntervalMs: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    target: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    tipSize: scala.Int | scala.Double = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (appendTarget != null) __obj.updateDynamic("appendTarget")(appendTarget)
    if (className != null) __obj.updateDynamic("className")(className)
    if (enterExitTransitionDurationMs != null) __obj.updateDynamic("enterExitTransitionDurationMs")(enterExitTransitionDurationMs.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (onOuterAction != null) __obj.updateDynamic("onOuterAction")(onOuterAction)
    if (place != null) __obj.updateDynamic("place")(place)
    if (preferPlace != null) __obj.updateDynamic("preferPlace")(preferPlace)
    if (refreshIntervalMs != null) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

