package typings.puppeteerCore.puppeteerTypesMod

import typings.puppeteerCore.webWorkerMod.ConsoleAPICalledCallback
import typings.puppeteerCore.webWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "WebWorker")
@js.native
open class WebWorker protected ()
  extends typings.puppeteerCore.webWorkerMod.WebWorker {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
