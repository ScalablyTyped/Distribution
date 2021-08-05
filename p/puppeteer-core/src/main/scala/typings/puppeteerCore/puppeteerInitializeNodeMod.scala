package typings.puppeteerCore

import typings.puppeteerCore.puppeteerNodePuppeteerMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerInitializeNodeMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/initialize-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializePuppeteerNode(packageName: String): PuppeteerNode = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePuppeteerNode")(packageName.asInstanceOf[js.Any]).asInstanceOf[PuppeteerNode]
}
