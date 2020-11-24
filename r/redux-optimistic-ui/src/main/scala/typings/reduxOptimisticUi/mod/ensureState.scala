package typings.reduxOptimisticUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-optimistic-ui", "ensureState")
@js.native
object ensureState extends js.Object {
  
  def apply[TState](state: TState): TState = js.native
  def apply[TState](state: OptimisticState[TState]): TState = js.native
}
