package typings.shevyjs.typesMod

import typings.shevyjs.shevyjsStrings.augmentedFourth
import typings.shevyjs.shevyjsStrings.majorSecond
import typings.shevyjs.shevyjsStrings.majorThird
import typings.shevyjs.shevyjsStrings.minorThird
import typings.shevyjs.shevyjsStrings.perfectFourth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var addMarginBottom: Boolean = js.native
  var baseFontScale: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth = js.native
  var baseFontSize: String = js.native
  var baseLineHeight: Double = js.native
  var proximity: Boolean = js.native
  var proximityFactor: Factor = js.native
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
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddMarginBottom(value: Boolean): Self = this.set("addMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseFontScaleVarargs(value: Factor*): Self = this.set("baseFontScale", js.Array(value :_*))
    @scala.inline
    def setBaseFontScale(value: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): Self = this.set("baseFontScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseFontSize(value: String): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseLineHeight(value: Double): Self = this.set("baseLineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setProximity(value: Boolean): Self = this.set("proximity", value.asInstanceOf[js.Any])
    @scala.inline
    def setProximityFactor(value: Factor): Self = this.set("proximityFactor", value.asInstanceOf[js.Any])
  }
  
}

