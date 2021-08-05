package typings.puppeteerCore.anon

import typings.puppeteerCore.connectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/BrowserConnector.BrowserOptions & {  browserWSEndpoint :string | undefined,   browserURL :string | undefined,   transport :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/ConnectionTransport.ConnectionTransport | undefined} */
trait BrowserOptionsbrowserWSEn extends StObject {
  
  var browserURL: js.UndefOr[String] = js.undefined
  
  var browserWSEndpoint: js.UndefOr[String] = js.undefined
  
  var defaultViewport: js.UndefOr[typings.puppeteerCore.puppeteerViewportMod.Viewport] = js.undefined
  
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  
  var slowMo: js.UndefOr[Double] = js.undefined
  
  var transport: js.UndefOr[ConnectionTransport] = js.undefined
}
object BrowserOptionsbrowserWSEn {
  
  inline def apply(): BrowserOptionsbrowserWSEn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptionsbrowserWSEn]
  }
  
  extension [Self <: BrowserOptionsbrowserWSEn](x: Self) {
    
    inline def setBrowserURL(value: String): Self = StObject.set(x, "browserURL", value.asInstanceOf[js.Any])
    
    inline def setBrowserURLUndefined: Self = StObject.set(x, "browserURL", js.undefined)
    
    inline def setBrowserWSEndpoint(value: String): Self = StObject.set(x, "browserWSEndpoint", value.asInstanceOf[js.Any])
    
    inline def setBrowserWSEndpointUndefined: Self = StObject.set(x, "browserWSEndpoint", js.undefined)
    
    inline def setDefaultViewport(value: typings.puppeteerCore.puppeteerViewportMod.Viewport): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
    
    inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
    
    inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    inline def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
    
    inline def setTransport(value: ConnectionTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
