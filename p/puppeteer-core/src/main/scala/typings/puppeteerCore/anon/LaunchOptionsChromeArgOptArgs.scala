package typings.puppeteerCore.anon

import typings.puppeteerCore.commonProductMod.Product
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined puppeteer-core.puppeteer-core/lib/esm/puppeteer/node/LaunchOptions.LaunchOptions & puppeteer-core.puppeteer-core/lib/esm/puppeteer/node/LaunchOptions.ChromeArgOptions & puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/BrowserConnector.BrowserOptions & {  product :puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/Product.Product | undefined,   extraPrefsFirefox :std.Record<string, unknown> | undefined} */
trait LaunchOptionsChromeArgOptArgs extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var defaultViewport: js.UndefOr[typings.puppeteerCore.commonPuppeteerViewportMod.Viewport] = js.undefined
  
  var devtools: js.UndefOr[Boolean] = js.undefined
  
  var dumpio: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
  
  var executablePath: js.UndefOr[String] = js.undefined
  
  var extraPrefsFirefox: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
  
  var handleSIGINT: js.UndefOr[Boolean] = js.undefined
  
  var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
  
  var headless: js.UndefOr[Boolean] = js.undefined
  
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  
  var pipe: js.UndefOr[Boolean] = js.undefined
  
  var product: js.UndefOr[Product] = js.undefined
  
  var slowMo: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var userDataDir: js.UndefOr[String] = js.undefined
}
object LaunchOptionsChromeArgOptArgs {
  
  inline def apply(): LaunchOptionsChromeArgOptArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptionsChromeArgOptArgs]
  }
  
  extension [Self <: LaunchOptionsChromeArgOptArgs](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setDefaultViewport(value: typings.puppeteerCore.commonPuppeteerViewportMod.Viewport): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
    
    inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    inline def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
    
    inline def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
    
    inline def setEnv(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    inline def setExtraPrefsFirefox(value: Record[String, js.Any]): Self = StObject.set(x, "extraPrefsFirefox", value.asInstanceOf[js.Any])
    
    inline def setExtraPrefsFirefoxUndefined: Self = StObject.set(x, "extraPrefsFirefox", js.undefined)
    
    inline def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
    
    inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
    
    inline def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
    
    inline def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
    
    inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
    
    inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
    
    inline def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
    
    inline def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
  }
}
