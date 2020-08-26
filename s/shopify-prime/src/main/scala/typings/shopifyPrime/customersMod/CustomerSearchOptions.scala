package typings.shopifyPrime.customersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerSearchOptions extends js.Object {
  /**
    * Set the field and direction by which to order results.
    */
  var order: js.UndefOr[String] = js.native
  /**
    * Text to search for in the shop's customer data.
    */
  var query: js.UndefOr[String] = js.native
}

object CustomerSearchOptions {
  @scala.inline
  def apply(): CustomerSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerSearchOptions]
  }
  @scala.inline
  implicit class CustomerSearchOptionsOps[Self <: CustomerSearchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

