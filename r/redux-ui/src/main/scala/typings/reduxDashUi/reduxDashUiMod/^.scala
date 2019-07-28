package typings.reduxDashUi.reduxDashUiMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-ui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val reducer: Reducer[js.Any, AnyAction] = js.native
  def default[UIStateShape](): js.Function1[/* component */ js.Any, _] = js.native
  def default[UIStateShape](params: uiParams[UIStateShape]): js.Function1[/* component */ js.Any, _] = js.native
}

