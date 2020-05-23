package typings.reactNativeSvgCharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CornerRadius extends js.Object {
  var cornerRadius: js.UndefOr[Double | String] = js.undefined
  var outerRadius: js.UndefOr[Double | String] = js.undefined
}

object CornerRadius {
  @scala.inline
  def apply(cornerRadius: Double | String = null, outerRadius: Double | String = null): CornerRadius = {
    val __obj = js.Dynamic.literal()
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerRadius]
  }
}

