package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  extends typings.redux.mod.Action[js.Any] {
  // add optional error key to conform to FSA design: https://github.com/redux-utilities/flux-standard-action
  // note that users of this middleware (using our types) must conform to FSA shaped actions or code will not compile
  var error: js.UndefOr[Boolean | Null] = js.native
  var meta: js.UndefOr[
    (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload
  ] = js.native
  var payload: js.UndefOr[TSuccessPayload | TErrorPayload | TStartPayload] = js.native
  var promise: js.UndefOr[js.Promise[TSuccessPayload]] = js.native
}

object Action {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](`type`: js.Any): Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action[_, _, _, _, _], TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] (val x: Self with (Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload])) extends AnyVal {
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
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    @scala.inline
    def setMeta(value: (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setPayload(value: TSuccessPayload | TErrorPayload | TStartPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPromise(value: js.Promise[TSuccessPayload]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
  }
  
}

