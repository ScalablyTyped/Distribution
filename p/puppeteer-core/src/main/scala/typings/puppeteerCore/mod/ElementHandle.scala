package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "ElementHandle")
@js.native
class ElementHandle[ElementType /* <: Element */] protected ()
  extends typings.puppeteerCore.jshandleMod.ElementHandle[ElementType] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.executionContextMod.ExecutionContext,
    client: typings.puppeteerCore.connectionMod.CDPSession,
    remoteObject: RemoteObject,
    page: typings.puppeteerCore.pageMod.Page,
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager
  ) = this()
}
