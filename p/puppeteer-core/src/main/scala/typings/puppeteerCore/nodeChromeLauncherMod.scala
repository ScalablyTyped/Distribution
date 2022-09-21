package typings.puppeteerCore

import typings.puppeteerCore.commonProductMod.Product
import typings.puppeteerCore.nodeLaunchOptionsMod.ChromeReleaseChannel
import typings.puppeteerCore.nodeProductLauncherMod.ProductLauncher
import typings.puppeteerCore.puppeteerCommonBrowserMod.CDPBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeChromeLauncherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/ChromeLauncher", "ChromeLauncher")
  @js.native
  open class ChromeLauncher protected ()
    extends StObject
       with ProductLauncher {
    def this(projectRoot: String, preferredRevision: String, isPuppeteerCore: Boolean) = this()
    def this(projectRoot: Unit, preferredRevision: String, isPuppeteerCore: Boolean) = this()
    
    /**
      * @internal
      */
    var _isPuppeteerCore: Boolean = js.native
    
    /**
      * @internal
      */
    var _preferredRevision: String = js.native
    
    /**
      * @internal
      */
    var _projectRoot: js.UndefOr[String] = js.native
    
    def defaultArgs(): js.Array[String] = js.native
    
    def executablePath(channel: ChromeReleaseChannel): String = js.native
    
    def launch(): js.Promise[CDPBrowser] = js.native
    
    @JSName("product")
    def product_MChromeLauncher: Product = js.native
  }
}
