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
  var `redux-pack/LIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.undefined
  var `redux-pack/TRANSACTION`: js.UndefOr[java.lang.String] = js.undefined
  var startPayload: js.UndefOr[TStartPayload] = js.undefined
}

object ActionMeta {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload](
    onFailure: (/* error */ TErrorPayload, /* getState */ GetState[TFullState]) => scala.Unit = null,
    onFinish: (/* resolved */ scala.Boolean, /* getState */ GetState[TFullState]) => scala.Unit = null,
    onStart: (/* payload */ TStartPayload, /* getState */ GetState[TFullState]) => scala.Unit = null,
    onSuccess: (/* response */ TSuccessPayload, /* getState */ GetState[TFullState]) => scala.Unit = null,
    `redux-pack/LIFECYCLE`: LIFECYCLEValues = null,
    `redux-pack/TRANSACTION`: java.lang.String = null,
    startPayload: TStartPayload = null
  ): ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction2(onFinish))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    if (`redux-pack/LIFECYCLE` != null) __obj.updateDynamic("redux-pack/LIFECYCLE")(`redux-pack/LIFECYCLE`)
    if (`redux-pack/TRANSACTION` != null) __obj.updateDynamic("redux-pack/TRANSACTION")(`redux-pack/TRANSACTION`)
    if (startPayload != null) __obj.updateDynamic("startPayload")(startPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
  }
}

