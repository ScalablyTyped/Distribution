package typings.sharepoint.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IStyleType.Cell
import typings.sharepoint.SP.JsGrid.IStyleType.GridPane
import typings.sharepoint.SP.JsGrid.IStyleType.Header
import typings.sharepoint.SP.JsGrid.IStyleType.Splitter
import typings.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typings.sharepoint.SP.JsGrid.IStyleType.Widget
import typings.sharepoint.anon.AllSelected
import typings.sharepoint.anon.Dra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyleManager extends js.Object {
  
  def GetCellStyle(styleId: String): Cell = js.native
  
  def RegisterCellStyle(styleId: String, cellStyle: Cell): Unit = js.native
  
  def UpdateDefaultCellStyleFromCss(styleObject: Cell, cssClass: String): Unit = js.native
  
  def UpdateGridPaneStyleFromCss(styleObject: GridPane, gridStyleNameCollection: js.Any): Unit = js.native
  
  def UpdateGroupStylesFromCss(styleObject: Cell, prefix: String): Unit = js.native
  
  def UpdateHeaderStyleFromCss(styleObject: Header, headerStyleNameCol: js.Any): Unit = js.native
  
  def UpdateSplitterStyleFromCss(styleObject: Splitter, splitterStyleNameCollection: js.Any): Unit = js.native
  
  var columnHeaderStyleCollection: AllSelected = js.native
  
  var defaultCellStyle: Cell = js.native
  
  var gridPaneStyle: GridPane = js.native
  
  var groupingStyles: js.Array[_] = js.native
  
  var readOnlyCellStyle: Cell = js.native
  
  var readOnlyFocusedCellStyle: Cell = js.native
  
  var rowHeaderStyleCollection: AllSelected = js.native
  
  var splitterStyleCollection: Dra = js.native
  
  var timescaleTierStyle: TimescaleTier = js.native
  
  var widgetDockHoverStyle: Widget = js.native
  
  var widgetDockPressedStyle: Widget = js.native
  
  var widgetDockStyle: Widget = js.native
}
object IStyleManager {
  
  @scala.inline
  def apply(
    GetCellStyle: String => Cell,
    RegisterCellStyle: (String, Cell) => Unit,
    UpdateDefaultCellStyleFromCss: (Cell, String) => Unit,
    UpdateGridPaneStyleFromCss: (GridPane, js.Any) => Unit,
    UpdateGroupStylesFromCss: (Cell, String) => Unit,
    UpdateHeaderStyleFromCss: (Header, js.Any) => Unit,
    UpdateSplitterStyleFromCss: (Splitter, js.Any) => Unit,
    columnHeaderStyleCollection: AllSelected,
    defaultCellStyle: Cell,
    gridPaneStyle: GridPane,
    groupingStyles: js.Array[_],
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
  implicit class IStyleManagerOps[Self <: IStyleManager] (val x: Self) extends AnyVal {
    
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
    def setGetCellStyle(value: String => Cell): Self = this.set("GetCellStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterCellStyle(value: (String, Cell) => Unit): Self = this.set("RegisterCellStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateDefaultCellStyleFromCss(value: (Cell, String) => Unit): Self = this.set("UpdateDefaultCellStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateGridPaneStyleFromCss(value: (GridPane, js.Any) => Unit): Self = this.set("UpdateGridPaneStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateGroupStylesFromCss(value: (Cell, String) => Unit): Self = this.set("UpdateGroupStylesFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateHeaderStyleFromCss(value: (Header, js.Any) => Unit): Self = this.set("UpdateHeaderStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateSplitterStyleFromCss(value: (Splitter, js.Any) => Unit): Self = this.set("UpdateSplitterStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnHeaderStyleCollection(value: AllSelected): Self = this.set("columnHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellStyle(value: Cell): Self = this.set("defaultCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridPaneStyle(value: GridPane): Self = this.set("gridPaneStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingStylesVarargs(value: js.Any*): Self = this.set("groupingStyles", js.Array(value :_*))
    
    @scala.inline
    def setGroupingStyles(value: js.Array[_]): Self = this.set("groupingStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyCellStyle(value: Cell): Self = this.set("readOnlyCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyFocusedCellStyle(value: Cell): Self = this.set("readOnlyFocusedCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeaderStyleCollection(value: AllSelected): Self = this.set("rowHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterStyleCollection(value: Dra): Self = this.set("splitterStyleCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimescaleTierStyle(value: TimescaleTier): Self = this.set("timescaleTierStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetDockHoverStyle(value: Widget): Self = this.set("widgetDockHoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetDockPressedStyle(value: Widget): Self = this.set("widgetDockPressedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetDockStyle(value: Widget): Self = this.set("widgetDockStyle", value.asInstanceOf[js.Any])
  }
}
