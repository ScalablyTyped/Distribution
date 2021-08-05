package typings.puppeteerCore.apiDocsEntryMod

import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Page")
@js.native
class Page protected ()
  extends typings.puppeteerCore.commonPageMod.Page {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    target: typings.puppeteerCore.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean
  ) = this()
}
/* static members */
object Page {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Page")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def create(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    target: typings.puppeteerCore.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean
  ): js.Promise[typings.puppeteerCore.commonPageMod.Page] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonPageMod.Page]]
  inline def create(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    target: typings.puppeteerCore.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ): js.Promise[typings.puppeteerCore.commonPageMod.Page] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonPageMod.Page]]
}
