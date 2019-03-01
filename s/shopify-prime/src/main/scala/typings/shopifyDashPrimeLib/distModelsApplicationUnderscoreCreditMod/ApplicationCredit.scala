package typings
package shopifyDashPrimeLib.distModelsApplicationUnderscoreCreditMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCredit
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The amount refunded by the application credit.
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The description of the application credit.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * States whether or not the application credit is a test transaction. Valid values are true or null.
    */
  var test: js.UndefOr[scala.Boolean] = js.undefined
}

object ApplicationCredit {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    amount: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    test: js.UndefOr[scala.Boolean] = js.undefined
  ): ApplicationCredit = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[ApplicationCredit]
  }
}

