package typings.reduxFirstRouting.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-first-routing", "startListener")
@js.native
object startListener extends js.Object {
  
  def apply(history: History[LocationState], store: Store[_, AnyAction]): Unit = js.native
}
