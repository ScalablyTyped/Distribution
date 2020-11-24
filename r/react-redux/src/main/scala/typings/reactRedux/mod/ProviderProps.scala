package typings.reactRedux.mod

import typings.react.mod.Context
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderProps[A /* <: Action[_] */] extends js.Object {
  
  /**
    * Optional context to be used internally in react-redux. Use React.createContext() to create a context to be used.
    * If this is used, generate own connect HOC by using connectAdvanced, supplying the same context provided to the
    * Provider. Initial value doesn't matter, as it is overwritten with the internal state of Provider.
    */
  var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.native
  
  /**
    * The single Redux store in your application.
    */
  var store: Store[_, A] = js.native
}
object ProviderProps {
  
  @scala.inline
  def apply[A /* <: Action[_] */](store: Store[_, A]): ProviderProps[A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[A]]
  }
  
  @scala.inline
  implicit class ProviderPropsOps[Self <: ProviderProps[_], A /* <: Action[_] */] (val x: Self with ProviderProps[A]) extends AnyVal {
    
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
    def setStore(value: Store[_, A]): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Context[ReactReduxContextValue[_, AnyAction]]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
}
