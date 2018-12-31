package typings
package reduxDashPackLib.reduxDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  extends reduxLib.reduxMod.Action[js.Any] {
  // add optional error key to conform to FSA design: https://github.com/redux-utilities/flux-standard-action
  // note that users of this middleware (using our types) must conform to FSA shaped actions or code will not compile
  var error: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var meta: js.UndefOr[
    (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload
  ] = js.undefined
  var payload: js.UndefOr[TSuccessPayload | TErrorPayload | TStartPayload] = js.undefined
  var promise: js.UndefOr[js.Promise[TSuccessPayload]] = js.undefined
}

