package typings.puppeteerCore.mod

import typings.puppeteerCore.webWorkerMod.ConsoleAPICalledCallback
import typings.puppeteerCore.webWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "WebWorker")
@js.native
class WebWorker protected ()
  extends typings.puppeteerCore.webWorkerMod.WebWorker {
  /**
    *
    * @internal
    */
  def this(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
