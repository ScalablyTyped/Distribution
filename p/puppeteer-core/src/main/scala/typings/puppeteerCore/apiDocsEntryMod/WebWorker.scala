package typings.puppeteerCore.apiDocsEntryMod

import typings.puppeteerCore.commonWebWorkerMod.ConsoleAPICalledCallback
import typings.puppeteerCore.commonWebWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "WebWorker")
@js.native
class WebWorker protected ()
  extends typings.puppeteerCore.commonWebWorkerMod.WebWorker {
  /**
    *
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
