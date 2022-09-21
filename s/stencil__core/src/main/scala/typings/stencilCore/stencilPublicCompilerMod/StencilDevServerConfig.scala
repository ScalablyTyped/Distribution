package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StencilDevServerConfig extends StObject {
  
  /**
    * IP address used by the dev server. The default is `0.0.0.0`, which points to all IPv4 addresses
    * on the local machine, such as `localhost`.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Base path to be used by the server. Defaults to the root pathname.
    */
  var basePath: js.UndefOr[String] = js.undefined
  
  /**
    * EXPERIMENTAL!
    * During development, node modules can be independently requested and bundled, making for
    * faster build times. This is only available using the Stencil Dev Server throughout
    * development. Production builds and builds with the `es5` flag will override
    * this setting to `false`. Default is `false`.
    */
  var experimentalDevModules: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the dev server should respond with gzip compressed content. Defaults to `true`.
    */
  var gzip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set, the dev server will run via https using the SSL certificate and key you provide
    * (use `fs` if you want to read them from files).
    */
  var https: js.UndefOr[Credentials] = js.undefined
  
  /**
    * The URL the dev server should first open to. Defaults to `/`.
    */
  var initialLoadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * When `true`, every request to the server will be logged within the terminal.
    * Defaults to `false`.
    */
  var logRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, when dev server is started the local dev URL is opened in your default browser.
    * However, to prevent this URL to be opened change this value to `false`. Defaults to `true`.
    */
  var openBrowser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the server's port. Defaults to `3333`.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * When files are watched and updated, by default the dev server will use `hmr` (Hot Module Replacement)
    * to update the page without a full page refresh. To have the page do a full refresh use `pageReload`.
    * To disable any reloading, use `null`. Defaults to `hmr`.
    */
  var reloadStrategy: js.UndefOr[PageReloadStrategy] = js.undefined
  
  /**
    * Local path to a NodeJs file with a dev server request listener as the default export.
    * The user's request listener is given the first chance to handle every request the dev server
    * receives, and can choose to handle it or instead pass it on to the default dev server
    * by calling `next()`.
    *
    * Below is an example of a NodeJs file the `requestListenerPath` config is using.
    * The request and response arguments are the same as Node's `http` module and `RequestListener`
    * callback. https://nodejs.org/api/http.html#http_http_createserver_options_requestlistener
    *
    * ```js
    * module.exports = function (req, res, next) {
    *    if (req.url === '/ping') {
    *      // custom response overriding the dev server
    *      res.setHeader('Content-Type', 'text/plain');
    *      res.writeHead(200);
    *      res.end('pong');
    *    } else {
    *      // pass request on to the default dev server
    *      next();
    *    }
    * };
    * ```
    */
  var requestListenerPath: js.UndefOr[String] = js.undefined
  
  /**
    * The root directory to serve the files from.
    */
  var root: js.UndefOr[String] = js.undefined
  
  /**
    * If the dev server should Server-Side Render (SSR) each page, meaning it'll dynamically generate
    * server-side rendered html on each page load. The `--ssr` flag will most commonly be used with
    * the`--dev --watch --serve` flags during development. Note that this is for development purposes
    * only, and the built-in dev server should not be used for production. Defaults to `false`.
    */
  var ssr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the dev server fails to start up within the given timeout (in milliseconds), the startup will
    * be canceled. Set to zero to disable the timeout. Defaults to `15000`.
    */
  var startupTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to use the dev server's websocket client or not. Defaults to `true`.
    */
  var websocket: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the dev server should fork a worker for the server process or not. A singled-threaded dev server
    * is slower, however it is useful for debugging http requests and responses. Defaults to `true`.
    */
  var worker: js.UndefOr[Boolean] = js.undefined
}
object StencilDevServerConfig {
  
  inline def apply(): StencilDevServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StencilDevServerConfig]
  }
  
  extension [Self <: StencilDevServerConfig](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setExperimentalDevModules(value: Boolean): Self = StObject.set(x, "experimentalDevModules", value.asInstanceOf[js.Any])
    
    inline def setExperimentalDevModulesUndefined: Self = StObject.set(x, "experimentalDevModules", js.undefined)
    
    inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setHttps(value: Credentials): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setInitialLoadUrl(value: String): Self = StObject.set(x, "initialLoadUrl", value.asInstanceOf[js.Any])
    
    inline def setInitialLoadUrlUndefined: Self = StObject.set(x, "initialLoadUrl", js.undefined)
    
    inline def setLogRequests(value: Boolean): Self = StObject.set(x, "logRequests", value.asInstanceOf[js.Any])
    
    inline def setLogRequestsUndefined: Self = StObject.set(x, "logRequests", js.undefined)
    
    inline def setOpenBrowser(value: Boolean): Self = StObject.set(x, "openBrowser", value.asInstanceOf[js.Any])
    
    inline def setOpenBrowserUndefined: Self = StObject.set(x, "openBrowser", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setReloadStrategy(value: PageReloadStrategy): Self = StObject.set(x, "reloadStrategy", value.asInstanceOf[js.Any])
    
    inline def setReloadStrategyNull: Self = StObject.set(x, "reloadStrategy", null)
    
    inline def setReloadStrategyUndefined: Self = StObject.set(x, "reloadStrategy", js.undefined)
    
    inline def setRequestListenerPath(value: String): Self = StObject.set(x, "requestListenerPath", value.asInstanceOf[js.Any])
    
    inline def setRequestListenerPathUndefined: Self = StObject.set(x, "requestListenerPath", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    
    inline def setStartupTimeout(value: Double): Self = StObject.set(x, "startupTimeout", value.asInstanceOf[js.Any])
    
    inline def setStartupTimeoutUndefined: Self = StObject.set(x, "startupTimeout", js.undefined)
    
    inline def setWebsocket(value: Boolean): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
    
    inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    
    inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
