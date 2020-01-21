package typings.reactRedux.mod

import typings.react.mod.Context
import typings.reactRedux.FnA
import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", "createStoreHook")
@js.native
object createStoreHook extends js.Object {
  def apply(): FnA = js.native
  def apply(context: Context[ReactReduxContextValue[_, AnyAction]]): FnA = js.native
}

