package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectRow[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * You can assign the background color of row which be selected.
  	 * If your requirement is much complex, you can assign a function to bgColor that
  	 * returns a css color string.
  	 */
  var bgColor: js.UndefOr[
    java.lang.String | (js.Function2[/* row */ TRow, /* isSelect */ scala.Boolean, java.lang.String])
  ] = js.undefined
  /**
  	 * You can assign the class name of selected rows. This can either be a string, or a function that takes two
  	 * arguments: row and isSelect.
  	 *   `row`: The current row data.
  	 *   `isSelect`: Flag indicating whether this particular row is selected.
  	 */
  var className: js.UndefOr[
    java.lang.String | (js.Function2[/* row */ TRow, /* isSelect */ scala.Boolean, java.lang.String])
  ] = js.undefined
  /**
  	 * If true, clicking the row will trigger expanding the row. Default is false.
  	 */
  var clickToExpand: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If true, clicking the row will trigger selection on that row, default is false.
  	 */
  var clickToSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If true, clicking the row will trigger selection on that row and also trigger cell editing if you enabled cell edit. Default is false.
  	 */
  var clickToSelectAndEditCell: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * You can change the width of the selection column by columnWidth (include units).
  	 */
  var columnWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Function that returns a component to customize the display of the selection checkbox or radio button with.
  	 */
  var customComponent: js.UndefOr[
    js.Function1[/* props */ CustomSelectProps, java.lang.String | reactLib.reactMod.ReactElement]
  ] = js.undefined
  /**
  	 * If true, the radio/checkbox column will be hidden.
  	 * You can enable this attribute if you enable clickToSelect and you don't want to show the selection column.
  	 */
  var hideSelectColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specify whether the selection column uses single(radio) or multiple(checkbox) selection modes. Required.
  	 */
  var mode: SelectRowMode
  /**
  	 * Accept a custom callback function, if a row be selected or unselected, this function will be called.
  	 * This callback function takes four arguments: row, isSelected, event, and rowIndex:
  	 *   `row`: is the row data which you wanted to select or unselect.
  	 *   `isSelected`: it's a boolean value means "whether or not that row will be selected?".
  	 *   `event`: The event target object.
  	 *   `rowIndex`: the index number for the row.
  	 * If the return value of this (function) is false, the select or deselect action will not be applied.
  	 */
  var onSelect: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* isSelected */ scala.Boolean, 
      /* event */ js.Any, 
      /* rowIndex */ scala.Double, 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Accept a custom callback function, if click select all checkbox, this function will be called. This callback
  	 * function taking two arguments: isSelected, rows.
  	 * isSelectedis a boolean value which means "whether or not that row will be selected?".
  	 * rows is the rows which be selected or unselected.
  	 *
  	 * Tips:
  	 * If the return value of this function is false, the select all or deselect all action will not be applied.
  	 * If return value of this function is an array of rowkeys, this array will be applied as selection row when
  	 * select all triggers. It's useful when you have a validation to filter some rows on selecting all.
  	 */
  var onSelectAll: js.UndefOr[
    js.Function2[
      /* isSelected */ scala.Boolean, 
      /* rows */ js.Array[TRow], 
      scala.Boolean | (js.Array[scala.Double | java.lang.String])
    ]
  ] = js.undefined
  /**
  	 * Only unselect visible rows.
  	 */
  var onlyUnselectVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Give an array data to perform which rows you want to be selected when table loading.
  	 * The content of array should be the rowkeys for the rows that you want to be selected.
  	 */
  var selected: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  /**
  	 * Default is false, if enabled, there will be a button on top of table for toggling selected rows only.
  	 */
  var showOnlySelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Provide a list of unselectable row keys.
  	 */
  var unselectable: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
}

object SelectRow {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    mode: SelectRowMode,
    bgColor: java.lang.String | (js.Function2[/* row */ TRow, /* isSelect */ scala.Boolean, java.lang.String]) = null,
    className: java.lang.String | (js.Function2[/* row */ TRow, /* isSelect */ scala.Boolean, java.lang.String]) = null,
    clickToExpand: js.UndefOr[scala.Boolean] = js.undefined,
    clickToSelect: js.UndefOr[scala.Boolean] = js.undefined,
    clickToSelectAndEditCell: js.UndefOr[scala.Boolean] = js.undefined,
    columnWidth: java.lang.String = null,
    customComponent: /* props */ CustomSelectProps => java.lang.String | reactLib.reactMod.ReactElement = null,
    hideSelectColumn: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: (/* row */ TRow, /* isSelected */ scala.Boolean, /* event */ js.Any, /* rowIndex */ scala.Double) => scala.Boolean | scala.Unit = null,
    onSelectAll: (/* isSelected */ scala.Boolean, /* rows */ js.Array[TRow]) => scala.Boolean | (js.Array[scala.Double | java.lang.String]) = null,
    onlyUnselectVisible: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.Array[scala.Double | java.lang.String] = null,
    showOnlySelected: js.UndefOr[scala.Boolean] = js.undefined,
    unselectable: js.Array[scala.Double | java.lang.String] = null
  ): SelectRow[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToExpand)) __obj.updateDynamic("clickToExpand")(clickToExpand)
    if (!js.isUndefined(clickToSelect)) __obj.updateDynamic("clickToSelect")(clickToSelect)
    if (!js.isUndefined(clickToSelectAndEditCell)) __obj.updateDynamic("clickToSelectAndEditCell")(clickToSelectAndEditCell)
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth)
    if (customComponent != null) __obj.updateDynamic("customComponent")(js.Any.fromFunction1(customComponent))
    if (!js.isUndefined(hideSelectColumn)) __obj.updateDynamic("hideSelectColumn")(hideSelectColumn)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction4(onSelect))
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction2(onSelectAll))
    if (!js.isUndefined(onlyUnselectVisible)) __obj.updateDynamic("onlyUnselectVisible")(onlyUnselectVisible)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showOnlySelected)) __obj.updateDynamic("showOnlySelected")(showOnlySelected)
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable)
    __obj.asInstanceOf[SelectRow[TRow]]
  }
}

