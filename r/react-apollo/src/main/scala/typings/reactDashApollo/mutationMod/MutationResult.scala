package typings.reactDashApollo.mutationMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult[TData] extends js.Object {
  var called: Boolean
  var client: typings.apolloDashClient.apolloDashClientMod.default[js.Object]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
}

object MutationResult {
  @scala.inline
  def apply[TData](
    called: Boolean,
    client: typings.apolloDashClient.apolloDashClientMod.default[js.Object],
    loading: Boolean,
    data: TData = null,
    error: ApolloError = null
  ): MutationResult[TData] = {
    val __obj = js.Dynamic.literal(called = called, client = client, loading = loading)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MutationResult[TData]]
  }
}

