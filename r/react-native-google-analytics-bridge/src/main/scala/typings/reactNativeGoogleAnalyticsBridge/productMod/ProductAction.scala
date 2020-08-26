package typings.reactNativeGoogleAnalyticsBridge.productMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductAction extends js.Object {
  var action: ProductActionEnum = js.native
  var checkoutOption: js.UndefOr[String] = js.native
  var checkoutStep: js.UndefOr[Double] = js.native
  var productActionList: js.UndefOr[String] = js.native
  var productListSource: js.UndefOr[String] = js.native
  var transaction: js.UndefOr[Transaction] = js.native
}

object ProductAction {
  @scala.inline
  def apply(action: ProductActionEnum): ProductAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductAction]
  }
  @scala.inline
  implicit class ProductActionOps[Self <: ProductAction] (val x: Self) extends AnyVal {
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
    def setAction(value: ProductActionEnum): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckoutOption(value: String): Self = this.set("checkoutOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckoutOption: Self = this.set("checkoutOption", js.undefined)
    @scala.inline
    def setCheckoutStep(value: Double): Self = this.set("checkoutStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckoutStep: Self = this.set("checkoutStep", js.undefined)
    @scala.inline
    def setProductActionList(value: String): Self = this.set("productActionList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductActionList: Self = this.set("productActionList", js.undefined)
    @scala.inline
    def setProductListSource(value: String): Self = this.set("productListSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductListSource: Self = this.set("productListSource", js.undefined)
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

