package typings
package reactDashBootstrapLib.libFadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeProps
  extends reactLib.reactMod.HTMLProps[Fade]
     with reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  var appear: js.UndefOr[scala.Boolean] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object FadeProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Fade] = null,
    TransitionCallbacks: reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks = null,
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
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

