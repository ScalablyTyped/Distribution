package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiStrings.horizontal
import typings.reactDashOnsenui.reactDashOnsenuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationOptions extends js.Object {
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var autoScrollRatio: js.UndefOr[Double] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var itemHeight: js.UndefOr[Double | String] = js.undefined
  var itemWidth: js.UndefOr[Double | String] = js.undefined
  var onOverscroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overscrollable: js.UndefOr[Boolean] = js.undefined
  var swipeable: js.UndefOr[Boolean] = js.undefined
}

object Anon_AnimationOptions {
  @scala.inline
  def apply(
    animationOptions: AnimationOptions = null,
    autoRefresh: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    autoScrollRatio: Int | Double = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    direction: horizontal | vertical = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    itemHeight: Double | String = null,
    itemWidth: Double | String = null,
    onOverscroll: () => Unit = null,
    onPostChange: () => Unit = null,
    onRefresh: () => Unit = null,
    overscrollable: js.UndefOr[Boolean] = js.undefined,
    swipeable: js.UndefOr[Boolean] = js.undefined
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
    if (onOverscroll != null) __obj.updateDynamic("onOverscroll")(js.Any.fromFunction0(onOverscroll))
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(js.Any.fromFunction0(onPostChange))
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction0(onRefresh))
    if (!js.isUndefined(overscrollable)) __obj.updateDynamic("overscrollable")(overscrollable)
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    __obj.asInstanceOf[Anon_AnimationOptions]
  }
}

