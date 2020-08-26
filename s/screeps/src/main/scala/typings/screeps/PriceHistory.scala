package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceHistory extends js.Object {
  var avgPrice: Double = js.native
  var date: String = js.native
  var resourceType: MarketResourceConstant = js.native
  var stddevPrice: Double = js.native
  var transactions: Double = js.native
  var volume: Double = js.native
}

object PriceHistory {
  @scala.inline
  def apply(
    avgPrice: Double,
    date: String,
    resourceType: MarketResourceConstant,
    stddevPrice: Double,
    transactions: Double,
    volume: Double
  ): PriceHistory = {
    val __obj = js.Dynamic.literal(avgPrice = avgPrice.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], stddevPrice = stddevPrice.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceHistory]
  }
  @scala.inline
  implicit class PriceHistoryOps[Self <: PriceHistory] (val x: Self) extends AnyVal {
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
    def setAvgPrice(value: Double): Self = this.set("avgPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStddevPrice(value: Double): Self = this.set("stddevPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactions(value: Double): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

