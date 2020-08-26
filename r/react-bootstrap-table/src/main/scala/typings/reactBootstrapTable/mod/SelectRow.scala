package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectRow[TRow /* <: js.Object */] extends js.Object {
  /**
    * You can assign the background color of row which be selected.
    * If your requirement is much complex, you can assign a function to bgColor that
    * returns a css color string.
    */
  var bgColor: js.UndefOr[String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])] = js.native
  /**
    * You can assign the class name of selected rows. This can either be a string, or a function that takes two
    * arguments: row and isSelect.
    *   `row`: The current row data.
    *   `isSelect`: Flag indicating whether this particular row is selected.
    */
  var className: js.UndefOr[String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])] = js.native
  /**
    * If true, clicking the row will trigger expanding the row. Default is false.
    */
  var clickToExpand: js.UndefOr[Boolean] = js.native
  /**
    * If true, clicking the row will trigger selection on that row, default is false.
    */
  var clickToSelect: js.UndefOr[Boolean] = js.native
  /**
    * If true, clicking the row will trigger selection on that row and also trigger cell editing if you enabled cell edit. Default is false.
    */
  var clickToSelectAndEditCell: js.UndefOr[Boolean] = js.native
  /**
    * You can change the width of the selection column by columnWidth (include units).
    */
  var columnWidth: js.UndefOr[String] = js.native
  /**
    * Function that returns a component to customize the display of the selection checkbox or radio button with.
    */
  var customComponent: js.UndefOr[js.Function1[/* props */ CustomSelectProps, String | ReactElement]] = js.native
  /**
    * If true, the radio/checkbox column will be hidden.
    * You can enable this attribute if you enable clickToSelect and you don't want to show the selection column.
    */
  var hideSelectColumn: js.UndefOr[Boolean] = js.native
  /**
    * Specify whether the selection column uses single(radio) or multiple(checkbox) selection modes. Required.
    */
  var mode: SelectRowMode = js.native
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
      /* isSelected */ Boolean, 
      /* event */ js.Any, 
      /* rowIndex */ Double, 
      Boolean | Unit
    ]
  ] = js.native
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
      /* isSelected */ Boolean, 
      /* rows */ js.Array[TRow], 
      Boolean | (js.Array[Double | String])
    ]
  ] = js.native
  /**
    * Only unselect visible rows.
    */
  var onlyUnselectVisible: js.UndefOr[Boolean] = js.native
  /**
    * Give an array data to perform which rows you want to be selected when table loading.
    * The content of array should be the rowkeys for the rows that you want to be selected.
    */
  var selected: js.UndefOr[js.Array[Double | String]] = js.native
  /**
    * Default is false, if enabled, there will be a button on top of table for toggling selected rows only.
    */
  var showOnlySelected: js.UndefOr[Boolean] = js.native
  /**
    * Provide a list of unselectable row keys.
    */
  var unselectable: js.UndefOr[js.Array[Double | String]] = js.native
}

object SelectRow {
  @scala.inline
  def apply[/* <: js.Object */ TRow](mode: SelectRowMode): SelectRow[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRow[TRow]]
  }
  @scala.inline
  implicit class SelectRowOps[Self <: SelectRow[_], /* <: js.Object */ TRow] (val x: Self with SelectRow[TRow]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMode(value: SelectRowMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgColorFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self = this.set("bgColor", js.Any.fromFunction2(value))
    @scala.inline
    def setBgColor(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setClassNameFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self = this.set("className", js.Any.fromFunction2(value))
    @scala.inline
    def setClassName(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClickToExpand(value: Boolean): Self = this.set("clickToExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToExpand: Self = this.set("clickToExpand", js.undefined)
    @scala.inline
    def setClickToSelect(value: Boolean): Self = this.set("clickToSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToSelect: Self = this.set("clickToSelect", js.undefined)
    @scala.inline
    def setClickToSelectAndEditCell(value: Boolean): Self = this.set("clickToSelectAndEditCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToSelectAndEditCell: Self = this.set("clickToSelectAndEditCell", js.undefined)
    @scala.inline
    def setColumnWidth(value: String): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setCustomComponent(value: /* props */ CustomSelectProps => String | ReactElement): Self = this.set("customComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomComponent: Self = this.set("customComponent", js.undefined)
    @scala.inline
    def setHideSelectColumn(value: Boolean): Self = this.set("hideSelectColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSelectColumn: Self = this.set("hideSelectColumn", js.undefined)
    @scala.inline
    def setOnSelect(
      value: (/* row */ TRow, /* isSelected */ Boolean, /* event */ js.Any, /* rowIndex */ Double) => Boolean | Unit
    ): Self = this.set("onSelect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectAll(
      value: (/* isSelected */ Boolean, /* rows */ js.Array[TRow]) => Boolean | (js.Array[Double | String])
    ): Self = this.set("onSelectAll", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelectAll: Self = this.set("onSelectAll", js.undefined)
    @scala.inline
    def setOnlyUnselectVisible(value: Boolean): Self = this.set("onlyUnselectVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyUnselectVisible: Self = this.set("onlyUnselectVisible", js.undefined)
    @scala.inline
    def setSelectedVarargs(value: (Double | String)*): Self = this.set("selected", js.Array(value :_*))
    @scala.inline
    def setSelected(value: js.Array[Double | String]): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShowOnlySelected(value: Boolean): Self = this.set("showOnlySelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnlySelected: Self = this.set("showOnlySelected", js.undefined)
    @scala.inline
    def setUnselectableVarargs(value: (Double | String)*): Self = this.set("unselectable", js.Array(value :_*))
    @scala.inline
    def setUnselectable(value: js.Array[Double | String]): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
  }
  
}

