package typings.sharepoint.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IStyleType.Cell
import typings.sharepoint.SP.JsGrid.IStyleType.GridPane
import typings.sharepoint.SP.JsGrid.IStyleType.Header
import typings.sharepoint.SP.JsGrid.IStyleType.Splitter
import typings.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typings.sharepoint.SP.JsGrid.IStyleType.Widget
import typings.sharepoint.anon.AllSelected
import typings.sharepoint.anon.Dra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStyleManager extends StObject {
  
  def GetCellStyle(styleId: String): Cell
  
  def RegisterCellStyle(styleId: String, cellStyle: Cell): Unit
  
  def UpdateDefaultCellStyleFromCss(styleObject: Cell, cssClass: String): Unit
  
  def UpdateGridPaneStyleFromCss(styleObject: GridPane, gridStyleNameCollection: Any): Unit
  
  def UpdateGroupStylesFromCss(styleObject: Cell, prefix: String): Unit
  
  def UpdateHeaderStyleFromCss(styleObject: Header, headerStyleNameCol: Any): Unit
  
  def UpdateSplitterStyleFromCss(styleObject: Splitter, splitterStyleNameCollection: Any): Unit
  
  var columnHeaderStyleCollection: AllSelected
  
  var defaultCellStyle: Cell
  
  var gridPaneStyle: GridPane
  
  var groupingStyles: js.Array[Any]
  
  var readOnlyCellStyle: Cell
  
  var readOnlyFocusedCellStyle: Cell
  
  var rowHeaderStyleCollection: AllSelected
  
  var splitterStyleCollection: Dra
  
  var timescaleTierStyle: TimescaleTier
  
  var widgetDockHoverStyle: Widget
  
  var widgetDockPressedStyle: Widget
  
  var widgetDockStyle: Widget
}
object IStyleManager {
  
