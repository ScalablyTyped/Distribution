package typings.reduxDashPack.reduxDashPackMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-pack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val middleware: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  def handle[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    state: TState,
    action: Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload],
    handlers: Handlers[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  ): TState = js.native
}

