package typings.reduxDashPack.reduxDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  extends typings.redux.reduxMod.Action[js.Any] {
  // add optional error key to conform to FSA design: https://github.com/redux-utilities/flux-standard-action
  // note that users of this middleware (using our types) must conform to FSA shaped actions or code will not compile
  var error: js.UndefOr[Boolean | Null] = js.undefined
  var meta: js.UndefOr[
    (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload
  ] = js.undefined
  var payload: js.UndefOr[TSuccessPayload | TErrorPayload | TStartPayload] = js.undefined
  var promise: js.UndefOr[js.Promise[TSuccessPayload]] = js.undefined
}

object Action {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    `type`: js.Any,
    error: js.UndefOr[Boolean] = js.undefined,
    meta: (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload = null,
    payload: TSuccessPayload | TErrorPayload | TStartPayload = null,
    promise: js.Promise[TSuccessPayload] = null
  ): Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
}

