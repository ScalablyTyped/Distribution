package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeeStatsResponse extends js.Object {
  var last_ledger: String
  var last_ledger_base_fee: String
  var ledger_capacity_usage: String
  var min_accepted_fee: String
  var mode_accepted_fee: String
  var p10_accepted_fee: String
  var p20_accepted_fee: String
  var p30_accepted_fee: String
  var p40_accepted_fee: String
  var p50_accepted_fee: String
  var p60_accepted_fee: String
  var p70_accepted_fee: String
  var p80_accepted_fee: String
  var p90_accepted_fee: String
  var p95_accepted_fee: String
  var p99_accepted_fee: String
}

object FeeStatsResponse {
  @scala.inline
  def apply(
    last_ledger: String,
    last_ledger_base_fee: String,
    ledger_capacity_usage: String,
    min_accepted_fee: String,
    mode_accepted_fee: String,
    p10_accepted_fee: String,
    p20_accepted_fee: String,
    p30_accepted_fee: String,
    p40_accepted_fee: String,
    p50_accepted_fee: String,
    p60_accepted_fee: String,
    p70_accepted_fee: String,
    p80_accepted_fee: String,
    p90_accepted_fee: String,
    p95_accepted_fee: String,
    p99_accepted_fee: String
  ): FeeStatsResponse = {
    val __obj = js.Dynamic.literal(last_ledger = last_ledger.asInstanceOf[js.Any], last_ledger_base_fee = last_ledger_base_fee.asInstanceOf[js.Any], ledger_capacity_usage = ledger_capacity_usage.asInstanceOf[js.Any], min_accepted_fee = min_accepted_fee.asInstanceOf[js.Any], mode_accepted_fee = mode_accepted_fee.asInstanceOf[js.Any], p10_accepted_fee = p10_accepted_fee.asInstanceOf[js.Any], p20_accepted_fee = p20_accepted_fee.asInstanceOf[js.Any], p30_accepted_fee = p30_accepted_fee.asInstanceOf[js.Any], p40_accepted_fee = p40_accepted_fee.asInstanceOf[js.Any], p50_accepted_fee = p50_accepted_fee.asInstanceOf[js.Any], p60_accepted_fee = p60_accepted_fee.asInstanceOf[js.Any], p70_accepted_fee = p70_accepted_fee.asInstanceOf[js.Any], p80_accepted_fee = p80_accepted_fee.asInstanceOf[js.Any], p90_accepted_fee = p90_accepted_fee.asInstanceOf[js.Any], p95_accepted_fee = p95_accepted_fee.asInstanceOf[js.Any], p99_accepted_fee = p99_accepted_fee.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeeStatsResponse]
  }
}

