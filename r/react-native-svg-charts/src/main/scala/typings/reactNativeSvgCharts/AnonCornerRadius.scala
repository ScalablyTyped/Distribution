package typings.reactNativeSvgCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCornerRadius extends js.Object {
  var cornerRadius: js.UndefOr[Double | String] = js.undefined
  var outerRadius: js.UndefOr[Double | String] = js.undefined
}

object AnonCornerRadius {
  @scala.inline
  def apply(cornerRadius: Double | String = null, outerRadius: Double | String = null): AnonCornerRadius = {
    val __obj = js.Dynamic.literal()
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCornerRadius]
  }
}

