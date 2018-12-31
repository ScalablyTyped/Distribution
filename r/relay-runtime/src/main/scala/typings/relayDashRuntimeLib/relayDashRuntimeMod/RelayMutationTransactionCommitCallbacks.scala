package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayMutationTransactionCommitCallbacks extends js.Object {
  var onFailure: js.UndefOr[RelayMutationTransactionCommitFailureCallback] = js.undefined
  var onSuccess: js.UndefOr[RelayMutationTransactionCommitSuccessCallback] = js.undefined
}

