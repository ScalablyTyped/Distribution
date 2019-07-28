package typings.reactDashApollo.mutationMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationState[TData] extends js.Object {
  var called: Boolean
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
}

object MutationState {
  @scala.inline
  def apply[TData](called: Boolean, loading: Boolean, data: TData = null, error: ApolloError = null): MutationState[TData] = {
    val __obj = js.Dynamic.literal(called = called, loading = loading)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MutationState[TData]]
  }
}

