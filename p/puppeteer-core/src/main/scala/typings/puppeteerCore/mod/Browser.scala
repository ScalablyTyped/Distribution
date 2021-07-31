package typings.puppeteerCore.mod

import typings.node.childProcessMod.ChildProcess
import typings.puppeteerCore.browserMod.BrowserCloseCallback
import typings.puppeteerCore.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Browser")
@js.native
class Browser protected ()
  extends typings.puppeteerCore.browserMod.Browser {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ) = this()
}
/* static members */
object Browser {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Browser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Unit,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: Unit,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
  @scala.inline
  def create(
    connection: typings.puppeteerCore.connectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    process: ChildProcess,
    closeCallback: BrowserCloseCallback
  ): js.Promise[typings.puppeteerCore.browserMod.Browser] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.browserMod.Browser]]
}
