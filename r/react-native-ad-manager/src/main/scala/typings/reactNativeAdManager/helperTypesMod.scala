package typings.reactNativeAdManager

import typings.reactNativeAdManager.anon.Accuracy
import typings.reactNativeAdManager.anon.Height
import typings.reactNativeAdManager.anon.Info
import typings.reactNativeAdManager.anon.Message
import typings.reactNativeAdManager.reactNativeAdManagerStrings.banner
import typings.reactNativeAdManager.reactNativeAdManagerStrings.fullBanner
import typings.reactNativeAdManager.reactNativeAdManagerStrings.largeBanner
import typings.reactNativeAdManager.reactNativeAdManagerStrings.leaderboard
import typings.reactNativeAdManager.reactNativeAdManagerStrings.mediumRectangle
import typings.reactNativeAdManager.reactNativeAdManagerStrings.smartBannerLandscape
import typings.reactNativeAdManager.reactNativeAdManagerStrings.smartBannerPortrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTypesMod {
  
  trait AdFailedToLoadEvent extends StObject {
    
    var error: Message
  }
  object AdFailedToLoadEvent {
    
    inline def apply(error: Message): AdFailedToLoadEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdFailedToLoadEvent]
    }
    
    extension [Self <: AdFailedToLoadEvent](x: Self) {
      
      inline def setError(value: Message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdLoadedEvent extends StObject {
    
    var gadSize: String
    
    var `type`: String
  }
  object AdLoadedEvent {
    
    inline def apply(gadSize: String, `type`: String): AdLoadedEvent = {
      val __obj = js.Dynamic.literal(gadSize = gadSize.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdLoadedEvent]
    }
    
    extension [Self <: AdLoadedEvent](x: Self) {
      
      inline def setGadSize(value: String): Self = StObject.set(x, "gadSize", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BannerProps
    extends StObject
       with typings.reactNative.mod.ViewProps {
    
    /**
      * DFP iOS library banner size constants
      * (https://developers.google.com/admob/ios/banner)
      * banner (320x50, Standard Banner for Phones and Tablets)
      * largeBanner (320x100, Large Banner for Phones and Tablets)
      * mediumRectangle (300x250, IAB Medium Rectangle for Phones and Tablets)
      * fullBanner (468x60, IAB Full-Size Banner for Tablets)
      * leaderboard (728x90, IAB Leaderboard for Tablets)
      * smartBannerPortrait (Screen width x 32|50|90, Smart Banner for Phones and Tablets)
      * smartBannerLandscape (Screen width x 32|50|90, Smart Banner for Phones and Tablets)
      *
      * banner is default
      */
    var adSize: js.UndefOr[
        banner | largeBanner | mediumRectangle | fullBanner | leaderboard | smartBannerPortrait | smartBannerLandscape
      ] = js.undefined
    
    /**
      * DFP ad unit ID
      */
    var adUnitID: js.UndefOr[String] = js.undefined
    
    var onAdClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAdFailedToLoad: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var onAdLeftApplication: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAdLoaded: js.UndefOr[js.Function1[/* event */ AdLoadedEvent, Unit]] = js.undefined
    
    var onAdOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAppEvent: js.UndefOr[js.Function1[/* event */ Info, Unit]] = js.undefined
    
    var onSizeChange: js.UndefOr[js.Function1[/* event */ Height, Unit]] = js.undefined
    
    /**
      * The ad manager targeting
      */
    var targeting: js.UndefOr[Targeting] = js.undefined
    
    /**
      * Array of test devices. Use Banner.simulatorId for the simulator
      */
    var testDevices: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional array specifying all valid sizes that are appropriate for this slot.
      */
    var validAdSizes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BannerProps {
    
    inline def apply(): BannerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BannerProps]
    }
    
    extension [Self <: BannerProps](x: Self) {
      
      inline def setAdSize(
        value: banner | largeBanner | mediumRectangle | fullBanner | leaderboard | smartBannerPortrait | smartBannerLandscape
      ): Self = StObject.set(x, "adSize", value.asInstanceOf[js.Any])
      
      inline def setAdSizeUndefined: Self = StObject.set(x, "adSize", js.undefined)
      
      inline def setAdUnitID(value: String): Self = StObject.set(x, "adUnitID", value.asInstanceOf[js.Any])
      
      inline def setAdUnitIDUndefined: Self = StObject.set(x, "adUnitID", js.undefined)
      
      inline def setOnAdClosed(value: () => Unit): Self = StObject.set(x, "onAdClosed", js.Any.fromFunction0(value))
      
      inline def setOnAdClosedUndefined: Self = StObject.set(x, "onAdClosed", js.undefined)
      
      inline def setOnAdFailedToLoad(value: /* error */ Any => Unit): Self = StObject.set(x, "onAdFailedToLoad", js.Any.fromFunction1(value))
      
      inline def setOnAdFailedToLoadUndefined: Self = StObject.set(x, "onAdFailedToLoad", js.undefined)
      
      inline def setOnAdLeftApplication(value: () => Unit): Self = StObject.set(x, "onAdLeftApplication", js.Any.fromFunction0(value))
      
      inline def setOnAdLeftApplicationUndefined: Self = StObject.set(x, "onAdLeftApplication", js.undefined)
      
      inline def setOnAdLoaded(value: /* event */ AdLoadedEvent => Unit): Self = StObject.set(x, "onAdLoaded", js.Any.fromFunction1(value))
      
      inline def setOnAdLoadedUndefined: Self = StObject.set(x, "onAdLoaded", js.undefined)
      
      inline def setOnAdOpened(value: () => Unit): Self = StObject.set(x, "onAdOpened", js.Any.fromFunction0(value))
      
      inline def setOnAdOpenedUndefined: Self = StObject.set(x, "onAdOpened", js.undefined)
      
      inline def setOnAppEvent(value: /* event */ Info => Unit): Self = StObject.set(x, "onAppEvent", js.Any.fromFunction1(value))
      
      inline def setOnAppEventUndefined: Self = StObject.set(x, "onAppEvent", js.undefined)
      
      inline def setOnSizeChange(value: /* event */ Height => Unit): Self = StObject.set(x, "onSizeChange", js.Any.fromFunction1(value))
      
      inline def setOnSizeChangeUndefined: Self = StObject.set(x, "onSizeChange", js.undefined)
      
      inline def setTargeting(value: Targeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
      
      inline def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
      
      inline def setTestDevices(value: js.Array[String]): Self = StObject.set(x, "testDevices", value.asInstanceOf[js.Any])
      
      inline def setTestDevicesUndefined: Self = StObject.set(x, "testDevices", js.undefined)
      
      inline def setTestDevicesVarargs(value: String*): Self = StObject.set(x, "testDevices", js.Array(value*))
      
      inline def setValidAdSizes(value: js.Array[String]): Self = StObject.set(x, "validAdSizes", value.asInstanceOf[js.Any])
      
      inline def setValidAdSizesUndefined: Self = StObject.set(x, "validAdSizes", js.undefined)
      
      inline def setValidAdSizesVarargs(value: String*): Self = StObject.set(x, "validAdSizes", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeAdManager.reactNativeAdManagerStrings.adLoaded
    - typings.reactNativeAdManager.reactNativeAdManagerStrings.adFailedToLoad
    - typings.reactNativeAdManager.reactNativeAdManagerStrings.adOpened
    - typings.reactNativeAdManager.reactNativeAdManagerStrings.adClosed
    - typings.reactNativeAdManager.reactNativeAdManagerStrings.adLeftApplication
  */
  trait InterstialEventType extends StObject
  object InterstialEventType {
    
    inline def adClosed: typings.reactNativeAdManager.reactNativeAdManagerStrings.adClosed = "adClosed".asInstanceOf[typings.reactNativeAdManager.reactNativeAdManagerStrings.adClosed]
    
    inline def adFailedToLoad: typings.reactNativeAdManager.reactNativeAdManagerStrings.adFailedToLoad = "adFailedToLoad".asInstanceOf[typings.reactNativeAdManager.reactNativeAdManagerStrings.adFailedToLoad]
    
    inline def adLeftApplication: typings.reactNativeAdManager.reactNativeAdManagerStrings.adLeftApplication = "adLeftApplication".asInstanceOf[typings.reactNativeAdManager.reactNativeAdManagerStrings.adLeftApplication]
    
    inline def adLoaded: typings.reactNativeAdManager.reactNativeAdManagerStrings.adLoaded = "adLoaded".asInstanceOf[typings.reactNativeAdManager.reactNativeAdManagerStrings.adLoaded]
    
    inline def adOpened: typings.reactNativeAdManager.reactNativeAdManagerStrings.adOpened = "adOpened".asInstanceOf[typings.reactNativeAdManager.reactNativeAdManagerStrings.adOpened]
  }
  
  /* Inlined std.Partial<{  customTargeting :object,   categoryExclusions :std.Array<string>,   keywords :std.Array<string>,   contentURL :string,   publisherProvidedID :string,   location :{  latitude :number,   longitude :number,   accuracy :number},   correlator :string}> */
  trait Targeting extends StObject {
    
    var categoryExclusions: js.UndefOr[js.Array[String]] = js.undefined
    
    var contentURL: js.UndefOr[String] = js.undefined
    
    var correlator: js.UndefOr[String] = js.undefined
    
    var customTargeting: js.UndefOr[js.Object] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var location: js.UndefOr[Accuracy] = js.undefined
    
    var publisherProvidedID: js.UndefOr[String] = js.undefined
  }
  object Targeting {
    
    inline def apply(): Targeting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Targeting]
    }
    
    extension [Self <: Targeting](x: Self) {
      
      inline def setCategoryExclusions(value: js.Array[String]): Self = StObject.set(x, "categoryExclusions", value.asInstanceOf[js.Any])
      
      inline def setCategoryExclusionsUndefined: Self = StObject.set(x, "categoryExclusions", js.undefined)
      
      inline def setCategoryExclusionsVarargs(value: String*): Self = StObject.set(x, "categoryExclusions", js.Array(value*))
      
      inline def setContentURL(value: String): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
      
      inline def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
      
      inline def setCorrelator(value: String): Self = StObject.set(x, "correlator", value.asInstanceOf[js.Any])
      
      inline def setCorrelatorUndefined: Self = StObject.set(x, "correlator", js.undefined)
      
      inline def setCustomTargeting(value: js.Object): Self = StObject.set(x, "customTargeting", value.asInstanceOf[js.Any])
      
      inline def setCustomTargetingUndefined: Self = StObject.set(x, "customTargeting", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLocation(value: Accuracy): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPublisherProvidedID(value: String): Self = StObject.set(x, "publisherProvidedID", value.asInstanceOf[js.Any])
      
      inline def setPublisherProvidedIDUndefined: Self = StObject.set(x, "publisherProvidedID", js.undefined)
    }
  }
  
  type ViewProps = typings.reactNative.mod.ViewProps
}
