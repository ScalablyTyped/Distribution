package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.Payment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payment_ extends BaseOperation[Payment] {
  var amount: String = js.native
  var asset: Asset = js.native
  var destination: String = js.native
}

object Payment_ {
  @scala.inline
  def apply(amount: String, asset: Asset, destination: String, `type`: Payment): Payment_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment_]
  }
  @scala.inline
  implicit class Payment_Ops[Self <: Payment_] (val x: Self) extends AnyVal {
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
  }
  
}

