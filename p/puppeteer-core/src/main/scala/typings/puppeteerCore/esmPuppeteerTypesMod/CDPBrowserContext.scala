package typings.puppeteerCore.esmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPBrowserContext")
@js.native
open class CDPBrowserContext protected ()
  extends typings.puppeteerCore.puppeteerCommonBrowserMod.CDPBrowserContext {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteerCore.puppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteerCore.puppeteerCommonBrowserMod.CDPBrowser
  ) = this()
  def this(
    connection: typings.puppeteerCore.puppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteerCore.puppeteerCommonBrowserMod.CDPBrowser,
    contextId: String
  ) = this()
}
