package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductAction extends js.Object {
  var action: ProductActionEnum
  var checkoutOption: js.UndefOr[String] = js.undefined
  var checkoutStep: js.UndefOr[Double] = js.undefined
  var productActionList: js.UndefOr[String] = js.undefined
  var productListSource: js.UndefOr[String] = js.undefined
  var transaction: js.UndefOr[Transaction] = js.undefined
}

object ProductAction {
  @scala.inline
  def apply(
    action: ProductActionEnum,
    checkoutOption: String = null,
    checkoutStep: Int | Double = null,
    productActionList: String = null,
    productListSource: String = null,
    transaction: Transaction = null
  ): ProductAction = {
    val __obj = js.Dynamic.literal(action = action)
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption)
    if (checkoutStep != null) __obj.updateDynamic("checkoutStep")(checkoutStep.asInstanceOf[js.Any])
    if (productActionList != null) __obj.updateDynamic("productActionList")(productActionList)
    if (productListSource != null) __obj.updateDynamic("productListSource")(productListSource)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[ProductAction]
  }
}