  inline def apply(
    GetCellStyle: String => Cell,
    RegisterCellStyle: (String, Cell) => Unit,
    UpdateDefaultCellStyleFromCss: (Cell, String) => Unit,
    UpdateGridPaneStyleFromCss: (GridPane, Any) => Unit,
    UpdateGroupStylesFromCss: (Cell, String) => Unit,
    UpdateHeaderStyleFromCss: (Header, Any) => Unit,
    UpdateSplitterStyleFromCss: (Splitter, Any) => Unit,
    columnHeaderStyleCollection: AllSelected,
    defaultCellStyle: Cell,
    gridPaneStyle: GridPane,
    groupingStyles: js.Array[Any],
    readOnlyCellStyle: Cell,
    readOnlyFocusedCellStyle: Cell,
    rowHeaderStyleCollection: AllSelected,
    splitterStyleCollection: Dra,
    timescaleTierStyle: TimescaleTier,
    widgetDockHoverStyle: Widget,
    widgetDockPressedStyle: Widget,
    widgetDockStyle: Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal(GetCellStyle = js.Any.fromFunction1(GetCellStyle), RegisterCellStyle = js.Any.fromFunction2(RegisterCellStyle), UpdateDefaultCellStyleFromCss = js.Any.fromFunction2(UpdateDefaultCellStyleFromCss), UpdateGridPaneStyleFromCss = js.Any.fromFunction2(UpdateGridPaneStyleFromCss), UpdateGroupStylesFromCss = js.Any.fromFunction2(UpdateGroupStylesFromCss), UpdateHeaderStyleFromCss = js.Any.fromFunction2(UpdateHeaderStyleFromCss), UpdateSplitterStyleFromCss = js.Any.fromFunction2(UpdateSplitterStyleFromCss), columnHeaderStyleCollection = columnHeaderStyleCollection.asInstanceOf[js.Any], defaultCellStyle = defaultCellStyle.asInstanceOf[js.Any], gridPaneStyle = gridPaneStyle.asInstanceOf[js.Any], groupingStyles = groupingStyles.asInstanceOf[js.Any], readOnlyCellStyle = readOnlyCellStyle.asInstanceOf[js.Any], readOnlyFocusedCellStyle = readOnlyFocusedCellStyle.asInstanceOf[js.Any], rowHeaderStyleCollection = rowHeaderStyleCollection.asInstanceOf[js.Any], splitterStyleCollection = splitterStyleCollection.asInstanceOf[js.Any], timescaleTierStyle = timescaleTierStyle.asInstanceOf[js.Any], widgetDockHoverStyle = widgetDockHoverStyle.asInstanceOf[js.Any], widgetDockPressedStyle = widgetDockPressedStyle.asInstanceOf[js.Any], widgetDockStyle = widgetDockStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStyleManager] (val x: Self) extends AnyVal {
    
    inline def setColumnHeaderStyleCollection(value: AllSelected): Self = StObject.set(x, "columnHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    inline def setDefaultCellStyle(value: Cell): Self = StObject.set(x, "defaultCellStyle", value.asInstanceOf[js.Any])
    
    inline def setGetCellStyle(value: String => Cell): Self = StObject.set(x, "GetCellStyle", js.Any.fromFunction1(value))
    
    inline def setGridPaneStyle(value: GridPane): Self = StObject.set(x, "gridPaneStyle", value.asInstanceOf[js.Any])
    
    inline def setGroupingStyles(value: js.Array[Any]): Self = StObject.set(x, "groupingStyles", value.asInstanceOf[js.Any])
    
    inline def setGroupingStylesVarargs(value: Any*): Self = StObject.set(x, "groupingStyles", js.Array(value*))
    
    inline def setReadOnlyCellStyle(value: Cell): Self = StObject.set(x, "readOnlyCellStyle", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyFocusedCellStyle(value: Cell): Self = StObject.set(x, "readOnlyFocusedCellStyle", value.asInstanceOf[js.Any])
    
    inline def setRegisterCellStyle(value: (String, Cell) => Unit): Self = StObject.set(x, "RegisterCellStyle", js.Any.fromFunction2(value))
    
    inline def setRowHeaderStyleCollection(value: AllSelected): Self = StObject.set(x, "rowHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    inline def setSplitterStyleCollection(value: Dra): Self = StObject.set(x, "splitterStyleCollection", value.asInstanceOf[js.Any])
    
    inline def setTimescaleTierStyle(value: TimescaleTier): Self = StObject.set(x, "timescaleTierStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDefaultCellStyleFromCss(value: (Cell, String) => Unit): Self = StObject.set(x, "UpdateDefaultCellStyleFromCss", js.Any.fromFunction2(value))
    
    inline def setUpdateGridPaneStyleFromCss(value: (GridPane, Any) => Unit): Self = StObject.set(x, "UpdateGridPaneStyleFromCss", js.Any.fromFunction2(value))
    
    inline def setUpdateGroupStylesFromCss(value: (Cell, String) => Unit): Self = StObject.set(x, "UpdateGroupStylesFromCss", js.Any.fromFunction2(value))
    
    inline def setUpdateHeaderStyleFromCss(value: (Header, Any) => Unit): Self = StObject.set(x, "UpdateHeaderStyleFromCss", js.Any.fromFunction2(value))
    
    inline def setUpdateSplitterStyleFromCss(value: (Splitter, Any) => Unit): Self = StObject.set(x, "UpdateSplitterStyleFromCss", js.Any.fromFunction2(value))
    
    inline def setWidgetDockHoverStyle(value: Widget): Self = StObject.set(x, "widgetDockHoverStyle", value.asInstanceOf[js.Any])
    
    inline def setWidgetDockPressedStyle(value: Widget): Self = StObject.set(x, "widgetDockPressedStyle", value.asInstanceOf[js.Any])
    
    inline def setWidgetDockStyle(value: Widget): Self = StObject.set(x, "widgetDockStyle", value.asInstanceOf[js.Any])
  }
}
