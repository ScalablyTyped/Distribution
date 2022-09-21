package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.puppeteerCore.commonProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "BrowserRunner")
@js.native
open class BrowserRunner protected ()
  extends typings.puppeteerCore.nodeBrowserRunnerMod.BrowserRunner {
  def this(product: Product, executablePath: String, processArguments: js.Array[String], userDataDir: String) = this()
  def this(
    product: Product,
    executablePath: String,
    processArguments: js.Array[String],
    userDataDir: String,
    isTempUserDataDir: Boolean
  ) = this()
}
