package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var name: java.lang.String
  var timeToLive: scala.Double
  var update: js.UndefOr[scala.Boolean] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(name: java.lang.String, timeToLive: scala.Double, update: js.UndefOr[scala.Boolean] = js.undefined): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(name = name, timeToLive = timeToLive)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

