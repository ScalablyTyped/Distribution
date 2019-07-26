package typings
package shopifyDashPrimeLib.distOptionsCustomersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerSearchOptions extends js.Object {
  /**
    * Set the field and direction by which to order results.
    */
  var order: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to search for in the shop's customer data.
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object CustomerSearchOptions {
  @scala.inline
  def apply(order: java.lang.String = null, query: java.lang.String = null): CustomerSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[CustomerSearchOptions]
  }
}

