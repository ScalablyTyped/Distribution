package typings
package shopifyDashPrimeLib.distModelsPaymentUnderscoreDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetails
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  var avs_result_code: js.UndefOr[java.lang.String] = js.undefined
  var credit_card_bin: js.UndefOr[java.lang.String] = js.undefined
  var credit_card_company: js.UndefOr[java.lang.String] = js.undefined
  var credit_card_number: js.UndefOr[java.lang.String] = js.undefined
  var cvv_result_code: js.UndefOr[java.lang.String] = js.undefined
}

object PaymentDetails {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    avs_result_code: java.lang.String = null,
    credit_card_bin: java.lang.String = null,
    credit_card_company: java.lang.String = null,
    credit_card_number: java.lang.String = null,
    cvv_result_code: java.lang.String = null,
    id: scala.Int | scala.Double = null
  ): PaymentDetails = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (avs_result_code != null) __obj.updateDynamic("avs_result_code")(avs_result_code)
    if (credit_card_bin != null) __obj.updateDynamic("credit_card_bin")(credit_card_bin)
    if (credit_card_company != null) __obj.updateDynamic("credit_card_company")(credit_card_company)
    if (credit_card_number != null) __obj.updateDynamic("credit_card_number")(credit_card_number)
    if (cvv_result_code != null) __obj.updateDynamic("cvv_result_code")(cvv_result_code)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetails]
  }
}

