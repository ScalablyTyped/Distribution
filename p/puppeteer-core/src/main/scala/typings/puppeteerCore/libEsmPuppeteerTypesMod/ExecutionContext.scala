package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ExecutionContext")
@js.native
open class ExecutionContext protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonExecutionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription
  ) = this()
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typings.puppeteerCore.libEsmPuppeteerCommonIsolatedWorldMod.IsolatedWorld
  ) = this()
}
