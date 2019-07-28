package typings.reactDashBootstrap.libOverlayMod

import typings.react.reactMod.ReactInstance
import typings.reactDashBootstrap.reactDashBootstrapMod.TransitionCallbacks
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends TransitionCallbacks {
  // Optional
  var animation: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var container: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var containerPadding: js.UndefOr[Double] = js.undefined
   // TODO: Add more specific type
  var onHide: js.UndefOr[js.Function] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var rootClose: js.UndefOr[Boolean] = js.undefined
  var shouldUpdatePosition: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Function | ReactInstance] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    animation: js.Any = null,
    container: js.Any = null,
    containerPadding: Int | Double = null,
    onEnter: /* node */ HTMLElement => _ = null,
    onEntered: /* node */ HTMLElement => _ = null,
    onEntering: /* node */ HTMLElement => _ = null,
    onExit: /* node */ HTMLElement => _ = null,
    onExited: /* node */ HTMLElement => _ = null,
    onExiting: /* node */ HTMLElement => _ = null,
    onHide: js.Function = null,
    placement: String = null,
    rootClose: js.UndefOr[Boolean] = js.undefined,
    shouldUpdatePosition: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    target: js.Function | ReactInstance = null
  ): OverlayProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (container != null) __obj.updateDynamic("container")(container)
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(rootClose)) __obj.updateDynamic("rootClose")(rootClose)
    if (!js.isUndefined(shouldUpdatePosition)) __obj.updateDynamic("shouldUpdatePosition")(shouldUpdatePosition)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

