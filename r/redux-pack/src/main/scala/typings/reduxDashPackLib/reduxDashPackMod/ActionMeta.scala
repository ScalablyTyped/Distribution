package typings
package reduxDashPackLib.reduxDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* error */ TErrorPayload, /* getState */ GetState[TFullState], scala.Unit]
  ] = js.undefined
  var onFinish: js.UndefOr[
    js.Function2[/* resolved */ scala.Boolean, /* getState */ GetState[TFullState], scala.Unit]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function2[/* payload */ TStartPayload, /* getState */ GetState[TFullState], scala.Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* response */ TSuccessPayload, /* getState */ GetState[TFullState], scala.Unit]
  ] = js.undefined
  var startPayload: js.UndefOr[TStartPayload] = js.undefined
}

object ActionMeta {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload](
    onFailure: js.Function2[/* error */ TErrorPayload, /* getState */ GetState[TFullState], scala.Unit] = null,
    onFinish: js.Function2[/* resolved */ scala.Boolean, /* getState */ GetState[TFullState], scala.Unit] = null,
    onStart: js.Function2[/* payload */ TStartPayload, /* getState */ GetState[TFullState], scala.Unit] = null,
    onSuccess: js.Function2[/* response */ TSuccessPayload, /* getState */ GetState[TFullState], scala.Unit] = null,
    startPayload: TStartPayload = null
  ): ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onFinish != null) __obj.updateDynamic("onFinish")(onFinish)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (startPayload != null) __obj.updateDynamic("startPayload")(startPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
  }
}

