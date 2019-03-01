package typings
package reactDashSDashAlertLib.reactDashSDashAlertMod.SAlertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertStackProps extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
}

object SAlertStackProps {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, spacing: scala.Int | scala.Double = null): SAlertStackProps = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertStackProps]
  }
}

