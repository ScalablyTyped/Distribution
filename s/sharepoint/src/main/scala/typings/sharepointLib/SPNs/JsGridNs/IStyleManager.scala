package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IStyleManager extends js.Object {
  var columnHeaderStyleCollection: sharepointLib.Anon_AllSelected
  var defaultCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  var gridPaneStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane
  var groupingStyles: js.Array[_]
  var readOnlyCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  var readOnlyFocusedCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  var rowHeaderStyleCollection: sharepointLib.Anon_AllSelected
  var splitterStyleCollection: sharepointLib.Anon_Dra
  var timescaleTierStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.TimescaleTier
  var widgetDockHoverStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  var widgetDockPressedStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  var widgetDockStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  def GetCellStyle(styleId: java.lang.String): sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  def RegisterCellStyle(styleId: java.lang.String, cellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell): scala.Unit
  def UpdateDefaultCellStyleFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, cssClass: java.lang.String): scala.Unit
  def UpdateGridPaneStyleFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane, gridStyleNameCollection: js.Any): scala.Unit
  def UpdateGroupStylesFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, prefix: java.lang.String): scala.Unit
  def UpdateHeaderStyleFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header, headerStyleNameCol: js.Any): scala.Unit
  def UpdateSplitterStyleFromCss(
    styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Splitter,
    splitterStyleNameCollection: js.Any
  ): scala.Unit
}

object IStyleManager {
  @scala.inline
  def apply(
    GetCellStyle: js.Function1[java.lang.String, sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell],
    RegisterCellStyle: js.Function2[java.lang.String, sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, scala.Unit],
    UpdateDefaultCellStyleFromCss: js.Function2[sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, java.lang.String, scala.Unit],
    UpdateGridPaneStyleFromCss: js.Function2[sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane, js.Any, scala.Unit],
    UpdateGroupStylesFromCss: js.Function2[sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, java.lang.String, scala.Unit],
    UpdateHeaderStyleFromCss: js.Function2[sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header, js.Any, scala.Unit],
    UpdateSplitterStyleFromCss: js.Function2[sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Splitter, js.Any, scala.Unit],
    columnHeaderStyleCollection: sharepointLib.Anon_AllSelected,
    defaultCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell,
    gridPaneStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane,
    groupingStyles: js.Array[_],
    readOnlyCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell,
    readOnlyFocusedCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell,
    rowHeaderStyleCollection: sharepointLib.Anon_AllSelected,
    splitterStyleCollection: sharepointLib.Anon_Dra,
    timescaleTierStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.TimescaleTier,
    widgetDockHoverStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget,
    widgetDockPressedStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget,
    widgetDockStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetCellStyle")(GetCellStyle)
    __obj.updateDynamic("RegisterCellStyle")(RegisterCellStyle)
    __obj.updateDynamic("UpdateDefaultCellStyleFromCss")(UpdateDefaultCellStyleFromCss)
    __obj.updateDynamic("UpdateGridPaneStyleFromCss")(UpdateGridPaneStyleFromCss)
    __obj.updateDynamic("UpdateGroupStylesFromCss")(UpdateGroupStylesFromCss)
    __obj.updateDynamic("UpdateHeaderStyleFromCss")(UpdateHeaderStyleFromCss)
    __obj.updateDynamic("UpdateSplitterStyleFromCss")(UpdateSplitterStyleFromCss)
    __obj.updateDynamic("columnHeaderStyleCollection")(columnHeaderStyleCollection)
    __obj.updateDynamic("defaultCellStyle")(defaultCellStyle)
    __obj.updateDynamic("gridPaneStyle")(gridPaneStyle)
    __obj.updateDynamic("groupingStyles")(groupingStyles)
    __obj.updateDynamic("readOnlyCellStyle")(readOnlyCellStyle)
    __obj.updateDynamic("readOnlyFocusedCellStyle")(readOnlyFocusedCellStyle)
    __obj.updateDynamic("rowHeaderStyleCollection")(rowHeaderStyleCollection)
    __obj.updateDynamic("splitterStyleCollection")(splitterStyleCollection)
    __obj.updateDynamic("timescaleTierStyle")(timescaleTierStyle)
    __obj.updateDynamic("widgetDockHoverStyle")(widgetDockHoverStyle)
    __obj.updateDynamic("widgetDockPressedStyle")(widgetDockPressedStyle)
    __obj.updateDynamic("widgetDockStyle")(widgetDockStyle)
    __obj.asInstanceOf[IStyleManager]
  }
}

