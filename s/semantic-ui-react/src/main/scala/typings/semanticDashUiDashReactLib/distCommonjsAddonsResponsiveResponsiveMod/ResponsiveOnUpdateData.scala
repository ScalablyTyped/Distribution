package typings
package semanticDashUiDashReactLib.distCommonjsAddonsResponsiveResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveOnUpdateData extends ResponsiveProps {
  var width: scala.Double
}

object ResponsiveOnUpdateData {
  @scala.inline
  def apply(
    width: scala.Double,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    fireOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    getWidth: () => scala.Double = null,
    maxWidth: scala.Double | java.lang.String = null,
    minWidth: scala.Double | java.lang.String = null,
    onUpdate: (/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLElement, reactLib.Event], /* data */ ResponsiveOnUpdateData) => scala.Unit = null
  ): ResponsiveOnUpdateData = {
    val __obj = js.Dynamic.literal(width = width)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount)
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    __obj.asInstanceOf[ResponsiveOnUpdateData]
  }
}

