package typings.rappid.rappidMod

import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import typings.jointjs.jointjsMod.diaNs.Cell
import typings.jointjs.jointjsMod.diaNs.CellView
import typings.jointjs.jointjsMod.diaNs.Graph
import typings.jointjs.jointjsMod.diaNs.Paper
import typings.rappid.Anon_Graph
import typings.rappid.rappidMod.uiNs.Handle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rappid", "ui")
@js.native
object uiNs extends js.Object {
  trait Handle extends js.Object {
    var icon: String
    var name: String
    var position: String
  }
  
  @js.native
  class SelectionView protected () extends Model {
    def this(opt: Anon_Graph) = this()
    var graph: Graph = js.native
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
  
}

