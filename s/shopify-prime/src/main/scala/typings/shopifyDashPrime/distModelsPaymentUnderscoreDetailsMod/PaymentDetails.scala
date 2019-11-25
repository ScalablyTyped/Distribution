package typings.shopifyDashPrime.distModelsPaymentUnderscoreDetailsMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetails extends ShopifyObject {
  var avs_result_code: js.UndefOr[String] = js.undefined
  var credit_card_bin: js.UndefOr[String] = js.undefined
  var credit_card_company: js.UndefOr[String] = js.undefined
  var credit_card_number: js.UndefOr[String] = js.undefined
  var cvv_result_code: js.UndefOr[String] = js.undefined
}

object PaymentDetails {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    avs_result_code: String = null,
    credit_card_bin: String = null,
    credit_card_company: String = null,
    credit_card_number: String = null,
    cvv_result_code: String = null,
    id: Int | Double = null
  ): PaymentDetails = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (avs_result_code != null) __obj.updateDynamic("avs_result_code")(avs_result_code.asInstanceOf[js.Any])
    if (credit_card_bin != null) __obj.updateDynamic("credit_card_bin")(credit_card_bin.asInstanceOf[js.Any])
    if (credit_card_company != null) __obj.updateDynamic("credit_card_company")(credit_card_company.asInstanceOf[js.Any])
    if (credit_card_number != null) __obj.updateDynamic("credit_card_number")(credit_card_number.asInstanceOf[js.Any])
    if (cvv_result_code != null) __obj.updateDynamic("cvv_result_code")(cvv_result_code.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetails]
  }
}

