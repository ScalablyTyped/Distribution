package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationOptions extends js.Object {
  var animationOptions: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions] = js.undefined
  var autoRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  var autoScrollRatio: js.UndefOr[scala.Double] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.horizontal | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.vertical
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var itemHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var itemWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var onOverscroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPostChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onRefresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var overscrollable: js.UndefOr[scala.Boolean] = js.undefined
  var swipeable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AnimationOptions {
  @scala.inline
  def apply(
    animationOptions: reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions = null,
    autoRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    autoScroll: js.UndefOr[scala.Boolean] = js.undefined,
    autoScrollRatio: scala.Int | scala.Double = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    direction: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.horizontal | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.vertical = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    itemHeight: scala.Double | java.lang.String = null,
    itemWidth: scala.Double | java.lang.String = null,
    onOverscroll: js.Function0[scala.Unit] = null,
    onPostChange: js.Function0[scala.Unit] = null,
    onRefresh: js.Function0[scala.Unit] = null,
    overscrollable: js.UndefOr[scala.Boolean] = js.undefined,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh)
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll)
    if (autoScrollRatio != null) __obj.updateDynamic("autoScrollRatio")(autoScrollRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (onOverscroll != null) __obj.updateDynamic("onOverscroll")(onOverscroll)
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(onPostChange)
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(onRefresh)
    if (!js.isUndefined(overscrollable)) __obj.updateDynamic("overscrollable")(overscrollable)
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    __obj.asInstanceOf[Anon_AnimationOptions]
  }
}

