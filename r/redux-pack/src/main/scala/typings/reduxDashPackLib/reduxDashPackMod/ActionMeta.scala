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

