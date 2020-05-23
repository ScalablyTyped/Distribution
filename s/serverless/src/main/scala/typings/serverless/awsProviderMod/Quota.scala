package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quota extends js.Object {
  var limit: js.UndefOr[Double | String] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var period: js.UndefOr[String] = js.undefined
}

object Quota {
  @scala.inline
  def apply(limit: Double | String = null, offset: Double | String = null, period: String = null): Quota = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quota]
  }
}

