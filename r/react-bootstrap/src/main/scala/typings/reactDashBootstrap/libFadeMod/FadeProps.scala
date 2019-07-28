package typings.reactDashBootstrap.libFadeMod

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.reactDashBootstrapMod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeProps
  extends HTMLProps[Fade]
     with TransitionCallbacks {
  var appear: js.UndefOr[Boolean] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object FadeProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[Fade] = null,
    TransitionCallbacks: TransitionCallbacks = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): FadeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, TransitionCallbacks)
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[FadeProps]
  }
}

