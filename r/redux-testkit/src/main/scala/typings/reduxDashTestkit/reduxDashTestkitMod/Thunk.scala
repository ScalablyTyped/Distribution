package typings.reduxDashTestkit.reduxDashTestkitMod

import typings.reduxDashTestkit.Anon_StateWithState
import typings.reduxDashThunk.reduxDashThunkMod.ThunkAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "Thunk")
@js.native
object Thunk extends js.Object {
  def apply(thunkFunc: ThunkAction[_, _, _, _]): ThunkTestkit with Anon_StateWithState = js.native
  def apply(thunkFunc: ThunkAction[_, _, _, _], extraArg: js.Any): ThunkTestkit with Anon_StateWithState = js.native
}

