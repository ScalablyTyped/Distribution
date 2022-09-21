package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.puppeteerCore.apiBrowserMod.TargetFilterCallback
import typings.puppeteerCore.commonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "FirefoxTargetManager")
@js.native
open class FirefoxTargetManager protected ()
  extends typings.puppeteerCore.commonFirefoxTargetManagerMod.FirefoxTargetManager {
  def this(
    connection: typings.puppeteerCore.puppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory
  ) = this()
  def this(
    connection: typings.puppeteerCore.puppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
