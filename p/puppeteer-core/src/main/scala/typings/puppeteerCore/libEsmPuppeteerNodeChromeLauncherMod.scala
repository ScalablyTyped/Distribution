package typings.puppeteerCore

import typings.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowser
import typings.puppeteerCore.libEsmPuppeteerNodeProductLauncherMod.ProductLauncher
import typings.puppeteerCore.libEsmPuppeteerNodePuppeteerNodeMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerNodeChromeLauncherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/ChromeLauncher", "ChromeLauncher")
  @js.native
  open class ChromeLauncher protected () extends ProductLauncher {
    def this(puppeteer: PuppeteerNode) = this()
    
    def defaultArgs(): js.Array[String] = js.native
    
    def launch(): js.Promise[CDPBrowser] = js.native
  }
}
