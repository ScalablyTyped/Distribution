package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscriptionJSON extends js.Object {
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var expirationTime: js.UndefOr[Double | Null] = js.undefined
  var keys: js.UndefOr[Record[java.lang.String, java.lang.String]] = js.undefined
}

object PushSubscriptionJSON {
  @scala.inline
  def apply(
    endpoint: java.lang.String = null,
    expirationTime: js.UndefOr[Null | Double] = js.undefined,
    keys: Record[java.lang.String, java.lang.String] = null
  ): PushSubscriptionJSON = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationTime)) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscriptionJSON]
  }
}

