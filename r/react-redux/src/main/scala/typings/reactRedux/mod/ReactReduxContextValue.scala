package typings.reactRedux.mod

import typings.redux.mod.Action
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactReduxContextValue[SS, A /* <: Action[_] */] extends js.Object {
  var store: Store[SS, A]
  var storeState: SS
}

object ReactReduxContextValue {
  @scala.inline
  def apply[SS, A /* <: Action[_] */](store: Store[SS, A], storeState: SS): ReactReduxContextValue[SS, A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], storeState = storeState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactReduxContextValue[SS, A]]
  }
}

