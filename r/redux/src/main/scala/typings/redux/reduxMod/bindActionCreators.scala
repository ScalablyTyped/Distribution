package typings.redux.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", "bindActionCreators")
@js.native
object bindActionCreators extends js.Object {
  def apply[A /* <: ActionCreator[_] */, B /* <: ActionCreator[_] */](actionCreator: A, dispatch: Dispatch[AnyAction]): B = js.native
}

