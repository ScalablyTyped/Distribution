package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.chrome
import typings.puppeteer.puppeteerStrings.firefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserFetcherOptions extends StObject {
  
  /**
    * Determines the host that will be used for downloading.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Determines the path to download browsers to.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Determines which platform the browser will be suited for.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * Determines which product the {@link BrowserFetcher} is for.
    *
    * @defaultValue `"chrome"`
    */
  var product: js.UndefOr[chrome | firefox] = js.undefined
}
object BrowserFetcherOptions {
  
  inline def apply(): BrowserFetcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserFetcherOptions]
  }
  
  extension [Self <: BrowserFetcherOptions](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProduct(value: chrome | firefox): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
