package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsAnalyticsMod

import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsCustomMod.CustomDimensionsByField
import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsCustomMod.CustomDimensionsByIndex
import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsCustomMod.CustomMetrics
import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.Product
import typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitPayload extends js.Object {
  var customDimensions: js.UndefOr[CustomDimensionsByIndex | CustomDimensionsByField] = js.undefined
  var customMetrics: js.UndefOr[CustomMetrics] = js.undefined
  var impressionList: js.UndefOr[String] = js.undefined
  var impressionProducts: js.UndefOr[js.Array[Product]] = js.undefined
  var impressionSource: js.UndefOr[String] = js.undefined
  var productAction: js.UndefOr[ProductAction] = js.undefined
  var products: js.UndefOr[js.Array[Product]] = js.undefined
  var session: js.UndefOr[SessionState] = js.undefined
  var utmCampaignUrl: js.UndefOr[String] = js.undefined
}

object HitPayload {
  @scala.inline
  def apply(
    customDimensions: CustomDimensionsByIndex | CustomDimensionsByField = null,
    customMetrics: CustomMetrics = null,
    impressionList: String = null,
    impressionProducts: js.Array[Product] = null,
    impressionSource: String = null,
    productAction: ProductAction = null,
    products: js.Array[Product] = null,
    session: SessionState = null,
    utmCampaignUrl: String = null
  ): HitPayload = {
    val __obj = js.Dynamic.literal()
    if (customDimensions != null) __obj.updateDynamic("customDimensions")(customDimensions.asInstanceOf[js.Any])
    if (customMetrics != null) __obj.updateDynamic("customMetrics")(customMetrics)
    if (impressionList != null) __obj.updateDynamic("impressionList")(impressionList)
    if (impressionProducts != null) __obj.updateDynamic("impressionProducts")(impressionProducts)
    if (impressionSource != null) __obj.updateDynamic("impressionSource")(impressionSource)
    if (productAction != null) __obj.updateDynamic("productAction")(productAction)
    if (products != null) __obj.updateDynamic("products")(products)
    if (session != null) __obj.updateDynamic("session")(session)
    if (utmCampaignUrl != null) __obj.updateDynamic("utmCampaignUrl")(utmCampaignUrl)
    __obj.asInstanceOf[HitPayload]
  }
}

