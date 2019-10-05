package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var includeLinkingObjects: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var timeToLive: js.UndefOr[Double] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(
    includeLinkingObjects: js.Array[String] = null,
    name: String = null,
    timeToLive: Int | Double = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (includeLinkingObjects != null) __obj.updateDynamic("includeLinkingObjects")(includeLinkingObjects)
    if (name != null) __obj.updateDynamic("name")(name)
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

