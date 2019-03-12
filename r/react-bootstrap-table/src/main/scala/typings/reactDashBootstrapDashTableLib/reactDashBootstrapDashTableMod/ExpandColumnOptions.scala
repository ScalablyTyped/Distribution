package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandColumnOptions extends js.Object {
  /**
  	 * set the width of indicator column.
  	 */
  var columnWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * If both an indicator column and a selection column are displaying, this specifies whether the indicator column
  	 * should be shown first. Default is true, false will move the expand indicator column after selection column.
  	 */
  var expandColumnBeforeSelectColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * a callback function to customize the appearance of the indicator column.
  	 */
  var expandColumnComponent: js.UndefOr[
    js.Function1[
      /* props */ ExpandColumnComponentProps, 
      java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Will enable an indicator column at first column if true. Default is false.
  	 */
  var expandColumnVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * a callback function to customise the header column
  	 */
  var expandedColumnHeaderComponent: js.UndefOr[
    js.Function1[
      /* props */ ExpandedColumnHeaderProps, 
      java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
}

object ExpandColumnOptions {
  @scala.inline
  def apply(
    columnWidth: scala.Double | java.lang.String = null,
    expandColumnBeforeSelectColumn: js.UndefOr[scala.Boolean] = js.undefined,
    expandColumnComponent: /* props */ ExpandColumnComponentProps => java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    expandColumnVisible: js.UndefOr[scala.Boolean] = js.undefined,
    expandedColumnHeaderComponent: /* props */ ExpandedColumnHeaderProps => java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): ExpandColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(expandColumnBeforeSelectColumn)) __obj.updateDynamic("expandColumnBeforeSelectColumn")(expandColumnBeforeSelectColumn)
    if (expandColumnComponent != null) __obj.updateDynamic("expandColumnComponent")(js.Any.fromFunction1(expandColumnComponent))
    if (!js.isUndefined(expandColumnVisible)) __obj.updateDynamic("expandColumnVisible")(expandColumnVisible)
    if (expandedColumnHeaderComponent != null) __obj.updateDynamic("expandedColumnHeaderComponent")(js.Any.fromFunction1(expandedColumnHeaderComponent))
    __obj.asInstanceOf[ExpandColumnOptions]
  }
}

