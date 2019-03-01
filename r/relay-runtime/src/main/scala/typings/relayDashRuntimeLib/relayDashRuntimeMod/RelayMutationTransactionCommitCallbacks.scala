package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayMutationTransactionCommitCallbacks extends js.Object {
  var onFailure: js.UndefOr[RelayMutationTransactionCommitFailureCallback] = js.undefined
  var onSuccess: js.UndefOr[RelayMutationTransactionCommitSuccessCallback] = js.undefined
}

object RelayMutationTransactionCommitCallbacks {
  @scala.inline
  def apply(
    onFailure: RelayMutationTransactionCommitFailureCallback = null,
    onSuccess: RelayMutationTransactionCommitSuccessCallback = null
  ): RelayMutationTransactionCommitCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[RelayMutationTransactionCommitCallbacks]
  }
}

