package typings
package reduxDashBootstrapLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureStore
  extends js.Function {
  def apply(
    middlewares: js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ],
    rootReducer: js.Object,
    initialState: js.Any
  ): reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction] = js.native
}

