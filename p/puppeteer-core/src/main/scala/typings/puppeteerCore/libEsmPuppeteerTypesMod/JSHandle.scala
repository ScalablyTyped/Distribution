package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "JSHandle")
@js.native
open class JSHandle[T] protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonJshandleMod.JSHandle[T] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.libEsmPuppeteerCommonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject
  ) = this()
}
