package typings.rcTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseFrameMod {
  
  @JSImport("rc-table/lib/hooks/useFrame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLayoutState[State](defaultState: State): js.Tuple2[State, js.Function1[/* updater */ Updater[State], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutState")(defaultState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[State, js.Function1[/* updater */ Updater[State], Unit]]]
  
  inline def useTimeoutLock[State](): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTimeoutLock")().asInstanceOf[js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]]]
  inline def useTimeoutLock[State](defaultState: State): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTimeoutLock")(defaultState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]]]
  
  type Updater[State] = js.Function1[/* prev */ State, State]
}
