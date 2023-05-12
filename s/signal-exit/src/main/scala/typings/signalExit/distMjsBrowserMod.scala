package typings.signalExit

import typings.signalExit.anon.AlwaysLast
import typings.signalExit.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsBrowserMod {
  
  @JSImport("signal-exit/dist/mjs/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
  
  inline def onExit(cb: Handler, opts: AlwaysLast): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("onExit")(cb.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def unload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")().asInstanceOf[Unit]
}
