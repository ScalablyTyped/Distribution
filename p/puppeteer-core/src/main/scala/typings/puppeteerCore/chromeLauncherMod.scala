package typings.puppeteerCore

import typings.puppeteerCore.commonBrowserMod.CDPBrowser
import typings.puppeteerCore.launchOptionsMod.ChromeReleaseChannel
import typings.puppeteerCore.productLauncherMod.ProductLauncher
import typings.puppeteerCore.productMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeLauncherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/ChromeLauncher", "ChromeLauncher")
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
