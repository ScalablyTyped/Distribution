package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerConfig extends StObject {
  
  var cacheId: js.UndefOr[String] = js.undefined
  
  var clientsClaim: js.UndefOr[Boolean] = js.undefined
  
  var directoryIndex: js.UndefOr[String] = js.undefined
  
  var dontCacheBustURLsMatching: js.UndefOr[js.RegExp] = js.undefined
  
  var globDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var globIgnores: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var globPatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var handleFetch: js.UndefOr[Boolean] = js.undefined
  
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[Any]] = js.undefined
  
  var manifestTransforms: js.UndefOr[Any] = js.undefined
  
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined
  
  var modifyUrlPrefix: js.UndefOr[Any] = js.undefined
  
  var navigateFallback: js.UndefOr[String] = js.undefined
  
  var navigateFallbackBlacklist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var navigateFallbackWhitelist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var runtimeCaching: js.UndefOr[js.Array[Any]] = js.undefined
  
  var skipWaiting: js.UndefOr[Boolean] = js.undefined
  
  var swDest: js.UndefOr[String] = js.undefined
  
  var swSrc: js.UndefOr[String] = js.undefined
  
  var templatedUrls: js.UndefOr[Any] = js.undefined
  
  var unregister: js.UndefOr[Boolean] = js.undefined
}
object ServiceWorkerConfig {
  
  inline def apply(): ServiceWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceWorkerConfig]
  }
  
  extension [Self <: ServiceWorkerConfig](x: Self) {
    
    inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    
    inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
    
    inline def setClientsClaim(value: Boolean): Self = StObject.set(x, "clientsClaim", value.asInstanceOf[js.Any])
    
    inline def setClientsClaimUndefined: Self = StObject.set(x, "clientsClaim", js.undefined)
    
    inline def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
    
    inline def setDontCacheBustURLsMatching(value: js.RegExp): Self = StObject.set(x, "dontCacheBustURLsMatching", value.asInstanceOf[js.Any])
    
    inline def setDontCacheBustURLsMatchingUndefined: Self = StObject.set(x, "dontCacheBustURLsMatching", js.undefined)
    
    inline def setGlobDirectory(value: String | js.Array[String]): Self = StObject.set(x, "globDirectory", value.asInstanceOf[js.Any])
    
    inline def setGlobDirectoryUndefined: Self = StObject.set(x, "globDirectory", js.undefined)
    
    inline def setGlobDirectoryVarargs(value: String*): Self = StObject.set(x, "globDirectory", js.Array(value*))
    
    inline def setGlobIgnores(value: String | js.Array[String]): Self = StObject.set(x, "globIgnores", value.asInstanceOf[js.Any])
    
    inline def setGlobIgnoresUndefined: Self = StObject.set(x, "globIgnores", js.undefined)
    
    inline def setGlobIgnoresVarargs(value: String*): Self = StObject.set(x, "globIgnores", js.Array(value*))
    
    inline def setGlobPatterns(value: js.Array[String]): Self = StObject.set(x, "globPatterns", value.asInstanceOf[js.Any])
    
    inline def setGlobPatternsUndefined: Self = StObject.set(x, "globPatterns", js.undefined)
    
    inline def setGlobPatternsVarargs(value: String*): Self = StObject.set(x, "globPatterns", js.Array(value*))
    
    inline def setHandleFetch(value: Boolean): Self = StObject.set(x, "handleFetch", value.asInstanceOf[js.Any])
    
    inline def setHandleFetchUndefined: Self = StObject.set(x, "handleFetch", js.undefined)
    
    inline def setIgnoreUrlParametersMatching(value: js.Array[Any]): Self = StObject.set(x, "ignoreUrlParametersMatching", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUrlParametersMatchingUndefined: Self = StObject.set(x, "ignoreUrlParametersMatching", js.undefined)
    
    inline def setIgnoreUrlParametersMatchingVarargs(value: Any*): Self = StObject.set(x, "ignoreUrlParametersMatching", js.Array(value*))
    
    inline def setManifestTransforms(value: Any): Self = StObject.set(x, "manifestTransforms", value.asInstanceOf[js.Any])
    
    inline def setManifestTransformsUndefined: Self = StObject.set(x, "manifestTransforms", js.undefined)
    
    inline def setMaximumFileSizeToCacheInBytes(value: Double): Self = StObject.set(x, "maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
    
    inline def setMaximumFileSizeToCacheInBytesUndefined: Self = StObject.set(x, "maximumFileSizeToCacheInBytes", js.undefined)
    
    inline def setModifyUrlPrefix(value: Any): Self = StObject.set(x, "modifyUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setModifyUrlPrefixUndefined: Self = StObject.set(x, "modifyUrlPrefix", js.undefined)
    
    inline def setNavigateFallback(value: String): Self = StObject.set(x, "navigateFallback", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackBlacklist(value: js.Array[js.RegExp]): Self = StObject.set(x, "navigateFallbackBlacklist", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackBlacklistUndefined: Self = StObject.set(x, "navigateFallbackBlacklist", js.undefined)
    
    inline def setNavigateFallbackBlacklistVarargs(value: js.RegExp*): Self = StObject.set(x, "navigateFallbackBlacklist", js.Array(value*))
    
    inline def setNavigateFallbackUndefined: Self = StObject.set(x, "navigateFallback", js.undefined)
    
    inline def setNavigateFallbackWhitelist(value: js.Array[js.RegExp]): Self = StObject.set(x, "navigateFallbackWhitelist", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackWhitelistUndefined: Self = StObject.set(x, "navigateFallbackWhitelist", js.undefined)
    
    inline def setNavigateFallbackWhitelistVarargs(value: js.RegExp*): Self = StObject.set(x, "navigateFallbackWhitelist", js.Array(value*))
    
    inline def setRuntimeCaching(value: js.Array[Any]): Self = StObject.set(x, "runtimeCaching", value.asInstanceOf[js.Any])
    
    inline def setRuntimeCachingUndefined: Self = StObject.set(x, "runtimeCaching", js.undefined)
    
    inline def setRuntimeCachingVarargs(value: Any*): Self = StObject.set(x, "runtimeCaching", js.Array(value*))
    
    inline def setSkipWaiting(value: Boolean): Self = StObject.set(x, "skipWaiting", value.asInstanceOf[js.Any])
    
    inline def setSkipWaitingUndefined: Self = StObject.set(x, "skipWaiting", js.undefined)
    
    inline def setSwDest(value: String): Self = StObject.set(x, "swDest", value.asInstanceOf[js.Any])
    
    inline def setSwDestUndefined: Self = StObject.set(x, "swDest", js.undefined)
    
    inline def setSwSrc(value: String): Self = StObject.set(x, "swSrc", value.asInstanceOf[js.Any])
    
    inline def setSwSrcUndefined: Self = StObject.set(x, "swSrc", js.undefined)
    
    inline def setTemplatedUrls(value: Any): Self = StObject.set(x, "templatedUrls", value.asInstanceOf[js.Any])
    
    inline def setTemplatedUrlsUndefined: Self = StObject.set(x, "templatedUrls", js.undefined)
    
    inline def setUnregister(value: Boolean): Self = StObject.set(x, "unregister", value.asInstanceOf[js.Any])
    
    inline def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
  }
}
