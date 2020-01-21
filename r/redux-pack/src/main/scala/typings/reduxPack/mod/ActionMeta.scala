package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* error */ TErrorPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.undefined
  var onFinish: js.UndefOr[js.Function2[/* resolved */ Boolean, /* getState */ GetState[TFullState], Unit]] = js.undefined
  var onStart: js.UndefOr[
    js.Function2[/* payload */ TStartPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* response */ TSuccessPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.undefined
  @JSName("redux-pack/LIFECYCLE")
  var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.undefined
  @JSName("redux-pack/TRANSACTION")
  var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.undefined
  var startPayload: js.UndefOr[TStartPayload] = js.undefined
}

object ActionMeta {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload](
    onFailure: (/* error */ TErrorPayload, /* getState */ GetState[TFullState]) => Unit = null,
    onFinish: (/* resolved */ Boolean, /* getState */ GetState[TFullState]) => Unit = null,
    onStart: (/* payload */ TStartPayload, /* getState */ GetState[TFullState]) => Unit = null,
    onSuccess: (/* response */ TSuccessPayload, /* getState */ GetState[TFullState]) => Unit = null,
    `redux-packSlashLIFECYCLE`: LIFECYCLEValues = null,
    `redux-packSlashTRANSACTION`: String = null,
    startPayload: TStartPayload = null
  ): ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction2(onFinish))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    if (`redux-packSlashLIFECYCLE` != null) __obj.updateDynamic("redux-pack/LIFECYCLE")(`redux-packSlashLIFECYCLE`.asInstanceOf[js.Any])
    if (`redux-packSlashTRANSACTION` != null) __obj.updateDynamic("redux-pack/TRANSACTION")(`redux-packSlashTRANSACTION`.asInstanceOf[js.Any])
    if (startPayload != null) __obj.updateDynamic("startPayload")(startPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
  }
}

