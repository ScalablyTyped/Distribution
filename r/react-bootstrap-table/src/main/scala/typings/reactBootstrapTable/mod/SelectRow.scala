package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectRow[TRow /* <: js.Object */] extends StObject {
  
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
  def apply[TRow /* <: js.Object */](mode: SelectRowMode): SelectRow[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRow[TRow]]
  }
  
  @scala.inline
  implicit class SelectRowMutableBuilder[Self <: SelectRow[_], TRow /* <: js.Object */] (val x: Self with SelectRow[TRow]) extends AnyVal {
    
    @scala.inline
    def setBgColor(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self = StObject.set(x, "bgColor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setClassName(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self = StObject.set(x, "className", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClickToExpand(value: Boolean): Self = StObject.set(x, "clickToExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToExpandUndefined: Self = StObject.set(x, "clickToExpand", js.undefined)
    
    @scala.inline
    def setClickToSelect(value: Boolean): Self = StObject.set(x, "clickToSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToSelectAndEditCell(value: Boolean): Self = StObject.set(x, "clickToSelectAndEditCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToSelectAndEditCellUndefined: Self = StObject.set(x, "clickToSelectAndEditCell", js.undefined)
    
    @scala.inline
    def setClickToSelectUndefined: Self = StObject.set(x, "clickToSelect", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setCustomComponent(value: /* props */ CustomSelectProps => String | ReactElement): Self = StObject.set(x, "customComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomComponentUndefined: Self = StObject.set(x, "customComponent", js.undefined)
    
    @scala.inline
    def setHideSelectColumn(value: Boolean): Self = StObject.set(x, "hideSelectColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSelectColumnUndefined: Self = StObject.set(x, "hideSelectColumn", js.undefined)
    
    @scala.inline
    def setMode(value: SelectRowMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelect(
      value: (/* row */ TRow, /* isSelected */ Boolean, /* event */ js.Any, /* rowIndex */ Double) => Boolean | Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnSelectAll(
      value: (/* isSelected */ Boolean, /* rows */ js.Array[TRow]) => Boolean | (js.Array[Double | String])
    ): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnlyUnselectVisible(value: Boolean): Self = StObject.set(x, "onlyUnselectVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyUnselectVisibleUndefined: Self = StObject.set(x, "onlyUnselectVisible", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Array[Double | String]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: (Double | String)*): Self = StObject.set(x, "selected", js.Array(value :_*))
    
    @scala.inline
    def setShowOnlySelected(value: Boolean): Self = StObject.set(x, "showOnlySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnlySelectedUndefined: Self = StObject.set(x, "showOnlySelected", js.undefined)
    
    @scala.inline
    def setUnselectable(value: js.Array[Double | String]): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    @scala.inline
    def setUnselectableVarargs(value: (Double | String)*): Self = StObject.set(x, "unselectable", js.Array(value :_*))
  }
}
