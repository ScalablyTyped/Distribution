package typings.puppeteerCore.anon

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.browserMod.IsPageTargetCallback
import typings.puppeteerCore.browserMod.TargetFilterCallback
import typings.puppeteerCore.connectionTransportMod.ConnectionTransport
import typings.puppeteerCore.puppeteerCoreStrings.cdp
import typings.puppeteerCore.puppeteerCoreStrings.webDriverBiDi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/BrowserConnector.BrowserConnectOptions & {  browserWSEndpoint :string | undefined,   browserURL :string | undefined,   transport :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/ConnectionTransport.ConnectionTransport | undefined} */
trait BrowserConnectOptionsbrow extends StObject {
  
  /**
    * @internal
    */
  var _isPageTarget: js.UndefOr[IsPageTargetCallback] = js.undefined
  
  var browserURL: js.UndefOr[String] = js.undefined
  
  var browserWSEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the viewport for each page.
    */
  var defaultViewport: js.UndefOr[typings.puppeteerCore.puppeteerViewportMod.Viewport | Null] = js.undefined
  
  /**
    * Whether to ignore HTTPS errors during navigation.
    * @defaultValue false
    */
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @defaultValue 'cdp'
    * @internal
    */
  var protocol: js.UndefOr[cdp | webDriverBiDi] = js.undefined
  
  /**
    * Slows down Puppeteer operations by the specified amount of milliseconds to
    * aid debugging.
    */
  var slowMo: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback to decide if Puppeteer should connect to a given target or not.
    */
  var targetFilter: js.UndefOr[TargetFilterCallback] = js.undefined
  
  var transport: js.UndefOr[ConnectionTransport] = js.undefined
}
object BrowserConnectOptionsbrow {
  
  inline def apply(): BrowserConnectOptionsbrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserConnectOptionsbrow]
  }
  
  extension [Self <: BrowserConnectOptionsbrow](x: Self) {
    
    inline def setBrowserURL(value: String): Self = StObject.set(x, "browserURL", value.asInstanceOf[js.Any])
    
    inline def setBrowserURLUndefined: Self = StObject.set(x, "browserURL", js.undefined)
    
    inline def setBrowserWSEndpoint(value: String): Self = StObject.set(x, "browserWSEndpoint", value.asInstanceOf[js.Any])
    
    inline def setBrowserWSEndpointUndefined: Self = StObject.set(x, "browserWSEndpoint", js.undefined)
    
    inline def setDefaultViewport(value: typings.puppeteerCore.puppeteerViewportMod.Viewport): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewportNull: Self = StObject.set(x, "defaultViewport", null)
    
    inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
    
    inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
    
    inline def setProtocol(value: cdp | webDriverBiDi): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    inline def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
    
    inline def setTargetFilter(value: /* target */ TargetInfo => Boolean): Self = StObject.set(x, "targetFilter", js.Any.fromFunction1(value))
    
    inline def setTargetFilterUndefined: Self = StObject.set(x, "targetFilter", js.undefined)
    
    inline def setTransport(value: ConnectionTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def set_isPageTarget(value: /* target */ TargetInfo => Boolean): Self = StObject.set(x, "_isPageTarget", js.Any.fromFunction1(value))
    
    inline def set_isPageTargetUndefined: Self = StObject.set(x, "_isPageTarget", js.undefined)
  }
}
