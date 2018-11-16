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

