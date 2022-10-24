package typings.puppeteer

import typings.puppeteerCore.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerGetConfigurationMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/getConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfiguration(): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")().asInstanceOf[Configuration]
}
