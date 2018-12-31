package typings
package shopifyDashPrimeLib.distModelsDraftUnderscoreLineUnderscoreItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftLineItem
  extends shopifyDashPrimeLib.distModelsLineUnderscoreItemMod.LineItem {
  /**
    * Discount which will be applied to the line item or the overall order.
    */
  var applied_discount: shopifyDashPrimeLib.distModelsAppliedUnderscoreDiscountMod.AppliedDiscount
  /**
    * Indicates if this is a product variant line item, or a custom line item. If set to true indicates a custom line item. If set to false indicates a product variant line item. This is a read only field.
    */
  var custom: js.UndefOr[scala.Boolean] = js.undefined
}

