package typings.puppeteerCore.apiDocsEntryMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "ExecutionContext")
@js.native
class ExecutionContext protected ()
  extends typings.puppeteerCore.commonExecutionContextMod.ExecutionContext {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    contextPayload: ExecutionContextDescription,
    world: typings.puppeteerCore.commonDomworldMod.DOMWorld
  ) = this()
}
