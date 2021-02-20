package typings.reactNativeGoogleAnalyticsBridge

import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByField
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByIndex
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomMetrics
import typings.reactNativeGoogleAnalyticsBridge.productMod.Product
import typings.reactNativeGoogleAnalyticsBridge.productMod.ProductAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsMod {
  
  @js.native
  sealed trait SessionState extends StObject
  @JSImport("react-native-google-analytics-bridge/dist/models/Analytics", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState with String] = js.native
    
    @js.native
    sealed trait End extends SessionState
    /* "end" */ val End: typings.reactNativeGoogleAnalyticsBridge.analyticsMod.SessionState.End with String = js.native
    
    @js.native
    sealed trait Start extends SessionState
    /* "start" */ val Start: typings.reactNativeGoogleAnalyticsBridge.analyticsMod.SessionState.Start with String = js.native
  }
  
  @js.native
  trait EventMetadata extends StObject {
    
    var label: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object EventMetadata {
    
    @scala.inline
    def apply(): EventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventMetadata]
    }
    
    @scala.inline
    implicit class EventMetadataMutableBuilder[Self <: EventMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait HitPayload extends StObject {
    
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
    implicit class HitPayloadMutableBuilder[Self <: HitPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomDimensions(value: CustomDimensionsByIndex | CustomDimensionsByField): Self = StObject.set(x, "customDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDimensionsUndefined: Self = StObject.set(x, "customDimensions", js.undefined)
      
      @scala.inline
      def setCustomMetrics(value: CustomMetrics): Self = StObject.set(x, "customMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMetricsUndefined: Self = StObject.set(x, "customMetrics", js.undefined)
      
      @scala.inline
      def setImpressionList(value: String): Self = StObject.set(x, "impressionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpressionListUndefined: Self = StObject.set(x, "impressionList", js.undefined)
      
      @scala.inline
      def setImpressionProducts(value: js.Array[Product]): Self = StObject.set(x, "impressionProducts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpressionProductsUndefined: Self = StObject.set(x, "impressionProducts", js.undefined)
      
      @scala.inline
      def setImpressionProductsVarargs(value: Product*): Self = StObject.set(x, "impressionProducts", js.Array(value :_*))
      
      @scala.inline
      def setImpressionSource(value: String): Self = StObject.set(x, "impressionSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpressionSourceUndefined: Self = StObject.set(x, "impressionSource", js.undefined)
      
      @scala.inline
      def setProductAction(value: ProductAction): Self = StObject.set(x, "productAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductActionUndefined: Self = StObject.set(x, "productAction", js.undefined)
      
      @scala.inline
      def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
      
      @scala.inline
      def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
      
      @scala.inline
      def setSession(value: SessionState): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUtmCampaignUrl(value: String): Self = StObject.set(x, "utmCampaignUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtmCampaignUrlUndefined: Self = StObject.set(x, "utmCampaignUrl", js.undefined)
    }
  }
  
  @js.native
  trait TimingMetadata extends StObject {
    
    var label: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  object TimingMetadata {
    
    @scala.inline
    def apply(name: String): TimingMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingMetadata]
    }
    
    @scala.inline
    implicit class TimingMetadataMutableBuilder[Self <: TimingMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
