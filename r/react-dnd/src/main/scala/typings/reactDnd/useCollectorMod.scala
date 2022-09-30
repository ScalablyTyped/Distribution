package typings.reactDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCollectorMod {
  
  @JSImport("react-dnd/dist/hooks/useCollector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCollector[T, S](monitor: T, collect: js.Function1[/* monitor */ T, S]): js.Tuple2[S, js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollector")(monitor.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function0[Unit]]]
  inline def useCollector[T, S](monitor: T, collect: js.Function1[/* monitor */ T, S], onUpdate: js.Function0[Unit]): js.Tuple2[S, js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollector")(monitor.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], onUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function0[Unit]]]
}
