package typings.signalExit

import typings.node.processMod.global.NodeJS.Signals
import typings.signalExit.anon.AlwaysLast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signal-exit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(load, unload) */ inline def onExit(cb: Handler): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onExit")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def onExit(cb: Handler, opts: AlwaysLast): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("onExit")(cb.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("signal-exit", "signals")
  @js.native
  val signals: js.Array[Signals] = js.native
  
  type Handler = js.Function2[/* code */ js.UndefOr[Double | Null], /* signal */ Signals | Null, Any]
}
