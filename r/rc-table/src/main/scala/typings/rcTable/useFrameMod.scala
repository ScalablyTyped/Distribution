package typings.rcTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFrameMod {
  
  @JSImport("rc-table/lib/hooks/useFrame", "useLayoutState")
  @js.native
  def useLayoutState[State](defaultState: State): js.Tuple2[State, js.Function1[/* updater */ Updater[State], Unit]] = js.native
  
  @JSImport("rc-table/lib/hooks/useFrame", "useTimeoutLock")
  @js.native
  def useTimeoutLock[State](): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]] = js.native
  @JSImport("rc-table/lib/hooks/useFrame", "useTimeoutLock")
  @js.native
  def useTimeoutLock[State](defaultState: State): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]] = js.native
  
  type Updater[State] = js.Function1[/* prev */ State, State]
}
