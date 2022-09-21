package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductLauncher extends StObject {
  
  def defaultArgs(`object`: BrowserLaunchArgumentOptions): js.Array[String] = js.native
  
  def executablePath(): String = js.native
  def executablePath(path: Any): String = js.native
  
  def launch(`object`: PuppeteerNodeLaunchOptions): js.Promise[Browser] = js.native
  
  var product: Product = js.native
}
