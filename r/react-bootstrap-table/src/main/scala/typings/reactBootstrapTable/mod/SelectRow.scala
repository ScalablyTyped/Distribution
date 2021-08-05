package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectRow[TRow /* <: js.Object */] extends StObject {
  
  /**
    * You can assign the background color of row which be selected.
    * If your requirement is much complex, you can assign a function to bgColor that
    * returns a css color string.
    */
  var bgColor: js.UndefOr[String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])] = js.undefined
  
  /**
    * You can assign the class name of selected rows. This can either be a string, or a function that takes two
    * arguments: row and isSelect.
    *   `row`: The current row data.
    *   `isSelect`: Flag indicating whether this particular row is selected.
    */
  var className: js.UndefOr[String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])] = js.undefined
  
  /**
    * If true, clicking the row will trigger expanding the row. Default is false.
    */
  var clickToExpand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, clicking the row will trigger selection on that row, default is false.
    */
  var clickToSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, clicking the row will trigger selection on that row and also trigger cell editing if you enabled cell edit. Default is false.
    */
  var clickToSelectAndEditCell: js.UndefOr[Boolean] = js.undefined
  
  /**
    * You can change the width of the selection column by columnWidth (include units).
    */
  var columnWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Function that returns a component to customize the display of the selection checkbox or radio button with.
    */
  var customComponent: js.UndefOr[js.Function1[/* props */ CustomSelectProps, String | ReactElement]] = js.undefined
  
  /**
    * If true, the radio/checkbox column will be hidden.
    * You can enable this attribute if you enable clickToSelect and you don't want to show the selection column.
    */
  var hideSelectColumn: js.UndefOr[Boolean] = js.undefined
  
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
      /* isSelected */ Boolean, 
      /* event */ js.Any, 
      /* rowIndex */ Double, 
      Boolean | Unit
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
      /* isSelected */ Boolean, 
      /* rows */ js.Array[TRow], 
      Boolean | (js.Array[Double | String])
    ]
  ] = js.undefined
  
  /**
    * Only unselect visible rows.
    */
  var onlyUnselectVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Give an array data to perform which rows you want to be selected when table loading.
    * The content of array should be the rowkeys for the rows that you want to be selected.
    */
  var selected: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /**
    * Default is false, if enabled, there will be a button on top of table for toggling selected rows only.
    */
  var showOnlySelected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provide a list of unselectable row keys.
    */
  var unselectable: js.UndefOr[js.Array[Double | String]] = js.undefined
}
object SelectRow {
  
  inline def apply[TRow /* <: js.Object */](mode: SelectRowMode): SelectRow[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRow[TRow]]
  }
  
  extension [Self <: SelectRow[?], TRow /* <: js.Object */](x: Self & SelectRow[TRow]) {
    
    inline def setBgColor(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self = StObject.set(x, "bgColor", js.Any.fromFunction2(value))
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setClassName(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self = StObject.set(x, "className", js.Any.fromFunction2(value))
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClickToExpand(value: Boolean): Self = StObject.set(x, "clickToExpand", value.asInstanceOf[js.Any])
    
    inline def setClickToExpandUndefined: Self = StObject.set(x, "clickToExpand", js.undefined)
    
    inline def setClickToSelect(value: Boolean): Self = StObject.set(x, "clickToSelect", value.asInstanceOf[js.Any])
    
    inline def setClickToSelectAndEditCell(value: Boolean): Self = StObject.set(x, "clickToSelectAndEditCell", value.asInstanceOf[js.Any])
    
    inline def setClickToSelectAndEditCellUndefined: Self = StObject.set(x, "clickToSelectAndEditCell", js.undefined)
    
    inline def setClickToSelectUndefined: Self = StObject.set(x, "clickToSelect", js.undefined)
    
    inline def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setCustomComponent(value: /* props */ CustomSelectProps => String | ReactElement): Self = StObject.set(x, "customComponent", js.Any.fromFunction1(value))
    
    inline def setCustomComponentUndefined: Self = StObject.set(x, "customComponent", js.undefined)
    
    inline def setHideSelectColumn(value: Boolean): Self = StObject.set(x, "hideSelectColumn", value.asInstanceOf[js.Any])
    
    inline def setHideSelectColumnUndefined: Self = StObject.set(x, "hideSelectColumn", js.undefined)
    
    inline def setMode(value: SelectRowMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(
      value: (/* row */ TRow, /* isSelected */ Boolean, /* event */ js.Any, /* rowIndex */ Double) => Boolean | Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
    
    inline def setOnSelectAll(
      value: (/* isSelected */ Boolean, /* rows */ js.Array[TRow]) => Boolean | (js.Array[Double | String])
    ): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction2(value))
    
    inline def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnlyUnselectVisible(value: Boolean): Self = StObject.set(x, "onlyUnselectVisible", value.asInstanceOf[js.Any])
    
    inline def setOnlyUnselectVisibleUndefined: Self = StObject.set(x, "onlyUnselectVisible", js.undefined)
    
    inline def setSelected(value: js.Array[Double | String]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: (Double | String)*): Self = StObject.set(x, "selected", js.Array(value :_*))
    
    inline def setShowOnlySelected(value: Boolean): Self = StObject.set(x, "showOnlySelected", value.asInstanceOf[js.Any])
    
    inline def setShowOnlySelectedUndefined: Self = StObject.set(x, "showOnlySelected", js.undefined)
    
    inline def setUnselectable(value: js.Array[Double | String]): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setUnselectableVarargs(value: (Double | String)*): Self = StObject.set(x, "unselectable", js.Array(value :_*))
  }
}
