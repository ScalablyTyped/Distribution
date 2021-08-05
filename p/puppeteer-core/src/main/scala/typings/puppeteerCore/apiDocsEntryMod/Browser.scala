package typings.puppeteerCore.apiDocsEntryMod

import typings.node.childProcessMod.ChildProcess
import typings.puppeteerCore.commonBrowserMod.BrowserCloseCallback
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Browser")
@js.native
class Browser protected ()
  extends typings.puppeteerCore.commonBrowserMod.Browser {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ) = this()
}
/* static members */
object Browser {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Browser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
  inline def create(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.commonBrowserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonBrowserMod.Browser]]
}
