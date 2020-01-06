package typings.redux.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", "bindActionCreators")
@js.native
object bindActionCreators extends js.Object {
  def apply[A, M /* <: ActionCreatorsMapObject[A] */](actionCreators: M, dispatch: Dispatch[AnyAction]): M = js.native
}

