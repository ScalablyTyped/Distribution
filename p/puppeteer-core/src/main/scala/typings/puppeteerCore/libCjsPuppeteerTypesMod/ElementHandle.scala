package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ElementHandle")
@js.native
open class ElementHandle[ElementType /* <: Node */] protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonElementHandleMod.ElementHandle[ElementType] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject,
    frame: typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame
  ) = this()
}
