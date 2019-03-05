package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscriptionJSON extends js.Object {
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var expirationTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var keys: js.UndefOr[Record[java.lang.String, java.lang.String]] = js.undefined
}

object PushSubscriptionJSON {
  @scala.inline
  def apply(
    endpoint: java.lang.String = null,
    expirationTime: scala.Int | scala.Double = null,
    keys: Record[java.lang.String, java.lang.String] = null
  ): PushSubscriptionJSON = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    __obj.asInstanceOf[PushSubscriptionJSON]
  }
}

