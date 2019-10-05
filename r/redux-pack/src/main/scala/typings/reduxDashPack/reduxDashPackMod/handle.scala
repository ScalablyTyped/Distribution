package typings.reduxDashPack.reduxDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-pack", "handle")
@js.native
object handle extends js.Object {
  def apply[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    state: TState,
    action: Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload],
    handlers: Handlers[TState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  ): TState = js.native
}

