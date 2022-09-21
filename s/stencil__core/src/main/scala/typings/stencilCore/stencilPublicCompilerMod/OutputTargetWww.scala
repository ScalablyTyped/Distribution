package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreBooleans.`false`
import typings.stencilCore.stencilCoreStrings.www
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetWww
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var appDir: js.UndefOr[String] = js.undefined
  
  /**
    * The base url of the app, it's required during prerendering to be the absolute path
    * of your app, such as: `https://my.app.com/app`.
    *
    * Default: `/`
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The directory to write the app's JavaScript and CSS build
    * files to. The default is to place this directory as a child
    * to the `dir` config. Default: `build`
    */
  var buildDir: js.UndefOr[String] = js.undefined
  
  /**
    * The copy config is an array of objects that defines any files or folders that should
    * be copied over to the build directory.
    *
    * Each object in the array must include a src property which can be either an absolute path,
    * a relative path or a glob pattern. The config can also provide an optional dest property
    * which can be either an absolute path or a path relative to the build directory.
    * Also note that any files within src/assets are automatically copied to www/assets for convenience.
    *
    * In the copy config below, it will copy the entire directory from src/docs-content over to www/docs-content.
    */
  var copy: js.UndefOr[js.Array[CopyTask]] = js.undefined
  
  /**
    * The directory to write the entire application to.
    * Note, the `buildDir` is where the app's JavaScript and CSS build
    * files are written. Default: `www`
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /**
    * Empty the build directory of all files and directories on first build.
    * Default: `true`
    */
  var empty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default index html file of the app, commonly found at the
    * root of the `src` directory.
    * Default: `index.html`
    */
  var indexHtml: js.UndefOr[String] = js.undefined
  
  /**
    * By default, stencil will include all the polyfills required by legacy browsers in the ES5 build.
    * If it's `false`, stencil will not emit this polyfills anymore and it's your responsibility to provide them before
    * stencil initializes.
    */
  var polyfills: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path to an external node module which has exports of the prerender config object.
    * ```
    * module.exports = {
    *   afterHydrate(document, url) {
    *     document.title = `URL: ${url.href}`;
    *   }
    * }
    * ```
    */
  var prerenderConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Service worker config for production builds. During development builds
    * service worker script will be injected to automatically unregister existing
    * service workers. When set to `false` neither a service worker registration
    * or unregistration will be added to the index.html.
    */
  var serviceWorker: js.UndefOr[ServiceWorkerConfig | Null | `false`] = js.undefined
  
  /**
    * Webapp output target.
    */
  @JSName("type")
  var type_OutputTargetWww: www
}
object OutputTargetWww {
  
  inline def apply(): OutputTargetWww = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("www")
    __obj.asInstanceOf[OutputTargetWww]
  }
  
  extension [Self <: OutputTargetWww](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBuildDir(value: String): Self = StObject.set(x, "buildDir", value.asInstanceOf[js.Any])
    
    inline def setBuildDirUndefined: Self = StObject.set(x, "buildDir", js.undefined)
    
    inline def setCopy(value: js.Array[CopyTask]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCopyVarargs(value: CopyTask*): Self = StObject.set(x, "copy", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setIndexHtml(value: String): Self = StObject.set(x, "indexHtml", value.asInstanceOf[js.Any])
    
    inline def setIndexHtmlUndefined: Self = StObject.set(x, "indexHtml", js.undefined)
    
    inline def setPolyfills(value: Boolean): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
    
    inline def setPolyfillsUndefined: Self = StObject.set(x, "polyfills", js.undefined)
    
    inline def setPrerenderConfig(value: String): Self = StObject.set(x, "prerenderConfig", value.asInstanceOf[js.Any])
    
    inline def setPrerenderConfigUndefined: Self = StObject.set(x, "prerenderConfig", js.undefined)
    
    inline def setServiceWorker(value: ServiceWorkerConfig | `false`): Self = StObject.set(x, "serviceWorker", value.asInstanceOf[js.Any])
    
    inline def setServiceWorkerNull: Self = StObject.set(x, "serviceWorker", null)
    
    inline def setServiceWorkerUndefined: Self = StObject.set(x, "serviceWorker", js.undefined)
    
    inline def setType(value: www): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
