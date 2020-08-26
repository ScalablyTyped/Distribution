package typings.rappid.mod.ui

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.Paper
import typings.rappid.anon.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rappid", "ui.SelectionView")
@js.native
class SelectionView protected ()
  extends Model[js.Any, ModelSetOptions] {
  def this(opt: Graph) = this()
  var graph: typings.jointjs.mod.dia.Graph = js.native
  var model: Collection[Cell] = js.native
  var paper: Paper = js.native
  def addHandle(handle: Handle): Unit = js.native
  def cancelSelection(): Unit = js.native
  def changeHandle(name: String, handle: Handle): Unit = js.native
  def createSelectionBox(cellView: CellView): Unit = js.native
  def destroySelectionBox(cellView: CellView): Unit = js.native
  def removeHandle(name: String): Unit = js.native
  def startSelecting(evt: js.Any): Unit = js.native
}

