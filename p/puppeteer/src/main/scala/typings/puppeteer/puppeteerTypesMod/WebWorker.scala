package typings.puppeteer.puppeteerTypesMod

import typings.puppeteer.webWorkerMod.ConsoleAPICalledCallback
import typings.puppeteer.webWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "WebWorker")
@js.native
open class WebWorker protected ()
  extends typings.puppeteer.webWorkerMod.WebWorker {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
