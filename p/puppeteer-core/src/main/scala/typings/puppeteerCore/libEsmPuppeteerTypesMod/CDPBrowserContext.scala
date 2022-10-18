package typings.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPBrowserContext")
@js.native
open class CDPBrowserContext protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowserContext {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowser
  ) = this()
  def this(
    connection: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    browser: typings.puppeteerCore.libEsmPuppeteerCommonBrowserMod.CDPBrowser,
    contextId: String
  ) = this()
}
