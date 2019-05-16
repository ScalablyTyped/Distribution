package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var includeLinkingObjects: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var timeToLive: js.UndefOr[scala.Double] = js.undefined
  var update: js.UndefOr[scala.Boolean] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(
    includeLinkingObjects: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    timeToLive: scala.Int | scala.Double = null,
    update: js.UndefOr[scala.Boolean] = js.undefined
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (includeLinkingObjects != null) __obj.updateDynamic("includeLinkingObjects")(includeLinkingObjects)
    if (name != null) __obj.updateDynamic("name")(name)
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

