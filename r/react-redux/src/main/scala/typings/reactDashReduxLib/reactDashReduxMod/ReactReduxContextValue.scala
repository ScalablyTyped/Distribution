package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactReduxContextValue[SS, A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  var store: reduxLib.reduxMod.Store[SS, A]
  var storeState: SS
}

object ReactReduxContextValue {
  @scala.inline
  def apply[SS, A /* <: reduxLib.reduxMod.Action[_] */](store: reduxLib.reduxMod.Store[SS, A], storeState: SS): ReactReduxContextValue[SS, A] = {
    val __obj = js.Dynamic.literal(store = store, storeState = storeState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactReduxContextValue[SS, A]]
  }
}

