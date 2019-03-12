package typings
package reduxDashTestkitLib.reduxDashTestkitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Reducer(action: reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]): ReducerTestkit with reduxDashTestkitLib.Anon_State = js.native
  def Selector(selector: js.Function2[/* state */ js.Any, /* action */ js.Any, _]): reduxDashTestkitLib.Anon_Args = js.native
  def Thunk(thunkFunc: reduxDashThunkLib.reduxDashThunkMod.ThunkAction[_, _, _, _]): ThunkTestkit with reduxDashTestkitLib.Anon_StateWithState = js.native
  def Thunk(thunkFunc: reduxDashThunkLib.reduxDashThunkMod.ThunkAction[_, _, _, _], extraArg: js.Any): ThunkTestkit with reduxDashTestkitLib.Anon_StateWithState = js.native
}

