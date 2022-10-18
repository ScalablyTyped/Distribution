package typings.puppeteerCore

import typings.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowser
import typings.puppeteerCore.libEsmPuppeteerCommonProductMod.Product
import typings.puppeteerCore.libEsmPuppeteerNodeLaunchOptionsMod.ChromeReleaseChannel
import typings.puppeteerCore.libEsmPuppeteerNodeProductLauncherMod.ProductLauncher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerNodeChromeLauncherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/ChromeLauncher", "ChromeLauncher")
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
