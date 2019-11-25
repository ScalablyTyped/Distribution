package typings.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsOpts extends js.Object {
  /**
  	 * Whether to include timestamps in the output, defaults to true
  	 */
  var timestamps: js.UndefOr[Boolean] = js.undefined
}

object MetricsOpts {
  @scala.inline
  def apply(timestamps: js.UndefOr[Boolean] = js.undefined): MetricsOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsOpts]
  }
}

