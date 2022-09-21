package typings.puppeteerCore.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "CDPBrowserContext")
@js.native
open class CDPBrowserContext protected ()
  extends typings.puppeteerCore.commonBrowserMod.CDPBrowserContext {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    browser: typings.puppeteerCore.commonBrowserMod.CDPBrowser
  ) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    browser: typings.puppeteerCore.commonBrowserMod.CDPBrowser,
    contextId: String
  ) = this()
}
