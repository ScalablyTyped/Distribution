package typings.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/hooks/useFrame", JSImport.Namespace)
@js.native
object useFrameMod extends js.Object {
  def useFrameState[State](defaultState: State): js.Tuple2[State, js.Function1[/* updater */ Updater[State], Unit]] = js.native
  def useTimeoutLock[State](): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State]] = js.native
  def useTimeoutLock[State](defaultState: State): js.Tuple2[js.Function1[/* state */ State, Unit], js.Function0[State]] = js.native
  type Updater[State] = js.Function1[/* prev */ State, State]
}

