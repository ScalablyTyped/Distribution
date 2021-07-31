package typings.reactNativeVersionCheck

import typings.nodeFetch.mod.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppID extends StObject {
    
    /**
      * App ID
      */
    var appID: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    var packageName: js.UndefOr[String] = js.undefined
  }
  object AppID {
    
    @scala.inline
    def apply(): AppID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppID]
    }
    
    @scala.inline
    implicit class AppIDMutableBuilder[Self <: AppID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppID(value: String): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIDUndefined: Self = StObject.set(x, "appID", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    }
  }
  
  trait CurrentVersion extends StObject {
    
    /**
      * app's current version from getCurrentVersion()
      */
    var currentVersion: js.UndefOr[String] = js.undefined
    
    /**
      * @default Infinity
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * isomorphic-fetch options (https://github.github.io/fetch/)
      */
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    /**
      * @default false
      */
    var forceUpdate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * app's latest version from getLatestVersion()
      */
    var latestVersion: js.UndefOr[String] = js.undefined
    
    /**
      * app's Package Name
      */
    var packageName: js.UndefOr[String] = js.undefined
    
    /**
      * provider name or function that returns promise or value of the latest version
      */
    var provider: js.UndefOr[js.Function0[String] | String] = js.undefined
  }
  object CurrentVersion {
    
    @scala.inline
    def apply(): CurrentVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentVersion]
    }
    
    @scala.inline
    implicit class CurrentVersionMutableBuilder[Self <: CurrentVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      @scala.inline
      def setForceUpdate(value: Boolean): Self = StObject.set(x, "forceUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdateUndefined: Self = StObject.set(x, "forceUpdate", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setLatestVersion(value: String): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestVersionUndefined: Self = StObject.set(x, "latestVersion", js.undefined)
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      @scala.inline
      def setProvider(value: js.Function0[String] | String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderFunction0(value: () => String): Self = StObject.set(x, "provider", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  trait FetchOptions extends StObject {
    
    /**
      * isomorphic-fetch options (https://github.github.io/fetch/)
      */
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    /**
      * @default false
      */
    var forceUpdate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Package name or function that returns promise or value of package name
      */
    var packageName: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    /**
      * provider name or function that returns promise or value of the latest version
      */
    var provider: js.UndefOr[js.Function0[String] | String] = js.undefined
  }
  object FetchOptions {
    
    @scala.inline
    def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    @scala.inline
    implicit class FetchOptionsMutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      @scala.inline
      def setForceUpdate(value: Boolean): Self = StObject.set(x, "forceUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdateUndefined: Self = StObject.set(x, "forceUpdate", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setPackageName(value: String | js.Function0[String]): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageNameFunction0(value: () => String): Self = StObject.set(x, "packageName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      @scala.inline
      def setProvider(value: js.Function0[String] | String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderFunction0(value: () => String): Self = StObject.set(x, "provider", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  trait IgnoreErrors extends StObject {
    
    /**
      * App ID
      */
    var appID: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreErrors {
    
    @scala.inline
    def apply(): IgnoreErrors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreErrors]
    }
    
    @scala.inline
    implicit class IgnoreErrorsMutableBuilder[Self <: IgnoreErrors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppID(value: String): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIDUndefined: Self = StObject.set(x, "appID", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    }
  }
  
  trait IsNeeded extends StObject {
    
    var currentVersion: String
    
    var isNeeded: Boolean
    
    var latestVersion: String
    
    var storeUrl: String
  }
  object IsNeeded {
    
    @scala.inline
    def apply(currentVersion: String, isNeeded: Boolean, latestVersion: String, storeUrl: String): IsNeeded = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], isNeeded = isNeeded.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], storeUrl = storeUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsNeeded]
    }
    
    @scala.inline
    implicit class IsNeededMutableBuilder[Self <: IsNeeded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNeeded(value: Boolean): Self = StObject.set(x, "isNeeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestVersion(value: String): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUrl(value: String): Self = StObject.set(x, "storeUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackageName extends StObject {
    
    /**
      * @default true
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Package Name
      */
    var packageName: js.UndefOr[String] = js.undefined
  }
  object PackageName {
    
    @scala.inline
    def apply(): PackageName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageName]
    }
    
    @scala.inline
    implicit class PackageNameMutableBuilder[Self <: PackageName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    }
  }
}
