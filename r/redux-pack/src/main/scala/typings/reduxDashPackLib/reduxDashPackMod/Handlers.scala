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

