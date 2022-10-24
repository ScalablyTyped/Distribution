package typings.puppeteerCore.mod

import typings.puppeteerCore.puppeteerCoreStrings.chrome
import typings.puppeteerCore.puppeteerCoreStrings.firefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserFetcherOptions extends StObject {
  
  /**
    * Determines the host that will be used for downloading.
    *
    * @defaultValue Either
    *
    * - https://storage.googleapis.com or
    * - https://archive.mozilla.org/pub/firefox/nightly/latest-mozilla-central
    *
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Determines the path to download browsers to.
    */
  var path: String
  
  /**
    * Determines which platform the browser will be suited for.
    *
    * @defaultValue Auto-detected.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * Determines which product the {@link BrowserFetcher} is for.
    *
    * @defaultValue `"chrome"`.
    */
  var product: js.UndefOr[chrome | firefox] = js.undefined
  
  /**
    * Enables the use of the Chromium binary for macOS ARM.
    *
    * @experimental
    */
  var useMacOSARMBinary: js.UndefOr[Boolean] = js.undefined
}
object BrowserFetcherOptions {
  
  inline def apply(path: String): BrowserFetcherOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserFetcherOptions]
  }
  
  extension [Self <: BrowserFetcherOptions](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProduct(value: chrome | firefox): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setUseMacOSARMBinary(value: Boolean): Self = StObject.set(x, "useMacOSARMBinary", value.asInstanceOf[js.Any])
    
    inline def setUseMacOSARMBinaryUndefined: Self = StObject.set(x, "useMacOSARMBinary", js.undefined)
  }
}
