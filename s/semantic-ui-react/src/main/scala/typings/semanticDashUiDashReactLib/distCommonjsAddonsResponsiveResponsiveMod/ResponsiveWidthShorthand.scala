package typings
package semanticDashUiDashReactLib.distCommonjsAddonsResponsiveResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveWidthShorthand extends js.Object {
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ResponsiveWidthShorthand {
  @scala.inline
  def apply(maxWidth: scala.Double | java.lang.String = null, minWidth: scala.Double | java.lang.String = null): ResponsiveWidthShorthand = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveWidthShorthand]
  }
}

