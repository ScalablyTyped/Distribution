package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "JSHandle")
@js.native
open class JSHandle[T] protected ()
  extends typings.puppeteerCore.commonJshandleMod.JSHandle[T] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.commonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject
  ) = this()
}
