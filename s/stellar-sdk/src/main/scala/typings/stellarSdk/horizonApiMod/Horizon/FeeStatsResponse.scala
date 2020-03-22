package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeeStatsResponse extends js.Object {
  var fee_charged: FeeDistribution
  var last_ledger: String
  var last_ledger_base_fee: String
  var ledger_capacity_usage: String
  var max_fee: FeeDistribution
}

object FeeStatsResponse {
  @scala.inline
  def apply(
    fee_charged: FeeDistribution,
    last_ledger: String,
    last_ledger_base_fee: String,
    ledger_capacity_usage: String,
    max_fee: FeeDistribution
  ): FeeStatsResponse = {
    val __obj = js.Dynamic.literal(fee_charged = fee_charged.asInstanceOf[js.Any], last_ledger = last_ledger.asInstanceOf[js.Any], last_ledger_base_fee = last_ledger_base_fee.asInstanceOf[js.Any], ledger_capacity_usage = ledger_capacity_usage.asInstanceOf[js.Any], max_fee = max_fee.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeeStatsResponse]
  }
}

