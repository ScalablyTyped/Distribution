package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* error */ TErrorPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.native
  var onFinish: js.UndefOr[js.Function2[/* resolved */ Boolean, /* getState */ GetState[TFullState], Unit]] = js.native
  var onStart: js.UndefOr[
    js.Function2[/* payload */ TStartPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.native
  var onSuccess: js.UndefOr[
    js.Function2[/* response */ TSuccessPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.native
  @JSName("redux-pack/LIFECYCLE")
  var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.native
  @JSName("redux-pack/TRANSACTION")
  var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.native
  var startPayload: js.UndefOr[TStartPayload] = js.native
}

object ActionMeta {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload](): ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
  }
  @scala.inline
  implicit class ActionMetaOps[Self <: ActionMeta[_, _, _, _], TFullState, TSuccessPayload, TErrorPayload, TStartPayload] (val x: Self with (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnFailure(value: (/* error */ TErrorPayload, /* getState */ GetState[TFullState]) => Unit): Self = this.set("onFailure", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnFinish(value: (/* resolved */ Boolean, /* getState */ GetState[TFullState]) => Unit): Self = this.set("onFinish", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    @scala.inline
    def setOnStart(value: (/* payload */ TStartPayload, /* getState */ GetState[TFullState]) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnSuccess(value: (/* response */ TSuccessPayload, /* getState */ GetState[TFullState]) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def `setRedux-packSlashLIFECYCLE`(value: LIFECYCLEValues): Self = this.set("redux-pack/LIFECYCLE", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRedux-packSlashLIFECYCLE`: Self = this.set("redux-pack/LIFECYCLE", js.undefined)
    @scala.inline
    def `setRedux-packSlashTRANSACTION`(value: String): Self = this.set("redux-pack/TRANSACTION", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRedux-packSlashTRANSACTION`: Self = this.set("redux-pack/TRANSACTION", js.undefined)
    @scala.inline
    def setStartPayload(value: TStartPayload): Self = this.set("startPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPayload: Self = this.set("startPayload", js.undefined)
  }
  
}

