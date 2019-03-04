package typings
package reduxDashBootstrapLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapResult extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var output: js.Any
  var root: reactLib.reactMod.Global.JSXNs.Element
  var store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]
}

object BootstrapResult {
  @scala.inline
  def apply(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    output: js.Any,
    root: reactLib.reactMod.Global.JSXNs.Element,
    store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]
  ): BootstrapResult = {
    val __obj = js.Dynamic.literal(history = history, output = output, root = root, store = store)
  
    __obj.asInstanceOf[BootstrapResult]
  }
}

