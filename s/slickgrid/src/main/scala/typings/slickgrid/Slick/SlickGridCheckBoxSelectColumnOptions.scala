package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlickGridCheckBoxSelectColumnOptions extends PluginOptions {
  /**
    * Column to add the checkbox to
    * @default "_checkbox_selector"
    */
  var columnId: js.UndefOr[String] = js.undefined
  /**
    * CSS class to be added to cells in this column
    * @default null
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /**
    * Tooltip text to display for this column
    * @default "Select/Deselect All"
    */
  var toolTip: js.UndefOr[String] = js.undefined
  /**
    * Width of the column
    * @default 30
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SlickGridCheckBoxSelectColumnOptions {
  @scala.inline
  def apply(
    columnId: String = null,
    cssClass: String = null,
    toolTip: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SlickGridCheckBoxSelectColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlickGridCheckBoxSelectColumnOptions]
  }
}

