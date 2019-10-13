package typings.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfaces

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.react.reactMod._Global_.JSX.Element
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
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
    val __obj = js.Dynamic.literal(history = history, routes = routes, store = store)
  
    __obj.asInstanceOf[RootComponentProps]
  }
}

