package typings.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfaces

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.react.reactMod._Global_.JSX.Element
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapResult extends js.Object {
  var history: History[LocationState]
  var output: js.Any
  var root: Element
  var store: Store[_, AnyAction]
}

object BootstrapResult {
  @scala.inline
  def apply(history: History[LocationState], output: js.Any, root: Element, store: Store[_, AnyAction]): BootstrapResult = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapResult]
  }
}

