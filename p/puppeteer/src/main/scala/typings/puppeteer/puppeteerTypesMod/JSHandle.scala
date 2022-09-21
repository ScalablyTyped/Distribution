package typings.puppeteer.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "JSHandle")
@js.native
open class JSHandle[T] protected ()
  extends typings.puppeteer.jshandleMod.JSHandle[T] {
  /**
    * @internal
    */
  def this(context: typings.puppeteer.executionContextMod.ExecutionContext, remoteObject: RemoteObject) = this()
}
