package typings.promDashClient.promDashClientMod.Histogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
  		 * Buckets used in the histogram
  		 */
  var buckets: js.UndefOr[js.Array[Double]] = js.undefined
}

object Config {
  @scala.inline
  def apply(buckets: js.Array[Double] = null): Config = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

