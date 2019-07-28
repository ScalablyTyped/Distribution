package typings.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveWidthShorthand extends js.Object {
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
}

object ResponsiveWidthShorthand {
  @scala.inline
  def apply(maxWidth: Double | String = null, minWidth: Double | String = null): ResponsiveWidthShorthand = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveWidthShorthand]
  }
}

