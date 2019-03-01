package typings
package reactDashVerticalDashTimelineDashComponentLib.reactDashVerticalDashTimelineDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalTimelineProps extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[
    reactDashVerticalDashTimelineDashComponentLib.reactDashVerticalDashTimelineDashComponentLibStrings.`1-column` | reactDashVerticalDashTimelineDashComponentLib.reactDashVerticalDashTimelineDashComponentLibStrings.`2-columns`
  ] = js.undefined
}

object VerticalTimelineProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    layout: reactDashVerticalDashTimelineDashComponentLib.reactDashVerticalDashTimelineDashComponentLibStrings.`1-column` | reactDashVerticalDashTimelineDashComponentLib.reactDashVerticalDashTimelineDashComponentLibStrings.`2-columns` = null
  ): VerticalTimelineProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (className != null) __obj.updateDynamic("className")(className)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalTimelineProps]
  }
}

