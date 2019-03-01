package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitPayload extends js.Object {
  var customDimensions: js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomDimensionsByIndex | reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomDimensionsByField
  ] = js.undefined
  var customMetrics: js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomMetrics
  ] = js.undefined
  var impressionList: js.UndefOr[java.lang.String] = js.undefined
  var impressionProducts: js.UndefOr[
    js.Array[reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.Product]
  ] = js.undefined
  var impressionSource: js.UndefOr[java.lang.String] = js.undefined
  var productAction: js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductAction
  ] = js.undefined
  var products: js.UndefOr[
    js.Array[reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.Product]
  ] = js.undefined
  var session: js.UndefOr[SessionState] = js.undefined
  var utmCampaignUrl: js.UndefOr[java.lang.String] = js.undefined
}

object HitPayload {
  @scala.inline
  def apply(
    customDimensions: reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomDimensionsByIndex | reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomDimensionsByField = null,
    customMetrics: reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomMetrics = null,
    impressionList: java.lang.String = null,
    impressionProducts: js.Array[reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.Product] = null,
    impressionSource: java.lang.String = null,
    productAction: reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductAction = null,
    products: js.Array[reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.Product] = null,
    session: SessionState = null,
    utmCampaignUrl: java.lang.String = null
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

