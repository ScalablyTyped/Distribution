package typings.reactRedux.mod

import typings.redux.mod.Action
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactReduxContextValue[SS, A /* <: Action[_] */] extends js.Object {
  
  var store: Store[SS, A] = js.native
  
  var storeState: SS = js.native
}
object ReactReduxContextValue {
  
  @scala.inline
  def apply[SS, A /* <: Action[_] */](store: Store[SS, A], storeState: SS): ReactReduxContextValue[SS, A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], storeState = storeState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactReduxContextValue[SS, A]]
  }
  
  @scala.inline
  implicit class ReactReduxContextValueOps[Self <: ReactReduxContextValue[_, _], SS, A /* <: Action[_] */] (val x: Self with (ReactReduxContextValue[SS, A])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStore(value: Store[SS, A]): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreState(value: SS): Self = this.set("storeState", value.asInstanceOf[js.Any])
  }
}
