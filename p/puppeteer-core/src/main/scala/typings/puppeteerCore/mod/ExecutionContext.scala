package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "ExecutionContext")
@js.native
class ExecutionContext protected ()
  extends typings.puppeteerCore.executionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typings.puppeteerCore.domworldMod.DOMWorld
  ) = this()
}
