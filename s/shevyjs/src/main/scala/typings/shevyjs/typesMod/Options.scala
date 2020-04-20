package typings.shevyjs.typesMod

import typings.shevyjs.shevyjsStrings.augmentedFourth
import typings.shevyjs.shevyjsStrings.majorSecond
import typings.shevyjs.shevyjsStrings.majorThird
import typings.shevyjs.shevyjsStrings.minorThird
import typings.shevyjs.shevyjsStrings.perfectFourth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addMarginBottom: Boolean
  var baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth
  var baseFontSize: String
  var baseLineHeight: Double
  var proximity: Boolean
  var proximityFactor: Factor
}

object Options {
  @scala.inline
  def apply(
    addMarginBottom: Boolean,
    baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth,
    baseFontSize: String,
    baseLineHeight: Double,
    proximity: Boolean,
    proximityFactor: Factor
  ): Options = {
    val __obj = js.Dynamic.literal(addMarginBottom = addMarginBottom.asInstanceOf[js.Any], baseFontScale = baseFontScale.asInstanceOf[js.Any], baseFontSize = baseFontSize.asInstanceOf[js.Any], baseLineHeight = baseLineHeight.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], proximityFactor = proximityFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

