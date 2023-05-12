package typings.puppeteerBrowsers

import typings.node.readlineMod.Interface
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCliMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/CLI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@puppeteer/browsers/lib/esm/CLI", "CLI")
  @js.native
  open class CLI () extends StObject {
    def this(cachePath: String) = this()
    def this(cachePath: String, rl: Interface) = this()
    def this(cachePath: Unit, rl: Interface) = this()
    
    /* private */ var `private`: Any = js.native
    
    def run(argv: js.Array[String]): js.Promise[Unit] = js.native
  }
  
  inline def makeProgressCallback(browser: Browser, buildId: String): js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeProgressCallback")(browser.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* downloadedBytes */ Double, /* totalBytes */ Double, Unit]]
}
