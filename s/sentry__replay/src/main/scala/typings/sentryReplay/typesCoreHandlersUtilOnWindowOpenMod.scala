package typings.sentryReplay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilOnWindowOpenMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/onWindowOpen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onWindowOpen(cb: WindowOpenHandler): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onWindowOpen")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  type WindowOpenHandler = js.Function0[Unit]
}
