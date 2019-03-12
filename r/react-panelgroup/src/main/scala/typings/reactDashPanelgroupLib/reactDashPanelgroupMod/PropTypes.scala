package typings
package reactDashPanelgroupLib.reactDashPanelgroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropTypes extends js.Object {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[
    reactDashPanelgroupLib.reactDashPanelgroupLibStrings.row | reactDashPanelgroupLib.reactDashPanelgroupLibStrings.column
  ] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* data */ PanelWidth, scala.Unit]] = js.undefined
  var panelColor: js.UndefOr[java.lang.String] = js.undefined
  var panelWidths: js.UndefOr[js.Array[PanelWidth | scala.Null]] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
}

object PropTypes {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    direction: reactDashPanelgroupLib.reactDashPanelgroupLibStrings.row | reactDashPanelgroupLib.reactDashPanelgroupLibStrings.column = null,
    onUpdate: /* data */ PanelWidth => scala.Unit = null,
    panelColor: java.lang.String = null,
    panelWidths: js.Array[PanelWidth | scala.Null] = null,
    spacing: scala.Int | scala.Double = null
  ): PropTypes = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (panelColor != null) __obj.updateDynamic("panelColor")(panelColor)
    if (panelWidths != null) __obj.updateDynamic("panelWidths")(panelWidths)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropTypes]
  }
}

