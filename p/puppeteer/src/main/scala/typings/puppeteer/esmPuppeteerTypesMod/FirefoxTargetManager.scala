package typings.puppeteer.esmPuppeteerTypesMod

import typings.puppeteer.apiBrowserMod.TargetFilterCallback
import typings.puppeteer.commonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "FirefoxTargetManager")
@js.native
open class FirefoxTargetManager protected ()
  extends typings.puppeteer.commonFirefoxTargetManagerMod.FirefoxTargetManager {
  def this(
    connection: typings.puppeteer.puppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory
  ) = this()
  def this(
    connection: typings.puppeteer.puppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
