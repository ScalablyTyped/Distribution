package typings.puppeteer.esmPuppeteerTypesMod

import typings.puppeteer.commonWebWorkerMod.ConsoleAPICalledCallback
import typings.puppeteer.commonWebWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "WebWorker")
@js.native
open class WebWorker protected ()
  extends typings.puppeteer.commonWebWorkerMod.WebWorker {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
