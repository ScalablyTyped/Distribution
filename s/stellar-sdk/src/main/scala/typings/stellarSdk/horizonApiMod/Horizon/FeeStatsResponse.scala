package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeeStatsResponse extends js.Object {
  var fee_charged: FeeDistribution = js.native
  var last_ledger: String = js.native
  var last_ledger_base_fee: String = js.native
  var ledger_capacity_usage: String = js.native
  var max_fee: FeeDistribution = js.native
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
  @scala.inline
  implicit class FeeStatsResponseOps[Self <: FeeStatsResponse] (val x: Self) extends AnyVal {
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
    def setFee_charged(value: FeeDistribution): Self = this.set("fee_charged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_ledger(value: String): Self = this.set("last_ledger", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_ledger_base_fee(value: String): Self = this.set("last_ledger_base_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedger_capacity_usage(value: String): Self = this.set("ledger_capacity_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_fee(value: FeeDistribution): Self = this.set("max_fee", value.asInstanceOf[js.Any])
  }
  
}

