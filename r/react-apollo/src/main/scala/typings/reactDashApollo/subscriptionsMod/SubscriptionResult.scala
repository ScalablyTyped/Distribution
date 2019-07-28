package typings.reactDashApollo.subscriptionsMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionResult[TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
}

object SubscriptionResult {
  @scala.inline
  def apply[TData](loading: Boolean, data: TData = null, error: ApolloError = null): SubscriptionResult[TData] = {
    val __obj = js.Dynamic.literal(loading = loading)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[SubscriptionResult[TData]]
  }
}

