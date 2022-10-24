package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "ProductLauncher")
@js.native
open class ProductLauncher () extends StObject {
  
  def defaultArgs(`object`: BrowserLaunchArgumentOptions): js.Array[String] = js.native
  
  def executablePath(): String = js.native
  def executablePath(channel: ChromeReleaseChannel): String = js.native
  
  def launch(`object`: PuppeteerNodeLaunchOptions): js.Promise[Browser] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /* Excluded from this release type: puppeteer */
  /* Excluded from this release type: __constructor */
  def product: Product = js.native
}
