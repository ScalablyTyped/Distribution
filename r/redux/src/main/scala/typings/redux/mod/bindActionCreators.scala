package typings.redux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", "bindActionCreators")
@js.native
object bindActionCreators extends js.Object {
  def apply[A, C /* <: ActionCreator[A] */](actionCreator: C, dispatch: Dispatch[AnyAction]): C = js.native
}

