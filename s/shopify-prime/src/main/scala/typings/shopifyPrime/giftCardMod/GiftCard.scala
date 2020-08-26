package typings.shopifyPrime.giftCardMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiftCard extends ShopifyObject {
  /**
    * A unique numeric identifier of the application that issued the gift card (if it was issued by an application).
    */
  var api_client_id: js.UndefOr[Double] = js.native
  /**
    * The balance of the gift card.
    */
  var balance: js.UndefOr[Double] = js.native
  /**
    * The gift card code which consists of a minimum of 8 alphanumeric characters. For security reasons, this is only available upon creation of the gift card.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The date and time when the gift card was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[Date] = js.native
  /**
    * The currency of the gift card.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The date and time when the gift card was disabled. The API returns this value in ISO 8601 format.
    */
  var disabled_at: js.UndefOr[Date] = js.native
  /**
    * The date and time when the gift card expires. The format must be YYYY-MM-DD.
    */
  var expires_on: js.UndefOr[Date] = js.native
  /**
    * Initial card value
    */
  var initial_value: js.UndefOr[Double] = js.native
  /**
    * The last four characters of the gift card code.
    */
  var last_characters: js.UndefOr[String] = js.native
  /**
    * A unique numeric identifier of the line_item that caused the creation of this gift card (if it was created by an order).
    */
  var line_item_id: js.UndefOr[Double] = js.native
  /**
    * Because gift cards are alternate payment methods, the gift card code is masked the same way a credit card would be.
    */
  var masked_code: js.UndefOr[String] = js.native
  /**
    * The text of an optional note that a shop owner can attach to the gift card. Not visible to merchants.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * A unique numeric identifier of the order that caused the creation of this gift card (if it was created by an order).
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * When specified, the gift card will be rendered using gift_card.SUFFIX.liquid instead of gift_card.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The date and time when the gift card was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[Date] = js.native
  /**
    * A unique numeric identifier of the user that issued the gift card (if it was issued by a user).
    */
  var user_id: js.UndefOr[Double] = js.native
}

object GiftCard {
  @scala.inline
  def apply(): GiftCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GiftCard]
  }
  @scala.inline
  implicit class GiftCardOps[Self <: GiftCard] (val x: Self) extends AnyVal {
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
    def setApi_client_id(value: Double): Self = this.set("api_client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_client_id: Self = this.set("api_client_id", js.undefined)
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDisabled_at(value: Date): Self = this.set("disabled_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled_at: Self = this.set("disabled_at", js.undefined)
    @scala.inline
    def setExpires_on(value: Date): Self = this.set("expires_on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires_on: Self = this.set("expires_on", js.undefined)
    @scala.inline
    def setInitial_value(value: Double): Self = this.set("initial_value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial_value: Self = this.set("initial_value", js.undefined)
    @scala.inline
    def setLast_characters(value: String): Self = this.set("last_characters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_characters: Self = this.set("last_characters", js.undefined)
    @scala.inline
    def setLine_item_id(value: Double): Self = this.set("line_item_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine_item_id: Self = this.set("line_item_id", js.undefined)
    @scala.inline
    def setMasked_code(value: String): Self = this.set("masked_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasked_code: Self = this.set("masked_code", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOrder_id(value: Double): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_id: Self = this.set("order_id", js.undefined)
    @scala.inline
    def setTemplate_suffix(value: String): Self = this.set("template_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_suffix: Self = this.set("template_suffix", js.undefined)
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
  
}

