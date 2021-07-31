package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.Instantiable2
import typings.reactNativeFirebase.reactNativeFirebaseStrings.SHORT
import typings.reactNativeFirebase.reactNativeFirebaseStrings.UNGUESSABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object links {
  
  @JSImport("react-native-firebase", "RNFirebase.links.DynamicLink")
  @js.native
  class DynamicLink protected () extends StObject {
    def this(link: String, domainURIPrefix: String) = this()
    
    var analytics: AnalyticsParameters = js.native
    
    var android: AndroidParameters = js.native
    
    var ios: IOSParameters = js.native
    
    var itunes: ITunesParameters = js.native
    
    var navigation: NavigationParameters = js.native
    
    var social: SocialParameters = js.native
  }
  
  trait AnalyticsParameters extends StObject {
    
    def setCampaign(campaign: String): DynamicLink
    
    def setContent(content: String): DynamicLink
    
    def setMedium(medium: String): DynamicLink
    
    def setSource(source: String): DynamicLink
    
    def setTerm(term: String): DynamicLink
  }
  object AnalyticsParameters {
    
    @scala.inline
    def apply(
      setCampaign: String => DynamicLink,
      setContent: String => DynamicLink,
      setMedium: String => DynamicLink,
      setSource: String => DynamicLink,
      setTerm: String => DynamicLink
    ): AnalyticsParameters = {
      val __obj = js.Dynamic.literal(setCampaign = js.Any.fromFunction1(setCampaign), setContent = js.Any.fromFunction1(setContent), setMedium = js.Any.fromFunction1(setMedium), setSource = js.Any.fromFunction1(setSource), setTerm = js.Any.fromFunction1(setTerm))
      __obj.asInstanceOf[AnalyticsParameters]
    }
    
    @scala.inline
    implicit class AnalyticsParametersMutableBuilder[Self <: AnalyticsParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetCampaign(value: String => DynamicLink): Self = StObject.set(x, "setCampaign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetContent(value: String => DynamicLink): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMedium(value: String => DynamicLink): Self = StObject.set(x, "setMedium", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSource(value: String => DynamicLink): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTerm(value: String => DynamicLink): Self = StObject.set(x, "setTerm", js.Any.fromFunction1(value))
    }
  }
  
  trait AndroidParameters extends StObject {
    
    def setFallbackUrl(fallbackUrl: String): DynamicLink
    
    def setMinimumVersion(minimumVersion: Double): DynamicLink
    
    def setPackageName(packageName: String): DynamicLink
  }
  object AndroidParameters {
    
    @scala.inline
    def apply(
      setFallbackUrl: String => DynamicLink,
      setMinimumVersion: Double => DynamicLink,
      setPackageName: String => DynamicLink
    ): AndroidParameters = {
      val __obj = js.Dynamic.literal(setFallbackUrl = js.Any.fromFunction1(setFallbackUrl), setMinimumVersion = js.Any.fromFunction1(setMinimumVersion), setPackageName = js.Any.fromFunction1(setPackageName))
      __obj.asInstanceOf[AndroidParameters]
    }
    
    @scala.inline
    implicit class AndroidParametersMutableBuilder[Self <: AndroidParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetFallbackUrl(value: String => DynamicLink): Self = StObject.set(x, "setFallbackUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinimumVersion(value: Double => DynamicLink): Self = StObject.set(x, "setMinimumVersion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPackageName(value: String => DynamicLink): Self = StObject.set(x, "setPackageName", js.Any.fromFunction1(value))
    }
  }
  
  trait IOSParameters extends StObject {
    
    def setAppStoreId(appStoreId: String): DynamicLink
    
    def setBundleId(bundleId: String): DynamicLink
    
    def setCustomScheme(customScheme: String): DynamicLink
    
    def setFallbackUrl(fallbackUrl: String): DynamicLink
    
    def setIPadBundleId(iPadBundleId: String): DynamicLink
    
    def setIPadFallbackUrl(iPadFallbackUrl: String): DynamicLink
    
    def setMinimumVersion(minimumVersion: String): DynamicLink
  }
  object IOSParameters {
    
    @scala.inline
    def apply(
      setAppStoreId: String => DynamicLink,
      setBundleId: String => DynamicLink,
      setCustomScheme: String => DynamicLink,
      setFallbackUrl: String => DynamicLink,
      setIPadBundleId: String => DynamicLink,
      setIPadFallbackUrl: String => DynamicLink,
      setMinimumVersion: String => DynamicLink
    ): IOSParameters = {
      val __obj = js.Dynamic.literal(setAppStoreId = js.Any.fromFunction1(setAppStoreId), setBundleId = js.Any.fromFunction1(setBundleId), setCustomScheme = js.Any.fromFunction1(setCustomScheme), setFallbackUrl = js.Any.fromFunction1(setFallbackUrl), setIPadBundleId = js.Any.fromFunction1(setIPadBundleId), setIPadFallbackUrl = js.Any.fromFunction1(setIPadFallbackUrl), setMinimumVersion = js.Any.fromFunction1(setMinimumVersion))
      __obj.asInstanceOf[IOSParameters]
    }
    
    @scala.inline
    implicit class IOSParametersMutableBuilder[Self <: IOSParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetAppStoreId(value: String => DynamicLink): Self = StObject.set(x, "setAppStoreId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBundleId(value: String => DynamicLink): Self = StObject.set(x, "setBundleId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCustomScheme(value: String => DynamicLink): Self = StObject.set(x, "setCustomScheme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFallbackUrl(value: String => DynamicLink): Self = StObject.set(x, "setFallbackUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIPadBundleId(value: String => DynamicLink): Self = StObject.set(x, "setIPadBundleId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIPadFallbackUrl(value: String => DynamicLink): Self = StObject.set(x, "setIPadFallbackUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinimumVersion(value: String => DynamicLink): Self = StObject.set(x, "setMinimumVersion", js.Any.fromFunction1(value))
    }
  }
  
  trait ITunesParameters extends StObject {
    
    def setAffiliateToken(affiliateToken: String): DynamicLink
    
    def setCampaignToken(campaignToken: String): DynamicLink
    
    def setProviderToken(providerToken: String): DynamicLink
  }
  object ITunesParameters {
    
    @scala.inline
    def apply(
      setAffiliateToken: String => DynamicLink,
      setCampaignToken: String => DynamicLink,
      setProviderToken: String => DynamicLink
    ): ITunesParameters = {
      val __obj = js.Dynamic.literal(setAffiliateToken = js.Any.fromFunction1(setAffiliateToken), setCampaignToken = js.Any.fromFunction1(setCampaignToken), setProviderToken = js.Any.fromFunction1(setProviderToken))
      __obj.asInstanceOf[ITunesParameters]
    }
    
    @scala.inline
    implicit class ITunesParametersMutableBuilder[Self <: ITunesParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetAffiliateToken(value: String => DynamicLink): Self = StObject.set(x, "setAffiliateToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCampaignToken(value: String => DynamicLink): Self = StObject.set(x, "setCampaignToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetProviderToken(value: String => DynamicLink): Self = StObject.set(x, "setProviderToken", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Links extends StObject {
    
    /** Creates a standard dynamic link. */
    def createDynamicLink(dynamicLink: DynamicLink): js.Promise[String] = js.native
    
    /** Creates a short dynamic link. */
    @JSName("createShortDynamicLink")
    def createShortDynamicLink_SHORT(dynamicLink: DynamicLink, `type`: SHORT): js.Promise[String] = js.native
    @JSName("createShortDynamicLink")
    def createShortDynamicLink_UNGUESSABLE(dynamicLink: DynamicLink, `type`: UNGUESSABLE): js.Promise[String] = js.native
    
    /**
      * Returns the URL that the app has been launched from. If the app was
      * not launched from a URL the return value will be null.
      */
    def getInitialLink(): js.Promise[String | Null] = js.native
    
    /**
      * Subscribe to URL open events while the app is still running.
      * The listener is called from URL open events whilst the app is still
      * running, use getInitialLink for URLs which cause the app to open
      * from a previously closed / not running state.
      * Returns an unsubscribe function, call the returned function to
      * unsubscribe from all future events.
      */
    def onLink(listener: js.Function1[/* url */ String, Unit]): js.Function0[Unit] = js.native
  }
  
  trait LinksStatics extends StObject {
    
    var DynamicLink: Instantiable2[
        /* link */ String, 
        /* domainURIPrefix */ String, 
        typings.reactNativeFirebase.mod.RNFirebase.links.DynamicLink
      ]
  }
  object LinksStatics {
    
    @scala.inline
    def apply(DynamicLink: Instantiable2[/* link */ String, /* domainURIPrefix */ String, DynamicLink]): LinksStatics = {
      val __obj = js.Dynamic.literal(DynamicLink = DynamicLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinksStatics]
    }
    
    @scala.inline
    implicit class LinksStaticsMutableBuilder[Self <: LinksStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicLink(value: Instantiable2[/* link */ String, /* domainURIPrefix */ String, DynamicLink]): Self = StObject.set(x, "DynamicLink", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationParameters extends StObject {
    
    def setForcedRedirectEnabled(forcedRedirectEnabled: Boolean): DynamicLink
  }
  object NavigationParameters {
    
    @scala.inline
    def apply(setForcedRedirectEnabled: Boolean => DynamicLink): NavigationParameters = {
      val __obj = js.Dynamic.literal(setForcedRedirectEnabled = js.Any.fromFunction1(setForcedRedirectEnabled))
      __obj.asInstanceOf[NavigationParameters]
    }
    
    @scala.inline
    implicit class NavigationParametersMutableBuilder[Self <: NavigationParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetForcedRedirectEnabled(value: Boolean => DynamicLink): Self = StObject.set(x, "setForcedRedirectEnabled", js.Any.fromFunction1(value))
    }
  }
  
  trait SocialParameters extends StObject {
    
    def setDescriptionText(descriptionText: String): DynamicLink
    
    def setImageUrl(imageUrl: String): DynamicLink
    
    def setTitle(title: String): DynamicLink
  }
  object SocialParameters {
    
    @scala.inline
    def apply(
      setDescriptionText: String => DynamicLink,
      setImageUrl: String => DynamicLink,
      setTitle: String => DynamicLink
    ): SocialParameters = {
      val __obj = js.Dynamic.literal(setDescriptionText = js.Any.fromFunction1(setDescriptionText), setImageUrl = js.Any.fromFunction1(setImageUrl), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[SocialParameters]
    }
    
    @scala.inline
    implicit class SocialParametersMutableBuilder[Self <: SocialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetDescriptionText(value: String => DynamicLink): Self = StObject.set(x, "setDescriptionText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetImageUrl(value: String => DynamicLink): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitle(value: String => DynamicLink): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    }
  }
}
