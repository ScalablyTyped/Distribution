package typings.reduxDashTestkit.reduxDashTestkitMod

import typings.redux.reduxMod.AnyAction
import typings.reduxDashTestkit.Anon_Args
import typings.reduxDashTestkit.Anon_State
import typings.reduxDashTestkit.Anon_StateWithState
import typings.reduxDashThunk.reduxDashThunkMod.ThunkAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Reducer(action: typings.redux.reduxMod.Reducer[_, AnyAction]): ReducerTestkit with Anon_State = js.native
  def Selector(selector: js.Function2[/* state */ js.Any, /* action */ js.Any, _]): Anon_Args = js.native
  def Thunk(thunkFunc: ThunkAction[_, _, _, _]): ThunkTestkit with Anon_StateWithState = js.native
  def Thunk(thunkFunc: ThunkAction[_, _, _, _], extraArg: js.Any): ThunkTestkit with Anon_StateWithState = js.native
}

