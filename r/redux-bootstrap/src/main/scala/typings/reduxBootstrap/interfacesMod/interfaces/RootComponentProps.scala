package typings.reduxBootstrap.interfacesMod.interfaces

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.global.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootComponentProps extends js.Object {
  
  var history: History[LocationState] = js.native
  
  var routes: Element = js.native
  
  var store: Store[_, AnyAction] = js.native
}
object RootComponentProps {
  
  @scala.inline
  def apply(history: History[LocationState], routes: Element, store: Store[_, AnyAction]): RootComponentProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootComponentProps]
  }
  
  @scala.inline
  implicit class RootComponentPropsOps[Self <: RootComponentProps] (val x: Self) extends AnyVal {
    
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
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: Element): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: Store[_, AnyAction]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
}
