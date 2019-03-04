package typings
package reactDashApolloLib.mutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult[TData] extends js.Object {
  var called: scala.Boolean
  var client: apolloDashClientLib.apolloDashClientMod.default[js.Object]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.undefined
  var loading: scala.Boolean
}

object MutationResult {
  @scala.inline
  def apply[TData](
    called: scala.Boolean,
    client: apolloDashClientLib.apolloDashClientMod.default[js.Object],
    loading: scala.Boolean,
    data: TData = null,
    error: apolloDashClientLib.apolloDashClientMod.ApolloError = null
  ): MutationResult[TData] = {
    val __obj = js.Dynamic.literal(called = called, client = client, loading = loading)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MutationResult[TData]]
  }
}

