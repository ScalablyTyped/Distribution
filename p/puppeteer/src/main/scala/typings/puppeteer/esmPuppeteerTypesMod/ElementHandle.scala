package typings.puppeteer.esmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "ElementHandle")
@js.native
open class ElementHandle[ElementType /* <: Node */] protected ()
  extends typings.puppeteer.commonElementHandleMod.ElementHandle[ElementType] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteer.commonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject,
    frame: typings.puppeteer.commonFrameMod.Frame
  ) = this()
}
