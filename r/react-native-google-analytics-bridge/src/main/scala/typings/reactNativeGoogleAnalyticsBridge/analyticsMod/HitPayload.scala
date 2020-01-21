package typings.reactNativeGoogleAnalyticsBridge.analyticsMod

import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByField
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByIndex
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomMetrics
import typings.reactNativeGoogleAnalyticsBridge.productMod.Product
import typings.reactNativeGoogleAnalyticsBridge.productMod.ProductAction
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
    if (customMetrics != null) __obj.updateDynamic("customMetrics")(customMetrics.asInstanceOf[js.Any])
    if (impressionList != null) __obj.updateDynamic("impressionList")(impressionList.asInstanceOf[js.Any])
    if (impressionProducts != null) __obj.updateDynamic("impressionProducts")(impressionProducts.asInstanceOf[js.Any])
    if (impressionSource != null) __obj.updateDynamic("impressionSource")(impressionSource.asInstanceOf[js.Any])
    if (productAction != null) __obj.updateDynamic("productAction")(productAction.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (utmCampaignUrl != null) __obj.updateDynamic("utmCampaignUrl")(utmCampaignUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitPayload]
  }
}

