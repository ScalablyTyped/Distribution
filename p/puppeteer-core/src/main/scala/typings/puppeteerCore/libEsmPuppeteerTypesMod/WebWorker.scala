package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.puppeteerCore.libEsmPuppeteerCommonWebWorkerMod.ConsoleAPICalledCallback
import typings.puppeteerCore.libEsmPuppeteerCommonWebWorkerMod.ExceptionThrownCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "WebWorker")
@js.native
open class WebWorker protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonWebWorkerMod.WebWorker {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    url: String,
    consoleAPICalled: ConsoleAPICalledCallback,
    exceptionThrown: ExceptionThrownCallback
  ) = this()
}
