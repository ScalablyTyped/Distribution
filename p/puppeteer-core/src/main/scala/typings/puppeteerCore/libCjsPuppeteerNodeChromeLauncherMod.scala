package typings.puppeteerCore

import typings.puppeteerCore.libCjsPuppeteerCommonBrowserMod.CDPBrowser
import typings.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.ChromeReleaseChannel
import typings.puppeteerCore.libCjsPuppeteerNodeProductLauncherMod.ProductLauncher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodeChromeLauncherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/ChromeLauncher", "ChromeLauncher")
  @js.native
  open class ChromeLauncher protected ()
    extends StObject
       with ProductLauncher {
    def this(preferredRevision: String, isPuppeteerCore: Boolean) = this()
    
    /**
      * @internal
      */
    var _isPuppeteerCore: Boolean = js.native
    
    /**
      * @internal
      */
    var _preferredRevision: String = js.native
    
    def defaultArgs(): js.Array[String] = js.native
    
    def executablePath(channel: ChromeReleaseChannel): String = js.native
    
    def launch(): js.Promise[CDPBrowser] = js.native
    
    @JSName("product")
    def product_MChromeLauncher: Product = js.native
  }
}
