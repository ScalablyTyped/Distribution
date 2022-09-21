package typings.puppeteerCore

import typings.puppeteerCore.nodePuppeteerMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializePuppeteerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/initializePuppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializePuppeteer(packageName: String): PuppeteerNode = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePuppeteer")(packageName.asInstanceOf[js.Any]).asInstanceOf[PuppeteerNode]
}
