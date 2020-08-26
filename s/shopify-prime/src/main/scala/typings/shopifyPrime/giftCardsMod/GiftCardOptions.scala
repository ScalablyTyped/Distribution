package typings.shopifyPrime.giftCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiftCardOptions extends js.Object {
  /**
    * Field and direction to order results by
    */
  var order: String = js.native
  /**
    * Text to search gift cards
    */
  var query: String = js.native
  /**
    * Restrict results to only enabled/disabled gift cards. Note: This is only usabled
    * with the /admin/gift_cards.json api and not /admin/gift_cards/search.json
    */
  var status: String = js.native
}

object GiftCardOptions {
  @scala.inline
  def apply(order: String, query: String, status: String): GiftCardOptions = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiftCardOptions]
  }
  @scala.inline
  implicit class GiftCardOptionsOps[Self <: GiftCardOptions] (val x: Self) extends AnyVal {
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
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

