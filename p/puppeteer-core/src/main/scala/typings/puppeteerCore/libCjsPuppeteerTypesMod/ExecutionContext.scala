package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ExecutionContext")
@js.native
open class ExecutionContext protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription
  ) = this()
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typings.puppeteerCore.libCjsPuppeteerCommonIsolatedWorldMod.IsolatedWorld
  ) = this()
}
