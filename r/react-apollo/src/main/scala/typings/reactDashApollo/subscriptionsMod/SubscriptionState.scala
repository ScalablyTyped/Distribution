package typings.reactDashApollo.subscriptionsMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionState[TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
}

object SubscriptionState {
  @scala.inline
  def apply[TData](loading: Boolean, data: TData = null, error: ApolloError = null): SubscriptionState[TData] = {
    val __obj = js.Dynamic.literal(loading = loading)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[SubscriptionState[TData]]
  }
}

