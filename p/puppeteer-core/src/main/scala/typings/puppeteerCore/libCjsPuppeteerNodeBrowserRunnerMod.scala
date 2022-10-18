package typings.puppeteerCore

import typings.node.childProcessMod.ChildProcess
import typings.puppeteerCore.anon.PreferredRevision
import typings.puppeteerCore.anon.SlowMo
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection
import typings.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import typings.puppeteerCore.libCjsPuppeteerNodeLaunchOptionsMod.LaunchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodeBrowserRunnerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/BrowserRunner", "BrowserRunner")
  @js.native
  open class BrowserRunner protected () extends StObject {
    def this(product: Product, executablePath: String, processArguments: js.Array[String], userDataDir: String) = this()
    def this(
      product: Product,
      executablePath: String,
      processArguments: js.Array[String],
      userDataDir: String,
      isTempUserDataDir: Boolean
    ) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    var connection: js.UndefOr[Connection] = js.native
    
    def kill(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    var proc: js.UndefOr[ChildProcess] = js.native
    
    def setupConnection(options: SlowMo): js.Promise[Connection] = js.native
    
    def setupWebDriverBiDiConnection(options: PreferredRevision): js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonBidiConnectionMod.Connection] = js.native
    
    def start(options: LaunchOptions): Unit = js.native
  }
}
