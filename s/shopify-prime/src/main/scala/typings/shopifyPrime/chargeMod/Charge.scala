package typings.shopifyPrime.chargeMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.accepted
import typings.shopifyPrime.shopifyPrimeStrings.active
import typings.shopifyPrime.shopifyPrimeStrings.cancelled
import typings.shopifyPrime.shopifyPrimeStrings.declined
import typings.shopifyPrime.shopifyPrimeStrings.expired
import typings.shopifyPrime.shopifyPrimeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charge extends ShopifyObject {
  /**
    * The URL that the customer should be sent to, to accept or decline the application charge.
    */
  var confirmation_url: js.UndefOr[String] = js.native
  /**
    * The date and time when the application charge was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The name of the application charge, e.g. "Super Expensive One-time Charge".
    */
  var name: String = js.native
  /**
    * The price of the application charge. Note: Shopify returns this value as a string.
    */
  var price: js.UndefOr[String | Double] = js.native
  /**
    * The URL the customer is sent to once they accept/decline a charge.
    */
  var return_url: js.UndefOr[String] = js.native
  /**
    * The status of the charge.
    */
  var status: js.UndefOr[pending | accepted | active | cancelled | declined | expired] = js.native
  /**
    * Whether or not the application charge is a test transaction.
    */
  var test: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the recurring application charge was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Charge {
  @scala.inline
  def apply(name: String): Charge = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
  @scala.inline
  implicit class ChargeOps[Self <: Charge] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirmation_url(value: String): Self = this.set("confirmation_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmation_url: Self = this.set("confirmation_url", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setPrice(value: String | Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_url: Self = this.set("return_url", js.undefined)
    @scala.inline
    def setStatus(value: pending | accepted | active | cancelled | declined | expired): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

