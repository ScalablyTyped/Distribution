package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "JSHandle")
@js.native
class JSHandle protected ()
  extends typings.puppeteerCore.jshandleMod.JSHandle {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.executionContextMod.ExecutionContext,
    client: typings.puppeteerCore.connectionMod.CDPSession,
    remoteObject: RemoteObject
  ) = this()
}
