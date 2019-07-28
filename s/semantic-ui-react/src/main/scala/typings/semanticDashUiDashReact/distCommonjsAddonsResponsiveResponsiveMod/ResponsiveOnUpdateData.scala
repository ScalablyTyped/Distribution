package typings.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod

import typings.react.Event
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveOnUpdateData extends ResponsiveProps {
  var width: Double
}

object ResponsiveOnUpdateData {
  @scala.inline
  def apply(
    width: Double,
    as: js.Any = null,
    children: ReactNode = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: () => Double = null,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ ResponsiveOnUpdateData) => Unit = null
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

