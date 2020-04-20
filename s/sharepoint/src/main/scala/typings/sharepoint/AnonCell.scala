package typings.sharepoint

import typings.sharepoint.SP.JsGrid.IStyleType.Cell
import typings.sharepoint.SP.JsGrid.IStyleType.GridPane
import typings.sharepoint.SP.JsGrid.IStyleType.Header
import typings.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle
import typings.sharepoint.SP.JsGrid.IStyleType.Splitter
import typings.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import typings.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typings.sharepoint.SP.JsGrid.IStyleType.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var Cell: typings.sharepoint.SP.JsGrid.IStyleType.Cell
  var GridPane: typings.sharepoint.SP.JsGrid.IStyleType.GridPane
  var Header: typings.sharepoint.SP.JsGrid.IStyleType.Header
  var RowHeaderStyle: typings.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle
  var Splitter: typings.sharepoint.SP.JsGrid.IStyleType.Splitter
  var SplitterHandle: typings.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
  var TimescaleTier: typings.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
  var Widget: typings.sharepoint.SP.JsGrid.IStyleType.Widget
}

object AnonCell {
  @scala.inline
  def apply(
    Cell: Cell,
    GridPane: GridPane,
    Header: Header,
    RowHeaderStyle: RowHeaderStyle,
    Splitter: Splitter,
    SplitterHandle: SplitterHandle,
    TimescaleTier: TimescaleTier,
    Widget: Widget
  ): AnonCell = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], GridPane = GridPane.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], RowHeaderStyle = RowHeaderStyle.asInstanceOf[js.Any], Splitter = Splitter.asInstanceOf[js.Any], SplitterHandle = SplitterHandle.asInstanceOf[js.Any], TimescaleTier = TimescaleTier.asInstanceOf[js.Any], Widget = Widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell]
  }
}

