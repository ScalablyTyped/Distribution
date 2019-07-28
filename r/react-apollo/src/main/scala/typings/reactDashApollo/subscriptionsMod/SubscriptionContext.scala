package typings.reactDashApollo.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionContext extends js.Object {
  var client: js.UndefOr[typings.apolloDashClient.apolloDashClientMod.default[js.Object]] = js.undefined
}

object SubscriptionContext {
  @scala.inline
  def apply(client: typings.apolloDashClient.apolloDashClientMod.default[js.Object] = null): SubscriptionContext = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[SubscriptionContext]
  }
}

