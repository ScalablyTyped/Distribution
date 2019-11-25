package typings.stripeDashV3.stripe.paymentMethod

import typings.stripeDashV3.stripeDashV3Strings.ach_credit_transfer
import typings.stripeDashV3.stripeDashV3Strings.ach_debit
import typings.stripeDashV3.stripeDashV3Strings.alipay
import typings.stripeDashV3.stripeDashV3Strings.bancontact
import typings.stripeDashV3.stripeDashV3Strings.card
import typings.stripeDashV3.stripeDashV3Strings.eps
import typings.stripeDashV3.stripeDashV3Strings.giropay
import typings.stripeDashV3.stripeDashV3Strings.ideal
import typings.stripeDashV3.stripeDashV3Strings.multibanco
import typings.stripeDashV3.stripeDashV3Strings.p24
import typings.stripeDashV3.stripeDashV3Strings.sepa_debit
import typings.stripeDashV3.stripeDashV3Strings.sofort
import typings.stripeDashV3.stripeDashV3Strings.stripe_account
import typings.stripeDashV3.stripeDashV3Strings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the payment method at the time of the transaction.
  */
trait PaymentMethodDetails extends js.Object {
  var ach_credit_transfer: js.UndefOr[AchCreditTransferDetails | Null] = js.undefined
  var ach_debit: js.UndefOr[AchDebitDetails | Null] = js.undefined
  var alipay: js.UndefOr[js.Any | Null] = js.undefined
  var bancontact: js.UndefOr[BanContactDetails | Null] = js.undefined
  var card: js.UndefOr[PaymentMethodCard | Null] = js.undefined
  var eps: js.UndefOr[EpsDetails | Null] = js.undefined
  var giropay: js.UndefOr[GiropayDetails | Null] = js.undefined
  var ideal: js.UndefOr[IdealDetails | Null] = js.undefined
  var multibanco: js.UndefOr[MultibancoDetails | Null] = js.undefined
  var p24: js.UndefOr[P24Details | Null] = js.undefined
  var sepa_debit: js.UndefOr[SepaDebitDetails | Null] = js.undefined
  var sofort: js.UndefOr[SofortDetails | Null] = js.undefined
  var stripe_account: js.UndefOr[js.Any | Null] = js.undefined
  /**
    * The type of transaction-specific details of the payment method used in the payment
    */
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
  var wechat: js.UndefOr[js.Any | Null] = js.undefined
}

object PaymentMethodDetails {
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat,
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
    if (ach_credit_transfer != null) __obj.updateDynamic("ach_credit_transfer")(ach_credit_transfer.asInstanceOf[js.Any])
    if (ach_debit != null) __obj.updateDynamic("ach_debit")(ach_debit.asInstanceOf[js.Any])
    if (alipay != null) __obj.updateDynamic("alipay")(alipay.asInstanceOf[js.Any])
    if (bancontact != null) __obj.updateDynamic("bancontact")(bancontact.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (eps != null) __obj.updateDynamic("eps")(eps.asInstanceOf[js.Any])
    if (giropay != null) __obj.updateDynamic("giropay")(giropay.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (multibanco != null) __obj.updateDynamic("multibanco")(multibanco.asInstanceOf[js.Any])
    if (p24 != null) __obj.updateDynamic("p24")(p24.asInstanceOf[js.Any])
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    if (sofort != null) __obj.updateDynamic("sofort")(sofort.asInstanceOf[js.Any])
    if (stripe_account != null) __obj.updateDynamic("stripe_account")(stripe_account.asInstanceOf[js.Any])
    if (wechat != null) __obj.updateDynamic("wechat")(wechat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodDetails]
  }
}

