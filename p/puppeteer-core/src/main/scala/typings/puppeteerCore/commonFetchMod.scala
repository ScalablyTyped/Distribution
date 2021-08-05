package typings.puppeteerCore

import typings.puppeteerCore.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonFetchMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFetch(): js.Promise[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFetch")().asInstanceOf[js.Promise[FnCall]]
}
