package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.puppeteerCore.apiBrowserMod.TargetFilterCallback
import typings.puppeteerCore.commonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ChromeTargetManager")
@js.native
open class ChromeTargetManager protected ()
  extends typings.puppeteerCore.commonChromeTargetManagerMod.ChromeTargetManager {
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
