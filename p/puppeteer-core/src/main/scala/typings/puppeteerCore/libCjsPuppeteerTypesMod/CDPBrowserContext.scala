package typings.puppeteerCore.libCjsPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "CDPBrowserContext")
@js.native
open class CDPBrowserContext protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonBrowserMod.CDPBrowserContext {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteerCore.libCjsPuppeteerCommonBrowserMod.CDPBrowser
  ) = this()
  def this(
    connection: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteerCore.libCjsPuppeteerCommonBrowserMod.CDPBrowser,
    contextId: String
  ) = this()
}
