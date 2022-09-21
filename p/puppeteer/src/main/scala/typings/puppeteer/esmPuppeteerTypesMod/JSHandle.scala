package typings.puppeteer.esmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "JSHandle")
@js.native
open class JSHandle[T] protected ()
  extends typings.puppeteer.commonJshandleMod.JSHandle[T] {
  /**
    * @internal
    */
  def this(context: typings.puppeteer.commonExecutionContextMod.ExecutionContext, remoteObject: RemoteObject) = this()
}
