package typings
package reduxDashBootstrapLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootComponentProps extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var routes: reactLib.reactMod.Global.JSXNs.Element
  var store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]
}

object RootComponentProps {
  @scala.inline
  def apply(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    routes: reactLib.reactMod.Global.JSXNs.Element,
    store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]
  ): RootComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("history")(history)
    __obj.updateDynamic("routes")(routes)
    __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[RootComponentProps]
  }
}

