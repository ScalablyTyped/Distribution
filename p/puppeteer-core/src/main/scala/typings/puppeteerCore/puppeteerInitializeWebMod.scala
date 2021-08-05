package typings.puppeteerCore

import typings.puppeteerCore.commonPuppeteerMod.Puppeteer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerInitializeWebMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/initialize-web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializePuppeteerWeb(packageName: String): Puppeteer = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePuppeteerWeb")(packageName.asInstanceOf[js.Any]).asInstanceOf[Puppeteer]
}
