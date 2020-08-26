package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandleStickDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  var barSpace: js.UndefOr[Double] = js.native
  var decreasingColor: js.UndefOr[Color] = js.native
  var decreasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.native
  var increasingColor: js.UndefOr[Color] = js.native
  var increasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.native
  var neutralColor: js.UndefOr[Color] = js.native
  var shadowColor: js.UndefOr[Color] = js.native
  var shadowColorSameAsCandle: js.UndefOr[Boolean] = js.native
  var shadowWidth: js.UndefOr[Double] = js.native
}

object CandleStickDatasetConfig {
  @scala.inline
  def apply(): CandleStickDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickDatasetConfig]
  }
  @scala.inline
  implicit class CandleStickDatasetConfigOps[Self <: CandleStickDatasetConfig] (val x: Self) extends AnyVal {
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
    def setBarSpace(value: Double): Self = this.set("barSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarSpace: Self = this.set("barSpace", js.undefined)
    @scala.inline
    def setDecreasingColor(value: Color): Self = this.set("decreasingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecreasingColor: Self = this.set("decreasingColor", js.undefined)
    @scala.inline
    def setDecreasingPaintStyle(value: CandleStickPaintStyle): Self = this.set("decreasingPaintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecreasingPaintStyle: Self = this.set("decreasingPaintStyle", js.undefined)
    @scala.inline
    def setIncreasingColor(value: Color): Self = this.set("increasingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncreasingColor: Self = this.set("increasingColor", js.undefined)
    @scala.inline
    def setIncreasingPaintStyle(value: CandleStickPaintStyle): Self = this.set("increasingPaintStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncreasingPaintStyle: Self = this.set("increasingPaintStyle", js.undefined)
    @scala.inline
    def setNeutralColor(value: Color): Self = this.set("neutralColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeutralColor: Self = this.set("neutralColor", js.undefined)
    @scala.inline
    def setShadowColor(value: Color): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowColorSameAsCandle(value: Boolean): Self = this.set("shadowColorSameAsCandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColorSameAsCandle: Self = this.set("shadowColorSameAsCandle", js.undefined)
    @scala.inline
    def setShadowWidth(value: Double): Self = this.set("shadowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowWidth: Self = this.set("shadowWidth", js.undefined)
  }
  
}

