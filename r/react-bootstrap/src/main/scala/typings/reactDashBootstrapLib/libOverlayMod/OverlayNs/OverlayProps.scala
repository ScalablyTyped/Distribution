package typings
package reactDashBootstrapLib.libOverlayMod.OverlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps
  extends reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  // Optional
  var animation: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var container: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var containerPadding: js.UndefOr[scala.Double] = js.undefined
   // TODO: Add more specific type
  var onHide: js.UndefOr[js.Function] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var rootClose: js.UndefOr[scala.Boolean] = js.undefined
  var shouldUpdatePosition: js.UndefOr[scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[js.Function | reactLib.reactMod.ReactNs.ReactInstance] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    animation: js.Any = null,
    container: js.Any = null,
    containerPadding: scala.Int | scala.Double = null,
    onEnter: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntered: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntering: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExit: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExited: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExiting: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onHide: js.Function = null,
    placement: java.lang.String = null,
    rootClose: js.UndefOr[scala.Boolean] = js.undefined,
    shouldUpdatePosition: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    target: js.Function | reactLib.reactMod.ReactNs.ReactInstance = null
  ): OverlayProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (container != null) __obj.updateDynamic("container")(container)
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(rootClose)) __obj.updateDynamic("rootClose")(rootClose)
    if (!js.isUndefined(shouldUpdatePosition)) __obj.updateDynamic("shouldUpdatePosition")(shouldUpdatePosition)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

