package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ElementHandle")
@js.native
open class ElementHandle[ElementType /* <: Node */] protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonElementHandleMod.ElementHandle[ElementType] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.libEsmPuppeteerCommonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject,
    frame: typings.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame
  ) = this()
}
