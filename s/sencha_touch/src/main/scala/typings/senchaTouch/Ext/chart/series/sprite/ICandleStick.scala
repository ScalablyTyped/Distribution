package typings.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleStick extends IAggregative {
  /** [Config Option] (Number) */
  var barWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var ohlcType: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var padding: js.UndefOr[Double] = js.native
}

object ICandleStick {
  @scala.inline
  def apply(): ICandleStick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleStick]
  }
  @scala.inline
  implicit class ICandleStickOps[Self <: ICandleStick] (val x: Self) extends AnyVal {
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
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    @scala.inline
    def setOhlcType(value: String): Self = this.set("ohlcType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOhlcType: Self = this.set("ohlcType", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

