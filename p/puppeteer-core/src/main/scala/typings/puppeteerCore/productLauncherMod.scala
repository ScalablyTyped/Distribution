package typings.puppeteerCore

import typings.puppeteerCore.anon.ExecutablePath
import typings.puppeteerCore.browserMod.Browser
import typings.puppeteerCore.chromeLauncherMod.ChromeLauncher
import typings.puppeteerCore.firefoxLauncherMod.FirefoxLauncher
import typings.puppeteerCore.launchOptionsMod.BrowserLaunchArgumentOptions
import typings.puppeteerCore.launchOptionsMod.ChromeReleaseChannel
import typings.puppeteerCore.launchOptionsMod.PuppeteerNodeLaunchOptions
import typings.puppeteerCore.productMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productLauncherMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/ProductLauncher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLauncher(projectRoot: String, preferredRevision: String, isPuppeteerCore: Boolean): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("createLauncher")(projectRoot.asInstanceOf[js.Any], preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  inline def createLauncher(projectRoot: String, preferredRevision: String, isPuppeteerCore: Boolean, product: Product): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("createLauncher")(projectRoot.asInstanceOf[js.Any], preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any], product.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  inline def createLauncher(projectRoot: Unit, preferredRevision: String, isPuppeteerCore: Boolean): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("createLauncher")(projectRoot.asInstanceOf[js.Any], preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  inline def createLauncher(projectRoot: Unit, preferredRevision: String, isPuppeteerCore: Boolean, product: Product): ProductLauncher = (^.asInstanceOf[js.Dynamic].applyDynamic("createLauncher")(projectRoot.asInstanceOf[js.Any], preferredRevision.asInstanceOf[js.Any], isPuppeteerCore.asInstanceOf[js.Any], product.asInstanceOf[js.Any])).asInstanceOf[ProductLauncher]
  
  inline def executablePathForChannel(channel: ChromeReleaseChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePathForChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveExecutablePath(launcher: ChromeLauncher): ExecutablePath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveExecutablePath")(launcher.asInstanceOf[js.Any]).asInstanceOf[ExecutablePath]
  inline def resolveExecutablePath(launcher: FirefoxLauncher): ExecutablePath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveExecutablePath")(launcher.asInstanceOf[js.Any]).asInstanceOf[ExecutablePath]
  
  @js.native
  trait ProductLauncher extends StObject {
    
    def defaultArgs(`object`: BrowserLaunchArgumentOptions): js.Array[String] = js.native
    
    def executablePath(): String = js.native
    def executablePath(path: Any): String = js.native
    
    def launch(`object`: PuppeteerNodeLaunchOptions): js.Promise[Browser] = js.native
    
    var product: Product = js.native
  }
}
