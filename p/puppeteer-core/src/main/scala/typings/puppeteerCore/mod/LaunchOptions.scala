package typings.puppeteerCore.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchOptions extends StObject {
  
  /**
    * Chrome Release Channel
    */
  var channel: js.UndefOr[ChromeReleaseChannel] = js.undefined
  
  /**
    * If true, pipes the browser process stdout and stderr to `process.stdout`
    * and `process.stderr`.
    * @defaultValue false
    */
  var dumpio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify environment variables that will be visible to the browser.
    * @defaultValue The contents of `process.env`.
    */
  var env: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
  
  /**
    * Path to a browser executable to use instead of the bundled Chromium. Note
    * that Puppeteer is only guaranteed to work with the bundled Chromium, so use
    * this setting at your own risk.
    */
  var executablePath: js.UndefOr[String] = js.undefined
  
  /**
    * {@link https://searchfox.org/mozilla-release/source/modules/libpref/init/all.js | Additional preferences } that can be passed when launching with Firefox.
    */
  var extraPrefsFirefox: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * Close the browser process on `SIGHUP`.
    * @defaultValue `true`
    */
  var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Close the browser process on `Ctrl+C`.
    * @defaultValue `true`
    */
  var handleSIGINT: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Close the browser process on `SIGTERM`.
    * @defaultValue `true`
    */
  var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, do not use `puppeteer.defaultArgs()` when creating a browser. If
    * an array is provided, these args will be filtered out. Use this with care -
    * you probably want the default arguments Puppeteer uses.
    * @defaultValue false
    */
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
    * Connect to a browser over a pipe instead of a WebSocket.
    * @defaultValue false
    */
  var pipe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which browser to launch.
    * @defaultValue `chrome`
    */
  var product: js.UndefOr[Product] = js.undefined
  
  /**
    * Maximum time in milliseconds to wait for the browser to start.
    * Pass `0` to disable the timeout.
    * @defaultValue 30000 (30 seconds).
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to wait for the initial page to be ready.
    * Useful when a user explicitly disables that (e.g. `--no-startup-window` for Chrome).
    * @defaultValue true
    */
  var waitForInitialPage: js.UndefOr[Boolean] = js.undefined
}
object LaunchOptions {
  
  inline def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: ChromeReleaseChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
    
    inline def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
    
    inline def setEnv(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    inline def setExtraPrefsFirefox(value: Record[String, Any]): Self = StObject.set(x, "extraPrefsFirefox", value.asInstanceOf[js.Any])
    
    inline def setExtraPrefsFirefoxUndefined: Self = StObject.set(x, "extraPrefsFirefox", js.undefined)
    
    inline def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
    
    inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
    
    inline def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
    
    inline def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
    
    inline def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
    
    inline def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value*))
    
    inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitForInitialPage(value: Boolean): Self = StObject.set(x, "waitForInitialPage", value.asInstanceOf[js.Any])
    
    inline def setWaitForInitialPageUndefined: Self = StObject.set(x, "waitForInitialPage", js.undefined)
  }
}
