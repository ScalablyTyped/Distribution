package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.overlay | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.default
  ] = js.undefined
  var animationOptions: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions] = js.undefined
  var collapse: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.portrait | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.landscape | scala.Boolean
  ] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.collapse | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.split
  ] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit]] = js.undefined
  var onModeChange: js.UndefOr[js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit]] = js.undefined
  var onPreClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit]] = js.undefined
  var onPreOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit]] = js.undefined
  var openThreshold: js.UndefOr[scala.Double] = js.undefined
  var side: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.left | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.right
  ] = js.undefined
  var swipeTargetWidth: js.UndefOr[scala.Double] = js.undefined
  var swipeable: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Animation {
  @scala.inline
  def apply(
    animation: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.overlay | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.default = null,
    animationOptions: reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions = null,
    collapse: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.portrait | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.landscape | scala.Boolean = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    mode: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.collapse | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.split = null,
    onClose: js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit] = null,
    onModeChange: js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit] = null,
    onOpen: js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit] = null,
    onPreClose: js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit] = null,
    onPreOpen: js.Function1[/* e */ js.UndefOr[reactLib.Event], scala.Unit] = null,
    openThreshold: scala.Int | scala.Double = null,
    side: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.left | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.right = null,
    swipeTargetWidth: scala.Int | scala.Double = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_Animation = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onModeChange != null) __obj.updateDynamic("onModeChange")(onModeChange)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onPreClose != null) __obj.updateDynamic("onPreClose")(onPreClose)
    if (onPreOpen != null) __obj.updateDynamic("onPreOpen")(onPreOpen)
    if (openThreshold != null) __obj.updateDynamic("openThreshold")(openThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (swipeTargetWidth != null) __obj.updateDynamic("swipeTargetWidth")(swipeTargetWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Animation]
  }
}

