package typings.shevyjs

import typings.shevyjs.shevyjsStrings.augmentedFourth
import typings.shevyjs.shevyjsStrings.majorSecond
import typings.shevyjs.shevyjsStrings.majorThird
import typings.shevyjs.shevyjsStrings.minorThird
import typings.shevyjs.shevyjsStrings.perfectFourth
import typings.shevyjs.typesMod.Factor
import typings.shevyjs.typesMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<shevyjs.shevyjs/types.Options> */
trait PartialOptions extends js.Object {
  var addMarginBottom: js.UndefOr[Boolean] = js.undefined
  var baseFontScale: js.UndefOr[Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth] = js.undefined
  var baseFontSize: js.UndefOr[String] = js.undefined
  var baseLineHeight: js.UndefOr[Double] = js.undefined
  var proximity: js.UndefOr[Boolean] = js.undefined
  var proximityFactor: js.UndefOr[Factor] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    addMarginBottom: js.UndefOr[Boolean] = js.undefined,
    baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth = null,
    baseFontSize: String = null,
    baseLineHeight: Int | Double = null,
    proximity: js.UndefOr[Boolean] = js.undefined,
    proximityFactor: Int | Double = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addMarginBottom)) __obj.updateDynamic("addMarginBottom")(addMarginBottom.asInstanceOf[js.Any])
    if (baseFontScale != null) __obj.updateDynamic("baseFontScale")(baseFontScale.asInstanceOf[js.Any])
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (baseLineHeight != null) __obj.updateDynamic("baseLineHeight")(baseLineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(proximity)) __obj.updateDynamic("proximity")(proximity.asInstanceOf[js.Any])
    if (proximityFactor != null) __obj.updateDynamic("proximityFactor")(proximityFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

