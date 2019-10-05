package typings.reactDashSDashAlert.reactDashSDashAlertMod.SAlert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertStackProps extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
}

object SAlertStackProps {
  @scala.inline
  def apply(limit: Int | Double = null, spacing: Int | Double = null): SAlertStackProps = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertStackProps]
  }
}

