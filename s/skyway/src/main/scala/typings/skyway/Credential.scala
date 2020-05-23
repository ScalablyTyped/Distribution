package typings.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  var authToken: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object Credential {
  @scala.inline
  def apply(
    authToken: String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined
  ): Credential = {
    val __obj = js.Dynamic.literal()
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
}

