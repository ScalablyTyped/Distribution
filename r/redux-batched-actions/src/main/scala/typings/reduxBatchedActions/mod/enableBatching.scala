package typings.reduxBatchedActions.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-batched-actions", "enableBatching")
@js.native
object enableBatching extends js.Object {
  
  def apply[S](reduce: Reducer[S, AnyAction]): Reducer[S, AnyAction] = js.native
}
