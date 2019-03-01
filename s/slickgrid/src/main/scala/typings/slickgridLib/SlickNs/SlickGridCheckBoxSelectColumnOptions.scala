package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlickGridCheckBoxSelectColumnOptions extends PluginOptions {
  /**
    * Column to add the checkbox to
    * @default "_checkbox_selector"
    */
  var columnId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS class to be added to cells in this column
    * @default null
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tooltip text to display for this column
    * @default "Select/Deselect All"
    */
  var toolTip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of the column
    * @default 30
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SlickGridCheckBoxSelectColumnOptions {
  @scala.inline
  def apply(
    columnId: java.lang.String = null,
    cssClass: java.lang.String = null,
    toolTip: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): SlickGridCheckBoxSelectColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlickGridCheckBoxSelectColumnOptions]
  }
}

