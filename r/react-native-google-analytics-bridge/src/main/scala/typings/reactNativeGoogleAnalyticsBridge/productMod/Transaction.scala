package typings.reactNativeGoogleAnalyticsBridge.productMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var affiliation: js.UndefOr[String] = js.native
  var couponCode: js.UndefOr[String] = js.native
  var id: String = js.native
  var revenue: js.UndefOr[Double] = js.native
  var shipping: js.UndefOr[Double] = js.native
  var tax: js.UndefOr[Double] = js.native
}

object Transaction {
  @scala.inline
  def apply(id: String): Transaction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAffiliation(value: String): Self = this.set("affiliation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffiliation: Self = this.set("affiliation", js.undefined)
    @scala.inline
    def setCouponCode(value: String): Self = this.set("couponCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCouponCode: Self = this.set("couponCode", js.undefined)
    @scala.inline
    def setRevenue(value: Double): Self = this.set("revenue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevenue: Self = this.set("revenue", js.undefined)
    @scala.inline
    def setShipping(value: Double): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setTax(value: Double): Self = this.set("tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
  }
  
}

