package typings.shopifyPrime.usageChargeMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageCharge extends ShopifyObject {
  /**
    * The date and time when the usage charge was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The name or description of the usage charge.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The price of the usage charge.
    */
  var price: js.UndefOr[Double] = js.native
  /**
    * The recurring application charge the usage charge belongs to.
    */
  var recurring_application_charge_id: js.UndefOr[Double] = js.native
  /**
    * The date and time when the usage charge was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object UsageCharge {
  @scala.inline
  def apply(): UsageCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageCharge]
  }
  @scala.inline
  implicit class UsageChargeOps[Self <: UsageCharge] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setRecurring_application_charge_id(value: Double): Self = this.set("recurring_application_charge_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurring_application_charge_id: Self = this.set("recurring_application_charge_id", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

