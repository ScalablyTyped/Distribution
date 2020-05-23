package typings.reactPanelgroup.mod

import typings.reactPanelgroup.reactPanelgroupStrings.column
import typings.reactPanelgroup.reactPanelgroupStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropTypes extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[row | column] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* data */ PanelWidth, Unit]] = js.undefined
  var panelColor: js.UndefOr[String] = js.undefined
  var panelWidths: js.UndefOr[js.Array[PanelWidth | Null]] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
}

object PropTypes {
  @scala.inline
  def apply(
    borderColor: String = null,
    direction: row | column = null,
    onUpdate: /* data */ PanelWidth => Unit = null,
    panelColor: String = null,
    panelWidths: js.Array[PanelWidth | Null] = null,
    spacing: js.UndefOr[Double] = js.undefined
  ): PropTypes = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (panelColor != null) __obj.updateDynamic("panelColor")(panelColor.asInstanceOf[js.Any])
    if (panelWidths != null) __obj.updateDynamic("panelWidths")(panelWidths.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropTypes]
  }
}

