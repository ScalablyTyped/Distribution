package typings.puppeteerCore.apiDocsEntryMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "JSHandle")
@js.native
class JSHandle protected ()
  extends typings.puppeteerCore.commonJshandleMod.JSHandle {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.commonExecutionContextMod.ExecutionContext,
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    remoteObject: RemoteObject
  ) = this()
}
