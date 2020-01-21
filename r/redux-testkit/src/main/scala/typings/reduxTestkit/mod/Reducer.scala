package typings.reduxTestkit.mod

import typings.redux.mod.AnyAction
import typings.reduxTestkit.AnonState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "Reducer")
@js.native
object Reducer extends js.Object {
  def apply(action: typings.redux.mod.Reducer[_, AnyAction]): ReducerTestkit with AnonState = js.native
}

