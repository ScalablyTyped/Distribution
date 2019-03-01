package typings
package reactDashApolloLib.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionContext extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
}

object SubscriptionContext {
  @scala.inline
  def apply(client: apolloDashClientLib.apolloDashClientMod.default[js.Object] = null): SubscriptionContext = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[SubscriptionContext]
  }
}

