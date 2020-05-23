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
    timeToLive: js.UndefOr[Double] = js.undefined,
    update: js.UndefOr[Boolean] = js.undefined
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (includeLinkingObjects != null) __obj.updateDynamic("includeLinkingObjects")(includeLinkingObjects.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(timeToLive)) __obj.updateDynamic("timeToLive")(timeToLive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

