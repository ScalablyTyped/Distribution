package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductAction extends js.Object {
  var action: ProductActionEnum
  var checkoutOption: js.UndefOr[java.lang.String] = js.undefined
  var checkoutStep: js.UndefOr[scala.Double] = js.undefined
  var productActionList: js.UndefOr[java.lang.String] = js.undefined
  var productListSource: js.UndefOr[java.lang.String] = js.undefined
  var transaction: js.UndefOr[Transaction] = js.undefined
}

object ProductAction {
  @scala.inline
  def apply(
    action: ProductActionEnum,
    checkoutOption: java.lang.String = null,
    checkoutStep: scala.Int | scala.Double = null,
    productActionList: java.lang.String = null,
    productListSource: java.lang.String = null,
    transaction: Transaction = null
  ): ProductAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption)
    if (checkoutStep != null) __obj.updateDynamic("checkoutStep")(checkoutStep.asInstanceOf[js.Any])
    if (productActionList != null) __obj.updateDynamic("productActionList")(productActionList)
    if (productListSource != null) __obj.updateDynamic("productListSource")(productListSource)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[ProductAction]
  }
}

