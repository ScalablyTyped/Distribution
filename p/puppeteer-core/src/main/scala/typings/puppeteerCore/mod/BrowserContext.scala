package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "BrowserContext")
@js.native
class BrowserContext protected ()
  extends typings.puppeteerCore.browserMod.BrowserContext {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    browser: typings.puppeteerCore.browserMod.Browser
  ) = this()
  def this(
    connection: typings.puppeteerCore.connectionMod.Connection,
    browser: typings.puppeteerCore.browserMod.Browser,
    contextId: String
  ) = this()
}
