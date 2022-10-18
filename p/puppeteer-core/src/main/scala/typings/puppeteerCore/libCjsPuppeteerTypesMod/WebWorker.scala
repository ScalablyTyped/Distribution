package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.ConsoleAPICalledCallback
import typings.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "WebWorker")
@js.native
open class WebWorker protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.WebWorker {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
