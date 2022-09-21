package typings.puppeteer.puppeteerTypesMod

import typings.puppeteer.productMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "BrowserRunner")
@js.native
open class BrowserRunner protected ()
  extends typings.puppeteer.browserRunnerMod.BrowserRunner {
  def this(product: Product, executablePath: String, processArguments: js.Array[String], userDataDir: String) = this()
  def this(
    product: Product,
    executablePath: String,
    processArguments: js.Array[String],
    userDataDir: String,
    isTempUserDataDir: Boolean
  ) = this()
}
