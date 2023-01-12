package typings.reactNativeAdManager

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactNativeAdManager.helperTypesMod.BannerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNativeAdsWithNativeAdMod {
  
  inline def apply[P](Component: ComponentType[P]): ComponentClass[P & NativeAdWrapperProps, ComponentState] = ^.asInstanceOf[js.Dynamic].apply(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & NativeAdWrapperProps, ComponentState]]
  
  @JSImport("react-native-ad-manager/src/native-ads/withNativeAd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait NativeAdWrapperProps
    extends StObject
       with BannerProps {
    
    var adLoaderIndex: js.UndefOr[String] = js.undefined
    
    var adsManager: js.UndefOr[typings.reactNativeAdManager.srcNativeAdsNativeAdsManagerMod.^] = js.undefined
    
    var correlator: js.UndefOr[String] = js.undefined
    
    var customTemplateIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var validAdTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object NativeAdWrapperProps {
    
    inline def apply(): NativeAdWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeAdWrapperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeAdWrapperProps] (val x: Self) extends AnyVal {
      
      inline def setAdLoaderIndex(value: String): Self = StObject.set(x, "adLoaderIndex", value.asInstanceOf[js.Any])
      
      inline def setAdLoaderIndexUndefined: Self = StObject.set(x, "adLoaderIndex", js.undefined)
      
      inline def setAdsManager(value: typings.reactNativeAdManager.srcNativeAdsNativeAdsManagerMod.^): Self = StObject.set(x, "adsManager", value.asInstanceOf[js.Any])
      
      inline def setAdsManagerUndefined: Self = StObject.set(x, "adsManager", js.undefined)
      
      inline def setCorrelator(value: String): Self = StObject.set(x, "correlator", value.asInstanceOf[js.Any])
      
      inline def setCorrelatorUndefined: Self = StObject.set(x, "correlator", js.undefined)
      
      inline def setCustomTemplateIds(value: js.Array[String]): Self = StObject.set(x, "customTemplateIds", value.asInstanceOf[js.Any])
      
      inline def setCustomTemplateIdsUndefined: Self = StObject.set(x, "customTemplateIds", js.undefined)
      
      inline def setCustomTemplateIdsVarargs(value: String*): Self = StObject.set(x, "customTemplateIds", js.Array(value*))
      
      inline def setValidAdTypes(value: js.Array[String]): Self = StObject.set(x, "validAdTypes", value.asInstanceOf[js.Any])
      
      inline def setValidAdTypesUndefined: Self = StObject.set(x, "validAdTypes", js.undefined)
      
      inline def setValidAdTypesVarargs(value: String*): Self = StObject.set(x, "validAdTypes", js.Array(value*))
    }
  }
}
