package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationOptionsAuto extends js.Object {
  var animation: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.none | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.slide
  ] = js.undefined
  var animationOptions: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions] = js.undefined
  var ignoreEdgeWidth: js.UndefOr[scala.Double] = js.undefined
  var index: scala.Double
  var onPostChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPreChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onReactive: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipe: js.UndefOr[
    js.Function2[
      /* index */ scala.Double, 
      /* animationOptions */ reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions, 
      scala.Unit
    ]
  ] = js.undefined
  var position: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.bottom | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.top | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.auto
  ] = js.undefined
  var swipeable: js.UndefOr[scala.Boolean] = js.undefined
  var tabBorder: js.UndefOr[scala.Boolean] = js.undefined
  def renderTabs(): js.Array[reactDashOnsenuiLib.reactDashOnsenuiMod.TabbarRenderTab]
}

object Anon_AnimationAnimationOptionsAuto {
  @scala.inline
  def apply(
    index: scala.Double,
    renderTabs: js.Function0[js.Array[reactDashOnsenuiLib.reactDashOnsenuiMod.TabbarRenderTab]],
    animation: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.none | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.slide = null,
    animationOptions: reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions = null,
    ignoreEdgeWidth: scala.Int | scala.Double = null,
    onPostChange: js.Function0[scala.Unit] = null,
    onPreChange: js.Function0[scala.Unit] = null,
    onReactive: js.Function0[scala.Unit] = null,
    onSwipe: js.Function2[
      /* index */ scala.Double, 
      /* animationOptions */ reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions, 
      scala.Unit
    ] = null,
    position: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.bottom | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.top | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.auto = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    tabBorder: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AnimationAnimationOptionsAuto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("renderTabs")(renderTabs)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (ignoreEdgeWidth != null) __obj.updateDynamic("ignoreEdgeWidth")(ignoreEdgeWidth.asInstanceOf[js.Any])
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(onPostChange)
    if (onPreChange != null) __obj.updateDynamic("onPreChange")(onPreChange)
    if (onReactive != null) __obj.updateDynamic("onReactive")(onReactive)
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(onSwipe)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (!js.isUndefined(tabBorder)) __obj.updateDynamic("tabBorder")(tabBorder)
    __obj.asInstanceOf[Anon_AnimationAnimationOptionsAuto]
  }
}

