package typings.shopifyPrime.fulfillmentMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.lineItemMod.LineItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fulfillment extends ShopifyObject {
  /**
    * The date and time when the fulfillment was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * A historical record of each item in the fulfillment.
    */
  var line_items: js.UndefOr[js.Array[LineItem]] = js.native
  /**
    * The unique numeric identifier for the order.
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * A textfield with information about the receipt.
    */
  var receipt: js.UndefOr[js.Any] = js.native
  /**
    * The status of the fulfillment. Known values are 'pending', 'open', 'success', 'cancelled',
    * 'error' and 'failure'.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The name of the shipping company.
    */
  var tracking_company: js.UndefOr[String] = js.native
  /**
    * The shipping number, provided by the shipping company. If multiple tracking numbers
    * exist, returns the first number.
    */
  var tracking_number: js.UndefOr[String] = js.native
  /**
    * A list of shipping numbers, provided by the shipping company. May be null.
    */
  var tracking_numbers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The tracking url, provided by the shipping company. May be null. If multiple tracking URLs
    * exist, returns the first URL.
    */
  var tracking_url: js.UndefOr[String] = js.native
  /**
    * An array of one or more tracking urls, provided by the shipping company. May be null.
    */
  var tracking_urls: js.UndefOr[js.Array[String]] = js.native
  /**
    * The date and time when the fulfillment was last modified.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Fulfillment {
  @scala.inline
  def apply(): Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fulfillment]
  }
  @scala.inline
  implicit class FulfillmentOps[Self <: Fulfillment] (val x: Self) extends AnyVal {
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
    def setLine_itemsVarargs(value: LineItem*): Self = this.set("line_items", js.Array(value :_*))
    @scala.inline
    def setLine_items(value: js.Array[LineItem]): Self = this.set("line_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine_items: Self = this.set("line_items", js.undefined)
    @scala.inline
    def setOrder_id(value: Double): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_id: Self = this.set("order_id", js.undefined)
    @scala.inline
    def setReceipt(value: js.Any): Self = this.set("receipt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceipt: Self = this.set("receipt", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTracking_company(value: String): Self = this.set("tracking_company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking_company: Self = this.set("tracking_company", js.undefined)
    @scala.inline
    def setTracking_number(value: String): Self = this.set("tracking_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking_number: Self = this.set("tracking_number", js.undefined)
    @scala.inline
    def setTracking_numbersVarargs(value: String*): Self = this.set("tracking_numbers", js.Array(value :_*))
    @scala.inline
    def setTracking_numbers(value: js.Array[String]): Self = this.set("tracking_numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking_numbers: Self = this.set("tracking_numbers", js.undefined)
    @scala.inline
    def setTracking_url(value: String): Self = this.set("tracking_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking_url: Self = this.set("tracking_url", js.undefined)
    @scala.inline
    def setTracking_urlsVarargs(value: String*): Self = this.set("tracking_urls", js.Array(value :_*))
    @scala.inline
    def setTracking_urls(value: js.Array[String]): Self = this.set("tracking_urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking_urls: Self = this.set("tracking_urls", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

