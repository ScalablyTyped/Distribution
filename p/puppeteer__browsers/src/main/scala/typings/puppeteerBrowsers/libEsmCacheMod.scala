package typings.puppeteerBrowsers

import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCacheMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/Cache", "Cache")
  @js.native
  open class Cache protected () extends StObject {
    def this(rootDir: String) = this()
    
    def browserRoot(browser: Browser): String = js.native
    
    def clear(): Unit = js.native
    
    def getInstalledBrowsers(): js.Array[InstalledBrowser] = js.native
    
    def installationDir(browser: Browser, platform: BrowserPlatform, buildId: String): String = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  trait InstalledBrowser extends StObject {
    
    var browser: Browser
    
    var buildId: String
    
    var path: String
    
    var platform: BrowserPlatform
  }
  object InstalledBrowser {
    
    inline def apply(browser: Browser, buildId: String, path: String, platform: BrowserPlatform): InstalledBrowser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledBrowser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledBrowser] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: BrowserPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
