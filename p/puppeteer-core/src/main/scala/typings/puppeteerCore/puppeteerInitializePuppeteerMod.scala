package typings.puppeteerCore

import typings.puppeteerCore.puppeteerNodePuppeteerMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerInitializePuppeteerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/initializePuppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializePuppeteer(packageName: String): PuppeteerNode = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePuppeteer")(packageName.asInstanceOf[js.Any]).asInstanceOf[PuppeteerNode]
}
