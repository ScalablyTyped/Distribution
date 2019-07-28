package typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux-toastr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val actions: ToastrActionCreators = js.native
  val reducer: Reducer[ToastrState, AnyAction] = js.native
  val toastr: ToastrEmitter = js.native
}

