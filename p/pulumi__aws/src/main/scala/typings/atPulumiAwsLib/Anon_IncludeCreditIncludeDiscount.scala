package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeCreditIncludeDiscount extends js.Object {
  var includeCredit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeDiscount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeOtherSubscription: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeRecurring: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeRefund: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeSubscription: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeTax: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var includeUpfront: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var useAmortized: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var useBlended: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_IncludeCreditIncludeDiscount {
  @scala.inline
  def apply(
    includeCredit: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeDiscount: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeOtherSubscription: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeRecurring: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeRefund: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeSubscription: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeSupport: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeTax: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    includeUpfront: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    useAmortized: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    useBlended: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
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

