package typings.reduxStorage.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-storage", "reducer")
@js.native
object reducer extends js.Object {
  
  def apply[TState](reducer: Reducer[TState, AnyAction]): Reducer[TState, AnyAction] = js.native
  def apply[TState](reducer: Reducer[TState, AnyAction], merger: StateMerger): Reducer[TState, AnyAction] = js.native
}
