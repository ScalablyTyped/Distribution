package typings.reduxDashForm.libReducerMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormReducer extends Reducer[FormStateMap, AnyAction] {
  def plugin(reducers: FormReducerMapObject): Reducer[FormStateMap, AnyAction] = js.native
}

