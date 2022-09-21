package typings.puppeteerCore.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ExecutionContext")
@js.native
open class ExecutionContext protected ()
  extends typings.puppeteerCore.executionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription
  ) = this()
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typings.puppeteerCore.isolatedWorldMod.IsolatedWorld
  ) = this()
}
