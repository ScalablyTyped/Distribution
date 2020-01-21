package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] extends js.Object {
  var always: js.UndefOr[handlerReducer[S, typings.redux.mod.Action[_]]] = js.undefined
  var failure: js.UndefOr[handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]]] = js.undefined
  var finish: js.UndefOr[handlerReducer[S, typings.redux.mod.Action[_]]] = js.undefined
  var start: js.UndefOr[handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]]] = js.undefined
  var success: js.UndefOr[handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]]] = js.undefined
}

object Handlers {
  @scala.inline
  def apply[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    always: (S, typings.redux.mod.Action[_]) => S = null,
    failure: (S, PackActionPayload[TErrorPayload, TMetaPayload]) => S = null,
    finish: (S, typings.redux.mod.Action[_]) => S = null,
    start: (S, PackActionPayload[TStartPayload, TMetaPayload]) => S = null,
    success: (S, PackActionPayload[TSuccessPayload, TMetaPayload]) => S = null
  ): Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    if (always != null) __obj.updateDynamic("always")(js.Any.fromFunction2(always))
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction2(failure))
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction2(finish))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    __obj.asInstanceOf[Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
}

