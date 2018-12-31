package typings
package reactDashApolloLib.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSubscriptionDataOptions[TData] extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.default[js.Object]
  var subscriptionData: SubscriptionResult[TData]
}

