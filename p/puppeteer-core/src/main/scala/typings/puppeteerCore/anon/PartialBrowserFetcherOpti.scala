package typings.puppeteerCore.anon

import typings.puppeteerCore.libCjsPuppeteerNodeBrowserFetcherMod.Platform
import typings.puppeteerCore.puppeteerCoreStrings.chrome
import typings.puppeteerCore.puppeteerCoreStrings.firefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<puppeteer-core.puppeteer-core/lib/cjs/puppeteer/node/BrowserFetcher.BrowserFetcherOptions> */
trait PartialBrowserFetcherOpti extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[Platform] = js.undefined
  
  var product: js.UndefOr[chrome | firefox] = js.undefined
  
  var useMacOSARMBinary: js.UndefOr[Boolean] = js.undefined
}
object PartialBrowserFetcherOpti {
  
  inline def apply(): PartialBrowserFetcherOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBrowserFetcherOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBrowserFetcherOpti] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProduct(value: chrome | firefox): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setUseMacOSARMBinary(value: Boolean): Self = StObject.set(x, "useMacOSARMBinary", value.asInstanceOf[js.Any])
    
    inline def setUseMacOSARMBinaryUndefined: Self = StObject.set(x, "useMacOSARMBinary", js.undefined)
  }
}
