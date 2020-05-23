package typings.reactNativeGoogleAnalyticsBridge.productMod

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
    checkoutStep: js.UndefOr[Double] = js.undefined,
    productActionList: String = null,
    productListSource: String = null,
    transaction: Transaction = null
  ): ProductAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (!js.isUndefined(checkoutStep)) __obj.updateDynamic("checkoutStep")(checkoutStep.get.asInstanceOf[js.Any])
    if (productActionList != null) __obj.updateDynamic("productActionList")(productActionList.asInstanceOf[js.Any])
    if (productListSource != null) __obj.updateDynamic("productListSource")(productListSource.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductAction]
  }
}

