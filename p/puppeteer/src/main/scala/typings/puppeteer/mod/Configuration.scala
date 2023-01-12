package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.error
import typings.puppeteer.puppeteerStrings.silent
import typings.puppeteer.puppeteerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * Specifies a certain version of the browser you'd like Puppeteer to use.
    *
    * Can be overridden by `PUPPETEER_BROWSER_REVISION`.
    *
    * See {@link PuppeteerNode.launch | puppeteer.launch} on how executable path
    * is inferred.
    *
    * @defaultValue A compatible-revision of the browser.
    */
  var browserRevision: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the directory to be used by Puppeteer for caching.
    *
    * Can be overridden by `PUPPETEER_CACHE_DIR`.
    *
    * @defaultValue `path.join(os.homedir(), '.cache', 'puppeteer')`
    */
  var cacheDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which browser you'd like Puppeteer to use.
    *
    * Can be overridden by `PUPPETEER_PRODUCT`.
    *
    * @defaultValue `'chrome'`
    */
  var defaultProduct: js.UndefOr[Product] = js.undefined
  
  /**
    * Specifies the URL prefix that is used to download Chromium.
    *
    * Can be overridden by `PUPPETEER_DOWNLOAD_HOST`.
    *
    * @remarks
    * This must include the protocol and may even need a path prefix.
    *
    * @defaultValue Either https://storage.googleapis.com or
    * https://archive.mozilla.org/pub/firefox/nightly/latest-mozilla-central,
    * depending on the product.
    */
  var downloadHost: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the path for the downloads folder.
    *
    * Can be overridden by `PUPPETEER_DOWNLOAD_PATH`.
    *
    * @defaultValue `<cache>/<product>` where `<cache>` is Puppeteer's cache
    * directory and `<product>` is the name of the browser.
    */
  var downloadPath: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an executable path to be used in
    * {@link PuppeteerNode.launch | puppeteer.launch}.
    *
    * Can be overridden by `PUPPETEER_EXECUTABLE_PATH`.
    *
    * @defaultValue Auto-computed.
    */
  var executablePath: js.UndefOr[String] = js.undefined
  
  /**
    * Defines experimental options for Puppeteer.
    */
  var experiments: js.UndefOr[ExperimentsConfiguration] = js.undefined
  
  /**
    * Tells Puppeteer to log at the given level.
    *
    * At the moment, any option silences logging.
    *
    * @defaultValue `undefined`
    */
  var logLevel: js.UndefOr[silent | error | warn] = js.undefined
  
  /**
    * Tells Puppeteer to not download during installation.
    *
    * Can be overridden by `PUPPETEER_SKIP_DOWNLOAD`.
    */
  var skipDownload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the directory to be used by Puppeteer for creating temporary files.
    *
    * Can be overridden by `PUPPETEER_TMP_DIR`.
    *
    * @defaultValue `os.tmpdir()`
    */
  var temporaryDirectory: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setBrowserRevision(value: String): Self = StObject.set(x, "browserRevision", value.asInstanceOf[js.Any])
    
    inline def setBrowserRevisionUndefined: Self = StObject.set(x, "browserRevision", js.undefined)
    
    inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
    
    inline def setDefaultProduct(value: Product): Self = StObject.set(x, "defaultProduct", value.asInstanceOf[js.Any])
    
    inline def setDefaultProductUndefined: Self = StObject.set(x, "defaultProduct", js.undefined)
    
    inline def setDownloadHost(value: String): Self = StObject.set(x, "downloadHost", value.asInstanceOf[js.Any])
    
    inline def setDownloadHostUndefined: Self = StObject.set(x, "downloadHost", js.undefined)
    
    inline def setDownloadPath(value: String): Self = StObject.set(x, "downloadPath", value.asInstanceOf[js.Any])
    
    inline def setDownloadPathUndefined: Self = StObject.set(x, "downloadPath", js.undefined)
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    inline def setExperiments(value: ExperimentsConfiguration): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
    
    inline def setLogLevel(value: silent | error | warn): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setSkipDownload(value: Boolean): Self = StObject.set(x, "skipDownload", value.asInstanceOf[js.Any])
    
    inline def setSkipDownloadUndefined: Self = StObject.set(x, "skipDownload", js.undefined)
    
    inline def setTemporaryDirectory(value: String): Self = StObject.set(x, "temporaryDirectory", value.asInstanceOf[js.Any])
    
    inline def setTemporaryDirectoryUndefined: Self = StObject.set(x, "temporaryDirectory", js.undefined)
  }
}
