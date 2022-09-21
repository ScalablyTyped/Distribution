package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ExecutionContext")
@js.native
open class ExecutionContext protected ()
  extends typings.puppeteerCore.commonExecutionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription
  ) = this()
  def this(
    client: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typings.puppeteerCore.commonIsolatedWorldMod.IsolatedWorld
  ) = this()
}
