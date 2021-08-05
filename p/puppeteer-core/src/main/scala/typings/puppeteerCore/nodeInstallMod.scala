package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeInstallMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/install", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadBrowser(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadBrowser")().asInstanceOf[js.Promise[Unit]]
  
  inline def logPolitely(toBeLogged: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolitely")(toBeLogged.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
