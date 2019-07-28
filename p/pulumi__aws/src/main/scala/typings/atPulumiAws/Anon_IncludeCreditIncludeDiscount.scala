package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeCreditIncludeDiscount extends js.Object {
  var includeCredit: js.UndefOr[Input[Boolean]] = js.undefined
  var includeDiscount: js.UndefOr[Input[Boolean]] = js.undefined
  var includeOtherSubscription: js.UndefOr[Input[Boolean]] = js.undefined
  var includeRecurring: js.UndefOr[Input[Boolean]] = js.undefined
  var includeRefund: js.UndefOr[Input[Boolean]] = js.undefined
  var includeSubscription: js.UndefOr[Input[Boolean]] = js.undefined
  var includeSupport: js.UndefOr[Input[Boolean]] = js.undefined
  var includeTax: js.UndefOr[Input[Boolean]] = js.undefined
  var includeUpfront: js.UndefOr[Input[Boolean]] = js.undefined
  var useAmortized: js.UndefOr[Input[Boolean]] = js.undefined
  var useBlended: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_IncludeCreditIncludeDiscount {
  @scala.inline
  def apply(
    includeCredit: Input[Boolean] = null,
    includeDiscount: Input[Boolean] = null,
    includeOtherSubscription: Input[Boolean] = null,
    includeRecurring: Input[Boolean] = null,
    includeRefund: Input[Boolean] = null,
    includeSubscription: Input[Boolean] = null,
    includeSupport: Input[Boolean] = null,
    includeTax: Input[Boolean] = null,
    includeUpfront: Input[Boolean] = null,
    useAmortized: Input[Boolean] = null,
    useBlended: Input[Boolean] = null
  ): Anon_IncludeCreditIncludeDiscount = {
    val __obj = js.Dynamic.literal()
    if (includeCredit != null) __obj.updateDynamic("includeCredit")(includeCredit.asInstanceOf[js.Any])
    if (includeDiscount != null) __obj.updateDynamic("includeDiscount")(includeDiscount.asInstanceOf[js.Any])
    if (includeOtherSubscription != null) __obj.updateDynamic("includeOtherSubscription")(includeOtherSubscription.asInstanceOf[js.Any])
    if (includeRecurring != null) __obj.updateDynamic("includeRecurring")(includeRecurring.asInstanceOf[js.Any])
    if (includeRefund != null) __obj.updateDynamic("includeRefund")(includeRefund.asInstanceOf[js.Any])
    if (includeSubscription != null) __obj.updateDynamic("includeSubscription")(includeSubscription.asInstanceOf[js.Any])
    if (includeSupport != null) __obj.updateDynamic("includeSupport")(includeSupport.asInstanceOf[js.Any])
    if (includeTax != null) __obj.updateDynamic("includeTax")(includeTax.asInstanceOf[js.Any])
    if (includeUpfront != null) __obj.updateDynamic("includeUpfront")(includeUpfront.asInstanceOf[js.Any])
    if (useAmortized != null) __obj.updateDynamic("useAmortized")(useAmortized.asInstanceOf[js.Any])
    if (useBlended != null) __obj.updateDynamic("useBlended")(useBlended.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeCreditIncludeDiscount]
  }
}

