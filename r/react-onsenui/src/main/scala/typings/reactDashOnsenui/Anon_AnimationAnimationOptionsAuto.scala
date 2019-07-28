package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiMod.TabbarRenderTab
import typings.reactDashOnsenui.reactDashOnsenuiStrings.auto
import typings.reactDashOnsenui.reactDashOnsenuiStrings.bottom
import typings.reactDashOnsenui.reactDashOnsenuiStrings.none
import typings.reactDashOnsenui.reactDashOnsenuiStrings.slide
import typings.reactDashOnsenui.reactDashOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationOptionsAuto extends js.Object {
  var animation: js.UndefOr[none | slide] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var ignoreEdgeWidth: js.UndefOr[Double] = js.undefined
  var index: Double
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onReactive: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipe: js.UndefOr[js.Function2[/* index */ Double, /* animationOptions */ AnimationOptions, Unit]] = js.undefined
  var position: js.UndefOr[bottom | top | auto] = js.undefined
  var swipeable: js.UndefOr[Boolean] = js.undefined
  var tabBorder: js.UndefOr[Boolean] = js.undefined
  def renderTabs(): js.Array[TabbarRenderTab]
}

object Anon_AnimationAnimationOptionsAuto {
  @scala.inline
  def apply(
    index: Double,
    renderTabs: () => js.Array[TabbarRenderTab],
    animation: none | slide = null,
    animationOptions: AnimationOptions = null,
    ignoreEdgeWidth: Int | Double = null,
    onPostChange: () => Unit = null,
    onPreChange: () => Unit = null,
    onReactive: () => Unit = null,
    onSwipe: (/* index */ Double, /* animationOptions */ AnimationOptions) => Unit = null,
    position: bottom | top | auto = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBorder: js.UndefOr[Boolean] = js.undefined
  ): Anon_AnimationAnimationOptionsAuto = {
    val __obj = js.Dynamic.literal(index = index, renderTabs = js.Any.fromFunction0(renderTabs))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (ignoreEdgeWidth != null) __obj.updateDynamic("ignoreEdgeWidth")(ignoreEdgeWidth.asInstanceOf[js.Any])
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(js.Any.fromFunction0(onPostChange))
    if (onPreChange != null) __obj.updateDynamic("onPreChange")(js.Any.fromFunction0(onPreChange))
    if (onReactive != null) __obj.updateDynamic("onReactive")(js.Any.fromFunction0(onReactive))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction2(onSwipe))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (!js.isUndefined(tabBorder)) __obj.updateDynamic("tabBorder")(tabBorder)
    __obj.asInstanceOf[Anon_AnimationAnimationOptionsAuto]
  }
}

