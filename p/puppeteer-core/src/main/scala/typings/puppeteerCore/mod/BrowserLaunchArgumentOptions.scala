package typings.puppeteerCore.mod

import typings.puppeteerCore.puppeteerCoreStrings.chrome
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserLaunchArgumentOptions extends StObject {
  
  /**
    * Additional command line arguments to pass to the browser instance.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    */
  var debuggingPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to auto-open a DevTools panel for each tab. If this is set to
    * `true`, then `headless` will be forced to `false`.
    * @defaultValue `false`
    */
  var devtools: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to run the browser in headless mode.
    * @defaultValue true
    */
  var headless: js.UndefOr[Boolean | chrome] = js.undefined
  
  /**
    * Path to a user data directory.
    * {@link https://chromium.googlesource.com/chromium/src/+/refs/heads/main/docs/user_data_dir.md | see the Chromium docs}
    * for more info.
    */
  var userDataDir: js.UndefOr[String] = js.undefined
}
object BrowserLaunchArgumentOptions {
  
  inline def apply(): BrowserLaunchArgumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserLaunchArgumentOptions]
  }
  
  extension [Self <: BrowserLaunchArgumentOptions](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDebuggingPort(value: Double): Self = StObject.set(x, "debuggingPort", value.asInstanceOf[js.Any])
    
    inline def setDebuggingPortUndefined: Self = StObject.set(x, "debuggingPort", js.undefined)
    
    inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    inline def setHeadless(value: Boolean | chrome): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
    
    inline def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
  }
}
