package typings.reactNativeGoogleAnalyticsBridge

import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByField
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByIndex
import typings.reactNativeGoogleAnalyticsBridge.customMod.CustomMetrics
import typings.reactNativeGoogleAnalyticsBridge.productMod.Product
import typings.reactNativeGoogleAnalyticsBridge.productMod.ProductAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsMod {
  
  @js.native
  sealed trait SessionState extends StObject
  @JSImport("react-native-google-analytics-bridge/dist/models/Analytics", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SessionState & String] = js.native
    
    @js.native
    sealed trait End
      extends StObject
         with SessionState
    /* "end" */ val End: typings.reactNativeGoogleAnalyticsBridge.analyticsMod.SessionState.End & String = js.native
    
    @js.native
    sealed trait Start
      extends StObject
         with SessionState
    /* "start" */ val Start: typings.reactNativeGoogleAnalyticsBridge.analyticsMod.SessionState.Start & String = js.native
  }
  
  trait EventMetadata extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object EventMetadata {
    
    inline def apply(): EventMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventMetadata]
    }
    
    extension [Self <: EventMetadata](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait HitPayload extends StObject {
    
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
    
    inline def apply(): HitPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HitPayload]
    }
    
    extension [Self <: HitPayload](x: Self) {
      
      inline def setCustomDimensions(value: CustomDimensionsByIndex | CustomDimensionsByField): Self = StObject.set(x, "customDimensions", value.asInstanceOf[js.Any])
      
      inline def setCustomDimensionsUndefined: Self = StObject.set(x, "customDimensions", js.undefined)
      
      inline def setCustomMetrics(value: CustomMetrics): Self = StObject.set(x, "customMetrics", value.asInstanceOf[js.Any])
      
      inline def setCustomMetricsUndefined: Self = StObject.set(x, "customMetrics", js.undefined)
      
      inline def setImpressionList(value: String): Self = StObject.set(x, "impressionList", value.asInstanceOf[js.Any])
      
      inline def setImpressionListUndefined: Self = StObject.set(x, "impressionList", js.undefined)
      
      inline def setImpressionProducts(value: js.Array[Product]): Self = StObject.set(x, "impressionProducts", value.asInstanceOf[js.Any])
      
      inline def setImpressionProductsUndefined: Self = StObject.set(x, "impressionProducts", js.undefined)
      
      inline def setImpressionProductsVarargs(value: Product*): Self = StObject.set(x, "impressionProducts", js.Array(value*))
      
      inline def setImpressionSource(value: String): Self = StObject.set(x, "impressionSource", value.asInstanceOf[js.Any])
      
      inline def setImpressionSourceUndefined: Self = StObject.set(x, "impressionSource", js.undefined)
      
      inline def setProductAction(value: ProductAction): Self = StObject.set(x, "productAction", value.asInstanceOf[js.Any])
      
      inline def setProductActionUndefined: Self = StObject.set(x, "productAction", js.undefined)
      
      inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
      
      inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
      
      inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
      
      inline def setSession(value: SessionState): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setUtmCampaignUrl(value: String): Self = StObject.set(x, "utmCampaignUrl", value.asInstanceOf[js.Any])
      
      inline def setUtmCampaignUrlUndefined: Self = StObject.set(x, "utmCampaignUrl", js.undefined)
    }
  }
  
  trait TimingMetadata extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object TimingMetadata {
    
    inline def apply(name: String): TimingMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingMetadata]
    }
    
    extension [Self <: TimingMetadata](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
