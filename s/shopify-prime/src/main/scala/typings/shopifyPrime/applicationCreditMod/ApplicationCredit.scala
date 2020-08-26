package typings.shopifyPrime.applicationCreditMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCredit extends ShopifyObject {
  /**
    * The amount refunded by the application credit.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * The description of the application credit.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * States whether or not the application credit is a test transaction. Valid values are true or null.
    */
  var test: js.UndefOr[Boolean] = js.native
}

object ApplicationCredit {
  @scala.inline
  def apply(): ApplicationCredit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationCredit]
  }
  @scala.inline
  implicit class ApplicationCreditOps[Self <: ApplicationCredit] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
  
}

