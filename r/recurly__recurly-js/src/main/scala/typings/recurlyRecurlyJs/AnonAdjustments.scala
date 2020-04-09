package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.checkoutMod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdjustments extends js.Object {
  var adjustments: String
  var discount: String
  var giftCard: String
  var items: js.Array[Item]
  var subscriptions: String
  var subtotal: String
  var taxes: String
  var total: String
}

object AnonAdjustments {
  @scala.inline
  def apply(
    adjustments: String,
    discount: String,
    giftCard: String,
    items: js.Array[Item],
    subscriptions: String,
    subtotal: String,
    taxes: String,
    total: String
  ): AnonAdjustments = {
    val __obj = js.Dynamic.literal(adjustments = adjustments.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], giftCard = giftCard.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdjustments]
  }
}

