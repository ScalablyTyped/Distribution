package typings
package shopifyDashPrimeLib.distModelsGiftUnderscoreCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GiftCard
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * A unique numeric identifier of the application that issued the gift card (if it was issued by an application).
       */
  var api_client_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * The balance of the gift card.
       */
  var balance: js.UndefOr[scala.Double] = js.undefined
  /**
       * The gift card code which consists of a minimum of 8 alphanumeric characters. For security reasons, this is only available upon creation of the gift card.
       */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the gift card was created. The API returns this value in ISO 8601 format.
       */
  var created_at: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * The currency of the gift card.
       */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the gift card was disabled. The API returns this value in ISO 8601 format.
       */
  var disabled_at: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * The date and time when the gift card expires. The format must be YYYY-MM-DD.
       */
  var expires_on: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * Initial card value
       */
  var initial_value: js.UndefOr[scala.Double] = js.undefined
  /**
       * The last four characters of the gift card code.
       */
  var last_characters: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A unique numeric identifier of the line_item that caused the creation of this gift card (if it was created by an order).
       */
  var line_item_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * Because gift cards are alternate payment methods, the gift card code is masked the same way a credit card would be.
       */
  var masked_code: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The text of an optional note that a shop owner can attach to the gift card. Not visible to merchants.
       */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A unique numeric identifier of the order that caused the creation of this gift card (if it was created by an order).
       */
  var order_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * When specified, the gift card will be rendered using gift_card.SUFFIX.liquid instead of gift_card.liquid.
       */
  var template_suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date and time when the gift card was last modified. The API returns this value in ISO 8601 format.
       */
  var updated_at: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * A unique numeric identifier of the user that issued the gift card (if it was issued by a user).
       */
  var user_id: js.UndefOr[scala.Double] = js.undefined
}

