package typings.sharepoint.anon

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

@js.native
trait Cell extends js.Object {
  var Cell: typings.sharepoint.SP.JsGrid.IStyleType.Cell = js.native
  var GridPane: typings.sharepoint.SP.JsGrid.IStyleType.GridPane = js.native
  var Header: typings.sharepoint.SP.JsGrid.IStyleType.Header = js.native
  var RowHeaderStyle: typings.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle = js.native
  var Splitter: typings.sharepoint.SP.JsGrid.IStyleType.Splitter = js.native
  var SplitterHandle: typings.sharepoint.SP.JsGrid.IStyleType.SplitterHandle = js.native
  var TimescaleTier: typings.sharepoint.SP.JsGrid.IStyleType.TimescaleTier = js.native
  var Widget: typings.sharepoint.SP.JsGrid.IStyleType.Widget = js.native
}

object Cell {
  @scala.inline
  def apply(
    Cell: typings.sharepoint.SP.JsGrid.IStyleType.Cell,
    GridPane: GridPane,
    Header: Header,
    RowHeaderStyle: RowHeaderStyle,
    Splitter: Splitter,
    SplitterHandle: SplitterHandle,
    TimescaleTier: TimescaleTier,
    Widget: Widget
  ): Cell = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], GridPane = GridPane.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], RowHeaderStyle = RowHeaderStyle.asInstanceOf[js.Any], Splitter = Splitter.asInstanceOf[js.Any], SplitterHandle = SplitterHandle.asInstanceOf[js.Any], TimescaleTier = TimescaleTier.asInstanceOf[js.Any], Widget = Widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
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
    def setCell(value: typings.sharepoint.SP.JsGrid.IStyleType.Cell): Self = this.set("Cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridPane(value: GridPane): Self = this.set("GridPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: Header): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeaderStyle(value: RowHeaderStyle): Self = this.set("RowHeaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplitter(value: Splitter): Self = this.set("Splitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplitterHandle(value: SplitterHandle): Self = this.set("SplitterHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimescaleTier(value: TimescaleTier): Self = this.set("TimescaleTier", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidget(value: Widget): Self = this.set("Widget", value.asInstanceOf[js.Any])
  }
  
}

