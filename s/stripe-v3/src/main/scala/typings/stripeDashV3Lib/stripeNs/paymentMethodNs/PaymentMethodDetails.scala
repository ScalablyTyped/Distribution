package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the payment method at the time of the transaction.
  */
trait PaymentMethodDetails extends js.Object {
  var ach_credit_transfer: js.UndefOr[AchCreditTransferDetails | scala.Null] = js.undefined
  var ach_debit: js.UndefOr[AchDebitDetails | scala.Null] = js.undefined
  var alipay: js.UndefOr[js.Any | scala.Null] = js.undefined
  var bancontact: js.UndefOr[BanContactDetails | scala.Null] = js.undefined
  var card: js.UndefOr[PaymentMethodCard | scala.Null] = js.undefined
  var eps: js.UndefOr[EpsDetails | scala.Null] = js.undefined
  var giropay: js.UndefOr[GiropayDetails | scala.Null] = js.undefined
  var ideal: js.UndefOr[IdealDetails | scala.Null] = js.undefined
  var multibanco: js.UndefOr[MultibancoDetails | scala.Null] = js.undefined
  var p24: js.UndefOr[P24Details | scala.Null] = js.undefined
  var sepa_debit: js.UndefOr[SepaDebitDetails | scala.Null] = js.undefined
  var sofort: js.UndefOr[SofortDetails | scala.Null] = js.undefined
  var stripe_account: js.UndefOr[js.Any | scala.Null] = js.undefined
  /**
    * The type of transaction-specific details of the payment method used in the payment
    */
  var `type`: stripeDashV3Lib.stripeDashV3LibStrings.ach_credit_transfer | stripeDashV3Lib.stripeDashV3LibStrings.ach_debit | stripeDashV3Lib.stripeDashV3LibStrings.alipay | stripeDashV3Lib.stripeDashV3LibStrings.bancontact | stripeDashV3Lib.stripeDashV3LibStrings.card | stripeDashV3Lib.stripeDashV3LibStrings.eps | stripeDashV3Lib.stripeDashV3LibStrings.giropay | stripeDashV3Lib.stripeDashV3LibStrings.ideal | stripeDashV3Lib.stripeDashV3LibStrings.multibanco | stripeDashV3Lib.stripeDashV3LibStrings.p24 | stripeDashV3Lib.stripeDashV3LibStrings.sepa_debit | stripeDashV3Lib.stripeDashV3LibStrings.sofort | stripeDashV3Lib.stripeDashV3LibStrings.stripe_account | stripeDashV3Lib.stripeDashV3LibStrings.wechat
  var wechat: js.UndefOr[js.Any | scala.Null] = js.undefined
}

object PaymentMethodDetails {
  @scala.inline
  def apply(
    `type`: stripeDashV3Lib.stripeDashV3LibStrings.ach_credit_transfer | stripeDashV3Lib.stripeDashV3LibStrings.ach_debit | stripeDashV3Lib.stripeDashV3LibStrings.alipay | stripeDashV3Lib.stripeDashV3LibStrings.bancontact | stripeDashV3Lib.stripeDashV3LibStrings.card | stripeDashV3Lib.stripeDashV3LibStrings.eps | stripeDashV3Lib.stripeDashV3LibStrings.giropay | stripeDashV3Lib.stripeDashV3LibStrings.ideal | stripeDashV3Lib.stripeDashV3LibStrings.multibanco | stripeDashV3Lib.stripeDashV3LibStrings.p24 | stripeDashV3Lib.stripeDashV3LibStrings.sepa_debit | stripeDashV3Lib.stripeDashV3LibStrings.sofort | stripeDashV3Lib.stripeDashV3LibStrings.stripe_account | stripeDashV3Lib.stripeDashV3LibStrings.wechat,
    ach_credit_transfer: AchCreditTransferDetails = null,
    ach_debit: AchDebitDetails = null,
    alipay: js.Any = null,
    bancontact: BanContactDetails = null,
    card: PaymentMethodCard = null,
    eps: EpsDetails = null,
    giropay: GiropayDetails = null,
    ideal: IdealDetails = null,
    multibanco: MultibancoDetails = null,
    p24: P24Details = null,
    sepa_debit: SepaDebitDetails = null,
    sofort: SofortDetails = null,
    stripe_account: js.Any = null,
    wechat: js.Any = null
  ): PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ach_credit_transfer != null) __obj.updateDynamic("ach_credit_transfer")(ach_credit_transfer)
    if (ach_debit != null) __obj.updateDynamic("ach_debit")(ach_debit)
    if (alipay != null) __obj.updateDynamic("alipay")(alipay)
    if (bancontact != null) __obj.updateDynamic("bancontact")(bancontact)
    if (card != null) __obj.updateDynamic("card")(card)
    if (eps != null) __obj.updateDynamic("eps")(eps)
    if (giropay != null) __obj.updateDynamic("giropay")(giropay)
    if (ideal != null) __obj.updateDynamic("ideal")(ideal)
    if (multibanco != null) __obj.updateDynamic("multibanco")(multibanco)
    if (p24 != null) __obj.updateDynamic("p24")(p24)
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit)
    if (sofort != null) __obj.updateDynamic("sofort")(sofort)
    if (stripe_account != null) __obj.updateDynamic("stripe_account")(stripe_account)
    if (wechat != null) __obj.updateDynamic("wechat")(wechat)
    __obj.asInstanceOf[PaymentMethodDetails]
  }
}

