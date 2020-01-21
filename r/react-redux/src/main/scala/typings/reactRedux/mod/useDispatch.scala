package typings.reactRedux.mod

import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", "useDispatch")
@js.native
object useDispatch extends js.Object {
  def apply[A /* <: Action[_] */](): Dispatch[A] = js.native
}

