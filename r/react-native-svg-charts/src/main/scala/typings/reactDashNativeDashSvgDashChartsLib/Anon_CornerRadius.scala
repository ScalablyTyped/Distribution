package typings
package reactDashNativeDashSvgDashChartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerRadius extends js.Object {
  var cornerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_CornerRadius {
  @scala.inline
  def apply(
    cornerRadius: scala.Double | java.lang.String = null,
    outerRadius: scala.Double | java.lang.String = null
  ): Anon_CornerRadius = {
    val __obj = js.Dynamic.literal()
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CornerRadius]
  }
}

