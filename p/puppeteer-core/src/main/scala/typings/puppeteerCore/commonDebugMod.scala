package typings.puppeteerCore

import typings.puppeteerCore.anon.TypeofimportedDebug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonDebugMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(prefix: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  object global {
    
    @JSGlobal("__PUPPETEER_DEBUG")
    @js.native
    def __PUPPETEER_DEBUG: String = js.native
    inline def __PUPPETEER_DEBUG_=(x: String): Unit = js.Dynamic.global.updateDynamic("__PUPPETEER_DEBUG")(x.asInstanceOf[js.Any])
  }
  
  inline def importDebug(): js.Promise[TypeofimportedDebug] = ^.asInstanceOf[js.Dynamic].applyDynamic("importDebug")().asInstanceOf[js.Promise[TypeofimportedDebug]]
}
