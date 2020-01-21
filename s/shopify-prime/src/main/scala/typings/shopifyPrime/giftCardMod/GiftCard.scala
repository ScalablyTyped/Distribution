package typings.shopifyPrime.giftCardMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiftCard extends ShopifyObject {
  /**
    * A unique numeric identifier of the application that issued the gift card (if it was issued by an application).
    */
  var api_client_id: js.UndefOr[Double] = js.undefined
  /**
    * The balance of the gift card.
    */
  var balance: js.UndefOr[Double] = js.undefined
  /**
    * The gift card code which consists of a minimum of 8 alphanumeric characters. For security reasons, this is only available upon creation of the gift card.
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the gift card was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[Date] = js.undefined
  /**
    * The currency of the gift card.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the gift card was disabled. The API returns this value in ISO 8601 format.
    */
  var disabled_at: js.UndefOr[Date] = js.undefined
  /**
    * The date and time when the gift card expires. The format must be YYYY-MM-DD.
    */
  var expires_on: js.UndefOr[Date] = js.undefined
  /**
    * Initial card value
    */
  var initial_value: js.UndefOr[Double] = js.undefined
  /**
    * The last four characters of the gift card code.
    */
  var last_characters: js.UndefOr[String] = js.undefined
  /**
    * A unique numeric identifier of the line_item that caused the creation of this gift card (if it was created by an order).
    */
  var line_item_id: js.UndefOr[Double] = js.undefined
  /**
    * Because gift cards are alternate payment methods, the gift card code is masked the same way a credit card would be.
    */
  var masked_code: js.UndefOr[String] = js.undefined
  /**
    * The text of an optional note that a shop owner can attach to the gift card. Not visible to merchants.
    */
  var note: js.UndefOr[String] = js.undefined
  /**
    * A unique numeric identifier of the order that caused the creation of this gift card (if it was created by an order).
    */
  var order_id: js.UndefOr[Double] = js.undefined
  /**
    * When specified, the gift card will be rendered using gift_card.SUFFIX.liquid instead of gift_card.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the gift card was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[Date] = js.undefined
  /**
    * A unique numeric identifier of the user that issued the gift card (if it was issued by a user).
    */
  var user_id: js.UndefOr[Double] = js.undefined
}

object GiftCard {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    api_client_id: Int | Double = null,
    balance: Int | Double = null,
    code: String = null,
    created_at: Date = null,
    currency: String = null,
    disabled_at: Date = null,
    expires_on: Date = null,
    id: Int | Double = null,
    initial_value: Int | Double = null,
    last_characters: String = null,
    line_item_id: Int | Double = null,
    masked_code: String = null,
    note: String = null,
    order_id: Int | Double = null,
    template_suffix: String = null,
    updated_at: Date = null,
    user_id: Int | Double = null
  ): GiftCard = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (api_client_id != null) __obj.updateDynamic("api_client_id")(api_client_id.asInstanceOf[js.Any])
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (disabled_at != null) __obj.updateDynamic("disabled_at")(disabled_at.asInstanceOf[js.Any])
    if (expires_on != null) __obj.updateDynamic("expires_on")(expires_on.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initial_value != null) __obj.updateDynamic("initial_value")(initial_value.asInstanceOf[js.Any])
    if (last_characters != null) __obj.updateDynamic("last_characters")(last_characters.asInstanceOf[js.Any])
    if (line_item_id != null) __obj.updateDynamic("line_item_id")(line_item_id.asInstanceOf[js.Any])
    if (masked_code != null) __obj.updateDynamic("masked_code")(masked_code.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (order_id != null) __obj.updateDynamic("order_id")(order_id.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiftCard]
  }
}

