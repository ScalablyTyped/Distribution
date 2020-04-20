package typings.reduxBootstrap.interfacesMod.interfaces

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod._Global_.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
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

