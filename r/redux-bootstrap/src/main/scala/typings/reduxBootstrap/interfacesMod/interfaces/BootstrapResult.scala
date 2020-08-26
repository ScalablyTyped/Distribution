package typings.reduxBootstrap.interfacesMod.interfaces

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.global.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapResult extends js.Object {
  var history: History[LocationState] = js.native
  var output: js.Any = js.native
  var root: Element = js.native
  var store: Store[_, AnyAction] = js.native
}

object BootstrapResult {
  @scala.inline
  def apply(history: History[LocationState], output: js.Any, root: Element, store: Store[_, AnyAction]): BootstrapResult = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapResult]
  }
  @scala.inline
  implicit class BootstrapResultOps[Self <: BootstrapResult] (val x: Self) extends AnyVal {
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
    def setOutput(value: js.Any): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: Element): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: Store[_, AnyAction]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

