package typings.reactDashRedux.reactDashReduxMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", "useStore")
@js.native
object useStore extends js.Object {
  def apply[S, A /* <: Action[_] */](): Store[S, A] = js.native
}

