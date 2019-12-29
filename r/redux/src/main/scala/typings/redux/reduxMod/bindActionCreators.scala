package typings.redux.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", "bindActionCreators")
@js.native
object bindActionCreators extends js.Object {
  def apply[M /* <: ActionCreatorsMapObject[_] */, N /* <: ActionCreatorsMapObject[_] */](actionCreators: M, dispatch: Dispatch[AnyAction]): N = js.native
}

