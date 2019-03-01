package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeCredit extends js.Object {
  var includeCredit: js.UndefOr[scala.Boolean] = js.undefined
  var includeDiscount: js.UndefOr[scala.Boolean] = js.undefined
  var includeOtherSubscription: js.UndefOr[scala.Boolean] = js.undefined
  var includeRecurring: js.UndefOr[scala.Boolean] = js.undefined
  var includeRefund: js.UndefOr[scala.Boolean] = js.undefined
  var includeSubscription: js.UndefOr[scala.Boolean] = js.undefined
  var includeSupport: js.UndefOr[scala.Boolean] = js.undefined
  var includeTax: js.UndefOr[scala.Boolean] = js.undefined
  var includeUpfront: js.UndefOr[scala.Boolean] = js.undefined
  var useAmortized: js.UndefOr[scala.Boolean] = js.undefined
  var useBlended: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeCredit {
  @scala.inline
  def apply(
    includeCredit: js.UndefOr[scala.Boolean] = js.undefined,
    includeDiscount: js.UndefOr[scala.Boolean] = js.undefined,
    includeOtherSubscription: js.UndefOr[scala.Boolean] = js.undefined,
    includeRecurring: js.UndefOr[scala.Boolean] = js.undefined,
    includeRefund: js.UndefOr[scala.Boolean] = js.undefined,
    includeSubscription: js.UndefOr[scala.Boolean] = js.undefined,
    includeSupport: js.UndefOr[scala.Boolean] = js.undefined,
    includeTax: js.UndefOr[scala.Boolean] = js.undefined,
    includeUpfront: js.UndefOr[scala.Boolean] = js.undefined,
    useAmortized: js.UndefOr[scala.Boolean] = js.undefined,
    useBlended: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IncludeCredit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeCredit)) __obj.updateDynamic("includeCredit")(includeCredit)
    if (!js.isUndefined(includeDiscount)) __obj.updateDynamic("includeDiscount")(includeDiscount)
    if (!js.isUndefined(includeOtherSubscription)) __obj.updateDynamic("includeOtherSubscription")(includeOtherSubscription)
    if (!js.isUndefined(includeRecurring)) __obj.updateDynamic("includeRecurring")(includeRecurring)
    if (!js.isUndefined(includeRefund)) __obj.updateDynamic("includeRefund")(includeRefund)
    if (!js.isUndefined(includeSubscription)) __obj.updateDynamic("includeSubscription")(includeSubscription)
    if (!js.isUndefined(includeSupport)) __obj.updateDynamic("includeSupport")(includeSupport)
    if (!js.isUndefined(includeTax)) __obj.updateDynamic("includeTax")(includeTax)
    if (!js.isUndefined(includeUpfront)) __obj.updateDynamic("includeUpfront")(includeUpfront)
    if (!js.isUndefined(useAmortized)) __obj.updateDynamic("useAmortized")(useAmortized)
    if (!js.isUndefined(useBlended)) __obj.updateDynamic("useBlended")(useBlended)
    __obj.asInstanceOf[Anon_IncludeCredit]
  }
}

