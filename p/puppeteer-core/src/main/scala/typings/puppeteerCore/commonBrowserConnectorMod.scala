package typings.puppeteerCore

import typings.puppeteerCore.anon.BrowserOptionsbrowserWSEnBrowserURL
import typings.puppeteerCore.commonBrowserMod.Browser
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonBrowserConnectorMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/BrowserConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connectToBrowser(options: BrowserOptionsbrowserWSEnBrowserURL): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectToBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]
  
  trait BrowserOptions extends StObject {
    
    var defaultViewport: js.UndefOr[Viewport] = js.undefined
    
    var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
    
    var slowMo: js.UndefOr[Double] = js.undefined
  }
  object BrowserOptions {
    
    @scala.inline
    def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
    
    @scala.inline
    implicit class BrowserOptionsMutableBuilder[Self <: BrowserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultViewport(value: Viewport): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
      
      @scala.inline
      def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
      
      @scala.inline
      def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
    }
  }
}
