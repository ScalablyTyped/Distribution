package typings.puppeteer.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchOptions
  extends StObject
     with ChromeArgOptions
     with BrowserOptions
     with Timeoutable {
  
  /**
    * Whether to pipe browser process stdout and stderr into process.stdout and
    * process.stderr.
    * @default false
    */
  var dumpio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify environment variables that will be visible to Chromium.
    * @default `process.env`.
    */
  var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
  
  /**
    * Path to a Chromium executable to run instead of bundled Chromium. If
    * executablePath is a relative path, then it is resolved relative to current
    * working directory.
    */
  var executablePath: js.UndefOr[String] = js.undefined
  
  /**
    * Close chrome process on SIGHUP.
    * @default true
    */
  var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Close chrome process on Ctrl-C.
    * @default true
    */
  var handleSIGINT: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Close chrome process on SIGTERM.
    * @default true
    */
  var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not use `puppeteer.defaultArgs()` for launching Chromium.
    * @default false
    */
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
    * Connects to the browser over a pipe instead of a WebSocket.
    * @default false
    */
  var pipe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which browser to launch.
    * At this time, this is either `chrome` or `firefox`. See also `PUPPETEER_PRODUCT`.
    * @default 'chrome'
    */
  var product: js.UndefOr[Product_] = js.undefined
}
object LaunchOptions {
  
  inline def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  
  extension [Self <: LaunchOptions](x: Self) {
    
    inline def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
    
    inline def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
    
    inline def setEnv(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    inline def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
    
    inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
    
    inline def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
    
    inline def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
    
    inline def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
    
    inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
    
    inline def setProduct(value: Product_): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
