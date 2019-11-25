package typings.sharepoint.SP.JsGrid

import typings.sharepoint.Anon_AllSelected
import typings.sharepoint.Anon_Dra
import typings.sharepoint.SP.JsGrid.IStyleType.Cell
import typings.sharepoint.SP.JsGrid.IStyleType.GridPane
import typings.sharepoint.SP.JsGrid.IStyleType.Header
import typings.sharepoint.SP.JsGrid.IStyleType.Splitter
import typings.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typings.sharepoint.SP.JsGrid.IStyleType.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IStyleManager extends js.Object {
  var columnHeaderStyleCollection: Anon_AllSelected
  var defaultCellStyle: Cell
  var gridPaneStyle: GridPane
  var groupingStyles: js.Array[_]
  var readOnlyCellStyle: Cell
  var readOnlyFocusedCellStyle: Cell
  var rowHeaderStyleCollection: Anon_AllSelected
  var splitterStyleCollection: Anon_Dra
  var timescaleTierStyle: TimescaleTier
  var widgetDockHoverStyle: Widget
  var widgetDockPressedStyle: Widget
  var widgetDockStyle: Widget
  def GetCellStyle(styleId: String): Cell
  def RegisterCellStyle(styleId: String, cellStyle: Cell): Unit
  def UpdateDefaultCellStyleFromCss(styleObject: Cell, cssClass: String): Unit
  def UpdateGridPaneStyleFromCss(styleObject: GridPane, gridStyleNameCollection: js.Any): Unit
  def UpdateGroupStylesFromCss(styleObject: Cell, prefix: String): Unit
  def UpdateHeaderStyleFromCss(styleObject: Header, headerStyleNameCol: js.Any): Unit
  def UpdateSplitterStyleFromCss(styleObject: Splitter, splitterStyleNameCollection: js.Any): Unit
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
    columnHeaderStyleCollection: Anon_AllSelected,
    defaultCellStyle: Cell,
    gridPaneStyle: GridPane,
    groupingStyles: js.Array[_],
    readOnlyCellStyle: Cell,
    readOnlyFocusedCellStyle: Cell,
    rowHeaderStyleCollection: Anon_AllSelected,
    splitterStyleCollection: Anon_Dra,
    timescaleTierStyle: TimescaleTier,
    widgetDockHoverStyle: Widget,
    widgetDockPressedStyle: Widget,
    widgetDockStyle: Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal(GetCellStyle = js.Any.fromFunction1(GetCellStyle), RegisterCellStyle = js.Any.fromFunction2(RegisterCellStyle), UpdateDefaultCellStyleFromCss = js.Any.fromFunction2(UpdateDefaultCellStyleFromCss), UpdateGridPaneStyleFromCss = js.Any.fromFunction2(UpdateGridPaneStyleFromCss), UpdateGroupStylesFromCss = js.Any.fromFunction2(UpdateGroupStylesFromCss), UpdateHeaderStyleFromCss = js.Any.fromFunction2(UpdateHeaderStyleFromCss), UpdateSplitterStyleFromCss = js.Any.fromFunction2(UpdateSplitterStyleFromCss), columnHeaderStyleCollection = columnHeaderStyleCollection.asInstanceOf[js.Any], defaultCellStyle = defaultCellStyle.asInstanceOf[js.Any], gridPaneStyle = gridPaneStyle.asInstanceOf[js.Any], groupingStyles = groupingStyles.asInstanceOf[js.Any], readOnlyCellStyle = readOnlyCellStyle.asInstanceOf[js.Any], readOnlyFocusedCellStyle = readOnlyFocusedCellStyle.asInstanceOf[js.Any], rowHeaderStyleCollection = rowHeaderStyleCollection.asInstanceOf[js.Any], splitterStyleCollection = splitterStyleCollection.asInstanceOf[js.Any], timescaleTierStyle = timescaleTierStyle.asInstanceOf[js.Any], widgetDockHoverStyle = widgetDockHoverStyle.asInstanceOf[js.Any], widgetDockPressedStyle = widgetDockPressedStyle.asInstanceOf[js.Any], widgetDockStyle = widgetDockStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStyleManager]
  }
}

