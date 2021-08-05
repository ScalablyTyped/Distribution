package typings.rcTabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRafMod {
  
  @JSImport("rc-tabs/es/hooks/useRaf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Callback /* <: js.Function */](callback: Callback): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  inline def useRafState[T](defaultState: T): js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRafState")(defaultState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]]]
  inline def useRafState[T](defaultState: js.Function0[T]): js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRafState")(defaultState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]]]
  
  type Callback[T] = js.Function1[/* ori */ T, T]
}
