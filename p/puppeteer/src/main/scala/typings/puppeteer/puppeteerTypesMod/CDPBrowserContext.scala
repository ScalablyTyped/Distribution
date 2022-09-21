package typings.puppeteer.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "CDPBrowserContext")
@js.native
open class CDPBrowserContext protected ()
  extends typings.puppeteer.commonBrowserMod.CDPBrowserContext {
  /**
    * @internal
    */
  def this(
    connection: typings.puppeteer.commonConnectionMod.Connection,
    browser: typings.puppeteer.commonBrowserMod.CDPBrowser
  ) = this()
  def this(
    connection: typings.puppeteer.commonConnectionMod.Connection,
    browser: typings.puppeteer.commonBrowserMod.CDPBrowser,
    contextId: String
  ) = this()
}
