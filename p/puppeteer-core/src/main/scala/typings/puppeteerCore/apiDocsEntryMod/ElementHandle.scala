package typings.puppeteerCore.apiDocsEntryMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "ElementHandle")
@js.native
class ElementHandle[ElementType /* <: Element */] protected ()
  extends typings.puppeteerCore.commonJshandleMod.ElementHandle[ElementType] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.commonExecutionContextMod.ExecutionContext,
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    remoteObject: RemoteObject,
    page: typings.puppeteerCore.commonPageMod.Page,
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager
  ) = this()
}
