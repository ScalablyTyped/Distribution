package typings
package reduxDashPackLib.reduxDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-pack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val KEY: reduxDashPackLib.Anon_LIFECYCLE = js.native
  val LIFECYCLE: reduxDashPackLib.Anon_FAILURE = js.native
  val middleware: reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def handle[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    state: TState,
    action: reduxDashPackLib.reduxDashPackMod.Action[
      reduxDashPackLib.reduxDashPackMod.TFullState, 
      TSuccessPayload, 
      TErrorPayload, 
      TStartPayload, 
      TMetaPayload
    ],
    handlers: reduxDashPackLib.reduxDashPackMod.Handlers[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  ): TState = js.native
}

