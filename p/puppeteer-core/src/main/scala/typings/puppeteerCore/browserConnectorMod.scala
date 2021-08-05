package typings.puppeteerCore

import typings.puppeteerCore.anon.BrowserOptionsbrowserWSEn
import typings.puppeteerCore.browserMod.Browser
import typings.puppeteerCore.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserConnectorMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/BrowserConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectToBrowser(options: BrowserOptionsbrowserWSEn): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectToBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]
  
  trait BrowserOptions extends StObject {
    
    var defaultViewport: js.UndefOr[Viewport] = js.undefined
    
    var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
    
    var slowMo: js.UndefOr[Double] = js.undefined
  }
  object BrowserOptions {
    
    inline def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
    
    extension [Self <: BrowserOptions](x: Self) {
      
      inline def setDefaultViewport(value: Viewport): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
      
      inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
      
      inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
      
      inline def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
    }
  }
}
