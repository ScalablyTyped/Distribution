package typings.shopifyPrime.applicationCreditMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCredit extends ShopifyObject {
  /**
    * The amount refunded by the application credit.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * The description of the application credit.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * States whether or not the application credit is a test transaction. Valid values are true or null.
    */
  var test: js.UndefOr[Boolean] = js.undefined
}

object ApplicationCredit {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    amount: js.UndefOr[Double] = js.undefined,
    description: String = null,
    id: js.UndefOr[Double] = js.undefined,
    test: js.UndefOr[Boolean] = js.undefined
  ): ApplicationCredit = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCredit]
  }
}

