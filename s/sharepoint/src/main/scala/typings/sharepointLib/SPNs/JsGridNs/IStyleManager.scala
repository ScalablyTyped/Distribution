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
  var splitterStyleCollection: sharepointLib.Anon_NormalHandle
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

