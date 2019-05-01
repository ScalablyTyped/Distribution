package typings
package promDashClientLib.promDashClientMod.HistogramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
  		 * Buckets used in the histogram
  		 */
  var buckets: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Config {
  @scala.inline
  def apply(buckets: js.Array[scala.Double] = null): Config = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    __obj.asInstanceOf[Config]
  }
}

