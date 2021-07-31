package typings.puppeteerCore

import typings.puppeteerCore.puppeteerMod.Puppeteer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeWebMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/initialize-web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initializePuppeteerWeb(packageName: String): Puppeteer = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePuppeteerWeb")(packageName.asInstanceOf[js.Any]).asInstanceOf[Puppeteer]
}
