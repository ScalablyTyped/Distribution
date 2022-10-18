package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "JSHandle")
@js.native
open class JSHandle[T] protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonJshandleMod.JSHandle[T] {
  /**
    * @internal
    */
  def this(
    context: typings.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext,
    remoteObject: RemoteObject
  ) = this()
}
