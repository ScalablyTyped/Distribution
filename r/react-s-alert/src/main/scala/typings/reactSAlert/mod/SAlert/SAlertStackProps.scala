package typings.reactSAlert.mod.SAlert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertStackProps extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
}

object SAlertStackProps {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, spacing: js.UndefOr[Double] = js.undefined): SAlertStackProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertStackProps]
  }
}

