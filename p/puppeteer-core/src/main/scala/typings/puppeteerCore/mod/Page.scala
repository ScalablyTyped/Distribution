package typings.puppeteerCore.mod

import typings.puppeteerCore.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Page")
@js.native
class Page protected ()
  extends typings.puppeteerCore.pageMod.Page {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    target: typings.puppeteerCore.targetMod.Target,
    ignoreHTTPSErrors: Boolean
  ) = this()
}
/* static members */
object Page {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Page")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  @scala.inline
  def create(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    target: typings.puppeteerCore.targetMod.Target,
    ignoreHTTPSErrors: Boolean
  ): js.Promise[typings.puppeteerCore.pageMod.Page] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.pageMod.Page]]
  @scala.inline
  def create(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    target: typings.puppeteerCore.targetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ): js.Promise[typings.puppeteerCore.pageMod.Page] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.pageMod.Page]]
}
