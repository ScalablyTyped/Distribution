package typings.puppeteer.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "ExecutionContext")
@js.native
open class ExecutionContext protected ()
  extends typings.puppeteer.executionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription
  ) = this()
  def this(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typings.puppeteer.isolatedWorldMod.IsolatedWorld
  ) = this()
}
