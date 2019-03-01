package typings
package reduxDashPackLib.reduxDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] extends js.Object {
  var always: js.UndefOr[handlerReducer[S, reduxLib.reduxMod.Action[_]]] = js.undefined
  var failure: js.UndefOr[handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]]] = js.undefined
  var finish: js.UndefOr[handlerReducer[S, reduxLib.reduxMod.Action[_]]] = js.undefined
  var start: js.UndefOr[handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]]] = js.undefined
  var success: js.UndefOr[handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]]] = js.undefined
}

object Handlers {
  @scala.inline
  def apply[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](
    always: handlerReducer[S, reduxLib.reduxMod.Action[_]] = null,
    failure: handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]] = null,
    finish: handlerReducer[S, reduxLib.reduxMod.Action[_]] = null,
    start: handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]] = null,
    success: handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]] = null
  ): Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    if (always != null) __obj.updateDynamic("always")(always)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (finish != null) __obj.updateDynamic("finish")(finish)
    if (start != null) __obj.updateDynamic("start")(start)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
}

