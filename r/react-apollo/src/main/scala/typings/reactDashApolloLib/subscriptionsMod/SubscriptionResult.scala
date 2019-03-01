package typings
package reactDashApolloLib.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionResult[TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.undefined
  var loading: scala.Boolean
}

object SubscriptionResult {
  @scala.inline
  def apply[TData](
    loading: scala.Boolean,
    data: TData = null,
    error: apolloDashClientLib.apolloDashClientMod.ApolloError = null
  ): SubscriptionResult[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[SubscriptionResult[TData]]
  }
}

