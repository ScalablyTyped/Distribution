package typings.puppeteerCore

import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.Browser
import typings.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.BrowserLaunchArgumentOptions
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.ChromeReleaseChannel
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.PuppeteerNodeLaunchOptions
import typings.puppeteerCore.libCjsPuppeteerNodePuppeteerNodeMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodeProductLauncherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/ProductLauncher", "ProductLauncher")
  @js.native
  open class ProductLauncher protected () extends StObject {
    /**
      * @internal
      */
    def this(puppeteer: PuppeteerNode, product: Product) = this()
    
    def defaultArgs(`object`: BrowserLaunchArgumentOptions): js.Array[String] = js.native
    
    def executablePath(): String = js.native
    def executablePath(channel: ChromeReleaseChannel): String = js.native
    
    /**
      * @internal
      */
    /* protected */ def getProfilePath(): String = js.native
    
    def launch(`object`: PuppeteerNodeLaunchOptions): js.Promise[Browser] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def product: Product = js.native
    
    /**
      * @internal
      */
    var puppeteer: PuppeteerNode = js.native
    
    /**
      * @internal
      */
    /* protected */ def resolveExecutablePath(): String = js.native
  }
}
