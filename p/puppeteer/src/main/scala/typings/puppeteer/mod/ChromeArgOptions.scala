package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeArgOptions extends StObject {
  
  /**
    * Additional arguments to pass to the browser instance.
    * The list of Chromium flags can be found here.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to auto-open a DevTools panel for each tab.
    * If this option is true, the headless option will be set false.
    */
  var devtools: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to run browser in headless mode.
    * @default true unless the devtools option is true.
    */
  var headless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path to a User Data Directory.
    */
  var userDataDir: js.UndefOr[String] = js.undefined
}
object ChromeArgOptions {
  
  inline def apply(): ChromeArgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeArgOptions]
  }
  
  extension [Self <: ChromeArgOptions](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
    
    inline def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
  }
}
