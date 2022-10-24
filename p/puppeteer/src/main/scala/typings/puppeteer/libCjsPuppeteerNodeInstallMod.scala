package typings.puppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodeInstallMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/node/install", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadBrowser(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadBrowser")().asInstanceOf[js.Promise[Unit]]
}
