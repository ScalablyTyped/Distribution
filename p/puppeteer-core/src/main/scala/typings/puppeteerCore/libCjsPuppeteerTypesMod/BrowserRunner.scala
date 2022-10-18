package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "BrowserRunner")
@js.native
open class BrowserRunner protected ()
  extends typings.puppeteerCore.libCjsPuppeteerNodeBrowserRunnerMod.BrowserRunner {
  def this(product: Product, executablePath: String, processArguments: js.Array[String], userDataDir: String) = this()
  def this(
    product: Product,
    executablePath: String,
    processArguments: js.Array[String],
    userDataDir: String,
    isTempUserDataDir: Boolean
  ) = this()
}
