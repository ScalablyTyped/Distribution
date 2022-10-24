package typings.puppeteer

import typings.puppeteerCore.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerGetConfigurationMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/getConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfiguration(): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")().asInstanceOf[Configuration]
}
