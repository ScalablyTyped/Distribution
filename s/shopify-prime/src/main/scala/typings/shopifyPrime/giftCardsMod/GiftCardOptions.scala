package typings.shopifyPrime.giftCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiftCardOptions extends js.Object {
  /**
    * Field and direction to order results by
    */
  var order: String
  /**
    * Text to search gift cards
    */
  var query: String
  /**
    * Restrict results to only enabled/disabled gift cards. Note: This is only usabled
    * with the /admin/gift_cards.json api and not /admin/gift_cards/search.json
    */
  var status: String
}

object GiftCardOptions {
  @scala.inline
  def apply(order: String, query: String, status: String): GiftCardOptions = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GiftCardOptions]
  }
}

