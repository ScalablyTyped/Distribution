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

object GiftCard {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    api_client_id: scala.Int | scala.Double = null,
    balance: scala.Int | scala.Double = null,
    code: java.lang.String = null,
    created_at: stdLib.Date = null,
    currency: java.lang.String = null,
    disabled_at: stdLib.Date = null,
    expires_on: stdLib.Date = null,
    id: scala.Int | scala.Double = null,
    initial_value: scala.Int | scala.Double = null,
    last_characters: java.lang.String = null,
    line_item_id: scala.Int | scala.Double = null,
    masked_code: java.lang.String = null,
    note: java.lang.String = null,
    order_id: scala.Int | scala.Double = null,
    template_suffix: java.lang.String = null,
    updated_at: stdLib.Date = null,
    user_id: scala.Int | scala.Double = null
  ): GiftCard = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (api_client_id != null) __obj.updateDynamic("api_client_id")(api_client_id.asInstanceOf[js.Any])
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (disabled_at != null) __obj.updateDynamic("disabled_at")(disabled_at)
    if (expires_on != null) __obj.updateDynamic("expires_on")(expires_on)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initial_value != null) __obj.updateDynamic("initial_value")(initial_value.asInstanceOf[js.Any])
    if (last_characters != null) __obj.updateDynamic("last_characters")(last_characters)
    if (line_item_id != null) __obj.updateDynamic("line_item_id")(line_item_id.asInstanceOf[js.Any])
    if (masked_code != null) __obj.updateDynamic("masked_code")(masked_code)
    if (note != null) __obj.updateDynamic("note")(note)
    if (order_id != null) __obj.updateDynamic("order_id")(order_id.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiftCard]
  }
}

