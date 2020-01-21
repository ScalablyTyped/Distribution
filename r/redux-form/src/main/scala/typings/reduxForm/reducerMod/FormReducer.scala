package typings.reduxForm.reducerMod

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormReducer extends Reducer[FormStateMap, AnyAction] {
  def plugin(reducers: FormReducerMapObject): Reducer[FormStateMap, AnyAction] = js.native
}

