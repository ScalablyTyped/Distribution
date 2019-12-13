package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriceHistory extends js.Object {
  var avgPrice: Double
  var date: String
  var resourceType: MarketResourceConstant
  var stddevPrice: Double
  var transactions: Double
  var volume: Double
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
}

