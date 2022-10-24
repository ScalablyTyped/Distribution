package typings.puppeteerCore

import typings.puppeteerCore.libCjsPuppeteerCommonBrowserMod.CDPBrowser
import typings.puppeteerCore.libCjsPuppeteerNodeProductLauncherMod.ProductLauncher
import typings.puppeteerCore.libCjsPuppeteerNodePuppeteerNodeMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodeChromeLauncherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/ChromeLauncher", "ChromeLauncher")
  @js.native
  open class ChromeLauncher protected () extends ProductLauncher {
    def this(puppeteer: PuppeteerNode) = this()
    
    def defaultArgs(): js.Array[String] = js.native
    
    def launch(): js.Promise[CDPBrowser] = js.native
  }
}
