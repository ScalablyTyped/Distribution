package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrateDocumentOptions extends StObject {
  
  /**
    * Build ID that will be added to `<html data-stencil-build="BUILD_ID">`. By default
    * a random ID will be generated
    */
  var buildId: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the `href` attribute on the `<link rel="canonical">`
    * tag within the `<head>`. If the value is not defined it will
    * ensure a canonical link tag is no included in the `<head>`.
    */
  var canonicalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Include the HTML comments and attributes used by the clientside
    * JavaScript to read the structure of the HTML and rebuild each
    * component. Defaults to `true`.
    */
  var clientHydrateAnnotations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Constrain `setTimeout()` to 1ms, but still async. Also
    * only allows `setInterval()` to fire once, also constrained to 1ms.
    * Defaults to `true`.
    */
  var constrainTimeouts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets `document.cookie`
    */
  var cookie: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the `dir` attribute on the top level `<html>`.
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Component tag names listed here will not be prerendered, nor will
    * hydrated on the clientside. Components listed here will be ignored
    * as custom elements and treated no differently than a `<div>`.
    */
  var excludeComponents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Sets the `lang` attribute on the top level `<html>`.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of components to hydrate on one page. Defaults to `300`.
    */
  var maxHydrateCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets `document.referrer`
    */
  var referrer: js.UndefOr[String] = js.undefined
  
  /**
    * Removes every `<script>` element found in the `document`. Defaults to `false`.
    */
  var removeScripts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Removes CSS not used by elements within the `document`. Defaults to `true`.
    */
  var removeUnusedStyles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The url the runtime uses for the resources, such as the assets directory.
    */
  var resourcesUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Prints out runtime console logs to the NodeJS process. Defaults to `false`.
    */
  var runtimeLogging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Component tags listed here will only be prerendered or serverside-rendered
    * and will not be clientside hydrated. This is useful for components that
    * are not dynamic and do not need to be defined as a custom element within the
    * browser. For example, a header or footer component would be a good example that
    * may not require any clientside JavaScript.
    */
  var staticComponents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The amount of milliseconds to wait for a page to finish rendering until
    * a timeout error is thrown. Defaults to `15000`.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets `document.title`.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Sets `location.href`
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Sets `navigator.userAgent`
    */
  var userAgent: js.UndefOr[String] = js.undefined
}
object HydrateDocumentOptions {
  
  inline def apply(): HydrateDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydrateDocumentOptions]
  }
  
  extension [Self <: HydrateDocumentOptions](x: Self) {
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setClientHydrateAnnotations(value: Boolean): Self = StObject.set(x, "clientHydrateAnnotations", value.asInstanceOf[js.Any])
    
    inline def setClientHydrateAnnotationsUndefined: Self = StObject.set(x, "clientHydrateAnnotations", js.undefined)
    
    inline def setConstrainTimeouts(value: Boolean): Self = StObject.set(x, "constrainTimeouts", value.asInstanceOf[js.Any])
    
    inline def setConstrainTimeoutsUndefined: Self = StObject.set(x, "constrainTimeouts", js.undefined)
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setExcludeComponents(value: js.Array[String]): Self = StObject.set(x, "excludeComponents", value.asInstanceOf[js.Any])
    
    inline def setExcludeComponentsUndefined: Self = StObject.set(x, "excludeComponents", js.undefined)
    
    inline def setExcludeComponentsVarargs(value: String*): Self = StObject.set(x, "excludeComponents", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMaxHydrateCount(value: Double): Self = StObject.set(x, "maxHydrateCount", value.asInstanceOf[js.Any])
    
    inline def setMaxHydrateCountUndefined: Self = StObject.set(x, "maxHydrateCount", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setRemoveScripts(value: Boolean): Self = StObject.set(x, "removeScripts", value.asInstanceOf[js.Any])
    
    inline def setRemoveScriptsUndefined: Self = StObject.set(x, "removeScripts", js.undefined)
    
    inline def setRemoveUnusedStyles(value: Boolean): Self = StObject.set(x, "removeUnusedStyles", value.asInstanceOf[js.Any])
    
    inline def setRemoveUnusedStylesUndefined: Self = StObject.set(x, "removeUnusedStyles", js.undefined)
    
    inline def setResourcesUrl(value: String): Self = StObject.set(x, "resourcesUrl", value.asInstanceOf[js.Any])
    
    inline def setResourcesUrlUndefined: Self = StObject.set(x, "resourcesUrl", js.undefined)
    
    inline def setRuntimeLogging(value: Boolean): Self = StObject.set(x, "runtimeLogging", value.asInstanceOf[js.Any])
    
    inline def setRuntimeLoggingUndefined: Self = StObject.set(x, "runtimeLogging", js.undefined)
    
    inline def setStaticComponents(value: js.Array[String]): Self = StObject.set(x, "staticComponents", value.asInstanceOf[js.Any])
    
    inline def setStaticComponentsUndefined: Self = StObject.set(x, "staticComponents", js.undefined)
    
    inline def setStaticComponentsVarargs(value: String*): Self = StObject.set(x, "staticComponents", js.Array(value*))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
