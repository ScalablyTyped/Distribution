package typings
package shopifyDashPrimeLib.distOptionsGiftUnderscoreCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiftCardOptions extends js.Object {
  /**
    * Field and direction to order results by
    */
  var order: java.lang.String
  /**
    * Text to search gift cards
    */
  var query: java.lang.String
  /**
    * Restrict results to only enabled/disabled gift cards. Note: This is only usabled
    * with the /admin/gift_cards.json api and not /admin/gift_cards/search.json
    */
  var status: java.lang.String
}

object GiftCardOptions {
  @scala.inline
  def apply(order: java.lang.String, query: java.lang.String, status: java.lang.String): GiftCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[GiftCardOptions]
  }
}

