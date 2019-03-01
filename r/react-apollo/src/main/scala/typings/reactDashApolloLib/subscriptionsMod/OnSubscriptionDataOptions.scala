package typings
package reactDashApolloLib.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSubscriptionDataOptions[TData] extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.default[js.Object]
  var subscriptionData: SubscriptionResult[TData]
}

object OnSubscriptionDataOptions {
  @scala.inline
  def apply[TData](
    client: apolloDashClientLib.apolloDashClientMod.default[js.Object],
    subscriptionData: SubscriptionResult[TData]
  ): OnSubscriptionDataOptions[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("subscriptionData")(subscriptionData)
    __obj.asInstanceOf[OnSubscriptionDataOptions[TData]]
  }
}

