package typings.reactNativeGoogleAnalyticsBridge.analyticsMod

import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByField
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByIndex
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomMetrics
import typings.reactNativeGoogleAnalyticsBridge.productMod.Product
import typings.reactNativeGoogleAnalyticsBridge.productMod.ProductAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitPayload extends js.Object {
  var customDimensions: js.UndefOr[CustomDimensionsByIndex | CustomDimensionsByField] = js.native
  var customMetrics: js.UndefOr[CustomMetrics] = js.native
  var impressionList: js.UndefOr[String] = js.native
  var impressionProducts: js.UndefOr[js.Array[Product]] = js.native
  var impressionSource: js.UndefOr[String] = js.native
  var productAction: js.UndefOr[ProductAction] = js.native
  var products: js.UndefOr[js.Array[Product]] = js.native
  var session: js.UndefOr[SessionState] = js.native
  var utmCampaignUrl: js.UndefOr[String] = js.native
}

object HitPayload {
  @scala.inline
  def apply(): HitPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HitPayload]
  }
  @scala.inline
  implicit class HitPayloadOps[Self <: HitPayload] (val x: Self) extends AnyVal {
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
    def setCustomDimensions(value: CustomDimensionsByIndex | CustomDimensionsByField): Self = this.set("customDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDimensions: Self = this.set("customDimensions", js.undefined)
    @scala.inline
    def setCustomMetrics(value: CustomMetrics): Self = this.set("customMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetrics: Self = this.set("customMetrics", js.undefined)
    @scala.inline
    def setImpressionList(value: String): Self = this.set("impressionList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionList: Self = this.set("impressionList", js.undefined)
    @scala.inline
    def setImpressionProductsVarargs(value: Product*): Self = this.set("impressionProducts", js.Array(value :_*))
    @scala.inline
    def setImpressionProducts(value: js.Array[Product]): Self = this.set("impressionProducts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionProducts: Self = this.set("impressionProducts", js.undefined)
    @scala.inline
    def setImpressionSource(value: String): Self = this.set("impressionSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionSource: Self = this.set("impressionSource", js.undefined)
    @scala.inline
    def setProductAction(value: ProductAction): Self = this.set("productAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductAction: Self = this.set("productAction", js.undefined)
    @scala.inline
    def setProductsVarargs(value: Product*): Self = this.set("products", js.Array(value :_*))
    @scala.inline
    def setProducts(value: js.Array[Product]): Self = this.set("products", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    @scala.inline
    def setSession(value: SessionState): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setUtmCampaignUrl(value: String): Self = this.set("utmCampaignUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmCampaignUrl: Self = this.set("utmCampaignUrl", js.undefined)
  }
  
}

