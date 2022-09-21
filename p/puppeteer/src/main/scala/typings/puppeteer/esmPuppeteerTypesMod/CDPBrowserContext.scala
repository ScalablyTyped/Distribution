package typings.puppeteer.esmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "CDPBrowserContext")
@js.native
open class CDPBrowserContext protected ()
  extends typings.puppeteer.puppeteerCommonBrowserMod.CDPBrowserContext {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteer.puppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteer.puppeteerCommonBrowserMod.CDPBrowser
  ) = this()
  def this(
    connection: typings.puppeteer.puppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteer.puppeteerCommonBrowserMod.CDPBrowser,
    contextId: String
  ) = this()
}
