package typings.reduxBootstrap.interfacesMod.interfaces

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod._Global_.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootComponentProps extends js.Object {
  var history: History[LocationState]
  var routes: Element
  var store: Store[_, AnyAction]
}

object RootComponentProps {
  @scala.inline
  def apply(history: History[LocationState], routes: Element, store: Store[_, AnyAction]): RootComponentProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RootComponentProps]
  }
}

