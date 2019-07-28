package typings.shopifyDashPrime.distOptionsCustomersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerSearchOptions extends js.Object {
  /**
    * Set the field and direction by which to order results.
    */
  var order: js.UndefOr[String] = js.undefined
  /**
    * Text to search for in the shop's customer data.
    */
  var query: js.UndefOr[String] = js.undefined
}

object CustomerSearchOptions {
  @scala.inline
  def apply(order: String = null, query: String = null): CustomerSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[CustomerSearchOptions]
  }
}

