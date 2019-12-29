package typings.stripeDashV3

import typings.stripeDashV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BillingdetailsSepadebit extends js.Object {
  /**
    * The customer's billing_details. name and email are required.
    */
  var billing_details: Anon_Email
  /**
    * An iban Element.
    */
  var sepa_debit: Element | Anon_Iban
}

object Anon_BillingdetailsSepadebit {
  @scala.inline
  def apply(billing_details: Anon_Email, sepa_debit: Element | Anon_Iban): Anon_BillingdetailsSepadebit = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], sepa_debit = sepa_debit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BillingdetailsSepadebit]
  }
}

