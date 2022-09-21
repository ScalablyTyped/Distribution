package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.anon.BrowserConnectOptionsbrow
import typings.puppeteerCore.browserMod.IsPageTargetCallback
import typings.puppeteerCore.browserMod.TargetFilterCallback
import typings.puppeteerCore.commonBrowserMod.CDPBrowser
import typings.puppeteerCore.puppeteerCoreStrings.cdp
import typings.puppeteerCore.puppeteerCoreStrings.webDriverBiDi
import typings.puppeteerCore.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserConnectorMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/BrowserConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectToCDPBrowser(options: BrowserConnectOptionsbrow): js.Promise[CDPBrowser] = ^.asInstanceOf[js.Dynamic].applyDynamic("_connectToCDPBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CDPBrowser]]
  
  trait BrowserConnectOptions extends StObject {
    
    /**
      * @internal
      */
    var _isPageTarget: js.UndefOr[IsPageTargetCallback] = js.undefined
    
    /**
      * Sets the viewport for each page.
      */
    var defaultViewport: js.UndefOr[Viewport | Null] = js.undefined
    
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
  }
  object BrowserConnectOptions {
    
    inline def apply(): BrowserConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserConnectOptions]
    }
    
    extension [Self <: BrowserConnectOptions](x: Self) {
      
      inline def setDefaultViewport(value: Viewport): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
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
      
      inline def set_isPageTarget(value: /* target */ TargetInfo => Boolean): Self = StObject.set(x, "_isPageTarget", js.Any.fromFunction1(value))
      
      inline def set_isPageTargetUndefined: Self = StObject.set(x, "_isPageTarget", js.undefined)
    }
  }
}
