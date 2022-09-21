package typings.puppeteer

import typings.puppeteer.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFetch(): js.Promise[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFetch")().asInstanceOf[js.Promise[FnCall]]
}
