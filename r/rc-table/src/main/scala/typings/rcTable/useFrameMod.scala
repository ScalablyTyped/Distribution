package typings.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-table/lib/hooks/useFrame", JSImport.Namespace)
@js.native
object useFrameMod extends js.Object {
  
  def useLayoutState[State](defaultState: State): js.Tuple2[State, js.Function1[/* updater */ Updater[State], Unit]] = js.native
  
  def useTimeoutLock[State](): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]] = js.native
  def useTimeoutLock[State](defaultState: State): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State | Null]] = js.native
  
  type Updater[State] = js.Function1[/* prev */ State, State]
}
